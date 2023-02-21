<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>회원관리페이지</h1>

	<div>
		<form action="searchAuth.do">
			<span>구분<input></span> 
			<span>아아디<input></span> 
			<span>이름<input></span>
			<span>자동차번호<input></span> 
			<span>업체명<input></span>
			<span>구분<input></span>

		</form>


		<table border="1" width="100%">
			<tr>
				<td>No.</td>
				<td>구분</td>
				<td>ID</td>
				<td>이름</td>
				<td>연락처</td>
				<td>자동차번호</td>
				<td>등록일</td>
				<td>관리</td>
			</tr>
		</table>
	</div>
</body>
</html>