package com.cg.bank.dto;

public class UserTable {

	private int userId;
	private String loginPassword;
	private String secretQuestion;
	private String secretAnswer;
	private String lockStatus;
	public UserTable() {
		super();
		// TODO Auto-generated constructor stub
	}
	public UserTable(int userId, String loginPassword, String secretQuestion,
			String secretAnswer, String lockStatus) {
		super();
		this.userId = userId;
		this.loginPassword = loginPassword;
		this.secretQuestion = secretQuestion;
		this.secretAnswer = secretAnswer;
		this.lockStatus = lockStatus;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getLoginPassword() {
		return loginPassword;
	}
	public void setLoginPassword(String loginPassword) {
		this.loginPassword = loginPassword;
	}
	public String getSecretQuestion() {
		return secretQuestion;
	}
	public void setSecretQuestion(String secretQuestion) {
		this.secretQuestion = secretQuestion;
	}
	public String getSecretAnswer() {
		return secretAnswer;
	}
	public void setSecretAnswer(String secretAnswer) {
		this.secretAnswer = secretAnswer;
	}
	public String getLockStatus() {
		return lockStatus;
	}
	public void setLockStatus(String lockStatus) {
		this.lockStatus = lockStatus;
	}
		
}
