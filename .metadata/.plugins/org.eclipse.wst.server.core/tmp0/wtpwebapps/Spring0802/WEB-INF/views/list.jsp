<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>주소록 조건 리스트</title>
</head>
<body>
<h3>주소록 조건 검색</h3><br/>

<form action="listQuery" method="post">
	검색선택 : 
	<select name="query">
					<!-- 대문자 중요!!! -->
		<option value="ADDRESS">주소</option>
		<option value="RELATION">관계</option>
	</select>&nbsp;&nbsp;&nbsp;
	<input type="text" name="content" size="30">
	<input type="submit" value="검색">

</form>

<table border="1">
		<tr>
			<td>번호</td>
			<td>이름</td>
			<td>폰번호</td>
			<td>주소</td>
			<td>전자우편</td>
			<td>관계</td>
		</tr>
		<c:set var="cnt" value="0" />
		<c:forEach items="${list}" var = "dto">
		<tr>
			<td><a href="view?seqno=${dto.seqno}">${dto.seqno}</a></td>
			<td>${dto.name}</td>
			<td>${dto.telno}</td>
			<td>${dto.address}</td>
			<td>${dto.email}</td>
			<td>${dto.relation}</td>
		</tr>
		<c:set var="cnt" value="${cnt=cnt+1 }" />
		</c:forEach>
		
		<tr>
			<td colspan="5"><a href="writeForm">주소록등록</a></td>
		</tr>	
				
	</table>
	<br><br>
	<p>검색결과는 <b>${cnt}</b>명 입니다. </p>
	

</body>
</html>