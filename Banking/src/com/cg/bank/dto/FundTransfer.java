package com.cg.bank.dto;

import java.util.Date;

public class FundTransfer {

	private int fundTransferId;
	private int accountId;
	private int payeeAccountId;
	private Date dateOfTransfer;
	private double transferAmount;
	public FundTransfer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public FundTransfer(int fundTransferId, int accountId, int payeeAccountId,
			Date dateOfTransfer, double transferAmount) {
		super();
		this.fundTransferId = fundTransferId;
		this.accountId = accountId;
		this.payeeAccountId = payeeAccountId;
		this.dateOfTransfer = dateOfTransfer;
		this.transferAmount = transferAmount;
	}
	public int getFundTransferId() {
		return fundTransferId;
	}
	public void setFundTransferId(int fundTransferId) {
		this.fundTransferId = fundTransferId;
	}
	public int getAccountId() {
		return accountId;
	}
	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}
	public int getPayeeAccountId() {
		return payeeAccountId;
	}
	public void setPayeeAccountId(int payeeAccountId) {
		this.payeeAccountId = payeeAccountId;
	}
	public Date getDateOfTransfer() {
		return dateOfTransfer;
	}
	public void setDateOfTransfer(Date dateOfTransfer) {
		this.dateOfTransfer = dateOfTransfer;
	}
	public double getTransferAmount() {
		return transferAmount;
	}
	public void setTransferAmount(double transferAmount) {
		this.transferAmount = transferAmount;
	}
	
	
}
