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
	<h2>Request Status</h2>
	<table border="1">
		<tr>
			<td>Service Id</td>
			<td>Account Id</td>
			<td>Request Raised Date</td>
			<td>Status</td>
		</tr>

		<s:forEach var="trackList" items="${trackList}">
		
			<tr>
				<td>${trackList.serviceId}</td>
				<td>${trackList.accountId}</td>
				<td>${trackList.serviceRaisedDate}</td>
				<td>${trackList.serviceStatus}</td>

			</tr>
		</s:forEach>
	</table>
</body>
</html>