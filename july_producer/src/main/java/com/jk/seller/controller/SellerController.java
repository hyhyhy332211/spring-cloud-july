package com.jk.seller.controller;

import com.jk.model.whn.CustomProduct;
import com.jk.model.zll.Tree;
import com.jk.seller.service.SellerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("app/seller")
public class SellerController {

    @Autowired
    private SellerService sellerService;

    /**
     * 测试
     *
     * @param userId
     * @return
     */
    @GetMapping("queryList")
    public String queryList(@RequestParam("userId") String userId) {
        String s = sellerService.queryList(userId);
        return s;
    }

    /**
     * 查询树
     */
    @GetMapping("getTreeList")
    public List<Tree> getTreeList() {
        return sellerService.getTreeList();
    }

    /**
     * 查询定制比价管理(服务商)列表
     */
    @GetMapping("getComparisonList")
    public Map<String, Object> getComparisonList(@RequestParam(value = "customProduct") String customProduct) {
        return sellerService.getComparisonList(customProduct);
    }

    /**
     * 查询材料单
     */
    @GetMapping("getMaterialList")
    public Map<String, Object> getMaterialList(@RequestParam(value = "material") String material) {
        return sellerService.getMaterialList(material);
    }

    /**
     * 待接单状态修改为待出图
     */
    @PutMapping("updateNoSingleStatus")
    public Boolean updateNoSingleStatus(@RequestParam(value = "productID") String productID) {
        try {
            sellerService.updateNoSingleStatus(productID);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /**
     * 实现文件上传
     */
    @PostMapping("fileUpload")
    public String fileUpload(@RequestParam("fileName") MultipartFile file) {
        if (file.isEmpty()) {
            return "false";
        }
        String fileName = file.getOriginalFilename();
        int size = (int) file.getSize();
        System.out.println(fileName + "-->" + size);

        String path = "E:/test";
        File dest = new File(path + "/" + fileName);
        if (!dest.getParentFile().exists()) { //判断文件父目录是否存在
            dest.getParentFile().mkdir();
        }
        try {
            file.transferTo(dest); //保存文件
            return "true";
        } catch (IllegalStateException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return "false";
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return "false";
        }
    }

    // 传入的参数file是我们指定的文件
    @PostMapping("uploadFile")
    public String upload(@RequestParam(value = "file") MultipartFile file) {
        return sellerService.Upload(file);
    }
}