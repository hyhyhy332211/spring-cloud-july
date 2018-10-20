package com.jk.seller.controller.sellerCustom;

import com.alibaba.fastjson.JSON;
import com.jk.model.whn.CustomProduct;
import com.jk.model.zll.Material;
import com.jk.model.zll.Tree;
import com.jk.seller.service.SellerServiceApi;
import com.jk.seller.service.sellerCustom.SellerCustomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Map;

@RestController
public class SellerCustomController implements SellerServiceApi {

    @Autowired
    private SellerCustomService sellerCustomService;



    @Override
    public String queryList(String userId) {
        System.out.println("userId = [" + userId + "]");
        String ss ="2222";
        return ss;
    }

    /**
     * 查询树
     * @return
     */
    @Override
    public List<Tree> getTreeList() {
        return sellerCustomService.getTreeList();
    }

    /**
     * 查询定制比价管理(服务商)列表
     * @return
     */
    @Override
    public Map<String, Object> getComparisonList(@RequestParam(value = "customProduct") String customProduct) {

        CustomProduct customProduct1 = JSON.parseObject(customProduct, CustomProduct.class);

        return sellerCustomService.getComparisonList(customProduct1);
    }

    /**
     * 查询材料单
     */
    @Override
    public Map<String, Object> getMaterialList(@RequestParam(value = "material") String material) {
        Material material1 = JSON.parseObject(material, Material.class);
        return sellerCustomService.getMaterialList(material1);
    }

    /**
     * 待接单状态修改为待出图
     */
    @Override
    public void updateNoSingleStatus(@RequestParam("productID") String productID) {
        sellerCustomService.updateNoSingleStatus(productID);
    }

    @Override
    public String Upload(@RequestParam(value = "file") MultipartFile file) {
        return sellerCustomService.Upload(file);
    }
}
