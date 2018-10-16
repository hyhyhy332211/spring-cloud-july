package com.jk.seller.service;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient("service-client")
public interface SellerService extends SellerServiceApi {
}
