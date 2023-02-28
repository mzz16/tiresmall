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
			<form action="searchAuth.do?m=auth" class="auth_form"> 
				<div id="auth_searchBox">
					<div class="auth_searchTitle">
						<div>구분
						<select id="auth_sortation" name="auth_sortation">
							<option value="all">전체</option>
							<option value="general">일반</option>
							<option value="company">업체</option>
							<option value="manager">관리자</option>
						</select>
						</div>
					</div>
					<div class="auth_searchTitle">
						<div class="auth_searchID">
							<label for="auth_searchid">아이디</label>
							<input id="auth_searchid" name="a_id">
						</div>	
					</div>
					<div class="auth_searchTitle">
						<div class="auth_search_name">
							<label for="auth_searchname">이름</label>
							<input id="auth_searchname" name="a_name">
						</div>
					</div>
					<div class="auth_searchTitle">
						<div class="auth_search_carnum">
							<label for="auth_searchcarnumber"> 자동차번호</label>
							<input id="auth_searchcarnumber" name="">
						</div>
					</div>
					<div id="searchBtn">
						<button>검색</button>
					</div>
				</div>
			</form>




			<table id="auth_content">
				<tr>
					<td class="auth_content_title auth_no">No.</td>
					<td class="auth_content_title auth_sortation">구분</td>
					<td class="auth_content_title auth_id">ID</td>
					<td class="auth_content_title auth_name">이 름</td>
					<td class="auth_content_title auth_phoneNum">연락처</td>
					<td class="auth_content_title auth_carNum">자동차 번호</td>
					<td class="auth_content_title auth_date">등록일</td>
					<td class="auth_content_title auth_management">관리</td>
				</tr>
				<c:forEach items="${manyAuth }" var="a" varStatus="status">
					<tr id="manyAuth_content">
						<td class="">${status.count }</td>
						<td class="">${a.a_Sortation }</td>
						<td class="">${a.a_id }</td>
						<td class="">${a.a_name }</td>
						<td class="">${a.a_phone }</td>
						<td class="">차번호</td>
						<td class=""><fmt:formatDate value="${a.a_date }" pattern = "yyyy-MM-dd"/>   </td>
						<td class="manyAuth_btn">
							<button>수정</button>
							<button>삭제</button> 
						</td>
					</tr>
				</c:forEach>
				
				
			</table>
		</div>
	</div>
</body>
</html>