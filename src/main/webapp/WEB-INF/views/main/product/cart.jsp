<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8" />
    <title>Insert title here</title>
  </head>
  <body>
    <div class="include_navi">
      <div class="include_navi_wrapper">
        <i class="fa-solid fa-house"></i>
        <i class="fa-solid fa-chevron-right"></i>
        <span>장바구니</span>
      </div>
    </div>
    <div class="cart_container">
      <div class="cart_titles">
        <div class="cart_title_left">
          <h1>장바구니</h1>
        </div>
        <div class="cart_title_right">
          <h2>장바구니</h2>
          <i class="fa-solid fa-chevron-right"></i>
          <h2>구매예약</h2>
          <i class="fa-solid fa-chevron-right"></i>
          <h2>예약완료</h2>
        </div>
      </div>
      <div class="cart_content">
        <div class="cart_list">
          <div class="cart_product">
            <div class="cart_product_check">
              <input type="checkbox" />
            </div>
            <div class="cart_product_img">
              <img
                src="resources/web/main/product/example.jpg"
                style="width: 150px"
              />
            </div>
            <div>
              <h3>넥센타이어</h3>
              <h1>엔페라 슈프림</h1>
              <h2>205/55 R16</h2>
              <h4>91V</h4>
            </div>
            <div>
              <h4>수량</h4>
              <i class="fa-solid fa-plus"></i>
              <input type="text" />
              <i class="fa-solid fa-minus"></i>
            </div>
            <div>
              <span>121,000원</span>
            </div>
          </div>
        </div>
        <div class="cart_confirm">
          <div>
            <h2>결제 정보</h2>
            <hr />
            <h3>상품 수</h3>
            <h3>소비자 가격</h3>
            <h3>할인 금액</h3>
            <hr />
            <h1>총 결제 금액</h1>
          </div>
        </div>
      </div>
    </div>
  </body>
</html>
