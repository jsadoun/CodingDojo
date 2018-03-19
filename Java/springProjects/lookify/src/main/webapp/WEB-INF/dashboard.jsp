<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Dashboard - Lookify</title>
</head>
<body>

	<c:forEach items="${errs}" var="err">
		<h2><c:out value="${err.getDefaultMessage()}"/></h2>
	</c:forEach>

<div>
	<a href="/songs/addsong">Add New</a>
	<a href="/songs/topten">Top Ten</a>
	<form method="POST" action="/search">
		<input type="text" name="artist"></input>
		<input type="submit" value="Search Artists"></input>
	</form>
</div>

<div>
	<table>
		<tr>
			<th>Name</th>
			<th>Artist</th>
			<th>Rating</th>
			<th>Actions</th>
		</tr>
		<c:forEach items="${songs}" var="song" varStatus="loop">
		<tr>
			<td><a href="/songs/${song.id}"> <c:out value="${song.id}"/> </a></td>
			<td><c:out value="${song.artist}" /></td>
			<td><c:out value="${song.rating}"/></td>
			<td><a href="/songs/delete/${song.id}">Delete</a></td>
		</tr>
		</c:forEach>
	</table>
</div>

</body>
</html>
