<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
			</c:forEach>
		</tr>
	</pre>
</table>

</body>
</html>