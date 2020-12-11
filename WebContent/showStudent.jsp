
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>All Students</title>
</head>
<body>
<%@ include file="header.jspf" %>
<br/>
	<a href="showAllStudent">Show Details</a>
	<div class="container">
		<table class="table table-bordered table-hover">
			<thead class="thead-dark">
				<th>Name</th>
				<th>Course</th>
				<th>Email</th>
				<th>City</th>
				<th>Action</th>
			</thead>
			<tbody>
				<c:forEach items="${students }" var="student">
					<tr>
						<td>${student.studentName }</td>
						<td>${student.course }</td>
						<td>${student.email }</td>
						<td>${student.city }</td>
						<td><a href="studentDetail?student_id=${student.studentId}">Detail</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>