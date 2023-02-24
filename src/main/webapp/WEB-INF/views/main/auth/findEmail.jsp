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
	<form  action="authReg.do"  method="post" enctype="multipart/form-data"
		name="join_form" onsubmit="return joinCheck();">
		
		<div id="find_container">
			<div id="find_logo">
				<a href="/home">
				<img alt="" src="resources/web/logo.png">
				</a>
			</div>
			
			<div class="find_box">
				<div class="find_title">
					<div id="find_title_id">이메일(아이디) 찾기</div>
					<div id="find_title_pw">비밀번호 찾기</div>
				</div>
				<div id="find_input">
					<span>이름</span>
					<input name="a_email">
				</div>
				<div id="find_input">
					<span>전화번호</span>
					<input name="a_phoneNum">
				</div>
			</div>
			
			<div id="join_pic"></div>
			<div id="join_policy"></div>
			
			<div id="join_btn">
			<button>아이디 찾기</button>
			</div>
		</div>
		</form>









	</div>
</body>
</html>