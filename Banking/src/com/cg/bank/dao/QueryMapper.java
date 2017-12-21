package com.cg.bank.dao;

public interface QueryMapper {
		
		public static final String VIEW_ALL_TRANSACTIONS="SELECT FundTransfer_ID, Account_ID, Payee_Account_ID, Date_Of_Transfer, Transfer_Amount FROM FUND_TRANSFER where DateofTransaction BETWEEN ? and SYSDATE WHERE Account_no =?";
		public static final String MINI_STATEMENT="SELECT Transaction_ID, DateofTransaction, TranAmount, Account_ID FROM Transactions WHERE account_id=?";
		
		public static final String SIGN_UP_ACCOUNT="INSERT into Account_Master values(seq_Account_Master.nextval,?,?,SYSDATE,seq_User_Table.currval)";
		public static final String SIGN_UP_USER="INSERT INTO User_Table VALUES(seq_User_Table.NEXTVAL,?,?,?,'open')";
		public static final String SIGN_UP_CUSTOMERS="INSERT INTO Customer VALUES(seq_Customer.NEXTVAL,seq_Account_Master.CURRval,seq_User_Table.CURRVAL,?,?,?,?)";
		
		public static final String LOGIN_USER="SELECT user_id, login_password from user_table WHERE USER_ID=?";
		
		public static final String UPDATE_USER_PASSWORD="UPDATE USER_TABLE SET LOGIN_PASSWORD=? WHERE USER_ID=?";
		public static final String UPDATE_USER_DETAILS="UPDATE CUSTOMER SET EMAIL=?,ADDRESS=? WHERE ACCOUNT_ID=?";
		
		public static final String REQUEST_CHEQUE_BOOK="insert into Service_Tracker values(seq_Service_Tracker.nextval,?,SYSDATE,'open')";
		
		public static final String CHECK_ID="SELECT ACCOUNT_ID FROM ACCOUNT_MASTER WHERE ACCOUNT_ID=?";
		public static final String ADD_PAYEE="insert into Payee_Table values(seq_PayeeTable.nextval,?,?,?)";
		public static final String UPDATE_USER_ACCOUNT="UPDATE ACCOUNT_MASTER SET Account_Balance=Account_Balance-? WHERE ACCOUNT_ID=?";
		public static final String UPDATE_TRANSACTION="insert into Transactions values(seq_Transactions.nextval,SYSDATE,?,?)";
		public static final String UPDATE_FUND_TRANSFER="insert into Fund_Transfer values(seq_Fund_Transfer.nextval,?,SYSDATE,?,?)";
		
		public static final String TRACK_SERVICE="SELECT Service_ID, Account_ID, Service_Raised_Date,Service_status FROM Service_Tracker WHERE Service_ID=?";
		
		public static final String VALIDATE_USER="SELECT user_id FROM User_table where user_id=? and login_password=?";
		public static final String GET_ACC_DETAILS="SELECT Account_master.account_id FROM Account_master JOIN User_Table ON Account_master.user_id=User_Table.user_id and user_table.user_id=?";
		
		public static final String GET_ACCOUNT="SELECT * FROM Account_master WHERE user_id=?";
		public static final String GET_USER="SELECT * FROM user_table WHERE user_id=?";
		public static final String GET_CUSTOMER="SELECT * FROM Customer WHERE user_id=?";
}
	