<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registration</title>
</head>
<body>
<%@ include file="header.jspf" %>
	<form action="register" method="post">
		<input type="text" name="studentName" placeholder="Student Name"/><br/>
		<input type="text" name="course" placeholder="Course"/><br/>
		<input type="text" name="firstName" placeholder="First Name"/><br/>
		<input type="text" name="lastName" placeholder="Last Name"/><br/>
		<input type="text" name="addLine1" placeholder="Add Line 1"/><br/>
		<input type="text" name="addLine2" placeholder="Add Line 2"/><br/>
		<input type="text" name="city" placeholder="City"/><br/>
		<input type="text" name="state" placeholder="State"/><br/>
		<input type="text" name="pin" placeholder="Pin"/><br/>
		<input type="text" name="mobile" placeholder="Mobile"/><br/>
		<input type="text" name="email" placeholder="Email"/><br/>
		<input type="text" name="password" placeholder="Password"/><br/>
		<input type="submit"/>
		
	</form>
</body>
</html>