<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<title>Register</title>
<head>
<meta charset="ISO-8859-1">
<h2 style="color:Tomato;">Register here</h2>
</head>
<body>
	<form action="saveindex" method="post">
		<pre>
			id   	    <input type="text" name="id" />
			name  	    <input type="text" name="name" />
			department  <input type="text" name="department" />
			year 	    <input type="text" name="year" />
			attended    <input type="text" name="attended" />
			email 	    <input type="text" name="email" />
			mobile 	    <input type="text" name="mobile" />
			            <input type="submit" value="Register"/>
		</pre>
	</form>
	${msg}
</body>
</html>