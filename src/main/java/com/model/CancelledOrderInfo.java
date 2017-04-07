package com.model;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

public class CancelledOrderInfo {
	@Id
	private ObjectId id;
	private long objectId;
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
	

}
