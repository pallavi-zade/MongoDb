package com.model;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

public class RefundedOrderInfo {
	@Id
	private ObjectId id;
	private long objectId;
	private long parentObjectId;
	public ObjectId getId() {
		return id;
	}
	public long getParentObjectId() {
		return parentObjectId;
	}
	public void setParentObjectId(long parentObjectId) {
		this.parentObjectId = parentObjectId;
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

}
