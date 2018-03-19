<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Song Info - Lookify</title>
</head>
<body>

		<a href="/dashboard">Dashboard</a> 							<br>
	<div>
		Title:			${song.id}									<br>
		Artist:			${song.artist}								<br>
		Rating (1-10):	${song.rating}								<br>
		<form action="/songs/delete/${song.id}" method="POST">
			<input type="submit" value="Delete">						
		</form>			
	</div>											

</body>
</html>
