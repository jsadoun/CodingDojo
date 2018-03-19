<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Artist Discography - Lookify</title>
</head>
<body>

	<p>Songs by artist: ${artist}</p>
	<input type="search" name="searchfordiscography">
	<input type="submit" value="New Search">
	<a href="/dashboard.jsp">Dashboard</a> <br>
	
	<table>
		<tr>
			<th>Name</th>
			<th>Rating</th>
			<th>Actions</th>
		</tr>
		<tr>
			<td> <c:out value="${song.id}"/>	</td>
			<td> <c:out value="${song.rating}"/>		</td>
			<td> 	
				<form action="/lookify/delete/${song.id}" method="POST">
					<input type="submit" value="Delete">
				</form>
			</td>
		</tr>
	</table>
	


</body>
</html>
