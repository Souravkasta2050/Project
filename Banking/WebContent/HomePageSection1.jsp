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

	<form action="Operations" method="post" target="_blank">
	
	<table>
	
		<tr>
			<td><input type="submit" name="miniStmt"
				value="Get Mini Statement"></td>
		</tr>
		
		<tr>
			<td><input type="submit" name="updateDetails"
				value="Update Personal Details"></td>
		</tr>
		<tr>
			<td><input type="submit" name="chequeBook"
				value="Apply for Cheque Book"></td>
		</tr>
		<tr>
			<td><input type="submit" name="fundTransfer"
				value="Fund Transfer"></td>
		</tr>
		<tr>
			<td><input type="submit" name="chngPwd"
				value="Change Password"></td>
		</tr>
		<tr>
			<td><input type="submit" name="trckReq"
				value="View Cheque Book Status"></td>
		</tr>
	
	</table>
	</form>
</body>
</html>