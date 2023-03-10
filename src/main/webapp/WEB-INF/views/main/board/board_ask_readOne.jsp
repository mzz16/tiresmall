<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div class="board_ask_create_container">
		<div class="board_ask_create_rowAndInput">
			<div>분류</div>
			<div>(분류)</div>
			<div>처리현황</div>
			<div>(처리현황)</div>
			<div>제목</div>
			<div>(제목)</div>
			<div>내용</div>
			<div>(내용)</div>
			<div>파일</div>
			<div>(파일)</div>
		</div>
	</div>
	
	<div class="board_ask_create_buttonArea">
		<div>
			<button class="board_ask_buttonTwo" onclick="location.href='board.ask.update'">수정</button>
			<button class="board_ask_buttonThree" onclick="location.href='board.ask.delete'">삭제</button>
		</div>
		<div>
			<button class="board_ask_buttonThree" onclick="location.href='board.ask.readall'">내 문의목록</button>
		</div>
	</div>
</body>
</html>