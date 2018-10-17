package com.jk.service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@RequestMapping("buyer")
public interface BuyService {

    @GetMapping("getenquiry")
    Map<String,Object> getenquiry(@RequestParam("userId") String userId);
}
