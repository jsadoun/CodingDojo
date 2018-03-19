<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
 
   
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>New Dojo</title>
</head>
<body>
	<h1>New Dojo</h1>

	<form:form action="/dojos/new" method="post" modelAttribute="dojo">
		<form:label path="name">Name:
			<form:input path="name"></form:input>
			<form:errors path="name"></form:errors>
		</form:label>
		
		<input type="submit" value="Create"></input>
	</form:form>
</body>
</html>