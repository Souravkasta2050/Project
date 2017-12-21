package com.cg.bank.service;

import java.util.List;

import com.cg.bank.dto.AccountMaster;
import com.cg.bank.dto.Customer;
import com.cg.bank.dto.ServiceTracker;
import com.cg.bank.dto.Transactions;
import com.cg.bank.dto.UserTable;
import com.cg.bank.exception.BankException;

public interface BankService {
	public List<AccountMaster> addAccount(AccountMaster accBean) throws BankException ;
	public List<UserTable> addUser(UserTable userBean) throws BankException ;
	public List<Customer> addCustomer(Customer custBean) throws BankException ;
	
	public int validateUser(int userid,String passwd) throws BankException ;
	
	public List<AccountMaster> getAccount(int userid) throws BankException ;
	public List<UserTable> getUser(int userid) throws BankException ;
	public List<Customer> getCustomer(int userid) throws BankException ;
	
	public List<Transactions> getTransactions(Object obj) throws BankException ;
	
	public void updateDetails(int acId,String eMail, String addr) throws BankException ;

	public void insertRequest(int acId) throws BankException ;
	
	public Boolean validatePayee(int acId,int pId,String pName)throws BankException ;
	
	public Boolean updateTrans(int acId,int pId,int tAmt)throws BankException ;
	public Boolean changePwd(int uId, String newPwd)throws BankException;
	public List<ServiceTracker> getStatus(int reqId)throws BankException;
}
