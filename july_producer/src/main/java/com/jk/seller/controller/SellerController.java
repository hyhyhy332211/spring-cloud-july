package com.jk.seller.controller;

import com.jk.seller.service.SellerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("tt")
public class SellerController{

      @Autowired
      private SellerService sellerService;

      @GetMapping("queryList")
      public String queryList(@RequestParam("userId") String userId){
          String s = sellerService.queryList(userId);
          return s;
      }

}
