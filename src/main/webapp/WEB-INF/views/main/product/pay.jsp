<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%> <%@ taglib prefix="c"
uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8" />
    <title>Insert title here</title>
  </head>
  <body>
    <form action="pay.complete" method="post" class="pay_container">
      <div class="pay_titles">
        <div class="pay_title_left">
          <h1>구매예약</h1>
        </div>
        <div class="pay_title_right">
          <h2>장바구니</h2>
          <i class="fa-solid fa-chevron-right"></i>
          <h2 class="pay_title_point">구매예약</h2>
          <i class="fa-solid fa-chevron-right"></i>
          <h2>예약완료</h2>
        </div>
      </div>
      <div class="pay_content">
        <div class="pay_list">
          <div class="pay_subtitles">
            <span>주문 상품</span>
          </div>
          <c:forEach var="tire" items="${sessionScope.cartSession}">
            <div class="pay_product">
              <div class="pay_product_left">
                <div class="pay_product_img">
                  <c:choose>
                    <c:when test="${tire.tg_img eq 'noimg'}">
                    <img 
                      src="resources/web/main/product/no-tire-image.jpg"
                      style="width: 150px"
                      />
                    </c:when>
                    <c:otherwise>
                    <img
                      src="resources/web/main/tire/${tire.tg_img}.jpg"
                      style="width: 150px"
                    />
                    </c:otherwise>
                  </c:choose>
                </div>
                <div class="pay_product_info">
                  <h2 href="http://localhost/home/product.brand?b=${tire.tg_brand}&p=1" class="pay_product_brand">${tire.tg_brand}</h2>
                  <h1 href="product.detail?tg_id=${tire.tg_id}" class="pay_product_name">${tire.tg_name}</h1>
                  <div class="pay_quantity_box">
                    <c:choose>
                      <c:when test="${tire.ti_ratio eq 0}">
                        <h2 class="pay_product_size">${tire.ti_width}R${tire.ti_inch} (${tire.ti_marking})</h2>
                      </c:when>
                      <c:otherwise>
                        <h2 class="pay_product_size">${tire.ti_width}/${tire.ti_ratio}R${tire.ti_inch} (${tire.ti_marking})</h2>
                      </c:otherwise>
                    </c:choose>
                    <span class="pay_quantity">${tire.ti_stock}EA</span>
                  </div>
                </div>
              </div>
              <div class="pay_product_right">
                <span class="pay_product_price"><fmt:formatNumber value="${tire.ti_stock * tire.ti_pricegp}" type="currency" currencySymbol="" />원</span>
              </div>
              <input type="hidden" class="pay_tg_id" value="${tire.tg_id}">
              <input type="hidden" class="pay_tg_brand" value="${tire.tg_brand}">
              <input type="hidden" class="pay_tg_name" value="${tire.tg_name}">
              <input type="hidden" class="pay_tg_img" value="${tire.tg_img}">
              <input type="hidden" class="pay_tg_dcrate" value="${tire.tg_dcrate}">
              <input type="hidden" class="pay_ti_id" value="${tire.ti_id}">
              <input type="hidden" class="pay_ti_width" value="${tire.ti_width}">
              <input type="hidden" class="pay_ti_ratio" value="${tire.ti_ratio}">
              <input type="hidden" class="pay_ti_inch" value="${tire.ti_inch}">
              <input type="hidden" class="pay_ti_stock" value="${tire.ti_stock}">
              <input type="hidden" class="pay_ti_pricegp" value="${tire.ti_pricegp}">
              <input type="hidden" class="pay_ti_pricefac" value="${tire.ti_pricefac}">
              <input type="hidden" class="pay_ti_marking" value="${tire.ti_marking}">
              <input type="hidden" class="pay_final_price" value="${tire.ti_stock * tire.ti_pricegp}" />
              <input type="hidden" class="pay_finalFac_price" value="${tire.ti_stock * tire.ti_pricefac}"/>
            </div>
          </c:forEach>
          <div class="pay_subtitles">
            <span>장착방법</span>
          </div>
          <ul class="pay_shipMethod">
            <li>
              <div>
                <span>장착점 선택</span>
              </div>
              <div>
                <select name="" id="">
                  <option value="">타이어쇼핑몰</option>
                  <option value="">타이어테크 죽동점</option>
                  <option value="">논산 타이어쇼핑몰</option>
                  <option value="">타이어테크 연무점</option>
                  <option value="">타이어테크 반월점</option>
                </select>
              </div>
            </li>
            <li>
              <div>
                <span>장착점 주소</span>
              </div>
              <div>
                <span>대전광역시 서구 신갈마로 83 (갈마동)</span>
              </div>
            </li>
            <li>
              <div>
                <span>전화번호</span>
              </div>
              <div>
                <span>042 - 545 - 8008</span>
              </div>
            </li>
            <li>
              <div>
                <span>영업시간</span>
              </div>
              <div>
                <span>평일 : 08:30 ~ 19:00 / 토요일 08:30 ~ 16:00 (일요일 휴무)</span>
              </div>
            </li>
            <li>
              <div>
                <span>장착예정일</span>
              </div>
              <div>
                <input type="date">
              </div>
            </li>
          </ul>
          <div class="pay_subtitles">
            <span>주문자 정보</span>
          </div>
          <ul class="pay_customerInfo">
            <li>
              <div>
                <span>주문자명</span>
              </div>
              <div>
                <input type="text">
              </div>
            </li>
            <li>
              <div>
                <span>연락처</span>
              </div>
              <div>
                <input type="text">
              </div>
            </li>
            <li>
              <div>
                <span>이메일</span>
              </div>
              <div>
                <input type="email">
              </div>
            </li>
            <li>
              <div>
                <span>차량정보</span>
              </div>
              <div>
                <select name="" id="">
                  <option value="">2023</option>
                </select>
                <select name="" id="">
                  <option value="">현대</option>
                </select>
                <select name="" id="">
                  <option value="">그랜절</option>
                </select>
              </div>
            </li>
            <li>
              <div>
                <span>차량번호</span>
              </div>
              <div>
                <input type="text">
              </div>
            </li>
            <li>
              <div>
                <span>기타요청</span>
              </div>
              <div>
                <input type="text">
              </div>
            </li>
          </ul>
          <div class="pay_subtitles">
            <span>결제 정보</span>
          </div>
          <div class="pay_payInfo">
            <input type="radio" name="payMethod" checked>
            <label>현장결제</label>
            <input type="radio" name="payMethod">
            <label>무통장</label>
          </div>
        </div>
        <div class="pay_confirm">
          <div class="pay_nav">
            <div class="pay_nav_title">
              <h2>주문 정보</h2>
            </div>
            <div class="pay_nav_content pay_nav_origianl">
              <h2 class="pay_nav_name">소비자 가격</h2>
              <span class="pay_nav_value"></span>
            </div>
            <div class="pay_nav_content pay_nav_discount">
              <h2 class="pay_nav_name">할인 금액</h2>
              <span class="pay_nav_value"></span>
            </div>
            <div class="pay_nav_content pay_nav_price">
              <h2 class="pay_nav_name">총 결제 금액</h2>
              <span class="pay_nav_value"></span>
            </div>
            <button class="pay_nav_pay">결제하기</button>
          </div>
        </div>
      </div>
    </form>
  </body>
</html>
