package com.cg.bank.dto;

import java.util.Date;

public class AccountMaster {
	private int accountId;
	private String accountType;
	private double accountBalance;
	private Date openDate;
	private int userId;
	public AccountMaster() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AccountMaster(int accountId, String accountType,
			double accountBalance, Date openDate, int userId) {
		super();
		this.accountId = accountId;
		this.accountType = accountType;
		this.accountBalance = accountBalance;
		this.openDate = openDate;
		this.userId = userId;
	}
	public int getAccountId() {
		return accountId;
	}
	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public double getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}
	public Date getOpenDate() {
		return openDate;
	}
	public void setOpenDate(Date openDate) {
		this.openDate = openDate;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	}
