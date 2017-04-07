package com.model;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Document(collection="Payment_Info")
public class PaymentInfo {
	@Id
	private ObjectId id;
	private String paymentMethod;
	private Integer amount;
	private String billNo;
	private long orderId;
	private long discountAmt;
	private long tax;
	public long getDiscountAmt() {
		return discountAmt;
	}
	public void setDiscountAmt(long discountAmt) {
		this.discountAmt = discountAmt;
	}
	public long getTax() {
		return tax;
	}
	public void setTax(long tax) {
		this.tax = tax;
	}
	public String getCurrancy() {
		return currancy;
	}
	public void setCurrancy(String currancy) {
		this.currancy = currancy;
	}
	private String currancy; 
	public long getOrderId() {
		return orderId;
	}
	public void setOrderId(long orderId) {
		this.orderId = orderId;
	}
	public ObjectId getId() {
		return id;
	}
	public void setId(ObjectId id) {
		this.id = id;
	}
	public String getPaymentMethod() {
		return paymentMethod;
	}
	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}
	public Integer getAmount() {
		return amount;
	}
	public void setAmount(Integer amount) {
		this.amount = amount;
	}
	public String getBillNo() {
		return billNo;
	}
	public void setBillNo(String billNo) {
		this.billNo = billNo;
	}
	
}
