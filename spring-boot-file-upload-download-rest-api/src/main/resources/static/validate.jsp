<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
<title>Upload File Request Page</title>
</head>
<body>

	<form method="POST" action="validate">
		<label>Paste the message here:-</label> <br/> <br/>
		<textarea name="message" cols="80" rows="25"></textarea> <br/> <br/>
		<input type="submit" value="Upload"> Press here to upload the message!
	</form>
	
</body>
</html>