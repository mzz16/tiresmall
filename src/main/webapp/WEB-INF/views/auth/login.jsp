<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="resources/css/auth/login.css">
</head>
<body>
	<div id="login_container">
		<div id="login_logo"><img alt="" src="resources/img/logo.jpg"> 
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
			<span>아이디 찾기</span>		
			<span>| 비밀번호 찾기 |</span>		
			<span>회원가입</span>		
		</div>
		<div id="login_social"></div>
	</div>
</body>
</html>