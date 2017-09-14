<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
			<title>Shopping Cart!!</title>
</head>
	<body>

		<form method ="get" action="cart">
		  Enter the name of the item: <input type="text" name="name" value="Name"></br>
		   Enter the quantity of the item: <input type="text" name="quantity" value="Quantity"></br>
		
			<input input type="submit" name="addCookie" value="Add Cookie"></br>
			<input input type="submit" name="listCookie" value="list Cookies"></br>
		</form>

	</body>
</html>