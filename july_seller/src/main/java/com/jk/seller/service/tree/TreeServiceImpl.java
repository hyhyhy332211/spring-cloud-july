package com.jk.seller.service.tree;

import com.jk.model.zll.tree.Tree;
import com.jk.seller.mapper.tree.TreeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TreeServiceImpl implements TreeService {

    @Autowired
    private TreeMapper treeMapper;

    @Override
    public List<Tree> getTreeList() {
        String id = "0";
        List<Tree> nodes = getNodes(id);
        return nodes;
    }

    private List<Tree> getNodes(String id) {
        List<Tree> trees = treeMapper.getNodes(id);
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
}
