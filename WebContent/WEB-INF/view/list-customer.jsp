<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>List of customers</title>
</head>
<body>
	<center>LIST OF STUDENTS</center>
	<table>
		<tr>
			<th>Id</th>
			<th>Firstname</th>
			<th>Lastname</th>
			<th>Email</th>
		</tr>
		<c:forEach items="${customers}" var="customer">
			<tr>
				<td>${customer.id}</td>
				<td>${customer.firstName}</td>
				<td>${customer.lastName}</td>
				<td>${customer.emai}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>