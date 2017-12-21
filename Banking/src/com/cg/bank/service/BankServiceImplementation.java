package com.cg.bank.service;

import java.util.List;

import com.cg.bank.dao.BankDao;
import com.cg.bank.dao.BankDaoImplementation;
import com.cg.bank.dto.AccountMaster;
import com.cg.bank.dto.Customer;
import com.cg.bank.dto.ServiceTracker;
import com.cg.bank.dto.Transactions;
import com.cg.bank.dto.UserTable;
import com.cg.bank.exception.BankException;

public class BankServiceImplementation implements BankService{
	BankDao bankDao;
	public BankServiceImplementation() {
		super();
		bankDao=new BankDaoImplementation();
	}
	
	public List<AccountMaster> addAccount(AccountMaster accBean) throws BankException {
		return bankDao.addAccount(accBean); 
	}
	
	public List<UserTable> addUser(UserTable userBean) throws BankException {
		return bankDao.addUser(userBean); 
	}
	
	public List<Customer> addCustomer(Customer custBean) throws BankException {
		return bankDao.addCustomer(custBean); 
	}	
	
	
	
	public int validateUser(int userid,String passwd) throws BankException {
		return bankDao.validateUser(userid,passwd); 
	}

	
	public List<AccountMaster> getAccount(int userid) throws BankException {
		return bankDao.getAccount(userid); 
	}
	public List<UserTable> getUser(int userid) throws BankException {
		return bankDao.getUser(userid); 
	}
	public List<Customer> getCustomer(int userid) throws BankException {
		return bankDao.getCustomer(userid); 
	}
	
	public List<Transactions> getTransactions(Object obj) throws BankException{
		return bankDao.getTransactions(obj); 
	} 
	

	@Override
	public void updateDetails(int acId, String eMail, String addr)throws BankException{
		bankDao.updateDetails(acId,eMail,addr);
		// TODO Auto-generated method stub
		
	}

	@Override
	public void insertRequest(int acId) throws BankException {
		bankDao.insertRequest(acId);
		
	}

	@Override
	public Boolean validatePayee(int acId, int pId,String pName)
			throws BankException {
		// TODO Auto-generated method stub
		return bankDao.validatePayee(acId, pId, pName);
	}

	@Override
	public Boolean updateTrans(int acId, int pId, int tAmt)
			throws BankException {
		// TODO Auto-generated method stub
		return bankDao.updateTrans(acId, pId, tAmt);
	}

	@Override
	public Boolean changePwd(int uId, String newPwd) throws BankException {
		// TODO Auto-generated method stub
		return bankDao.changePwd(uId, newPwd);
	}

	@Override
	public List<ServiceTracker> getStatus(int reqId) throws BankException {
		// TODO Auto-generated method stub
		return bankDao.getStatus(reqId);
	}
	
	
	


}
