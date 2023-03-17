<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="resources/css/main/search/main_search.css" />
<script src="https://code.jquery.com/jquery-3.6.3.js"
	integrity="sha256-nQLuAZGRRcILA+6dMBOvcRh5Pe310sBpanc6+QBmyVM="
	crossorigin="anonymous"></script>
</head>
<body>
	<div class="searchTopImgWrapper"></div>
	<div class="searchTireSizeGuideWrapper"></div>

	<div class="searchContainer">
		<div class="searchConditionWrapper">
			<div class="conditionItemBox">
				<div class="conditionSubtitle">단면폭</div>
				<div class="conditionItem1">
					<div class="vhrItem1">145</div>
					<div class="vhrItem1">155</div>
					<div class="vhrItem1">165</div>
					<div class="vhrItem1">175</div>
					<div class="vhrItem1">185</div>
					<div class="vhrItem1">195</div>
					<div class="vhrItem1">205</div>
					<div class="vhrItem1">215</div>
					<div class="vhrItem1">225</div>
					<div class="vhrItem1">235</div>
					<div class="vhrItem1">245</div>
					<div class="vhrItem1">255</div>
					<div class="vhrItem1">265</div>
					<div class="vhrItem1">275</div>
					<div class="vhrItem1">285</div>
					<div class="vhrItem1">295</div>
					<div class="vhrItem1">305</div>
					<div class="vhrItem1">315</div>
					<div class="vhrItem1">325</div>
					<div class="vhrItem1">335</div>
					<div class="vhrItem1">345</div>
					<div class="vhrItem1">355</div>
					<div class="vhrItem1">500</div>
				</div>
			</div>
			<div class="conditionItemBox">
				<div class="conditionSubtitle">편평비</div>
				<div class="conditionItem2">
					<div class="vhrItem2">25</div>
					<div class="vhrItem2">30</div>
					<div class="vhrItem2">35</div>
					<div class="vhrItem2">40</div>
					<div class="vhrItem2">45</div>
					<div class="vhrItem2">50</div>
					<div class="vhrItem2">55</div>
					<div class="vhrItem2">60</div>
					<div class="vhrItem2">65</div>
					<div class="vhrItem2">70</div>
					<div class="vhrItem2">75</div>

				</div>
			</div>
			<div class="conditionItemBox">
				<div class="conditionSubtitle">인치</div>
				<div class="conditionItem3">
					<div class="vhrItem3">12</div>
					<div class="vhrItem3">13</div>
					<div class="vhrItem3">14</div>
					<div class="vhrItem3">15</div>
					<div class="vhrItem3">16</div>
					<div class="vhrItem3">17</div>
					<div class="vhrItem3">18</div>
					<div class="vhrItem3">19</div>
					<div class="vhrItem3">20</div>
					<div class="vhrItem3">21</div>
					<div class="vhrItem3">22</div>
				</div>
			</div>
		</div>
		<button class="searchTireBtn" type="button" onclick="searchTire()">타이어 찾기</button>
	</div>
	
	<div class="searchResultContainer">
		<div class="searchResultTitle">검색 결과</div>
		<hr style="margin-bottom: 50px;">
	</div>
	
	<div class="tire-item">
		<div class="tire-img">타이어이미지</div>
		<div class="tire-info">
			<div class="tire-brand" style="font-size: 18px; padding-bottom: 10px;">타이어 브랜드</div>
			<div class="tire-name" style="font-size: 24px; padding-bottom: 30px; font-weight: 500;">타이어이름</div>
			<div class="tire-cost" style="font-size: 26px; padding-bottom: 10px; font-weight: 500;">타이어 가격</div>
			<div class="tire-info-size">
				<div class="tire-info-width">width123</div>&nbsp;/&nbsp;
				<div class="tire-info-ratio">ratio123</div>&nbsp;/&nbsp; 
				<div class="tire-info-inch">inch123</div>&nbsp;
			</div>
		</div>
	</div>
	
	
	<div class="tire-items">
	</div>
</body>
</html>