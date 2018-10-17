package com.jk.controller;

import com.jk.service.BuyFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("buy")
public class BuyerController {
@Autowired
private BuyFeignService buyFeignService;
    @GetMapping("getenquiry")
    public Map<String,Object> getbook(String userId) {
        System.out.println(userId);
        return buyFeignService.getenquiry(userId);
    }
}
