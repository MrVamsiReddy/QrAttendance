<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registrations</title>
</head>
<body>
<table BORDER="1">
	<pre>
		<tr>
			<th>Id</th>
			<th>Name</th>
			<th>Department</th>
			<th>Year</th>
			<th>Attended</th>
			<th>Email</th>
			<th>Mobile</th>
			<th>Delete</th>
			<th>Update Attendance</th>
		</tr>
			<c:forEach items="${tabledata}" var="td">
		<tr>
				<td>${td.id}</td>
				<td>${td.name}</td>
				<td>${td.department}</td>
				<td>${td.year}</td>
				<td>${td.attended}</td>
				<td>${td.email}</td>
				<td>${td.mobile}</td>
				<td><a href="DelReg?id=${td.id}">delete</a></td>
				<td><a href="UpdateReg?id=${td.id}">update</a></td>
			</c:forEach>
		</tr>
	</pre>
</table>

</body>
</html>