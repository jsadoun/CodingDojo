<!DOCTYPE html>
<html>
<head>

<title>Dojo Survey Index</title>
</head>
<body>

<form action="/process" method="POST">
	Name:<input type="text" name="name"><br>
	Dojo Location:<select name="location">
		<option value="LA">LA</option>
		<option value="DC">DC</option>
	</select><br>
	Favorite Language:<select name="language">
		<option value="python">Python</option>
		<option value="ruby">Ruby</option>
		<option value="java">Java</option>
		<option value="mean">Ruby</option>
	</select><br>
	Comment (optional):<textarea name="comment" placeholder="type comments here.."></textarea><br>
	<br>
	<input type="submit" value="Submit">
</form>

</body>
</html>