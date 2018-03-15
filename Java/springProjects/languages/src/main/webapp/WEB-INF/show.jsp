<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE HTML>
<html>
	<head>
		<title>Show Language</title>
	</head>
	
	<body>	
		<h1> <c:out value="${language.name}"/> </h1>
		<h1> <c:out value="${language.creator}"/> </h1>
		<h1> <c:out value="${language.version}"/> </h1>
		<form action="/languages/edit/${language.id}" method="POST">
			<input type="submit" value="Edit">
		</form>
		<form action="/languages/delete/${language.id}" method="POST">
			<input type="submit" value="Delete">
		</form>
		
	</body>
</html>