package com.cg.bank.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import com.cg.bank.dto.AccountMaster;
import com.cg.bank.dto.Customer;
import com.cg.bank.dto.ServiceTracker;
import com.cg.bank.dto.Transactions;
import com.cg.bank.dto.UserTable;
import com.cg.bank.exception.BankException;
import com.cg.bank.util.DBUtil;

public class BankDaoImplementation implements BankDao {
	
	Logger log=Logger.getLogger(BankDaoImplementation.class);
	
	
	public BankDaoImplementation() {
		super();
		PropertyConfigurator.configure("resources/log4j.properties");
	}

	ServiceTracker trackBean=new ServiceTracker(); 

	Connection con;
	Statement stm;
	PreparedStatement pstm;
	ResultSet rst = null;
	int acc = 0;

	@Override
	public List<AccountMaster> addAccount(AccountMaster accBean)
			throws BankException {
		List<AccountMaster> accList = new ArrayList<AccountMaster>();
		try {
			con = DBUtil.getConnection();

			pstm = con.prepareStatement(QueryMapper.SIGN_UP_ACCOUNT);
			pstm.setString(1, accBean.getAccountType());
			pstm.setDouble(2, accBean.getAccountBalance());
			acc = pstm.executeUpdate();

			if (acc != 0) {
				accList.add(accBean);
			}

		} catch (SQLException e) {
			log.warn("Account Details weren't updated");
			throw new BankException("Check the data type of the details entered");
		} finally {
			try {
				pstm.close();
				con.close();
				log.info("Connections closed");
			} catch (SQLException e) {
				log.warn("Connections not closed properly");
				
			}
		}
		return accList;
	}

