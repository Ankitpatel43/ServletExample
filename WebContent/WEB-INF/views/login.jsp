<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login page</title>
</head>
<body>
         <h1>Welcome to our application</h1>
         <p>${errorMsg}</p>
  <form action="handleLogin" method="post">
  
       Username: <input type="text" name="username" required="required"><br /> 
       Password: <input type="password" name="password" required="required"><br /> 
       <input type="submit" value="login">
     
  </form>

</body>
</html>