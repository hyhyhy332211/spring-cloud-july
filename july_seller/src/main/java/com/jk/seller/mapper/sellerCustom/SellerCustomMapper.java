package com.jk.seller.mapper.sellerCustom;

import com.jk.model.whn.CustomProduct;
import com.jk.model.zll.File;
import com.jk.model.zll.Material;
import com.jk.model.zll.Tree;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface SellerCustomMapper {

    /**
     * 初始化树
     * @return
     */
    @Select("select id,name as text,url as href,pid from t_tree where pid = #{id}")
    List<Tree> getNodes(String id);

    /**
     * 查询定制比价管理(服务商)列表
     * @return
     */
    List<CustomProduct> getComparisonList(CustomProduct customProduct1);

    /**
     * 查询材料单
     */
    List<Material> getMaterialList(Material material1);

    /**
     * 待接单状态修改为待出图
     */
    void updateNoSingleStatus(@Param("productID") String productID);

    void saveFile(File biaopath);
}
