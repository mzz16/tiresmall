<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1.0"
	charset="UTF-8">
<title>order</title>
<script src="https://code.jquery.com/jquery-3.6.3.js"
	integrity="sha256-nQLuAZGRRcILA+6dMBOvcRh5Pe310sBpanc6+QBmyVM="
	crossorigin="anonymous"></script>
<link rel="stylesheet" href="resources/css/admin/board/admin_order.css">
<link rel="stylesheet" href="resources/css/admin/board/admin_order_modal.css">
</head>
<body>

	<div class="container sub">
		<div class="DashBoard">
			<form class="order_form" action="search.order.do">
				<div>
					<div class="input_box3">
						<div class="no-drag">주문자명</div>
						<input name="nameInput" id="a_name">
					</div>
					<div class="input_box4">
						<div class="no-drag">주문자전화</div>
						<input name="idInput" id="a_phone">
					</div>
					<div class="input_box5">
						<div class="no-drag">주문번호</div>
						<input name="titleInput" id="q_title">
					</div>
					<div class="button_box">
						<button id="searchBtn" class="orderBtn">검색</button>
					</div>
				</div>


				<div class="DashBoard order_content">
					<table class="order_content">
						<tr>
							<th class="th_head">No</th>
							<th class="th_head">회원구분</th>
							<th class="th_head">주문번호</th>
							<th class="th_head">주문일시</th>
							<th class="th_head">주문자명</th>
							<th class="th_head">주문자전화</th>
							<th class="th_head">주문명</th>
							<th class="th_head">총금액</th>
							<th class="th_head">결제방법</th>
							<th class="th_head">배송방법</th>
							<th class="th_head">STEP</th>
						</tr>
						<c:if test="${empty orders}">
							<tr>
								<td colspan="5">해당 목록이없습니다</td>
							</tr>
						</c:if>
						<c:forEach var="o" items="${orders }" varStatus="status">
								<tr class="order_modal_go">
									<td class="td_c1">${status.count }
										<input type="hidden" value="${o.o_no }">
									</td>
									<td class="td_c2">${o.o_sortation }</td>
									<td class="td_c3">${o.o_ordernumber }</td>
									<td class="td_c4"><fmt:formatDate
											pattern="yyyy-MM-dd HH:mm:ss" value="${o.o_orderdate }" /></td>
									<td class="td_c5">${o.a_name }</td>
									<td class="td_c6">${o.a_phone }</td>
									<td class="td_c7">${o.o_ordername }</td>
									<td class="td_c8">${o.o_price }</td>
									<td class="td_c9">${o.o_paymethod }</td>
									<td class="td_c10">${o.o_deliverymethod }</td>
									<td class="td_c11">
											<input type="hidden" value="${o.o_pay_has }">	
									<%-- <c:choose>
										<c:when test="${o.o_pay_has ne 결제완료}">결제대기/주문취소
										</c:when>
										<c:otherwise>결제완료</c:otherwise>
									</c:choose> --%>
									</td>
								</tr>
						</c:forEach>
					</table>
				</div>
			</form>
		</div>
	</div>
	<div id="paging-box">
		<c:if test="${curPage != 1 }">
			<a style="color: black;" href="order.page.change?p=${curPage - 1 }">이전</a>
		</c:if>

		<c:forEach var="page" begin="1" end="${pageCount }">
			<c:choose>
					<c:when test="${page eq param.p or (curPage == 1 and curPage == page)}}">
						<a style="color:white; background-color: #333;" href="order.page.change?p=${page }" style="color: #00BFFF">${page } </a>
					</c:when>
					<c:otherwise>
						<a style="color: black;" href="order.page.change?p=${page }">${page } </a>
					</c:otherwise>
				</c:choose>
		</c:forEach>
		<c:if test="${curPage != pageCount }">
			<a style="color: black;" href="order.page.change?p=${curPage + 1 }">다음</a>
		</c:if>
	</div>
	<script src="resources/js/admin/board/admin_order.js"></script>

</body>
</html>