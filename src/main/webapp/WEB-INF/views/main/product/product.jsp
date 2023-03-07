<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="resources/css/main/product/main_product.css">
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
		
		<div id="product_container">
		
			<%-- <c:forEach items="" var=""> --%>
				<a href="detail.test">
					<div class="product_item">
						<div class="product_item_img">
						<%-- <c:choose>
							<c:when test=""> --%>
								<img src="resources/web/main/product/no-tire-image.jpg">
							<%-- </c:when>
							<c:otherwise>
								<img src="resources/web/main/product/no-tire-img.jpg">
							</c:otherwise>					
						</c:choose> --%>
						</div>
						<div class="product_item_title">
							<p>타이어 브랜드</p>
							<p>타이어 이름</p>
						</div>
						<div class="product_item_text">설명(overflow시 ...)</div>
						<div class="product_item_size">인치 최소값 ~ 인치 최대값</div>
						<div class="product_item_price"> 가격 최소값 ~ 가격 최대값</div>
						<div class="product_item_detail"><i class="fa-solid fa-magnifying-glass"></i>상세보기</div>
					</div>
				</a>
			<%-- </c:forEach> --%>
			<a href="detail.test">
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
			</a>
		</div>
		<div id="product_wrap_paging"><a href="#">이전</a> <a href="#">1</a> <a href="#">다음</a></div>
	</div>
	
<script src="https://kit.fontawesome.com/772d40e343.js" crossorigin="anonymous"></script>
</body>
</html>