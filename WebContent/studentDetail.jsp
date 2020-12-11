<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student Detail</title>
</head>
<body>
	<%@ include file="header.jspf" %>
	<h1>${student.studentName }</h1>
	<table class="table table-bordered table-hover">
			<thead class="thead-dark">
				<th>Name</th>
				<th>Course</th>
				<th>Email</th>
				<th>City</th>
				<th>Action</th>
			</thead>
			<tbody>
					<tr>
						<td>${student.studentName }</td>
						<td>${student.course }</td>
						<td>${student.email }</td>
						<td>${student.city }</td>
						<td><a href="studentDetail?student_id=${student.studentId}">Detail</a></td>
					</tr>
			</tbody>
		</table>
</body>
</html>