package com.jk.buyer.service;

import com.jk.model.Test;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

public interface BuyerService {
    @GetMapping("queryList")
    Test queryOrderById(@RequestParam("testId") String testId);

}
