<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div class="board_ask_readAll_container">
		<div class="board_ask_readAll_columnAndList">
			<div>번호</div>
			<div>분류</div>
			<div>제목</div>
			<div>등록일</div>
			<div>처리현황</div>
			<div>
				<!-- 
				<c:forEach var="m" items="${msgs }">
					<table class="aSNSMsg">
						<tr>
							<td class="asmImgTd" align="center" valign="top" rowspan="4"><img
								src="resources/files/${m.m_photo }"></td>
			
							<td class="asmOwner">${m.s_owner }</td>
						</tr>
						<tr>
							<td><fmt:formatDate value="${m.s_date }" type="both"
									dateStyle="short" timeStyle="short" /></td>
						</tr>
						<tr>
							<td class="asmTxt">${m.s_txt }</td>
						</tr>
						<c:if test="${m.s_owner == sessionScope.loginMember.m_id }">
							<tr>
								<td colspan="2" align="right">
									<button
										onclick="updateSNSMsg(${m.s_no}, '${m.s_txt}', ${curPage });"
										class="aSNSMsgBtn">수정</button>
									<button onclick="deleteSNSMsg(${m.s_no});" class="aSNSMsgBtn">삭제</button>
								</td>
							</tr>
						</c:if>
					</table>
				</c:forEach>
				 -->
				<div>
					등록된 문의내용이 없습니다
				</div>
			</div>
		</div>
		
		<div>
			<button class="board_ask_buttonOne" onclick="location.href='board.ask.create'">문의등록</button>
		</div>
	</div>
</body>
</html>