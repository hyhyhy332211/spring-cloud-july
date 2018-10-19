package com.jk.controller;

import com.jk.customization.service.CustomizationServiceApi;
import com.jk.service.CustomizationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomizationController implements CustomizationServiceApi {
    @Autowired
    private CustomizationService customizationService;

    @Override
    public String queryList(String userId) {
        System.out.println("userId = [" + userId + "]");
        String s ="2222";
        return s;
    }
}
