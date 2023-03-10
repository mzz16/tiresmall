<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="resources/css/main/product/main_product.css">
<script src="https://code.jquery.com/jquery-3.6.3.js"
	integrity="sha256-nQLuAZGRRcILA+6dMBOvcRh5Pe310sBpanc6+QBmyVM="
	crossorigin="anonymous"></script>
<script type="text/javascript" src="resources/js/main/product/main_product.js"></script>
</head>
<body>
<h1>${test }</h1>
	<div id="product_wrap">
		<div id="product_wrap_top">
			<div id="product_top_img">
				<img src="resources/web/main/product/note.jpg">
			</div>
			<div id="product_wrap_subtitle">
					<h1><span>국내유통 100%</span> <span>정품타이어 취급!</span></h1>
					<h2><span>TIRE<span>S</span>MALL</span>에서는 오직 정품 타이어만 취급합니다.</h2>
					<h3>오늘 주문하고 바로 장착 가능하며 직영점 장착시 차량점검 무상 서비스 제공!</h3>
			</div>
		</div>
		<div id="product_search">
			<span>총 ${theNumber }개 상품이 검색 되었습니다. </span>
			<div id="product_search_type">
				<input name="carType" type="radio" value="1"> 승용차
				<input name="carType" type="radio" value="0"> SUV
				<input name="carTypeA" type="radio" value="1"> 승용차a
				<input name="carTypeA" type="radio" value="0"> SUVa
			</div>
		</div>
		<div id="product_container">
			<c:forEach items="${pGroups }" var="pGroup">
				<a href="detail.test">
					<div class="product_item">
						<div class="product_item_hidden"></div>
						<div class="product_item_img">
						<c:choose>
							<c:when test="${pGroup.tg_img eq 'noimg'}">
								<img src="resources/web/main/product/no-tire-image.jpg">
							</c:when>
							<c:otherwise>
								<img src="${pGroup.tg_img }"> <!-- 타이어 등록 기능 되면 경로지정 -->
							</c:otherwise>					
						</c:choose>
						</div>
						<div class="product_item_title">
							<input type="hidden" value="${pGroup.tg_id }"/>
							<p>${pGroup.tg_brand }</p>
							<p>${pGroup.tg_name }</p>
						</div>
						<div class="product_item_text">${pGroup.tg_text }</div>
						<div class="product_item_size">${pGroup.minInch }인치  ~ ${pGroup.maxInch }인치</div>
						<div class="product_item_price">
							<fmt:formatNumber type="currency">
								${pGroup.minPrice }
							</fmt:formatNumber>
								~ 
							<fmt:formatNumber type="currency">
								${pGroup.maxPrice }
							</fmt:formatNumber>
						</div>
						<div class="product_item_detail"><i class="fa-solid fa-magnifying-glass"></i>상세보기</div>
					</div>
				</a>
			</c:forEach>
		</div>
		<div id="product_wrap_paging">
			<c:if test="${curPage ne 1 }">
				<div class="product_paging_firstLast"><a href="javascript:movePage(1)">1</a> . . .</div>
			</c:if>
			<c:choose>
				<c:when test="${curPage eq 1 }">
					<div class="product_paging_prevNext" style="color:lightgray">이전</div>
				</c:when>
				<c:otherwise>
					<div class="product_paging_prevNext"><a href="javascript:movePage(${curPage -1})">이전</a></div>
				</c:otherwise>
			</c:choose>
			<div id="product_paging_num">
				<input type="hidden" id="product_curPage" value="${curPage }">
				<input type="hidden" id="product_pageCount" value="${pageCount }">
			</div>
			<c:choose>
				<c:when test="${curPage eq pageCount}">
					<div class="product_paging_prevNext" style="color:lightgray">다음</div>
				</c:when>
				<c:otherwise>
					<div class="product_paging_prevNext"><a href="javascript:movePage(${curPage +1})">다음</a></div>
				</c:otherwise>
			</c:choose>
			<c:if test="${curPage ne pageCount }">
				<div class="product_paging_firstLast">. . . <a href="javascript:movePage(${pageCount })">${pageCount}</a></div>
			</c:if>
		</div>
	</div>
	
<script src="https://kit.fontawesome.com/772d40e343.js" crossorigin="anonymous"></script>
</body>
</html>