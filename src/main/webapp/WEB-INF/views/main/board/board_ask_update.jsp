<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="board.ask.update.do" method="post">
		<div class="board_ask_cu_rowAndValue">
			<div>분류<span class="board_ask_cu_important">*</span></div>
			<div>
				<select required name="a_sortation">
					<option value="">--선택--</option>
					<option value="상품">상품</option>
					<option value="결제">결제</option>
					<option value="장착">장착</option>
					<option value="기타">기타</option>
				</select>
			</div>
			<div>제목<span class="board_ask_cu_important">*</span></div>
			<div><input required name="a_title" type="text" value="${ask.a_title}"></div>
			<div>내용<span class="board_ask_cu_important">*</span></div>
			<div>
				<div>
					<textarea required name="a_text" maxlength="2000">${ask.a_text}</textarea>
					<div><span class="board_ask_cu_important">* 내용은 2000자까지 입력이 가능합니다.</span></div>
				</div>
			</div>
		</div>
		
		<div class="board_ask_cu_request">*는 필수 입력사항입니다.</div>
	
		<div class="board_ask_cu_buttons">
				<button class="board_ask_buttonRed">수정하기</button>
				<button class="board_ask_buttonGray" type="button" onclick="location.href='board.ask.readall'">내 문의목록</button>
		</div>
	</form>
</body>
</html>