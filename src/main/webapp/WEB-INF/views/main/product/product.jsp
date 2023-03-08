<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
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
			<form action="product.search">
				<input placeholder="타이어명 검색"><button>검색</button>
			</form>
		</div>
		<div id="product_container">
			<c:forEach items="${pGroups }" var="pGroup">
				<a href="detail.test">
					<div class="product_item">
						<div class="product_item_hidden"></div>
						<div class="product_item_border"></div>
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
						<div class="product_item_size"><span class="product_size_min"></span>인치  ~ <span class="product_size_max"></span>인치</div>
						<div class="product_item_price"> 가격 최소값 ~ 가격 최대값</div>
						<div class="product_item_detail"><i class="fa-solid fa-magnifying-glass"></i>상세보기</div>
					</div>
				</a>
			</c:forEach>
			<!-- <a href="detail.test">
				<div class="product_item">
					<div class="product_item_img">
						<img src="resources/web/main/product/as_t1.jpg">
					</div>
					<div class="product_item_title">
						<p>넥센타이어</p>
						<p>엔페라 프리머스 AS T1</p>
					</div>
					<div class="product_item_text">4계절 고급 세단용 프리미엄 타이어 !</div>
					<div class="product_item_size">16인치 ~ 19인치</div>
					<div class="product_item_price">92,400원 ~ 201,500원</div>
					<div class="product_item_detail"><i class="fa-solid fa-magnifying-glass"></i>상세보기</div>
				</div>
			</a>
			<a href="detail.test">
				<div class="product_item">
					<div class="product_item_img">
						<img src="resources/web/main/product/CT-8.jpg">
					</div>
					<div class="product_item_title">
						<p>넥센타이어</p>
						<p>로디안 CT-8</p>
					</div>
					<div class="product_item_text">안정적 주행성능과 연비 내구성 향상 !</div>
					<div class="product_item_size">13인치 ~ 17인치</div>
					<div class="product_item_price">57,000원 ~ 131,800원</div>
					<div class="product_item_detail"><i class="fa-solid fa-magnifying-glass"></i>상세보기</div>
				</div>
			</a>
			<a href="detail.test">
				<div class="product_item">
					<div class="product_item_img">
						<img src="resources/web/main/product/ct-8r.jpg">
					</div>
					<div class="product_item_title">
						<p>넥센타이어</p>
						<p>로디안 CT8R</p>
					</div>
					<div class="product_item_text">경제성과 주행성능을 모두 만족하는 소형 화물용타이어 !</div>
					<div class="product_item_size">12인치 ~ 13인치</div>
					<div class="product_item_price">58,700원 ~ 67,400원</div>
					<div class="product_item_detail"><i class="fa-solid fa-magnifying-glass"></i>상세보기</div>
				</div>
			</a>
			<a href="detail.test">
				<div class="product_item">
					<div class="product_item_img">
						<img src="resources/web/main/product/ah8.jpg">
					</div>
					<div class="product_item_title">
						<p>넥센타이어</p>
						<p>엔프리즈 AH8</p>
					</div>
					<div class="product_item_text">글로벌 카메이커에 인정받은 기술력으로 안정적인 사계절 주행</div>
					<div class="product_item_size">13인치 ~ 18인치</div>
					<div class="product_item_price">44,600원 ~ 130,200원</div>
					<div class="product_item_detail"><i class="fa-solid fa-magnifying-glass"></i>상세보기</div>
				</div>
			</a>
			<a href="detail.test">
				<div class="product_item">
					<div class="product_item_img">
						<img src="resources/web/main/product/ah8.jpg">
					</div>
					<div class="product_item_title">
						<p>넥센타이어</p>
						<p>엔프리즈 AH8</p>
					</div>
					<div class="product_item_text">글로벌 카메이커에 인정받은 기술력으로 안정적인 사계절 주행</div>
					<div class="product_item_size">13인치 ~ 18인치</div>
					<div class="product_item_price">44,600원 ~ 130,200원</div>
					<div class="product_item_detail"><i class="fa-solid fa-magnifying-glass"></i>상세보기</div>
				</div>
			</a>
			<a href="detail.test">
				<div class="product_item">
					<div class="product_item_img">
						<img src="resources/web/main/product/ah8.jpg">
					</div>
					<div class="product_item_title">
						<p>넥센타이어</p>
						<p>엔프리즈 AH8</p>
					</div>
					<div class="product_item_text">글로벌 카메이커에 인정받은 기술력으로 안정적인 사계절 주행</div>
					<div class="product_item_size">13인치 ~ 18인치</div>
					<div class="product_item_price">44,600원 ~ 130,200원</div>
					<div class="product_item_detail"><i class="fa-solid fa-magnifying-glass"></i>상세보기</div>
				</div>
			</a>
			<a href="detail.test">
				<div class="product_item">
					<div class="product_item_img">
						<img src="resources/web/main/product/ah8.jpg">
					</div>
					<div class="product_item_title">
						<p>넥센타이어</p>
						<p>엔프리즈 AH8</p>
					</div>
					<div class="product_item_text">글로벌 카메이커에 인정받은 기술력으로 안정적인 사계절 주행</div>
					<div class="product_item_size">13인치 ~ 18인치</div>
					<div class="product_item_price">44,600원 ~ 130,200원</div>
					<div class="product_item_detail"><i class="fa-solid fa-magnifying-glass"></i>상세보기</div>
				</div>
			</a>
			<a href="detail.test">
				<div class="product_item">
					<div class="product_item_img">
						<img src="resources/web/main/product/ah8.jpg">
					</div>
					<div class="product_item_title">
						<p>넥센타이어</p>
						<p>엔프리즈 AH8</p>
					</div>
					<div class="product_item_text">글로벌 카메이커에 인정받은 기술력으로 안정적인 사계절 주행</div>
					<div class="product_item_size">13인치 ~ 18인치</div>
					<div class="product_item_price">44,600원 ~ 130,200원</div>
					<div class="product_item_detail"><i class="fa-solid fa-magnifying-glass"></i>상세보기</div>
				</div>
			</a>
			<a href="detail.test">
				<div class="product_item">
					<div class="product_item_img">
						<img src="resources/web/main/product/ah8.jpg">
					</div>
					<div class="product_item_title">
						<p>넥센타이어</p>
						<p>엔프리즈 AH8</p>
					</div>
					<div class="product_item_text">글로벌 카메이커에 인정받은 기술력으로 안정적인 사계절 주행</div>
					<div class="product_item_size">13인치 ~ 18인치</div>
					<div class="product_item_price">44,600원 ~ 130,200원</div>
					<div class="product_item_detail"><i class="fa-solid fa-magnifying-glass"></i>상세보기</div>
				</div>
			</a>
			<a href="detail.test">
				<div class="product_item">
					<div class="product_item_img">
						<img src="resources/web/main/product/ah8.jpg">
					</div>
					<div class="product_item_title">
						<p>넥센타이어</p>
						<p>엔프리즈 AH8</p>
					</div>
					<div class="product_item_text">글로벌 카메이커에 인정받은 기술력으로 안정적인 사계절 주행</div>
					<div class="product_item_size">13인치 ~ 18인치</div>
					<div class="product_item_price">44,600원 ~ 130,200원</div>
					<div class="product_item_detail"><i class="fa-solid fa-magnifying-glass"></i>상세보기</div>
				</div>
			</a>
			<a href="detail.test">
				<div class="product_item">
					<div class="product_item_img">
						<img src="resources/web/main/product/ah8.jpg">
					</div>
					<div class="product_item_title">
						<p>넥센타이어</p>
						<p>엔프리즈 AH8</p>
					</div>
					<div class="product_item_text">글로벌 카메이커에 인정받은 기술력으로 안정적인 사계절 주행</div>
					<div class="product_item_size">13인치 ~ 18인치</div>
					<div class="product_item_price">44,600원 ~ 130,200원</div>
					<div class="product_item_detail"><i class="fa-solid fa-magnifying-glass"></i>상세보기</div>
				</div>
			</a>
			<a href="detail.test">
				<div class="product_item">
					<div class="product_item_img">
						<img src="resources/web/main/product/ah8.jpg">
					</div>
					<div class="product_item_title">
						<p>넥센타이어</p>
						<p>엔프리즈 AH8</p>
					</div>
					<div class="product_item_text">글로벌 카메이커에 인정받은 기술력으로 안정적인 사계절 주행</div>
					<div class="product_item_size">13인치 ~ 18인치</div>
					<div class="product_item_price">44,600원 ~ 130,200원</div>
					<div class="product_item_detail"><i class="fa-solid fa-magnifying-glass"></i>상세보기</div>
				</div>
			</a>
			<a href="detail.test">
				<div class="product_item">
					<div class="product_item_img">
						<img src="resources/web/main/product/ah8.jpg">
					</div>
					<div class="product_item_title">
						<p>넥센타이어</p>
						<p>엔프리즈 AH8</p>
					</div>
					<div class="product_item_text">글로벌 카메이커에 인정받은 기술력으로 안정적인 사계절 주행</div>
					<div class="product_item_size">13인치 ~ 18인치</div>
					<div class="product_item_price">44,600원 ~ 130,200원</div>
					<div class="product_item_detail"><i class="fa-solid fa-magnifying-glass"></i>상세보기</div>
				</div>
			</a>
			<a href="detail.test">
				<div class="product_item">
					<div class="product_item_img">
						<img src="resources/web/main/product/ah8.jpg">
					</div>
					<div class="product_item_title">
						<p>넥센타이어</p>
						<p>엔프리즈 AH8</p>
					</div>
					<div class="product_item_text">글로벌 카메이커에 인정받은 기술력으로 안정적인 사계절 주행</div>
					<div class="product_item_size">13인치 ~ 18인치</div>
					<div class="product_item_price">44,600원 ~ 130,200원</div>
					<div class="product_item_detail"><i class="fa-solid fa-magnifying-glass"></i>상세보기</div>
				</div>
			</a>
			<a href="detail.test">
				<div class="product_item">
					<div class="product_item_img">
						<img src="resources/web/main/product/ah8.jpg">
					</div>
					<div class="product_item_title">
						<p>넥센타이어</p>
						<p>엔프리즈 AH8</p>
					</div>
					<div class="product_item_text">글로벌 카메이커에 인정받은 기술력으로 안정적인 사계절 주행</div>
					<div class="product_item_size">13인치 ~ 18인치</div>
					<div class="product_item_price">44,600원 ~ 130,200원</div>
					<div class="product_item_detail"><i class="fa-solid fa-magnifying-glass"></i>상세보기</div>
				</div>
			</a> -->
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