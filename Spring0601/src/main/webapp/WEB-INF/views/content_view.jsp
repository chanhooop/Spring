<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<form action="modify" method="post">
		<table border="1">
		
			<tr>
				<td>번호</td>
				<td><input type="text" name="bId" value="${content_view.bId}" readonly="readonly"></td>
				<!-- <input type="hidden" name="bId" value="${content_view.bId}"> -->
			</tr>
			<tr>
				<td>이름</td>
				<td><input type="text" name="bName" size="20" value="${content_view.bName}"></td>
			</tr>
			<tr>
				<td>제목</td>
				<td><input type="text" name="bTitle" size="50" value="${content_view.bTitle}"></td>
			</tr>
			<tr>
				<td>내용</td>
				<td><textarea rows="10" cols="50" name="bContent" >${content_view.bContent}</textarea></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="수정">&nbsp;&nbsp;&nbsp;<a href="list">목록보기</a>
				&nbsp;&nbsp;&nbsp;<a href="delete?bId=${content_view.bId}">삭제</a></td>
			</tr>
		</table>
	</form>
</body>
</html>