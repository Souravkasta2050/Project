<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<link rel="stylesheet" type="text/css" href="signup.css">  

<title>Sign Up Page</title>
</head>


<body>

	<hr>
	<center>
	<div class="container ">
			<div class="jumbotron1">
			
<br/>
	<p align="left" class="head">  SBD Bank</p>
	<h6 align="left" class="welcome1">(Your Faithful And Friendly Financial Partner)</h6>
	<form action="Login.jsp" method="post">
		<table align="right">
			<tr>
				<td><input type="submit" name="LogIn" class="btn btn-success tilt" value="Sign In"></td>
			</tr>
		</table>
	</form>
	<br>
	<br>
	

</div></div>
</center>

	<hr>


	<center>
		<div class="container ">
			<div class="jumbotron">

				<h2 class="welcome">Welcome to SBD Bank</h2>
				<hr>
				<h3 class="login">Sign Up</h3>
				<form action="SignUp" method="post">

					<table align="center">
						<tr>
							<!-- <td><b>Customer Name: </b></td>
	 	-->
							<td><input type="text" name="custName"
								placeholder="Enter customer name" class="form-control"
								pattern="^[A-Z][a-z]{5,}"
								title="Customer Name should start with an Uppercase And should be at least 5 characters long"
								required></td>
						</tr>
						
						<tr>
							<!-- <td><b>E-Mail: </b></td>
	 -->
							<!-- Validating the Last Name -->

							<td><input type="text" name="email"
								placeholder="Enter your email id" class="form-control"
								pattern="^[a-z./_]{20}+@[a-z]{10}[.a-z]{2,6}"
								title="Email address can not contain Uppercase letters and whitespaces"
								required></td>
						</tr>

						<tr>
							<!-- <td><b>Address: </b></td>
	 -->
							<td><textarea rows='3' cols='20' name="address"
									placeholder="Enter your address" class="form-control" required></textarea></td>
						</tr>
						<tr>
							<!-- <td ><b>Security Question: </b></td>
	 -->
						</tr>
						<tr>
							<td><select name="SecQues"
								placeholder="Enter secret question" class="form-control"
								required>
									<option selected disabled>Please Select Security
										Question</option>
									<option>What is your favourite Pet</option>
									<option>What's your first school name</option>
									<option>What's your Mother's Maiden Name</option>
									<option>What's your favourite Dish</option>
							</select></td>
						</tr>
						<tr>
							<!-- <td><b>Security Answer: </b></td> -->
							<td><input type="text" name="SecAns"
								placeholder="Enter your answer" class="form-control"
								pattern="^[A-Za-z]{3,}"
								title="Security answer can not contain any special character or any number"
								required></td>
						</tr>
						<tr>
							<!-- <td><b>Account Balance: </b></td>
	 -->
							<td><input type="number" name="AccBal"
								placeholder="Enter your account balance" class="form-control"
								pattern="^[0-9]{10,2}"
								title="Balance Can not contain 0 or negative value" required>
							</td>
						</tr>
						<tr>
							<!-- <td><b>Pan Card: </b></td>
	 -->
							<!-- Validating the Mobile Number -->
							<td><input type="text" name="panNo"
								placeholder="Enter your PAN number" class="form-control"
								pattern="[A-Z]{5}[0-9]{4}[A-Z]{1}"
								title="Pan Number's first 5 charcters must be alphabets,next 4 characters should be digit and the last character must be an alphabet."
								required></td>
						</tr>
						<tr>
							<!-- <td><b>Account Type: </b></td>
	 -->
							<td><select name="accountType"
								placeholder="Enter Account type" class="form-control" required>
									<option selected disabled>Please Select Account Type</option>
									<option>Savings</option>
									<option>Current</option>
									<option>Salary</option>
							</select></td>
						</tr>
						<tr>
							<!-- <td><b>Password: </b></td>
	 -->
							<td><input type="password" name="pwd"
								placeholder="Create password" class="form-control"
								pattern="^[A-Z][0-9][a-z]{6,15}"
								title="Password should consists at least one number one special character one UpperCase and minimum 8 characters"
								required></td>
						</tr>
						<tr>
							<!-- 
	<td><b>Confirm Password: </b></td> -->
							<td><input type="password" name="cnfPwd"
								placeholder="Confirm password" class="form-control"
								pattern="^[A-Z][0-9][a-z]{6,15}"
								title="Password should consists at least one number one special character one UpperCase and minimum 8 characters"
								required></td>
						</tr>
						<tr>
						<td></td>
						
						<td></td>
						</tr>
						<tr>

							<td><input type="submit" value="Add Customer"
								class="btn btn-success tilt" /></td>
							<td></td>

						</tr>
					</table>
				</form>
				<hr>
