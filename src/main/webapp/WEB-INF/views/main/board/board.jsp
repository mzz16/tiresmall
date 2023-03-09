<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div class="board_mainContainer">
		<div class="board_link">
			<a href="/home"><i class="fa-solid fa-house"></i></a> <span style="color: white;">></span> <a href="board.home">고객센터</a> ${board_whereAmIOne }
		</div>
		
		<div class="board_title">
			${board_whereAmITwo }
		</div>
	
		<div class="board_sideMenu">
			<div>
				<a class="board_sideMenuList board_home" href="board.home">고객센터 홈</a>
			</div>
			
			<br>
			
			<div>
				<a class="board_sideMenuList board_notice" href="board.notice">공지사항</a>
			</div>
			<div>
				<a class="board_sideMenuList board_event" href="board.event">이벤트</a>
			</div>
			
			<br>
			
			<div>
				<a class="board_sideMenuList board_shoppingGuide" href="board.shoppingGuide">구매가이드</a>
			</div>
			
			<br>
			
			<div>
				<a class="board_sideMenuList board_faq" href="board.faq">FAQ</a>
			</div>
			<div>
				<a class="board_sideMenuList board_ask" href="board.ask">1:1문의</a>
			</div>
			<div>
				<a class="board_sideMenuList board_kakao" href="board.kakao" onclick="board_openKakao()">카카오톡상담<img src="resources/web/main/board/kakaoLogo.png" style="width: 16px; vertical-align: bottom;"/></a>
			</div>
		</div>
		
		<div class="board_sideInfo">
			전화문의<br>
			1234-5678<br>
			<br>
			운영시간<br>
			평일<span class="tab">&#9;</span>08:30 A.M. ~ 19:00 P.M.<br>
			토요일<span class="tab">&#9;</span>08:30 A.M. ~ 16:00 P.M.<br>
			일요일<span class="tab">&#9;</span>휴무
		</div>
		
		<div class="board_contentsArea">
			<input class="whereAmI" value="${board_whereAmITwo }" type="hidden">
			<jsp:include page="${board_contents }"></jsp:include>
		</div>
	</div>
</body>
</html>