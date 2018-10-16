package com.jk.seller.controller;

import com.jk.seller.service.SellerServiceApi;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController implements SellerServiceApi {
    @Override
    public String queryList(String userId) {
        System.out.println("userId = [" + userId + "]");
        String ss ="2222";
        return ss;
    }
}
