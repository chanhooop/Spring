<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

<table cellpadding="0" cellspacing="0" border="1">
		<form action="write" method="post">
			<tr>
				<td > �̸� </td>
				<td> <input type="text" name="mName" size = "20"> </td>
			</tr>
			<tr>
				<td> ����ȣ </td>
				<td> <input type="text" name="mTelno" size = "70" > </td>
			</tr>
			<tr>
				<td> �ּ� </td>
				<td> <input type="text" name="mAddress" size = "70" > </td>
			</tr>
			<tr>
				<td> ���ڿ��� </td>
				<td> <input type="text" name="mEmail" size = "70" > </td>
			</tr>
			<tr>
				<td> ���� </td>
				<td> <input type="text" name="mRelation" size = "70" > </td>
			</tr>
			
			<tr >
				<td colspan="2"> <input type="submit" value="�Է�"> &nbsp;&nbsp; <a href="list">��Ϻ���</a></td>
			</tr>
		</form>
</table>

</body>
</html>