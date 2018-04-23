<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Courses</title>
</head>
<body>

	<h1>Welcome, ${currentUser.username}</h1> <br>
	
	<h3>Courses</h3>
	
	<div>
		<table>
			<tr>
				<th>Course</th>
				<th>Instructor</th>
				<th>Signups</th>
				<th>Action</th>
			</tr>
			<c:forEach items="${courses}" var="course">
			<tr>
				<td>${course.courseName}</td>
				<td>${course.instructorName}</td>
				<td>${course.currentSize}/${course.courseLimit}</td>
				<td><a href="">Add</a></td> 
				
			</tr>
			</c:forEach>
		</table>		
	</div>
	
	<div>
		<a href="/courses/new"><button>Add a course</button></a>
	</div>
	
	
</body>
</html>