<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8" />
    <title>Insert title here</title>
  </head>
  <body>
    <div class="detail_container">
      <section class="detail_product">
        <div class="detail_img">
          <img src="resources/web/main/product/example.jpg" />
        </div>
        <div class="detail_info">
          <div class="detail_titles">
            <h1>엔페라 프리머스 AS T1</h1>
            <h3>4계절 고급 세단 용 프리미엄 타이어</h3>
          </div>
          <div class="detail_option">
            <div>
              <h5>사이즈 선택 :</h5>
              <select>
                <option>1</option>
                <option>2</option>
                <option>3</option>
              </select>
            </div>
            <div>
              <h5>마킹 :</h5>
              <span></span>
            </div>
            <div>
              <h5>배송비 :</h5>
              <span>직영점 방문장착시 배송비무료</span>
            </div>
            <div>
              <h5>장착비 :</h5>
              <span>장착비 별도 / 표준공임표 참조</span>
            </div>
            <div>
              <h5>제조일자 :</h5>
              <span>국내브랜드 6개월 이내 제품 / 수입브랜드 1년 이내 제품</span>
            </div>
          </div>
          <div class="detail_price">
            <h5>소비자가격 :</h5>
            <span>147,000원</span>
            <h5>수량 :</h5>
            <select>
              <option>1</option>
              <option>2</option>
              <option>3</option>
            </select>
            <h5>최종가격</h5>
            <span>95,600원</span>
          </div>
          <div class="detail_buy">
            <button>장바구니</button>
            <button>구매예약</button>
          </div>
        </div>
      </section>
      <section class="detail_content">
        <ul class="detail_nav">
          <li>상품정보</li>
          <li>구매 전 확인사항</li>
          <li>타이어 장착 안내</li>
          <li>배송 / 반품 / 교환 / AS 안내</li>
        </ul>
        <div class="detail_include"></div>
      </section>
    </div>
    <script src="https://code.jquery.com/jquery-latest.min.js"></script>
    <script src="resources/js/main/product/product_detail.js"></script>
  </body>
</html>
