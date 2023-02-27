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
		<div class="subMenuContent1" onclick="location.href='admin.tire.go?m=tire&sm=1'">타이어 상품 관리</div>
		<div class="subMenuContent2" onclick="location.href='admin.tire.brand.go?m=tire&sm=2'">타이어 상품 브랜드 관리</div>
		<div class="subMenuContent3" onclick="location.href='admin.tire.discount.go?m=tire&sm=3'">타이어 상품 할인율 관리</div>
		<div class="subMenuContent4" onclick="location.href='admin.tire.charicteristic.go?m=tire&sm=4'">타이어 특징관리</div>
		<input id="sm" type="hidden" value="${param.sm }">
	</div>
</body>
</html>