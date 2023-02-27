<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="resources/css/main/store/main_store.css">
<script src="https://code.jquery.com/jquery-3.6.3.js"
	integrity="sha256-nQLuAZGRRcILA+6dMBOvcRh5Pe310sBpanc6+QBmyVM="
	crossorigin="anonymous"></script>
<script type="text/javascript"
	src="resources/js/main/store/main_store.js"></script>
<script
	src="https://maps.googleapis.com/maps/api/js?key=AIzaSyAuyB2oFUoxC04Ue82J1pxusEfNPy5FBJE&callback=initMap"></script>	
</head>
<body>
	<select class="sel" name="shop_complist" id="shop_complist"
			 size="6"
			style="height: 130px; width: 300px; font-size: 15px; padding: 10px;">
			<option	value="1" comp_name="[직영점] 타이어쇼핑몰" comp_tel="042-545-8008"
				comp_address="대전광역시 서구 신갈마로 83 (갈마동)"
				opentimememo="평일 : 08:30 ~ 19:00 / 토요일 08:30 ~ 16:00 (일요일 휴무)"
				lngmemo="127.3641291161978" latmemo="36.34176318004567"
				locmemo="한국타이어,넥센타이어,금호타이어,미쉐린타이어,컨티넨탈타이어,피넬리타이어,휠얼라인먼트,경정비,수입차정비 / 본사직영매장"
				>[직영점] 타이어쇼핑몰</option>
			<option value="2" comp_name="[제휴 당일장착점] 타이어테크 죽동점"
				comp_tel="010-4417-2220" comp_address="대전광역시 유성구 죽동 707-2번지 타이어테크"
				opentimememo="평일 오전08:30-19:00 토요일 오전 08:30-16:00  일요일휴무"
				lngmemo="127.33738852478393" latmemo="36.36919624428963"
				locmemo="한국타이어, 금호타이어,넥센타이어, 타이어렌탈전문점, 휠얼라이먼트, 합성오일 전문점">[제휴
				당일장착점] 타이어테크 죽동점</option>
			<option value="3" comp_name="[제휴 당일장착점]논산 타이어쇼핑몰(타이어테크 시청점)"
				comp_tel="010-8488-2326" comp_address="충청남도 논산시 시민로 262 논산타이어 (내동)"
				opentimememo="평일 오전 08:30-19:00 토요일 오전08:30-16:00 일요일 휴무"
				lngmemo="127.09327191619546" latmemo="36.19009368007888"
				locmemo="한국,금호 넥센,미쉐린,컨티넨탈,피넬리 휠얼라이먼트,국산차및 수입차 경정비">[제휴
				당일장착점]논산 타이어쇼핑몰(타이어테크 시청점)</option>
			<option value="4" comp_name="[제휴 당일장착점]타이어테크 연무점"
				comp_tel="010-4202-1588"
				comp_address="충청남도 논산시 연무읍 왕릉로13번길 38 타이어테크 연무점"
				opentimememo="평일 오전 08:30-19:00 토요일 오전 08:30-16:00 일요일휴무"
				lngmemo="127.09625011619448" latmemo="36.11886928009448"
				locmemo="한국타이어,금호타이어,넥센타이어,컨티넨탈타이어,피넬리타이어,경정비,타이어렌탈">[제휴
				당일장착점]타이어테크 연무점</option>
			<option value="5" comp_name="[제휴 당일장착점] 타이어테크 반월점 (로얄카)"
				comp_tel="010-7267-2220"
				comp_address="충청남도 논산시 해월로252 타이어테크 반월점 (로얄카)"
				opentimememo="평일 오전 08:30-19:00 토요일 오전 08:30-16:00 일요일휴무"
				lngmemo="127.0916009161958" latmemo="36.208516980074826"
				locmemo="한국,금호,넥센타이어,각종수입타이어,타이어 렌탈,휠얼라이먼트,경정비">[제휴 당일장착점]
				타이어테크 반월점 (로얄카)</option>
		</select>
	<div id="store_wrap">
		<div id="store_wrap_subtitle">
			<h1>당일 장착 매장안내</h1>
			<h2>대전 타이어쇼핑몰에서 구매 후 당일 장착서비스가 가능한 매장 안내 입니다.</h2>
		</div>
		<div id="store_wrap_info">
			<div id="store_info_name">[직영점] 타이어쇼핑몰</div>
			<div class="store_info_row">
				<div class="store_info_row_index">위치안내 :</div>
				<div class="store_info_row_content">대전광역시 서구 신갈마로 83 (갈마동)</div>
			</div>
			<div class="store_info_row">
				<div class="store_info_row_index">전화번호 :</div>
				<div class="store_info_row_content">042-545-8008</div>
			</div>
			<div class="store_info_row">
				<div class="store_info_row_index">영업시간 :</div>
				<div class="store_info_row_content">평일 : 08:30 ~ 19:00 / 토요일 08:30 ~ 16:00 (일요일 휴무)</div>
			</div>
			<div class="store_info_row">
				<div class="store_info_row_index">취급품목 :</div>
				<div class="store_info_row_content">한국타이어,넥센타이어,금호타이어,미쉐린타이어,컨티넨탈타이어,피넬리타이어,휠얼라인먼트,경정비,수입차정비 / 본사직영매장</div>
			</div>
		</div>
			<input id="location_lng" type="hidden" value="127.3663178"></input>
			<input id="location_lat" type="hidden" value="36.3417632"></input>
		<div id="store_wrap_map" style="height: 600px">
			<!--  
			직영점 36.3417632		127.3663178
			죽동점 36.369228		127.338054
			시청점 36.1900937		127.0954606
			연무점 36.1188693		127.0984388
			반월점 36.208517		127.0937896
			
			
			
			 -->

		</div>
		<div id="store_wrap_banner">
			<img src="">
		</div>
	</div>


</body>
</html>