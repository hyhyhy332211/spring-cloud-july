package com.jk.service;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient("service-buyer")
public interface BuyFeignService extends  BuyService {
}
