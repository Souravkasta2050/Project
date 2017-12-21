package com.cg.bank.dto;

import java.util.Date;

public class ServiceTracker {

	private int serviceId;
	private int accountId;
	private Date serviceRaisedDate;
	private String serviceStatus;
	public ServiceTracker() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ServiceTracker(int serviceId, int accountId, Date serviceRaisedDate,
			String serviceStatus) {
		super();
		this.serviceId = serviceId;
		this.accountId = accountId;
		this.serviceRaisedDate = serviceRaisedDate;
		this.serviceStatus = serviceStatus;
	}
	public int getServiceId() {
		return serviceId;
	}
	public void setServiceId(int serviceId) {
		this.serviceId = serviceId;
	}
	public int getAccountId() {
		return accountId;
	}
	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}
	public Date getServiceRaisedDate() {
		return serviceRaisedDate;
	}
	public void setServiceRaisedDate(Date serviceRaisedDate) {
		this.serviceRaisedDate = serviceRaisedDate;
	}
	public String getServiceStatus() {
		return serviceStatus;
	}
	public void setServiceStatus(String serviceStatus) {
		this.serviceStatus = serviceStatus;
	}
	}
