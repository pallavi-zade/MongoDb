package com.model;




import java.util.Date;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Order_Info")
public class OrderInfo {
@Id
private ObjectId id;
private long objectId;
private Date OrderDate;
private long OrderIsOnSale;
public ObjectId getId() {
	return id;
}
public void setId(ObjectId id) {
	this.id = id;
}
public long getObjectId() {
	return objectId;
}
public void setObjectId(long objectId) {
	this.objectId = objectId;
}
public Date getOrderDate() {
	return OrderDate;
}
public void setOrderDate(Date orderDate) {
	OrderDate = orderDate;
}
public long getOrderIsOnSale() {
	return OrderIsOnSale;
}
public void setOrderIsOnSale(long orderIsOnSale) {
	OrderIsOnSale = orderIsOnSale;
}


}

