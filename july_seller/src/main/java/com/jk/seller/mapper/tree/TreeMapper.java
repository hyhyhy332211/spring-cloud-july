package com.jk.seller.mapper.tree;

import com.jk.model.zll.tree.Tree;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface TreeMapper {

    @Select("select id,name as text,url as href,pid from t_tree where pid = #{id}")
    List<Tree> getNodes(String id);
}
