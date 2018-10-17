package com.jk.controller;

import com.jk.service.BuyService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class BuyerController implements BuyService {

    @Override
    public Map<String,Object> getenquiry(@RequestParam("userId") String userId) {
        Map<String,Object> map = new HashMap<String,Object>();

        return null;
    }
}
