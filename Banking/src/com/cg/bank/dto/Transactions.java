package com.cg.bank.dto;

import java.util.Date;

public class Transactions {

	private int transactionId;
	private Date dateOfTransaction;
	private String transactionType;
	private double tranAmount;
	private int accountId;
	public Transactions() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Transactions(int transactionId, Date dateOfTransaction,
			String transactionType, double tranAmount, int accountId) {
		super();
		this.transactionId = transactionId;
		this.dateOfTransaction = dateOfTransaction;
		this.transactionType = transactionType;
		this.tranAmount = tranAmount;
		this.accountId = accountId;
	}
	public int getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(int transactionId) {
		this.transactionId = transactionId;
	}
	public Date getDateOfTransaction() {
		return dateOfTransaction;
	}
	public void setDateOfTransaction(Date dateOfTransaction) {
		this.dateOfTransaction = dateOfTransaction;
	}
	public String getTransactionType() {
		return transactionType;
	}
	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}
	public double getTranAmount() {
		return tranAmount;
	}
	public void setTranAmount(double tranAmount) {
		this.tranAmount = tranAmount;
	}
	public int getAccountId() {
		return accountId;
	}
	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}
	}
