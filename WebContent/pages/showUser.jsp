<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Show user</title>
</head >
<body >

<table border="1" width="100%">

<tr >
 			<td>Login</td>
 			<td>Password</td>
 			<td>Firstname</td>
 			<td>Lastname</td>
 			<td>Gender</td>
 			<td>Age</td>
 			</tr>
 		
 <c:forEach items="${users}" var="user">
 			<tr>
 			<td>${user.getLogin()} </td>
 			<td>${user.getPassword()} </td>
 			<td>${user.getFirstname()} </td>
 			<td>${user.getLastname()} </td>
 			<td>${user.getGender()} </td>
 			<td>${user.getAge()} </td>
 			</tr>
     
    </c:forEach>
    
</table>
</body>
</html>