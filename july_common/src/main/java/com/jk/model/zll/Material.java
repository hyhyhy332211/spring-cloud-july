package com.jk.model.zll;

import com.jk.util.PageUtil;
import lombok.Data;

import java.io.Serializable;

//材料单
@Data
@lombok.ToString
public class Material extends PageUtil implements Serializable {
    private static final long serialVersionUID = 3203370458453267006L;

      //材料编号
      private String materialID;

      //材料名称
      private String materialName;

      //材料数量
      private String datumcount;

      //保存时间
      private String materialDate;

      //渠道业务字段
      private String channel;




}
