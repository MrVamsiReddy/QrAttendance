<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update</title>
</head>
<body>
	<h2 style="color:Tomato;">Mark Attendance</h2>
	<form action="SaveUpdate" method="post">
		<pre>
			id         <input type="text" name="id" value="${update.id}" readonly>
			name 	   <input type="text" name="name" value="${update.name}" readonly/>
			department <input type="text" name="department" value="${update.department}" readonly/>
			year       <input type="text" name="year" value="${update.year}" readonly/>
			attended   <input type="text" name="attended" value="${update.attended}" />
			email 	   <input type="text" name="email" value="${update.email}" readonly/>
			mobile 	   <input type="text" name="mobile" value="${update.mobile}" readonly/>
			<input type="submit" value="update Attendance"/>
		</pre>
	</form>
</body>
</html>