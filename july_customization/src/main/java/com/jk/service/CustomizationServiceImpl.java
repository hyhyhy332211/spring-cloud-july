package com.jk.service;

import com.jk.mapper.CustomizationMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomizationServiceImpl implements CustomizationService{
    @Autowired
    private CustomizationMapper customizationMapper;
}
