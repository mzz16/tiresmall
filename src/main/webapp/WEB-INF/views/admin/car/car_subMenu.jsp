<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div class="subMenu">
		<div class="subMenuContent1" onclick="location.href='admin.car.go?m=car&sm=1'">차종 관리</div>
		<div class="subMenuContent2" onclick="location.href='admin.car.brand.go?m=car&sm=2'">차종 메이커 관리</div>
		<input id="sm" type="hidden" value="${param.sm }">
	</div>
</body>
</html>