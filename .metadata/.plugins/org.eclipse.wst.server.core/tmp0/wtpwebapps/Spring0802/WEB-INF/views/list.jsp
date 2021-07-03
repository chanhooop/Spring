<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>�ּҷ� ���� ����Ʈ</title>
</head>
<body>
<h3>�ּҷ� ���� �˻�</h3><br/>

<form action="listQuery" method="post">
	�˻����� : 
	<select name="query">
					<!-- �빮�� �߿�!!! -->
		<option value="ADDRESS">�ּ�</option>
		<option value="RELATION">����</option>
	</select>&nbsp;&nbsp;&nbsp;
	<input type="text" name="content" size="30">
	<input type="submit" value="�˻�">

</form>

<table border="1">
		<tr>
			<td>��ȣ</td>
			<td>�̸�</td>
			<td>����ȣ</td>
			<td>�ּ�</td>
			<td>���ڿ���</td>
			<td>����</td>
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
			<td colspan="5"><a href="writeForm">�ּҷϵ��</a></td>
		</tr>	
				
	</table>
	<br><br>
	<p>�˻������ <b>${cnt}</b>�� �Դϴ�. </p>
	

</body>
</html>