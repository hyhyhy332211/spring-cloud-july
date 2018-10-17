package com.jk.model.whn;

import lombok.Data;

import java.io.Serializable;

//渠道表
@Data
@lombok.ToString
public class Custom implements Serializable {
    private static final long serialVersionUID = -5133372059638456257L;

     //渠道Id
     private String customId;
     //渠道名称
     private String channel;
     //类目
     private String productType;

}
