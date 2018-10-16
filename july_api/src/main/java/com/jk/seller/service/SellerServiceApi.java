package com.jk.seller.service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RequestMapping("test")
public interface SellerServiceApi {

    @GetMapping("queryList")
    String queryList(@RequestParam("userId") String userId);
}
