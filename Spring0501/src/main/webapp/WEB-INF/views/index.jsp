<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

	Get<br>
	<form action = "student" method="get">
		
		student id : <input type="text" name="id"><br>
		<input type="submit" value="전송">
	</form>
	
	<hr>
	
	Post<br>
	<form action = "student" method="post">
		
		student id : <input type="text" name="id"><br>
		<input type="submit" value="전송">
	</form>
	

<hr>

	Get2<br>
	<form action = "studentGet" method="get">
		
		student id : <input type="text" name="id"><br>
		<input type="submit" value="전송">
	</form>
	
	<hr>
	
	Post2<br>
	<form action = "studentPost" method="post">
		
		student id : <input type="text" name="id"><br>
		<input type="submit" value="전송">
	</form>
	

<hr>

</body>
</html>