package com.jk.seller.service;

import com.jk.model.zll.Tree;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Map;

@RequestMapping("seller")
public interface SellerServiceApi {

    @GetMapping("queryList")
    String queryList(@RequestParam("userId") String userId);


    /**
     * 初始化树
     * @return
     */
    @GetMapping("getTreeList")
    List<Tree> getTreeList();

    /**
     * 查询定制比价管理(服务商)列表
     * @return
     */
    @GetMapping("getComparisonList")
    Map<String,Object> getComparisonList(@RequestParam(value = "customProduct") String customProduct);

    /**
     * 查询材料单
     */
    @GetMapping("getMaterialList")
    Map<String, Object> getMaterialList(@RequestParam(value = "material") String material);

    /**
     * 待接单状态修改为待出图
     */
    @PutMapping("updateNoSingleStatus")
    void updateNoSingleStatus(@RequestParam("productID") String productID);

    @PostMapping("uploadFile")
    String Upload(@RequestParam(value = "file") MultipartFile file);
}
