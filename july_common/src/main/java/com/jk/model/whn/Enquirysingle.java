package com.jk.model.whn;

import java.io.Serializable;
//这是一张询价单
public class Enquirysingle implements Serializable {

              private String enquirySingleID;//询价单ID

              private String startDate;//报名开始日期

              private String undefiendStartDate;//自定义开始日期

              private String abortDate;//报名截止日期

              private String releaseDate;//中标结果公布日期

              private String undefiendReleaseDate;//自定义公布日期

              private String receivingCycle;//期望收货周期

              private String supplier;//供应商范围

              private String minSupplierNum;//最低参与报价供应商的数量

              private String sumPrice;//预期总价

              private String invoiceType;//发票类型

              private String rate;//开票方式

              private String openTicket;//结算商

              private String settlementShang;//配送方式

              private String consigneeName;//收货人姓名

              private String consigneeAddress;//收货人地址

              private String consigneePhone;//收货人电话

              private String purchasingCompany;//采购公司

              private String purchasingDepartment;//公司的部门

              private String defaultFactory;//默认工厂

              private String defaultWarehouse;//默认仓库存地

              private String note;//备注

              private String attachment;//附件

              private String materialStatus;//您是否提供材料单

  @Override
  public String toString() {
    return "Enquirysingle{" +
            "enquirySingleID='" + enquirySingleID + '\'' +
            ", startDate='" + startDate + '\'' +
            ", undefiendStartDate='" + undefiendStartDate + '\'' +
            ", abortDate='" + abortDate + '\'' +
            ", releaseDate='" + releaseDate + '\'' +
            ", undefiendReleaseDate='" + undefiendReleaseDate + '\'' +
            ", receivingCycle='" + receivingCycle + '\'' +
            ", supplier='" + supplier + '\'' +
            ", minSupplierNum='" + minSupplierNum + '\'' +
            ", sumPrice='" + sumPrice + '\'' +
            ", invoiceType='" + invoiceType + '\'' +
            ", rate='" + rate + '\'' +
            ", openTicket='" + openTicket + '\'' +
            ", settlementShang='" + settlementShang + '\'' +
            ", consigneeName='" + consigneeName + '\'' +
            ", consigneeAddress='" + consigneeAddress + '\'' +
            ", consigneePhone='" + consigneePhone + '\'' +
            ", purchasingCompany='" + purchasingCompany + '\'' +
            ", purchasingDepartment='" + purchasingDepartment + '\'' +
            ", defaultFactory='" + defaultFactory + '\'' +
            ", defaultWarehouse='" + defaultWarehouse + '\'' +
            ", note='" + note + '\'' +
            ", attachment='" + attachment + '\'' +
            ", materialStatus='" + materialStatus + '\'' +
            '}';
  }

  public String getEnquirySingleID() {
    return enquirySingleID;
  }

  public void setEnquirySingleID(String enquirySingleID) {
    this.enquirySingleID = enquirySingleID;
  }

  public String getStartDate() {
    return startDate;
  }

  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }

  public String getUndefiendStartDate() {
    return undefiendStartDate;
  }

  public void setUndefiendStartDate(String undefiendStartDate) {
    this.undefiendStartDate = undefiendStartDate;
  }

  public String getAbortDate() {
    return abortDate;
  }

  public void setAbortDate(String abortDate) {
    this.abortDate = abortDate;
  }

  public String getReleaseDate() {
    return releaseDate;
  }

  public void setReleaseDate(String releaseDate) {
    this.releaseDate = releaseDate;
  }

  public String getUndefiendReleaseDate() {
    return undefiendReleaseDate;
  }

  public void setUndefiendReleaseDate(String undefiendReleaseDate) {
    this.undefiendReleaseDate = undefiendReleaseDate;
  }

  public String getReceivingCycle() {
    return receivingCycle;
  }

  public void setReceivingCycle(String receivingCycle) {
    this.receivingCycle = receivingCycle;
  }

  public String getSupplier() {
    return supplier;
  }

  public void setSupplier(String supplier) {
    this.supplier = supplier;
  }

  public String getMinSupplierNum() {
    return minSupplierNum;
  }

  public void setMinSupplierNum(String minSupplierNum) {
    this.minSupplierNum = minSupplierNum;
  }

  public String getSumPrice() {
    return sumPrice;
  }

  public void setSumPrice(String sumPrice) {
    this.sumPrice = sumPrice;
  }

  public String getInvoiceType() {
    return invoiceType;
  }

  public void setInvoiceType(String invoiceType) {
    this.invoiceType = invoiceType;
  }

  public String getRate() {
    return rate;
  }

  public void setRate(String rate) {
    this.rate = rate;
  }

  public String getOpenTicket() {
    return openTicket;
  }

  public void setOpenTicket(String openTicket) {
    this.openTicket = openTicket;
  }

  public String getSettlementShang() {
    return settlementShang;
  }

  public void setSettlementShang(String settlementShang) {
    this.settlementShang = settlementShang;
  }

  public String getConsigneeName() {
    return consigneeName;
  }

  public void setConsigneeName(String consigneeName) {
    this.consigneeName = consigneeName;
  }

  public String getConsigneeAddress() {
    return consigneeAddress;
  }

  public void setConsigneeAddress(String consigneeAddress) {
    this.consigneeAddress = consigneeAddress;
  }

  public String getConsigneePhone() {
    return consigneePhone;
  }

  public void setConsigneePhone(String consigneePhone) {
    this.consigneePhone = consigneePhone;
  }

  public String getPurchasingCompany() {
    return purchasingCompany;
  }

  public void setPurchasingCompany(String purchasingCompany) {
    this.purchasingCompany = purchasingCompany;
  }

  public String getPurchasingDepartment() {
    return purchasingDepartment;
  }

  public void setPurchasingDepartment(String purchasingDepartment) {
    this.purchasingDepartment = purchasingDepartment;
  }

  public String getDefaultFactory() {
    return defaultFactory;
  }

  public void setDefaultFactory(String defaultFactory) {
    this.defaultFactory = defaultFactory;
  }

  public String getDefaultWarehouse() {
    return defaultWarehouse;
  }

  public void setDefaultWarehouse(String defaultWarehouse) {
    this.defaultWarehouse = defaultWarehouse;
  }

  public String getNote() {
    return note;
  }

  public void setNote(String note) {
    this.note = note;
  }

  public String getAttachment() {
    return attachment;
  }

  public void setAttachment(String attachment) {
    this.attachment = attachment;
  }

  public String getMaterialStatus() {
    return materialStatus;
  }

  public void setMaterialStatus(String materialStatus) {
    this.materialStatus = materialStatus;
  }
}
