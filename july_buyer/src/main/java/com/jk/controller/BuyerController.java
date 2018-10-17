package com.jk.controller;

import com.jk.model.whn.Enquirysingle;
import com.jk.service.BuyService;
import com.jk.service.buyer.BuysService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class BuyerController implements BuyService {

    @Autowired
    private BuysService buysService;
    @Override
    public Map<String,Object> getenquiry(@RequestParam("userId") String userId) {
        Map<String,Object> map = new HashMap<String,Object>();
        Enquirysingle enquirysingle = buysService.getenquiry(userId);
        map.put("enquirysingle",enquirysingle);
        return map;
    }
}
