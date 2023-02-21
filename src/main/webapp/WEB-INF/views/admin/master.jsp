<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="resources/css/admin/master.css" />
<script src="https://code.jquery.com/jquery-3.6.3.js"
	integrity="sha256-nQLuAZGRRcILA+6dMBOvcRh5Pe310sBpanc6+QBmyVM="
	crossorigin="anonymous"></script>
</head>
<script src="resources/master/js/master.js"></script>
</head>
<body>
	<div id="mainMenuba">
		<nav id="mainMenu">
			<div id="menulogo" onclick="location.href='admin.shopmall.go'">로고</div>
			<div id="menuTitle" onclick="location.href='admin.order.go'">주문 관리</div>
			<div id="menuTitle" onclick="location.href='admin.tire.go'">타이어상품 관리</div>
			<div id="menuTitle" onclick="location.href='admin.car.go'">차종 관리</div>
			<div id="menuTitle" onclick="location.href='admin.auth.go'">회원 관리</div>
			<div id="menuTitle" onclick="location.href='admin.company.go'">장착점 관리</div>
			<div id="menuTitle" onclick="location.href='admin.comunity.go'">게시판 관리</div>
		</nav>
	<%-- <input id="whatMenu" type="hidden" value="${whatPage}">
		<div id="subMenu">내용이 들어갈것들 왜 안나올까?
	</div> --%>

	</div>


	<div>
		<jsp:include page="${contentPage }"></jsp:include>
	</div>


</body>
</html>