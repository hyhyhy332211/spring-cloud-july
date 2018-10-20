package com.jk.seller.service.sellerCustom;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.jk.model.whn.CustomProduct;
import com.jk.model.zll.File;
import com.jk.model.zll.Material;
import com.jk.model.zll.Tree;
import com.jk.seller.mapper.sellerCustom.SellerCustomMapper;
import com.jk.util.FileUtil;
import com.jk.util.UUIDUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ClassUtils;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class SellerCustomServiceImpl implements SellerCustomService {

    @Autowired
    private SellerCustomMapper sellerCustomMapper;

    /**
     * 初始化树
     * @return
     */
    @Override
    public List<Tree> getTreeList() {
        String id = "0";
        List<Tree> nodes = getNodes(id);
        return nodes;
    }
    private List<Tree> getNodes(String id) {
        List<Tree> trees = sellerCustomMapper.getNodes(id);
        for (Tree treeBean : trees) {
            List<Tree> nodes = getNodes(treeBean.getId());
            if(nodes != null && nodes.size()>0) {
                treeBean.setLeaf(false);
                treeBean.setSelectable(false);
            }else {
                treeBean.setLeaf(true);
                treeBean.setSelectable(true);
            }
            treeBean.setNodes(nodes);
        }
        return trees;
    }

    /**
     * 查询定制比价管理(服务商)列表
     * @param custom
     * @return
     */
    @Override
    public Map<String, Object> getComparisonList(CustomProduct customProduct1) {
        Map<String,Object> map = new HashMap<>();
        PageHelper.startPage(customProduct1.getPage(),customProduct1.getRows());
        List<CustomProduct> list = sellerCustomMapper.getComparisonList(customProduct1);
        Page p = (Page) list;
        long total = p.getTotal();
        map.put("rows",list);
        map.put("total",total);
        return map;
    }

    /**
     * 查询材料单
     * @param material1
     * @return
     */
    @Override
    public Map<String, Object> getMaterialList(Material material1) {
        Map<String,Object> map = new HashMap<>();
        PageHelper.startPage(material1.getPage(),material1.getRows());
        List<Material> list = sellerCustomMapper.getMaterialList(material1);
        Page p = (Page) list;
        long total = p.getTotal();
        map.put("rows",list);
        map.put("total",total);
        return map;
    }

    @Override
    public void updateNoSingleStatus(String productID) {
        sellerCustomMapper.updateNoSingleStatus(productID);
    }

    @Override
    public String Upload(@RequestParam(value = "file") MultipartFile file) {
        if(!file.isEmpty()) {
            // 获取文件名称,包含后缀
            String fileName = file.getOriginalFilename();

            // 存放在这个路径下：该路径是该工程目录下的static文件下：(注：该文件可能需要自己创建)
            // 放在static下的原因是，存放的是静态文件资源，即通过浏览器输入本地服务器地址，加文件名时是可以访问到的
            String path = ClassUtils.getDefaultClassLoader().getResource("").getPath()+"static/";

            try {
                // 该方法是对文件写入的封装，在util类中，导入该包即可使用，后面会给出方法
                FileUtil.fileupload(file.getBytes(), path, fileName);
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

            // 接着创建对应的实体类，将以下路径进行添加，然后通过数据库操作方法写入
            File biaopath = new File();
            biaopath.setFileId(UUIDUtil.getUUID());
            biaopath.setFilePath("http://localhost:8763/"+fileName);
            sellerCustomMapper.saveFile(biaopath);
        }
        return "success";

    }

}