</body>

<!-- <body>

	<form action="Login.jsp" method="post">
		<table align="right">
			<tr>
				<td><input type="submit" name="LogIn" value="Sign In"></td>
			</tr>
		</table>
	</form>
	<br>
	<br>

	<hr>

	<header>
	<h1 align="center">
		<u>Welcome to Pandav Bank</u>
	</h1>
	<hr>
	</header>


	<h2 align="center">Sign Up</h2>
	<form action="SignUp" method="post">

		<table align="center">
			<tr>
				<td><b>Customer Name: </b></td>
				Validating the First Name
				<td><input type="text" name="custName"
					pattern="^[A-Z][a-z]{5,}"
					title="Customer Name should start with an Uppercase And should be at least 5 characters long"
					required></td>
			</tr>
			<tr>
				<td><b>E-Mail: </b></td>
				Validating the Last Name
				<td><input type="text" name="email"
					pattern="^[a-z./_]{20}+@[a-z]{10}[.a-z]{2,6}"
					title="Email address can not contain Uppercase letters and whitespaces"
					required></td>
			</tr>
			<tr>
				<td><b>Address: </b></td>
				<td><textarea rows='3' cols='20' name="address" required></textarea></td>
			</tr>
			<tr>
				<td><b>Security Question: </b></td>
				<td><select name="SecQues" required>
						<option selected disabled>Please Select Security Question</option>
						<option>What is your favourite Pet</option>
						<option>What's your first school name</option>
						<option>What's your Mother's Maiden Name</option>
						<option>What's your favourite Dish</option>
				</select></td>
			</tr>
			<tr>
				<td><b>Security Answer: </b></td>
				<td><input type="text" name="SecAns" pattern="^[A-Za-z]{3,}"
					title="Security answer can not contain any special character or any number"
					required></td>
			</tr>
			<tr>
				<td><b>Account Balance: </b></td>
				<td><input type="number" name="AccBal" pattern="^[0-9]{10,2}"
					title="Balance Can not contain 0 or negative value" required>
				</td>
			</tr>
			<tr>
				<td><b>Pan Card: </b></td>
				Validating the Mobile Number
				<td><input type="text" name="panNo"
					pattern="[A-Z]{5}[0-9]{4}[A-Z]{1}"
					title="Pan Number's first 5 charcters must be alphabets,next 4 characters should be digit and the last character must be an alphabet."
					required></td>
			</tr>
			<tr>
				<td><b>Account Type: </b></td>
				<td><select name="accountType" required>
						<option selected disabled>Please Select Account Type</option>
						<option>Savings</option>
						<option>Current</option>
						<option>Salary</option>
				</select></td>
			</tr>
			<tr>
				<td><b>Password: </b></td>
				<td><input type="password" name="pwd"
					pattern="^[A-Z][0-9][a-z]{6,15}"
					title="Password should consists at least one number one special character one UpperCase and minimum 8 characters"
					required></td>
			</tr>
			<tr>
				<td><b>Confirm Password: </b></td>
				<td><input type="password" name="cnfPwd"
					pattern="^[A-Z][0-9][a-z]{6,15}"
					title="Password should consists at least one number one special character one UpperCase and minimum 8 characters"
					required></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="Add Customer" /></td>
			</tr>
		</table>
	</form>
	<hr>

</body> -->
</html>