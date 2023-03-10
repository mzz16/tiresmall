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
		<div class="subMenuContent1" onclick="location.href='admin.notice.go?subMenu=1'">공지사항 관리</div>
		<div class="subMenuContent2" onclick="location.href='admin.qna.go?subMenu=2'">1:1문의 관리</div>
		<div class="subMenuContent3" onclick="location.href='admin.faq.go?subMenu=3'">FAQ</div>
		<div class="subMenuContent4" onclick="location.href='주소??subMenu=1'">이벤트</div>
		<input id="sm" type="hidden" value="${menuSession.subMenu }">
	</div>
</body>
</html>