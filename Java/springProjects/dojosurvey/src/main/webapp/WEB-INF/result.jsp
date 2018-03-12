<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<title>Result</title>
</head>
<body>

<fieldset>
	<legend>Dojo Survey - Results</legend>
	Name: <c:out value="${name}"/><br>
	Dojo Location:<c:out value="${location}"/><br>
	Favorite Language:<c:out value="${language}"/><br>
	Comment:<c:out value="${comment}"/><br>
</fieldset>

</body>
</html>