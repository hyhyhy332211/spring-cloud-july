package com.jk.seller.service.sellerCustom;

import com.jk.model.whn.CustomProduct;
import com.jk.model.zll.Material;
import com.jk.model.zll.Tree;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Map;

public interface SellerCustomService {
    /**
     * 初始化树
     * @return
     */
    List<Tree> getTreeList();

    /**
     * 查询定制比价管理(服务商)列表
     * @param customProduct1
     * @return
     */
    Map<String, Object> getComparisonList(CustomProduct customProduct1);

    /**
     * 查询材料单
     * @param material1
     * @return
     */
    Map<String, Object> getMaterialList(Material material1);

    /**
     * 待接单状态修改为待出图
     */
    void updateNoSingleStatus(String productID);

    String Upload(@RequestParam(value = "file") MultipartFile file);
}
