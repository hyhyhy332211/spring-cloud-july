package com.jk.seller.controller;

import com.jk.model.zll.tree.Tree;
import com.jk.seller.service.SellerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("app/seller")
public class SellerController{

      @Autowired
      private SellerService sellerService;

      @GetMapping("queryList")
      public String queryList(@RequestParam("userId") String userId){
          String s = sellerService.queryList(userId);
          return s;
      }
    /**
     * 查询树
     */
    @GetMapping("getTreeList")
    public List<Tree> getTreeList(){
        return sellerService.getTreeList();
    }

}
