<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customer Confirmation</title>
</head>
<body>
	<div>
		<h2>Customer Confirmation</h2><br><br>
		The customer is confirmed :<b> ${customer.firstName } ${customer.lastName } </b><br/><br/>
		Free Passes : ${customer.freePasses } <br/><br/>
		Postal Code : ${customer.postalCode }<br/><br/>
		Course Code : ${customer.courseCode }<br/><br/>
		<br/><br/><a href="main-menu">Home</a>
	</div>
</body>
</html>