package com.model.sql;

import java.io.Serializable;

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
@Table(name = "wp_users")

public class UserMaster implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@Column
	private String user_login;

	@Column
	private String user_pass;

	@Column
	private String user_nicename;

	@Column
	private String user_email;

	@Column
	private String user_url;

	@Column
	private String  user_registered;

	@Column
	private String user_active_key;
	@Column
	private String user_status;
	@Column
	private String display_name;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getUser_login() {
		return user_login;
	}
	public void setUser_login(String user_login) {
		this.user_login = user_login;
	}
	public String getUser_pass() {
		return user_pass;
	}
	public void setUser_pass(String user_pass) {
		this.user_pass = user_pass;
	}
	public String getUser_nicename() {
		return user_nicename;
	}
	public void setUser_nicename(String user_nicename) {
		this.user_nicename = user_nicename;
	}
	public String getUser_email() {
		return user_email;
	}
	public void setUser_email(String user_email) {
		this.user_email = user_email;
	}
	public String getUser_url() {
		return user_url;
	}
	public void setUser_url(String user_url) {
		this.user_url = user_url;
	}
	public String getUser_registered() {
		return user_registered;
	}
	public void setUser_registered(String user_registered) {
		this.user_registered = user_registered;
	}
	public String getUser_active_key() {
		return user_active_key;
	}
	public void setUser_active_key(String user_active_key) {
		this.user_active_key = user_active_key;
	}
	public String getUser_status() {
		return user_status;
	}
	public void setUser_status(String user_status) {
		this.user_status = user_status;
	}
	public String getDisplay_name() {
		return display_name;
	}
	public void setDisplay_name(String display_name) {
		this.display_name = display_name;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	

	
	
}