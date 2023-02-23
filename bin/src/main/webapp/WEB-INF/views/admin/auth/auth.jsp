<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div class="container">
		<form action="searchAuth.do">
			<div style="display: flex;">
				<div>
					<label for="auth_sortation"> 구분<input id="auth_sortation"
						name=""></label>
				</div>
				<div>
					<label for="auth_id"> 아이디<input id="auth_id" name=""></label>
				</div>
				<div>
					<label for="auth_name"> 이름<input id="auth_name" name=""></label>
				</div>
				<div>
					<label for="auth_carnumber"> 자동차번호<input
						id="auth_carnumber" name=""></label>
				</div>
				<div>
					<label for="auth_companyMame"> 업체명<input
						id="auth_companyMame" name=""></label>
				</div>
			</div>
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
			</tr>
		</table>
	</div>
</body>
</html>