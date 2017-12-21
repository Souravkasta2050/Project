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

<link rel="stylesheet" type="text/css" href="Login.css">

<title>Log In Page</title>

</head>
<!-- <style>
        .jumbotron{
          background-color: #4d94ff;
          width: 35%;
        }
        .tilt{
          float: right;
        }
        .login{
        	color: white;
        }
      </style> -->
      <!-- <body>
        <center>
        <div class="container ">
          
          <div class="jumbotron">
          <h2 class="login">Login Page</h2>
            <from action="SignIn" method="post">
            <table class="table" caption="Sign Up">
              <tr>
                <td>
                  <input type="text" name="userId" placeholder="Enter your username" class="form-control" pattern="^[A-Z][A-Za-z]{3,}"/>
                </td>
              </tr>
              <tr>
                <td>
                  <input type="password" name="password" placeholder="Enter your password" class="form-control" pattern="^[A-Z]{1,}[0-9]{1,}[2!-_]{1,}[a-z]{3,6}" minlength="8"/>
                </td>
              </tr>
              <tr>
                <td>
                  <input type="submit" value="Login" class="btn btn-success tilt" />
                </td>
              </tr>
            </table>
          </form>
          </div>
        </div>
</center>
      </body>  -->
      
 <body>

	<center>
		<div class="container ">

			<div class="jumbotron">
			
			<h2 class="login">Login Page</h2>

				<form action="SignIn" method="post">
					<table caption="Sign In">
						<tr>
							<!-- <td><b>User Id: </b></td> -->
							
							<td><input type="text" name="userId" pattern="^[0-9]{3,}"
								placeholder="Enter your username" class="form-control" required></td>
						</tr>
						<tr>
							<!-- <td><b>Password: </b></td> -->
							<td><input type="password" name="password"
								pattern="^[A-Z][0-9][a-z]{6,15}"
								placeholder="Enter your password" class="form-control" required>
							</td>
						</tr>
						<tr>
							<td><input type="submit"
								value="Log In" class="btn btn-success tilt"></td>
						</tr>
					</table>
				</form>
	</center>
</body>  
</html>