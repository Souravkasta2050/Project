<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="TrackRequest" method="post">
<table caption="Tracking the Status" align="center">
<tr>
	<td><b>Request Id: </b></td>
	
	<td><input type="number" name="reqId" pattern="^[0-9]{4}" title="The Request Id must contain 4 digits" required></td>
</tr>
<tr>
<td colspan="2" align="center"><input type="submit" value="Get Status"></td></tr>
</table>
</form>
</body>
</html>