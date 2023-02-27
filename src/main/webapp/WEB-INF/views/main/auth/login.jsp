<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="resources/css/main/auth/auth.css">
</head>
<body>
	<div id="login_container">
		<div id="login_logo">
		<a href="/home">
		<img alt="" src="resources/web/logo.png">
		</a> 
		</div>
		<div id="login_box">
			<div id="login_box_title">ID로그인 </div>
			<input id="login_id" name="login_id" placeholder="아이디">		
			<input id="login_pw" name="login_pw" placeholder="비밀번호">		
		</div>
		<div id="login_btn"> 
			<button>로그인</button>
		</div>
		<div id="login_other_btn"> 
			<span onclick="location.href='findEmail.go'">아이디/비밀번호 찾기 |</span>		
			<span onclick="location.href='authTermsOfUse.go'">회원가입</span>		
		</div>
		<div id="login_social"></div>
	</div>
</body>
</html>