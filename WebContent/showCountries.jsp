<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
		<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
			<title>Friendly Countries</title>
		</head>
	<body>
	
	    <ul style="list-style: lower-greek;">
		<c:forEach items="${countries}" var="country">
			<li>
			   ${country}
			</li>
		 
		</c:forEach>
		</ul>
		
		 <ul style="list-style: upper-alpha;">
			<c:forTokens items="Thomas, William, Bunty, Andres, Icaro, Jonathan" delims=", " var="trainee">
		
				<li>
				  ${trainee}
				</li>
			</c:forTokens>
		
		</ul>
	</body>
</html>