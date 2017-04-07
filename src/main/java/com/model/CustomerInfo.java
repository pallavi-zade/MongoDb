package com.model;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Customer_Info")
public class CustomerInfo {
	@Id
	private ObjectId id;
	private String customerName;
	private String gender;
	private Integer age;
	private String location;
	private String email;
	private long externalCustomerdId;

	public ObjectId getId() {
		return id;
	}

	public String getCustomerName() {
		return customerName;
	}

	public String getGender() {
		return gender;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	
	

	public long getExternalCustomerdId() {
		return externalCustomerdId;
	}

	public void setExternalCustomerdId(long externalCustomerdId) {
		this.externalCustomerdId = externalCustomerdId;
	}

	public Integer getAge() {
		return age;
	}

	public String getLocation() {
		return location;
	}

	public void setId(ObjectId id) {
		this.id = id;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public void setLocation(String location) {
		this.location = location;
	}

}
