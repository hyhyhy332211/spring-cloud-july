package com.jk.buyer.service;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient("service-buyer")
public interface BookFeignService extends BuyerService{
}
