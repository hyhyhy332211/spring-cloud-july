package com.jk.model.whn;

import java.io.Serializable;
//这是一张付款方式表
public class Payment implements Serializable {

     private String paymentID;//
     private String paymentType;//付款方式
     private String paymentProportion;//付款比例
     private String paymentDays;//账期

 @Override
 public String toString() {
  return "Payment{" +
          "paymentID='" + paymentID + '\'' +
          ", paymentType='" + paymentType + '\'' +
          ", paymentProportion='" + paymentProportion + '\'' +
          ", paymentDays='" + paymentDays + '\'' +
          '}';
 }

 public String getPaymentID() {
  return paymentID;
 }

 public void setPaymentID(String paymentID) {
  this.paymentID = paymentID;
 }

 public String getPaymentType() {
  return paymentType;
 }

 public void setPaymentType(String paymentType) {
  this.paymentType = paymentType;
 }

 public String getPaymentProportion() {
  return paymentProportion;
 }

 public void setPaymentProportion(String paymentProportion) {
  this.paymentProportion = paymentProportion;
 }

 public String getPaymentDays() {
  return paymentDays;
 }

 public void setPaymentDays(String paymentDays) {
  this.paymentDays = paymentDays;
 }
}
