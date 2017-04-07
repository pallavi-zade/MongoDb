package com.model.sql;

import java.io.Serializable;
import java.sql.Time;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToOne;
import javax.persistence.Table;
/**
 * The persistent class for the user database table.
 * 
 */
@Entity
@Table(name = "wp_woo_sr_orders")

public class orders implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@Column
	private long order_id;

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getOrder_id() {
		return order_id;
	}
	public void setOrder_id(long order_id) {
		this.order_id = order_id;
	}
	public Date getCreated_date() {
		return created_date;
	}
	public void setCreated_date(Date created_date) {
		this.created_date = created_date;
	}
	public Time getCreated_time() {
		return created_time;
	}
	public void setCreated_time(Time created_time) {
		this.created_time = created_time;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public long getParent_id() {
		return parent_id;
	}
	public void setParent_id(long parent_id) {
		this.parent_id = parent_id;
	}
	public Integer getTotal() {
		return total;
	}
	public void setTotal(Integer total) {
		this.total = total;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public long getDiscount() {
		return discount;
	}
	public void setDiscount(long discount) {
		this.discount = discount;
	}
	public long getCart_discount() {
		return cart_discount;
	}
	public void setCart_discount(long cart_discount) {
		this.cart_discount = cart_discount;
	}
	public long getShipping() {
		return shipping;
	}
	public void setShipping(long shipping) {
		this.shipping = shipping;
	}
	public long getShipping_tax() {
		return shipping_tax;
	}
	public void setShipping_tax(long shipping_tax) {
		this.shipping_tax = shipping_tax;
	}
	public String getShipping_method() {
		return shipping_method;
	}
	public void setShipping_method(String shipping_method) {
		this.shipping_method = shipping_method;
	}
	public long getTax() {
		return tax;
	}
	public void setTax(long tax) {
		this.tax = tax;
	}
	public long getQty() {
		return qty;
	}
	public void setQty(long qty) {
		this.qty = qty;
	}
	public String getPayment_method() {
		return payment_method;
	}
	public void setPayment_method(String payment_method) {
		this.payment_method = payment_method;
	}
	public long getUser_id() {
		return user_id;
	}
	public void setUser_id(long user_id) {
		this.user_id = user_id;
	}
	public String getBilling_email() {
		return billing_email;
	}
	public void setBilling_email(String billing_email) {
		this.billing_email = billing_email;
	}
	public String getCustomer_name() {
		return customer_name;
	}
	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}
	public String getBilling_country() {
		return billing_country;
	}
	public void setBilling_country(String billing_country) {
		this.billing_country = billing_country;
	}
	public String getTrash() {
		return trash;
	}
	public void setTrash(String trash) {
		this.trash = trash;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Column
	private Date created_date;

	@Column
	private Time created_time;

	@Column
	private String status;

	@Column
	private String type;

	@Column
	private long parent_id;

	@Column
	private Integer total;
	@Column
	private String currency;
	@Column
	private long discount;
	@Column
	private long cart_discount;
	@Column
	private long shipping;
	@Column
	private long shipping_tax;
	@Column
	private String shipping_method;
	@Column
	private long tax;
	@Column
	private long qty;
	@Column
	private String payment_method;
	@Column
	private long user_id;
	@Column
	private String billing_email;
	@Column
	private String customer_name;
	@Column
	private String billing_country;
	@Column
	private String trash;
	

	
	
}