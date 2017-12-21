<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="FundTransfer">
<table>
					<tr>
						<td>Payee Account Number</td>
						<td><input type="number" name="recId" pattern="[1-9][0-9]{9}" title="Account Id should be a valid 10 digit number" required></td>
					</tr>
					<tr>
						<td>Amount</td>
						<td><input type="number" name="amt" min="1" title="Amount can't be less than 1" required></td>
					</tr>
					<tr>
						<td></td>
						<td></td>
					</tr>
					<tr>
						<td colspan="2" align="center"><input type="submit" name="Register Payee"></td>
						
					</tr>

				</table>
</form>

</body>
</html>