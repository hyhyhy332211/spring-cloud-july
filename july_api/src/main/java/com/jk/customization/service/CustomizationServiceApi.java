package com.jk.customization.service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@RequestMapping("cc")
public interface CustomizationServiceApi {

    @GetMapping("querylist")
    String queryList(String userId);

    @GetMapping("getInquiryList")
    Map<String, Object> getInquiryList();
}
