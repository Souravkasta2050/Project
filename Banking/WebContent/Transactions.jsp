<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="s"%>

	<p>Account Number : ${accObj }</p>



	<table border="1">
		
			<tr>
				<th>Transaction Id</th>
				<th>Transaction Date</th>
				<th>Transaction Amount</th>
				<th>AccountID</th>
			</tr>
			<s:forEach var="tranList" items="${tranList}">
			<tr>
				<td>${tranList.transactionId}</td>
				<td>${tranList.dateOfTransaction}</td>
				<td>${tranList.tranAmount}</td>
				<td>${tranList.accountId}</td>
			</tr>
		</s:forEach>
	</table>


</body>
</html>