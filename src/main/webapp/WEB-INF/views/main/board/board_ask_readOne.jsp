<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div>
		<div class="board_ask_readOne_rowAndValue">
			<div>분류</div>
			<div>${ask.a_sortation}</div>
			<div>처리현황</div>
			<!-- 
			<div>
			<%--
				${a.a_status }
			 --%>
			</div>
			 -->
			<c:choose>
				<c:when test="${!empty ask.a_reply}">
					<div>
						답변완료 <i class="fa-regular fa-circle-check"></i>
					</div>
				</c:when>
				<c:otherwise>
					<div>
						답변대기
					</div>
				</c:otherwise>
			</c:choose>
			<div>제목</div>
			<div>${ask.a_title}</div>
			<div>내용</div>
			<div>${ask.a_text}</div>
			<c:if test="${!empty ask.a_reply}">
				<div>답변내용</div>
				<div>${ask.a_reply.ar_text }</div>
			</c:if>
		</div>
	
		<div class="board_ask_readOne_buttons">
			<c:if test="${empty ask.a_reply}">
				<button class="board_ask_buttonRed" onclick="location.href='board.ask.update.go?a_number=' + ${ask.a_number}">수정</button>
			</c:if>
			<button class="board_ask_buttonGray" onclick="deleteAsk(${ask.a_number});">삭제</button>
			<button class="board_ask_buttonGray" onclick="location.href='board.ask.readall'">내 문의목록</button>
		</div>
	</div>
</body>
</html>