	public List<UserTable> addUser(UserTable userBean) throws BankException {
		List<UserTable> userList = new ArrayList<UserTable>();
		try {
			con = DBUtil.getConnection();

			pstm = con.prepareStatement(QueryMapper.SIGN_UP_USER);
			pstm.setString(1, userBean.getLoginPassword());
			pstm.setString(2, userBean.getSecretQuestion());
			pstm.setString(3, userBean.getSecretAnswer());

			acc = pstm.executeUpdate();

			if (acc != 0) {
				userList.add(userBean);
			}
		} catch (SQLException e) {
			e.printStackTrace();
			throw new BankException("User Details weren't updated");
		} finally {
			try {
				pstm.close();
				con.close();
				log.info("Connections closed");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return userList;
	}

	public List<Customer> addCustomer(Customer custBean) throws BankException {
		List<Customer> custList = new ArrayList<Customer>();
		try {
			con = DBUtil.getConnection();

			pstm = con.prepareStatement(QueryMapper.SIGN_UP_CUSTOMERS);
			pstm.setString(1, custBean.getCustomerName());
			pstm.setString(2, custBean.getEmail());
			pstm.setString(3, custBean.getAddress());
			pstm.setString(4, custBean.getPancard());
			acc = pstm.executeUpdate();

			if (acc != 0) {
				custList.add(custBean);
			}
		} catch (SQLException e) {
			e.printStackTrace();
			throw new BankException("User Details weren't updated");
		} finally {
			try {
				pstm.close();
				con.close();
				log.info("Connections closed");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return custList;
	}

	public int validateUser(int userid, String passwd) throws BankException {
		try {
			con = DBUtil.getConnection();

			pstm = con.prepareStatement(QueryMapper.VALIDATE_USER);
			pstm.setInt(1, userid);
			pstm.setString(2, passwd);
			rst = pstm.executeQuery();
			rst.next();
			int id = rst.getInt(1);
			
			con.close();
			pstm.close();
			log.info("Connections closed");
			if (id != 0) {
				return getDetails(id);
			} else {
				return 0;
			}
		} catch (SQLException e) {
			e.printStackTrace();
			throw new BankException("Account Not found");
		} 
		}
	

	public int getDetails(int id) throws BankException, SQLException {
		int accId = 0;
		con = DBUtil.getConnection();
		try {
			
			pstm = con.prepareStatement(QueryMapper.GET_ACC_DETAILS);
			pstm.setInt(1, id);
			ResultSet rst1 = pstm.executeQuery();
			while(rst1.next())
			{
			accId = rst1.getInt(1);
			
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return accId;

	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public List<AccountMaster> getAccount(int userid) throws BankException {
		
		List<AccountMaster> accList = new ArrayList<AccountMaster>();
		AccountMaster accBean=new AccountMaster();
		
	try {
		con = DBUtil.getConnection();
		pstm = con.prepareStatement(QueryMapper.GET_ACCOUNT);
		pstm.setInt(1, userid);
		ResultSet rst1 = pstm.executeQuery();
		while(rst1.next())
		{
		accBean.setAccountId(rst1.getInt(1));
		accBean.setAccountType(rst1.getString(2));
		accBean.setAccountBalance(rst1.getDouble(3));
		accBean.setOpenDate(rst1.getDate(4));
		accBean.setUserId(rst1.getInt(5));
		accList.add(accBean);
		}
	} catch (SQLException e) {
		e.printStackTrace();
		throw new BankException("Account details nahi aa rahi hai");
		
	}finally {
		try {
			pstm.close();
			con.close();
			log.info("Connections closed");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	return accList;
	}

	public List<UserTable> getUser(int userid) throws BankException{
		List<UserTable> userList = new ArrayList<UserTable>();
		UserTable userBean=new UserTable();
		
	try {
		con = DBUtil.getConnection();
		pstm = con.prepareStatement(QueryMapper.GET_USER);
		pstm.setInt(1, userid);
		ResultSet rst1 = pstm.executeQuery();
		while(rst1.next())
		{
			userBean.setUserId(rst1.getInt(1));
			userBean.setLoginPassword(rst1.getString(2));
			userBean.setSecretQuestion(rst1.getString(3));
			userBean.setSecretAnswer(rst1.getString(4));
			userBean.setLockStatus(rst1.getString(5));
			userList.add(userBean);
			
		}
	} catch (SQLException e) {
		e.printStackTrace();
		throw new BankException("user details nahi aa rahi hai");
	}finally {
		try {
			pstm.close();
			con.close();
			log.info("Connections closed");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	return userList;
	}

	public List<Customer> getCustomer(int userid) throws BankException{
		List<Customer> custList = new ArrayList<Customer>();
		Customer custBean= new Customer();
		
	
	try {
		con = DBUtil.getConnection();
		pstm = con.prepareStatement(QueryMapper.GET_CUSTOMER);
		pstm.setInt(1, userid);
		ResultSet rst1 = pstm.executeQuery();
		while(rst1.next())
		{
			custBean.setCustomerId(rst1.getInt(1));
			custBean.setAccountId(rst1.getInt(2));
			custBean.setUserId(rst1.getInt(3));
			custBean.setCustomerName(rst1.getString(4));
			custBean.setEmail(rst1.getString(5));
			custBean.setAddress(rst1.getString(6));
			custBean.setPancard(rst1.getString(7));
			custList.add(custBean);
		}
	} catch (SQLException e) {
		e.printStackTrace();
		throw new BankException("Customer details nahi aa rahi hai");
	}finally {
		try {
			pstm.close();
			con.close();
			log.info("Connections closed");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	return custList;
}
	
	
	
	
	
	
	public List<Transactions> getTransactions(Object obj) throws BankException{
		List<Transactions> tranList = new ArrayList<Transactions>();
		Transactions tranBean= new Transactions();
		
	
	try {
		con = DBUtil.getConnection();
		pstm = con.prepareStatement(QueryMapper.MINI_STATEMENT);
		pstm.setObject(1, obj);
		ResultSet rst1 = pstm.executeQuery();
		while(rst1.next())
		{
			tranBean.setTransactionId(rst1.getInt(1));
			tranBean.setDateOfTransaction(rst1.getDate(2));
			tranBean.setTranAmount(rst1.getDouble(3));
			tranBean.setAccountId(rst1.getInt(4));
			tranList.add(tranBean);
		}
	} catch (SQLException e) {
		e.printStackTrace();
		throw new BankException("Transactions details nahi aa rahi hai");
	}finally {
		try {
			pstm.close();
			con.close();
			log.info("Connections closed");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	return tranList;
		
	}
	
	
	
	public void updateDetails(int acId,String eMail,String addr) throws BankException {
		try {
			con = DBUtil.getConnection();
			pstm = con.prepareStatement(QueryMapper.UPDATE_USER_DETAILS);
			pstm.setString(1, eMail);
			pstm.setString(2, addr);
			pstm.setInt(3, acId);
			ResultSet rst1 = pstm.executeQuery();
			if(!rst1.next()){
				throw new BankException("Personal Details were not updated");
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
			throw new BankException("Personal details update nahi ho rahi hai");
		}finally {
			try {
				pstm.close();
				con.close();
				log.info("Connections closed");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}

	@Override
	public void insertRequest(int acId) throws BankException {
		try {
			con = DBUtil.getConnection();
			pstm = con.prepareStatement(QueryMapper.REQUEST_CHEQUE_BOOK);
			pstm.setInt(1, acId);
			ResultSet rst1 = pstm.executeQuery();
			if(!rst1.next()){
				throw new BankException("Service request were not updated");
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
			throw new BankException("Service request update nahi ho rahi hai");
		}finally {
			try {
				pstm.close();
				con.close();
				log.info("Connections closed");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	
		
	}

	@Override
	public Boolean validatePayee(int acId, int pId,String pName)
			throws BankException {
		try {
			con = DBUtil.getConnection();
			pstm = con.prepareStatement(QueryMapper.CHECK_ID);
			pstm.setInt(1, acId);
			ResultSet rst = pstm.executeQuery();
			
			
			if(rst.next()){
				PreparedStatement pstm1 = con.prepareStatement(QueryMapper.CHECK_ID);
				pstm1.setInt(1, pId);
				ResultSet rst1 = pstm1.executeQuery();
				if(rst1.next()){
					PreparedStatement pstm2 = con.prepareStatement(QueryMapper.ADD_PAYEE);
					pstm2.setInt(1, pId);
					pstm2.setInt(2, acId);
					pstm2.setString(3, pName);
					ResultSet rst2 = pstm2.executeQuery();
					if(rst2.next()){
						return true;
					}
					else{
						return false;
					}
				}
				else{
					throw new BankException("Payee Account_id is invalid");
				}
				}
				else{
					throw new BankException("Account_id is invalid");
				}
				
		} catch (SQLException e) {
			e.printStackTrace();
			throw new BankException("Service request update nahi ho rahi hai");
		}finally {
			try {
				pstm.close();
				con.close();
				log.info("Connections closed");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
			}

	@Override
	public Boolean updateTrans(int acId, int pId, int tAmt)
			throws BankException {
		try {
			con = DBUtil.getConnection();
			pstm = con.prepareStatement(QueryMapper.UPDATE_USER_ACCOUNT);
			pstm.setInt(1, tAmt);
			pstm.setInt(2, acId);
			ResultSet rst = pstm.executeQuery();
			System.out.println("1"+rst);
			
			if(rst.next()){
				int amt=-tAmt;
				PreparedStatement pstm1 = con.prepareStatement(QueryMapper.UPDATE_USER_ACCOUNT);
				pstm1 .setInt(1, amt);
				pstm1 .setInt(2, pId);
				ResultSet rst1 = pstm.executeQuery();
				System.out.println("2"+rst1);
			
				if(rst1.next()){
					PreparedStatement pstm2 = con.prepareStatement(QueryMapper.UPDATE_TRANSACTION);
					pstm2.setInt(1, tAmt);
					pstm2.setInt(2, pId);
					ResultSet rst2 = pstm2.executeQuery();
					System.out.println("3"+rst2);
					if(rst2.next()){
						PreparedStatement pstm3 = con.prepareStatement(QueryMapper.UPDATE_FUND_TRANSFER);
						pstm3.setInt(1, acId);
						pstm3.setInt(2, tAmt);
						pstm3.setInt(3, pId);
						ResultSet rst3 = pstm3.executeQuery();
						System.out.println("4"+rst3);
						if(rst3.next()){
						return true;
					}
					else{
						return false;
					}
				}
				else{
					throw new BankException("Trnsaction table nahi hua");
				}}
				else{
					throw new BankException("payee nahi hua");
				}}else{
					throw new BankException("account nahi hua");
				}
				
		}catch (SQLException e) {
			e.printStackTrace();
			throw new BankException("trans update nahi ho rahi hai");
		}finally {
			try {
				pstm.close();
				con.close();
				log.info("Connections closed");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

	@Override
	public Boolean changePwd(int uId, String newPwd) throws BankException {
		try {
			con = DBUtil.getConnection();
			pstm = con.prepareStatement(QueryMapper.UPDATE_USER_PASSWORD);
			pstm.setString(1, newPwd);
			pstm.setInt(2, uId);
			ResultSet rst1 = pstm.executeQuery();
			if(!rst1.next()){
				return false;
			}
			else
			{
				return true;
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
			throw new BankException("password  update nahi ho rahi hai");
		}finally {
			try {
				pstm.close();
				con.close();
				log.info("Connections closed");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
				
		
	}

	@Override
	public List<ServiceTracker> getStatus(int reqId) throws BankException {
		List<ServiceTracker> trackList=new ArrayList<ServiceTracker>(); 
		try {
			con = DBUtil.getConnection();
			pstm = con.prepareStatement(QueryMapper.TRACK_SERVICE);
			pstm.setInt(1, reqId);
			ResultSet rst1 = pstm.executeQuery();
			while(rst1.next()){
				trackBean.setServiceId(rst1.getInt(1));
				trackBean.setAccountId(rst1.getInt(2));
				trackBean.setServiceRaisedDate(rst1.getDate(3));
				trackBean.setServiceStatus(rst1.getString(4));
				trackList.add(trackBean);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
			throw new BankException("password  update nahi ho rahi hai");
		}finally {
			try {
				pstm.close();
				con.close();
				log.info("Connections closed");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return trackList;
	}
	
	
	}
