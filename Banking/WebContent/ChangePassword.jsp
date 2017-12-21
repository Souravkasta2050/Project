<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2 align="center">Chenage Password</h2>
	<form action="ChangePwd" method="post">

		<table align="center">

			<tr>
				<td><b>Current Password: </b></td>
				<td><input type="password" name="curPass"
					pattern="^[A-Z][0-9][a-z]{6,15}"
					title="Password should consists at least one number one special character one UpperCase and minimum 8 characters"
					required></td>
			</tr>
			<tr>
				<td><b>New Password: </b></td>
				<td><input type="password" name="newPass"
					pattern="^[A-Z][0-9][a-z]{6,15}"
					title="Password should consists at least one number one special character one UpperCase and minimum 8 characters"
					required></td>
			</tr>
			<tr>
				<td><b>Confirm Password: </b></td>
				<td><input type="password" name="cnfPass"
					pattern="^[A-Z][0-9][a-z]{6,15}"
					title="Password should consists at least one number one special character one UpperCase and minimum 8 characters"
					required></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="Update Password" /></td>
			</tr>
		</table>
	</form>

</body>
</html>