<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<table border="1">
		<tr>
			<td>��ȣ</td>
			<td>�̸�</td>
			<td>����</td>
			<td>��¥</td>
			<td>����</td>
		</tr>
		<c:forEach items="${list}" var = "dto">
		<tr>
			<td>${dto.bId}</td>
			<td>${dto.bName}</td>
			<td>${dto.bTitle}</td>
			<td>${dto.bDate}</td>
			<td><a href="delete?bId=${dto.bId}">X</a></td>
		</tr>
		</c:forEach>
		<tr>
			<td colspan="5"><a href="write_view">���ۼ�</a></td>
		</tr>	
		
		
		
	</table>
</body>
</html>