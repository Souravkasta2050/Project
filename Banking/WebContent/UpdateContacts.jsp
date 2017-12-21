<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<header>
	<h1 align="center">
		<u>Welcome to Pandav Bank</u>
	</h1>
	<hr>
	</header>


	<h2 align="center">Update Details</h2>
	<form action="UpdateDetails" method="post">

		<table align="center">
			
			<tr>
				<td><b>E-Mail: </b></td>
				<!-- Validating the Last Name -->
				<td><input type="text" name="email"
					pattern="^[a-z./_]{20}+@[a-z]{10}[.a-z]{2,6}" 
					title="1)Email address can not contain Uppercase letters and whitespaces 2)If you don't want to update it, enter the old email"
					required></td>
			</tr>
			<tr>
				<td><b>Address: </b></td>
				<td><textarea rows='3' cols='20' name="address" title="1)If you don't want to update it, enter the old Address" required></textarea></td>
			</tr>
						<tr>
				<td></td>
				<td><input type="submit" value="Update Details" /></td>
			</tr>
		</table>
	</form>
	<hr>

</body>
</html>