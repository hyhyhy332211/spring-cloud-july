package com.jk.controller;

import com.jk.buyer.service.BuyerService;
import com.jk.model.Test;
import com.jk.seller.service.SellerServiceApi;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController implements BuyerService {

    @Override
    public Test queryOrderById(String testId) {
        System.out.println(testId);
        Test test = new Test();
        test.setId("234234");
        return test;
    }
}
