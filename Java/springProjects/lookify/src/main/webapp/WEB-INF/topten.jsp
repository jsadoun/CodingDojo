<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Top Ten - Lookify</title>
</head>
<body>

	<c:forEach items="${errs}" var="err">
		<h2><c:out value="${err.getDefaultMessage()}"/></h2>
	</c:forEach>

	<h3>Top Ten Songs:</h3>
	<h3><a href="/dashboard">Dashboard</a> </h3>   <br>
	
	<div>
	<c:forEach items="${songs}" var="song" varStatus="loop">
		<h3> <c:out value="${song.rating}" /> - <a href="/songs/${song.id}"><c:out value="${song.name}"/></a> - <c:out value="${song.artist}"/> </h3>
	</c:forEach>
	</div>


</body>
</html>