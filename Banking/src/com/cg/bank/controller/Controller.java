package com.cg.bank.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cg.bank.dto.AccountMaster;
import com.cg.bank.dto.Customer;
import com.cg.bank.dto.ServiceTracker;
import com.cg.bank.dto.Transactions;
import com.cg.bank.dto.UserTable;
import com.cg.bank.exception.BankException;
import com.cg.bank.service.BankService;
import com.cg.bank.service.BankServiceImplementation;

/**
 * Servlet implementation class Controller
 */
@WebServlet(urlPatterns = { "/SignUp", "/SignIn", "/Operations",
		"/UpdateDetails", "/RegisterPayee", "/FundTransfer", "/ChangePwd",
		"/TrackRequest" })
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
	BankService bankService;
	AccountMaster accBean;
	Customer custBean;
	UserTable userBean;
	ServiceTracker trackBean;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Controller() {
		super();
		accBean = new AccountMaster();
		custBean = new Customer();
		userBean = new UserTable();
		bankService = new BankServiceImplementation();
	}

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		RequestDispatcher dispatch = null;
		String path = request.getServletPath();
		String url = "";

		List<AccountMaster> accList;
		List<UserTable> userList;
		List<Customer> custList;
		List<ServiceTracker> trackList;

		switch (path) {

		case "/SignUp":

			accBean.setAccountType(request.getParameter("accountType"));
			accBean.setAccountBalance(Integer.parseInt((request
					.getParameter("AccBal"))));

			custBean.setCustomerName(request.getParameter("custName"));
			custBean.setEmail(request.getParameter("email"));
			custBean.setAddress(request.getParameter("address"));
			custBean.setPancard(request.getParameter("panNo"));

			userBean.setSecretQuestion(request.getParameter("SecQues"));
			userBean.setSecretAnswer(request.getParameter("SecAns"));

			String pwd = request.getParameter("pwd");
			if (pwd.equals(request.getParameter("cnfPwd"))) {
				userBean.setLoginPassword(pwd);
			}

			try {
				userList = bankService.addUser(userBean);
				accList = bankService.addAccount(accBean);
				custList = bankService.addCustomer(custBean);
				url = "Login.jsp";
				break;
			} catch (BankException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		case "/SignIn":
			int userid = (Integer.parseInt(request.getParameter("userId")));
			int accId = 0;
			String passwd = (request.getParameter("password"));
			HttpSession session = request.getSession();
			session.setAttribute("user", userid);

			try {
				accId = bankService.validateUser(userid, passwd);
				if (accId != 0) {
					/* accBean.setAccountId(accId); */

					userList = bankService.getUser(userid);
					accList = bankService.getAccount(userid);
					custList = bankService.getCustomer(userid);
					session.setAttribute("accList", accList);
					session.setAttribute("userList", userList);
					session.setAttribute("custList", custList);
					session.setAttribute("accId", accId);
					url = "HomePage.jsp";
				}
			}

			catch (BankException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			break;

		case "/Operations":

			if ("Get Mini Statement".equals(request.getParameter("miniStmt"))) {
				session = request.getSession();

				try {
					Object obj = session.getAttribute("accId");

					List<Transactions> tranList = bankService
							.getTransactions(obj);
					session.setAttribute("accObj", obj);
					session.setAttribute("tranList", tranList);
					url = "Transactions.jsp";
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			}

			else if ("Update Personal Details".equals(request
					.getParameter("updateDetails"))) {

				session = request.getSession();

				try {

					Object obj = session.getAttribute("accId");
					url = "UpdateContacts.jsp";

				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				break;

			}

			else if ("Apply for Cheque Book".equals(request
					.getParameter("chequeBook"))) {

				session = request.getSession();

				try {

					Object obj = session.getAttribute("accId");

					int acId = (Integer) obj;
					System.out.println(acId);
					bankService.insertRequest(acId);
					url = "UpdateSuccess.jsp";
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				break;

			}

			else if ("Fund Transfer".equals(request
					.getParameter("fundTransfer"))) {

				session = request.getSession();

				try {
					url = "RegisterPayee.jsp";
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				break;

			}

			else if ("Change Password".equals(request.getParameter("chngPwd"))) {

				try {
					url = "ChangePassword.jsp";
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				break;

			} else if ("View Cheque Book Status".equals(request
					.getParameter("trckReq"))) {

				try {
					url = "TrackRequest.jsp";
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				break;
			}

		case "/UpdateDetails":

			session = request.getSession();

			try {
				System.out.println("Update wala hai");
				Object obj = session.getAttribute("accId");
				String eMail = request.getParameter("email");
				String addr = request.getParameter("address");
				int acId = (Integer) obj;
				System.out.println(acId);
				bankService.updateDetails(acId, eMail, addr);
				url = "UpdateSuccess.jsp";
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;

		case "/RegisterPayee":

			session = request.getSession();

			try {
				System.out.println("Register Payee");
				Object obj = session.getAttribute("accId");
				int pId = Integer.parseInt(request.getParameter("payeeAccId"));
				String pName = request.getParameter("payeeNickName");
				int acId = (Integer) obj;
				System.out.println(acId);
				System.out.println(pId);
				System.out.println(pName);
				Boolean available = bankService.validatePayee(acId, pId, pName);
				if (available) {
					url = "FundTransfer.jsp";
				} else {
					url = "UpdateFailed.jsp";
				}

			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;

		case "/FundTransfer":

			session = request.getSession();

			try {
				System.out.println("Trnaasction Payee");
				Object obj = session.getAttribute("accId");
				int pId = Integer.parseInt(request.getParameter("recId"));
				int tAmt = Integer.parseInt(request.getParameter("amt"));
				int acId = (Integer) obj;
				System.out.println("acc: " + acId);
				System.out.println("acc: " + pId);
				System.out.println("acc: " + tAmt);
				Boolean available = bankService.updateTrans(acId, pId, tAmt);
				if (available) {
					url = "UpdateSuccess.jsp";
				} else {
					url = "UpdateFailed.jsp";
				}

			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;

		case "/ChangePwd":

			session = request.getSession();
			int uId = (Integer) session.getAttribute("user");
			try {
				System.out.println("Password wala");

				String oldPwd = request.getParameter("curPass");
				String newPwd = request.getParameter("newPass");
				String cnfPwd = request.getParameter("cnfPass");
				System.out.println("acc: " + oldPwd);
				System.out.println("acc: " + newPwd);
				System.out.println("acc: " + cnfPwd);

				accId = bankService.validateUser(uId, oldPwd);
				if (accId != 0) {
					if (newPwd.equals(cnfPwd)) {
						boolean available = bankService.changePwd(uId, newPwd);

						if (available) {
							url = "UpdateSuccess.jsp";
						} else {
							url = "UpdateFailed.jsp";
						}
					}
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
			
		case "/TrackRequest":

			session = request.getSession();

			try {
				System.out.println("Track Req");
				
/*				trackBean.setServiceId(Integer.parseInt(request.getParameter("reqId")));
				userList = bankService.addUser(userBean);*/
				
				int reqId=Integer.parseInt(request.getParameter("reqId"));
				trackList =bankService.getStatus(reqId);
				System.out.println(trackList);
				session.setAttribute("trackList", trackList);
				/*session.setAttribute("reqId", reqId);*/
				url="DisplayStatus.jsp";

			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;



		}

		RequestDispatcher rd = request.getRequestDispatcher(url);
		rd.forward(request, response);
	}
}
