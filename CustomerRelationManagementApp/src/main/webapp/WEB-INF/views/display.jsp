<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<table>
		<tr>
			<th>Cid</th>
			<th>Name</th>
			<th>Address</th>
			<th>DOB</th>
			<th>Gender</th>
			<th>Country</th>
		</tr>
		<c:forEach var="customer" items="${customers}">
			<tr>
				<td>${customer.cid}</td>
				<td>${customer.name}</td>
				<td>${customer.address}</td>
				<td>${customer.dob}</td>
				<td>${customer.gender}</td>
				<td>${customer.country }</td>
				<td><a href="#">Edit</a></td>
				<td><a href="#">Delete</a></td>
			</tr>
		</c:forEach>
	</table>

</body>
</html>