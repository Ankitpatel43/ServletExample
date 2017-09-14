<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>   
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
		<head>
			<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
			<title>Insert title here</title>
		</head>
	<body>
      <h1> Today is the ${dayOfTheWeek} 
      
      <%-- 
      <%
        int day = (int)request.getAttribute("dayOfTheWeek");
        if(day==1)
        	out.print("st ");
        else if(day==2)
        	out.print("nd ");
        else if(day==3)
        	out.print("rd ");
        else
        	out.print("th ");
      %>
      
      --%>
      
     
      
      	<c:choose>
    			<c:when test="${dayOfTheWeek==1}">
          			st
    			</c:when>
    			<c:when test="${dayOfTheWeek==2}">
          			nd
    			</c:when>
    			<c:when test="${dayOfTheWeek ==3}">
          			rd
    			</c:when>
    			<c:otherwise>
          			th
    			</c:otherwise>
		</c:choose>
         day of the week</h1>
      
	</body>
</html>