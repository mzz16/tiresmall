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
			<select name="a_sortation">
				<option value="">--선택--</option>
				<option value="1">상품</option>
				<option value="2">결제</option>
				<option value="3">장착</option>
				<option value="4">기타</option>
			</select>
			<div>제목</div>
			<div><input type="text"></div>
			<div>내용</div>
			<div><textarea></textarea></div>
			<div>파일첨부</div>
			<div><input type="file"></div>
		</div>
	</div>
	
	<div class="board_ask_create_buttonArea">
		<div>
			<button class="board_ask_buttonTwo" onclick="location.href='board.ask.readall'">등록하기</button>
		</div>
		<div>
			<button class="board_ask_buttonThree" onclick="location.href='board.ask.readall'">내 문의목록</button>
		</div>
	</div>
</body>
</html>