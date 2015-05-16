<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>UserAdd</title>
</head>
<body>
<form action="/userBD" method="post">			
			 Please enter all data<br>
			login:<input type="text" name="login"size="20px"><br>
			password:<input type="password" name="password"size="20px"><br>
			firstname:<input type="text" name="firstname"size="20px"><br>
			lastname:<input type="text" name="lastname"size="20px"><br>
			male<input type="radio" name="gender"  value="male" size="20px">
  			 female<input type="radio" name="gender" value="female" size="20px"><br>
			age:<input type="text" name="age"size="20px"><br>
			
			<input type="submit" value="submit"><br>						
		</form>	
</body>
</html>