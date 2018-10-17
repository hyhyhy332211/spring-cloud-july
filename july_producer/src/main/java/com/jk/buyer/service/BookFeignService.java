package com.jk.buyer.service;

import com.jk.service.BuyService;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient("service-buyer")
public interface BookFeignService extends BuyService {
}
