<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="resources/css/admin/auth/admin_auth.css">
</head>
<body>
	<div class="container">
		<div id="auth_container">
			<form action="searchAuth.do" class="auth_form"> 
				<div id="auth_searchBox">
					<div class="auth_serachTitle">
						<div>구분
						<select id="auth_sortation" name="auth_sortation">
							<option value="">전체</option>
							<option value="">일반</option>
							<option value="">업체</option>
							<option value="">관리자</option>
						</select>
						</div>
					</div>
					<div class="auth_serachTitle">
						<div>
							<label for="auth_id">아이디</label>
							<input id="auth_id" name="">
						</div>	
					</div>
					<div class="auth_serachTitle">
						<div>
							<label for="auth_name">이름</label>
							<input id="auth_name" name="">
						</div>
					</div>
					<div class="auth_serachTitle">
						<div>
							<label for="auth_carnumber"> 자동차번호</label>
							<input id="auth_carnumber" name="">
						</div>
					</div>
					<button>검색</button>
				</div>
			</form>




			<table id="auth_content">
				<tr>
					<td class="auth_content_title auth_no">No.</td>
					<td class="auth_content_title auth_sortation">구분</td>
					<td class="auth_content_title auth_id">ID</td>
					<td class="auth_content_title auth_name">이름</td>
					<td class="auth_content_title auth_phoneNum">연락처</td>
					<td class="auth_content_title auth_carNum">자동차번호</td>
					<td class="auth_content_title auth_date">등록일</td>
					<td class="auth_content_title auth_management">관리</td>
				</tr>
				<%-- <c:forEach items="" var="">
					<tr>
						<td>No.</td>
						<td>구분</td>
						<td>ID</td>
						<td>이름</td>
						<td>연락처</td>
						<td>자동차번호</td>
						<td>등록일</td>
						<td>
							<button>수정</button>
							<button>삭제</button> 
						</td>
					</tr>
				</c:forEach> --%>
				
				
			</table>
		</div>
	</div>
</body>
</html>