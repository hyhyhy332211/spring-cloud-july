package com.jk.seller.service;

import com.jk.model.zll.tree.Tree;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@RequestMapping("seller")
public interface SellerServiceApi {

    @GetMapping("queryList")
    String queryList(@RequestParam("userId") String userId);

    @GetMapping("getTreeList")
    List<Tree> getTreeList();
}
