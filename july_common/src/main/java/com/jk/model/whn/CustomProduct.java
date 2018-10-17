package com.jk.model.whn;

import java.io.Serializable;
//这是填写定制产品信息表
public class CustomProduct implements Serializable {

 private static final long serialVersionUID = -877317810370928570L;

      private String productID;//定制产品ID

        private String productName;//产品名称

        private String procurementNum;//采购数量

        private String productType;//产品类型

        private Double inletPressureMin;//进口压力最小值

        private Double inletPressureMax;//进口压力最大值

        private Double outletPressureMin;//出口压力最小值

        private Double outletPressureMax;//出口压力最大值

        private String trafficLength;//流量计长度

        private String voltageRegulator;//调压器

        private String carton;//外箱

        private String cartonMaterial;//外箱材质

        private String note;//备注

        private String attachment;//附件

        private String demandType;//需求类型

        private String status;  //状态字段

 public static long getSerialVersionUID() {
  return serialVersionUID;
 }

 public String getProductID() {
  return productID;
 }

 public void setProductID(String productID) {
  this.productID = productID;
 }

 public String getProductName() {
  return productName;
 }

 public void setProductName(String productName) {
  this.productName = productName;
 }

 public String getProcurementNum() {
  return procurementNum;
 }

 public void setProcurementNum(String procurementNum) {
  this.procurementNum = procurementNum;
 }

 public String getProductType() {
  return productType;
 }

 public void setProductType(String productType) {
  this.productType = productType;
 }

 public Double getInletPressureMin() {
  return inletPressureMin;
 }

 public void setInletPressureMin(Double inletPressureMin) {
  this.inletPressureMin = inletPressureMin;
 }

 public Double getInletPressureMax() {
  return inletPressureMax;
 }

 public void setInletPressureMax(Double inletPressureMax) {
  this.inletPressureMax = inletPressureMax;
 }

 public Double getOutletPressureMin() {
  return outletPressureMin;
 }

 public void setOutletPressureMin(Double outletPressureMin) {
  this.outletPressureMin = outletPressureMin;
 }

 public Double getOutletPressureMax() {
  return outletPressureMax;
 }

 public void setOutletPressureMax(Double outletPressureMax) {
  this.outletPressureMax = outletPressureMax;
 }

 public String getTrafficLength() {
  return trafficLength;
 }

 public void setTrafficLength(String trafficLength) {
  this.trafficLength = trafficLength;
 }

 public String getVoltageRegulator() {
  return voltageRegulator;
 }

 public void setVoltageRegulator(String voltageRegulator) {
  this.voltageRegulator = voltageRegulator;
 }

 public String getCarton() {
  return carton;
 }

 public void setCarton(String carton) {
  this.carton = carton;
 }

 public String getCartonMaterial() {
  return cartonMaterial;
 }

 public void setCartonMaterial(String cartonMaterial) {
  this.cartonMaterial = cartonMaterial;
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

 public String getDemandType() {
  return demandType;
 }

 public void setDemandType(String demandType) {
  this.demandType = demandType;
 }

 public String getStatus() {
  return status;
 }

 public void setStatus(String status) {
  this.status = status;
 }

 @Override
 public String toString() {
  return "CustomProduct{" +
          "productID='" + productID + '\'' +
          ", productName='" + productName + '\'' +
          ", procurementNum='" + procurementNum + '\'' +
          ", productType='" + productType + '\'' +
          ", inletPressureMin=" + inletPressureMin +
          ", inletPressureMax=" + inletPressureMax +
          ", outletPressureMin=" + outletPressureMin +
          ", outletPressureMax=" + outletPressureMax +
          ", trafficLength='" + trafficLength + '\'' +
          ", voltageRegulator='" + voltageRegulator + '\'' +
          ", carton='" + carton + '\'' +
          ", cartonMaterial='" + cartonMaterial + '\'' +
          ", note='" + note + '\'' +
          ", attachment='" + attachment + '\'' +
          ", demandType='" + demandType + '\'' +
          ", status='" + status + '\'' +
          '}';
 }
}
