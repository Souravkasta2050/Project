package com.cg.bank.dto;

public class Customer {
	private int customerId;
	private int accountId;
	private int userId;
	private String customerName;
	private String email;
	private String address;
	private String pancard;
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customer(int customerId, int accountId, int userId,
			String customerName, String email, String address, String pancard) {
		super();
		this.customerId = customerId;
		this.accountId = accountId;
		this.userId = userId;
		this.customerName = customerName;
		this.email = email;
		this.address = address;
		this.pancard = pancard;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public int getAccountId() {
		return accountId;
	}
	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPancard() {
		return pancard;
	}
	public void setPancard(String pancard) {
		this.pancard = pancard;
	}
	}
