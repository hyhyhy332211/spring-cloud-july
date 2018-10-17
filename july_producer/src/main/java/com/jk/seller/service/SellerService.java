package com.jk.seller.service;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient("seller-client")
public interface SellerService extends SellerServiceApi {
}
