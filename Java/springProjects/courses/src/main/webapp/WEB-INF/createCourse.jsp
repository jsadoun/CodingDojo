<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Create New Course</title>
</head>
<body>
	
	<h2>Create a new course</h2>
	
	<div>
		<form:form action="/courses/new" method="POST" modelAttribute="course">
			
			<form:label path="courseName">Name:
			<form:input path="courseName"></form:input>
			<form:errors path="courseName"></form:errors>
			</form:label> <br>
			
			<form:label path="instructorName">Instructor:
			<form:input path="instructorName"></form:input>
			<form:errors path="instructorName"></form:errors>
			</form:label> <br>
			
			<form:label path="courseLimit">Limit:
			<form:input path="courseLimit"></form:input>
			<form:errors path="courseLimit"></form:errors>
			</form:label> <br>
			
			<input type="submit" value="Create"> 
		</form:form>
	</div>
</body>
</html>