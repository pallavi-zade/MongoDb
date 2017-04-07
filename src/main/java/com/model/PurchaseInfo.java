package com.model;



import java.util.Date;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="Purchase_Info")
public class PurchaseInfo {

	@Id
	private ObjectId id;
	private long orderId;
	public long getOrderId() {
		return orderId;
	}
	public void setOrderId(long orderId) {
		this.orderId = orderId;
	}
	private Date dateOfPurchase;
	private String sourceOfPurchase;
	public ObjectId getId() {
		return id;
	}
	public void setId(ObjectId id) {
		this.id = id;
	}
	public Date getDateOfPurchase() {
		return dateOfPurchase;
	}
	public void setDateOfPurchase(Date dateOfPurchase) {
		this.dateOfPurchase = dateOfPurchase;
	}
	public String getSourceOfPurchase() {
		return sourceOfPurchase;
	}
	public void setSourceOfPurchase(String sourceOfPurchase) {
		this.sourceOfPurchase = sourceOfPurchase;
	}
	
}
