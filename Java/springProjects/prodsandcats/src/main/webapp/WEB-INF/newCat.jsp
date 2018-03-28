<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>New Category</title>
</head>
<body>

	<h1>New Category</h1>
	
	<div>
		<form:form action="/categories/new" method="POST" modelAttribute="category">
			<form:label path="name">Name:
			<form:input path="name"></form:input><br>
			<form:errors path="name"></form:errors>
			</form:label>
			
			<input type="submit" value="Create"></input>
		</form:form>
	</div>

</body>
</html>