<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body background="biege">
	<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="s"%>

	<form action="Index.jsp" target="_parent" method="post">
		<table align="right">
			<tr>
				<td><input type="submit" name="logOut" value="Log Out"></td>
			</tr>
		</table>
	</form>
	<br>
	<br>

	<hr>


	<h1 align="center">
		<u>Welcome to Pandav Bank</u>
	</h1>

	<hr>
	<s:forEach var="accList" items="${accList}">
		<s:forEach var="userList" items="${userList}">
			<s:forEach var="custList" items="${custList}">

				<h2>Hello ${custList.customerName}</h2>
				<table>
					<tr>
						<td>Account Number</td>
						<td>${accList.accountId}</td>
					</tr>
					<tr>
						<td>Account Balance</td>
						<td>${accList.accountBalance}</td>
					</tr>
					<tr>
						<td>Account Type</td>
						<td>${accList.accountType}</td>
					</tr>

				</table>
			</s:forEach>
		</s:forEach>
	</s:forEach>
</body>
</html>