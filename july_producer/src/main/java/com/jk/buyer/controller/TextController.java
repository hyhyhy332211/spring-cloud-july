package com.jk.buyer.controller;

import com.jk.buyer.service.BookFeignService;
import com.jk.model.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TextController {

    @Autowired
    private BookFeignService bookFeignService;

    @GetMapping("/hi")
    public Test getbook(String testId) {
        System.out.println(testId);
        return bookFeignService.queryOrderById(testId);
    }
}
