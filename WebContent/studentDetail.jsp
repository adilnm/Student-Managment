<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student Detail</title>
</head>
<body>
	<%@ include file="header.jspf" %>
	<div class="container">
		<h4>Name: ${student.studentName }</h4>
		<h4>Course: ${student.course }</h4>
		<h4>City: ${student.city }</h4>
		<h4>State: ${student.state }</h4>
		<h4>Phone: ${student.mobile }</h4>
		<h4>Email: ${student.email }</h4>
		</div>
	
</body>
</html>