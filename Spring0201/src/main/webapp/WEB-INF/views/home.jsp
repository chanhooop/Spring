<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  
</h1>

<P>  The time on the server is ${serverTime}. </P>
<P> <img src="/s0201/resources/google.png"/>. </P>  <!-- 이름쓸때는 패키지명이 가장중요하다  -->
<P> <img src="/s0201/myResources/google.png"/>. </P>  <!-- 이름쓸때는 패키지명이 가장중요하다  --> <!-- 서블릿 컨텍스트에 위치를 알려주고 실행해야한다 -->		
 <!-- 이미지 소스 / 패키지명 / 웹앱하위폴더 이름 / 파일이름 -->
  
</body>
</html>
