package com.jk.service.buyer;

import com.jk.mapper.BuyMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BuysServiceImpl implements  BuysService{
    @Autowired
    private BuyMapper buyMapper;
}
