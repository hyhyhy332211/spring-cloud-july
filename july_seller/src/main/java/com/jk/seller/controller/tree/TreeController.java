package com.jk.seller.controller.tree;

import com.jk.model.zll.tree.Tree;
import com.jk.seller.service.SellerServiceApi;
import com.jk.seller.service.tree.TreeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TreeController implements SellerServiceApi {

    @Autowired
    private TreeService treeService;


    @Override
    public String queryList(String userId) {
        System.out.println("userId = [" + userId + "]");
        String ss ="2222";
        return ss;
    }

    @Override
    public List<Tree> getTreeList() {
        return treeService.getTreeList();
    }
}
