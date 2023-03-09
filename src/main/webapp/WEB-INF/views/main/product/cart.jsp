<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8" />
    <title>Insert title here</title>
  </head>
  <body>
    <div class="cart_container">
      <div class="cart_titles">
        <div class="cart_title_left">
          <h1>장바구니</h1>
        </div>
        <div class="cart_title_right">
          <h2 class="cart_title_point">장바구니</h2>
          <i class="fa-solid fa-chevron-right"></i>
          <h2>구매예약</h2>
          <i class="fa-solid fa-chevron-right"></i>
          <h2>예약완료</h2>
        </div>
      </div>
      <div class="cart_content">
        <div class="cart_list">
          <div class="cart_product">
            <button class="cart_product_delete">
              <i class="fa-solid fa-xmark"></i>
            </button>
            <div class="cart_product_left">
              <div class="cart_product_img">
                <img
                  src="resources/web/main/product/example.jpg"
                  style="width: 150px"
                />
              </div>
              <div class="cart_product_info">
                <h3 class="cart_product_brand">넥센타이어</h3>
                <h1 class="cart_product_name">엔페라 슈프림</h1>
                <div class="cart_size_box">
                  <h2 class="cart_product_size">205/55 R16</h2>
                  <h4 class="cart_product_mark">91V</h4>
                </div>
              </div>
            </div>
            <div class="cart_product_right">
              <div class="cart_product_quantity">
                <h4>수량</h4>
                <div class="cart_quantity_box">
                  <button class="cart_minus_button">
                    <i class="fa-solid fa-minus"></i>
                  </button>
                  <input
                    type="text"
                    class="cart_quantity_input"
                    value="1"
                    readonly
                  />
                  <button class="cart_plus_button">
                    <i class="fa-solid fa-plus"></i>
                  </button>
                </div>
              </div>
              <div class="cart_product_price">
                <span>121,000원</span>
              </div>
            </div>
          </div>
        </div>
        <div class="cart_confirm">
          <div class="cart_nav">
            <div class="cart_nav_title">
              <h2>주문 정보</h2>
            </div>
            <h3 class="cart_nav_content cart_nav_origianl">소비자 가격</h3>
            <h3 class="cart_nav_content cart_nav_discount">할인 금액</h3>
            <h1 class="cart_nav_content cart_nav_price">총 결제 금액</h1>
            <button class="cart_nav_pay">결제하기</button>
          </div>
        </div>
      </div>
    </div>
  </body>
</html>
