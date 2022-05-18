<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="ImageUpload" method="post" enctype="multipart/form-data">
	<label for="selectImages">Select Images</label>
	<input type="file" name="files" multiple="multiple">
	<input type="submit" value="Upload">
</form>

</body>
</html>