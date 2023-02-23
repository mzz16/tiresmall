<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%> <%@ taglib uri="http://java.sun.com/jsp/jstl/core"
prefix="c"%>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8" />
    <title>대전 타이어쇼핑몰</title>
    <link rel="stylesheet" href="resources/css/index.css" />
  </head>
  <body>
    <div class="index_shadow"></div>
    <div class="index_container">
      <header>
        <div class="index_wrapper index_hWrapper">
          <div class="index_hTop">
            <div class="index_hTopLeft">
              <a href="admin.order.go?m=order">관리자</a>
              <a href="/">구매가이드</a>
              <a href="/">실시간 상담</a>
            </div>
            <div class="index_hTopRight">
              <a href="login">로그인</a>
              <a href="join">회원가입</a>
              <a href="non-member">비회원 주문조회</a>
              <a href="/">고객센터</a>
            </div>
          </div>
          <div class="index_hBottom">
            <div class="index_logo">
              <a href="/home">
                <img src="resources/web/logo.png" style="height: 50px" />
              </a>
            </div>
            <div class="index_topNav">
              <div class="index_tnMenu index_tnSearch">
                <a href="search.car">타이어 찾기</a>
              </div>
              <div class="index_tnMenu index_tnBrand">
                <a href="/">브랜드별 타이어</a>
              </div>
              <div class="index_tnMenu index_tnStore">
                <a href="/">매장 안내</a>
              </div>
            </div>
            <div class="index_sideNav">
              <a href="/">장바구니</a>
            </div>
          </div>
        </div>
        <div class="index_dropMenu">
          <ul class="index_dropSearch index_dropWrapper">
            <li class="index_dropMenu_menu">
              <a href="search.car">차종으로 검색</a>
              <a href="search.size">타이어 사이즈로 검색</a>
              <a href="search.product">제품명으로 찾기</a>
            </li>
          </ul>
          <ul class="index_dropBrand index_dropWrapper">
            <li class="index_dropMenu_menu">
              <a href="/">넥센타이어</a>
              <a href="/">한국타이어</a>
              <a href="/">콘티넨탈타이어</a>
              <a href="/">피렐리타이어</a>
              <a href="/">미쉐린타이어</a>
            </li>
          </ul>
          <ul class="index_dropStore index_dropWrapper">
            <li class="index_dropMenu_menu">
              <a href="/">타이어쇼핑몰</a>
              <a href="/">타이어테크 죽동점</a>
              <a href="/">논산 타이어쇼핑몰(타이어테크 시청점)</a>
              <a href="/">타이어테크 연무점</a>
              <a href="/">타이어테크 반월점</a>
            </li>
          </ul>
        </div>
      </header>
      <main>
      	<jsp:include page="${content}"></jsp:include>
      </main>
      <footer>
        <div class="index_wrapper index_fWrapper">
          <div class="index_fTop">
            <div class="index_fLogo">
              <img src="resources/web/logo2.png" style="height: 40px" />
            </div>
            <div class="index_fNav">
              <a href="/">이용약관 |</a>
              <a href="/">개인정보 처리방침 |</a>
              <a href="/">장착점 제휴문의 |</a>
              <a href="/">환불정책 |</a>
              <a href="/">도매문의</a>
            </div>
          </div>
          <div class="index_fBottom">
            <p>
              대전 타이어쇼핑몰 ㅣ 대표 강남용 ㅣ 대전광역시 서구 신갈마로
              83(갈마동) 사업자등록번호 597-01-01529 ㅣ 통신판매업 신고번호
              2022-대전서구-0842호
            </p>
            <p>고객센터 010-5125-8008 ㅣ kny2220@naver.com</p>
            <p>
              TIRESHOPPINGMALL.COM | Copyright © PITNINE & SUN Co.,Ltd. All
              Rights Reserved.
            </p>
          </div>
        </div>
      </footer>
    </div>
    <script src="resources/js/index.js"></script>
  </body>
</html>
