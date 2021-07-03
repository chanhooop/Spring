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
				<td > 이름 </td>
				<td> <input type="text" name="mName" size = "20"> </td>
			</tr>
			<tr>
				<td> 폰번호 </td>
				<td> <input type="text" name="mTelno" size = "70" > </td>
			</tr>
			<tr>
				<td> 주소 </td>
				<td> <input type="text" name="mAddress" size = "70" > </td>
			</tr>
			<tr>
				<td> 전자우편 </td>
				<td> <input type="text" name="mEmail" size = "70" > </td>
			</tr>
			<tr>
				<td> 관계 </td>
				<td> <input type="text" name="mRelation" size = "70" > </td>
			</tr>
			
			<tr >
				<td colspan="2"> <input type="submit" value="입력"> &nbsp;&nbsp; <a href="list">목록보기</a></td>
			</tr>
		</form>
</table>

</body>
</html>