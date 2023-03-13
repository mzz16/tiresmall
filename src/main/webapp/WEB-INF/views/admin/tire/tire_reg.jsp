<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet"
	href="resources/css/admin/tire/admin_tire_reg.css">
<script src="resources/js/admin/tire/admin_tire.js"></script>
</head>
<body>
	<input id="whatMenu" value="tire" type="hidden">
	<input id="sm" value="1" type="hidden">
	<div class="container sub">
		<div id="tire_container">
			<div id="admin-tire-reg">
				<h1 id="admin-tire-reg-whatPage">타이어 상품 등록</h1>
			</div>
			<form action="admin.tire.reg.do" id="admin_tire_table_container">
					<table id="admin_tire_table">
						<tr>
							<td class="admin_tire_table_title">브랜드</td>
							<td>
								<div class="admin-tire-reg-radio-di">
									<label class="admin-tire-teg-label"> <input
										type="radio" name="tg_brand" value="1"
										class="admin-tire-teg-input">
										<div class="rad-design"></div>
										<div class="rad-text">넥센타이어</div>
									</label> <label class="admin-tire-teg-label"> <input
										type="radio" name="tg_brand" value="2"
										class="admin-tire-teg-input">
										<div class="rad-design"></div>
										<div class="rad-text">금호타이어</div>
									</label> <label class="admin-tire-teg-label"> <input
										type="radio" name="tg_brand" value="3"
										class="admin-tire-teg-input">
										<div class="rad-design"></div>
										<div class="rad-text">미쉐린타이어</div>
									</label> <label class="admin-tire-teg-label"> <input
										type="radio" name="tg_brand" value="4"
										class="admin-tire-teg-input">
										<div class="rad-design"></div>
										<div class="rad-text">콘티넨탈타이어</div>
									</label> <label class="admin-tire-teg-label"> <input
										type="radio" name="tg_brand" value="5"
										class="admin-tire-teg-input">
										<div class="rad-design"></div>
										<div class="rad-text">한국타이어</div>
									</label> <label class="admin-tire-teg-label"> <input
										type="radio" name="tg_brand" value="6"
										class="admin-tire-teg-input">
										<div class="rad-design"></div>
										<div class="rad-text">요코하마타이어</div>
									</label> <label class="admin-tire-teg-label"> <input
										type="radio" name="tg_brand" value="7"
										class="admin-tire-teg-input">
										<div class="rad-design"></div>
										<div class="rad-text">브리지스톤타이어</div>
									</label> <label class="admin-tire-teg-label"> <input
										type="radio" name="tg_brand" value="8"
										class="admin-tire-teg-input">
										<div class="rad-design"></div>
										<div class="rad-text">굳이어타이어</div>
									</label>
								</div>
								<div class="admin-tire-reg-radio-di">
									<label class="admin-tire-teg-label"> <input
										type="radio" name="tg_brand" value="9"
										class="admin-tire-teg-input">
									<div class="rad-design"></div>
									<div class="rad-text">던롭타이어</div>
								</label> <label class="admin-tire-teg-label"> <input
									type="radio" name="tg_brand" value="10"
									class="admin-tire-teg-input">
									<div class="rad-design"></div>
									<div class="rad-text">피렐리타이어</div>
								</label> <label class="admin-tire-teg-label"> <input
									type="radio" name="tg_brand" value="11"
									class="admin-tire-teg-input">
									<div class="rad-design"></div>
									<div class="rad-text">BF굿리치타이어</div>
								</label>
							</div>
						</td>
					</tr>
					<tr>
						<td class="admin_tire_table_title">모델명</td>
						<td><input type="text" name="tg_name"
							id="admin-tire-reg-name-input" /></td>
					</tr>
					<tr>
						<td class="admin_tire_table_title">설명</td>
						<td>
							<div>
								<div>
									<input type="text" name="tg_text"
										id="admin-tire-reg-txt-input" />
								</div>
								<div>타이어 특성 고르기</div>
							</div>
						</td>
					</tr>
					<tr>
						<td class="admin_tire_table_title">출력</td>
						<td>
							<div class="admin-tire-reg-radio-di">
								<label class="admin-tire-teg-label"> <input
									type="radio" name="tg_print" class="admin-tire-teg-input"  value="1">
									<div class="rad-design"></div>
									<div class="rad-text">출력</div>
								</label> <label class="admin-tire-teg-label"> <input
									type="radio" name="tg_print" class="admin-tire-teg-input"  value="0"
									checked="checked">
									<div class="rad-design"></div>
									<div class="rad-text">숨김</div>
								</label>
							</div>
						</td>
					</tr>
					<tr>
						<td class="admin_tire_table_title">추천</td>
						<td>
							<div class="admin-tire-reg-radio-di">
								<label class="admin-tire-teg-label"> <input
									type="checkbox" name="tg_suv" class="admin-tire-teg-input" value="1">
									<div class="rad-design"></div>
									<div class="rad-text" >SUV추천</div>
								</label> <label class="admin-tire-teg-label"> <input
									type="checkbox" name="tg_sedan" class="admin-tire-teg-input" value="1">
									<div class="rad-design"></div>
									<div class="rad-text">승용차 추천</div>
								</label>
							</div>
						</td>
					</tr>
					<tr>
						<td class="admin_tire_table_title">타이어사이즈</td>
						<td>
							<div id="admin_tire_size_button" >사이즈추가</div>
							<table id="admin-tire-size-reg">
								<tr>
									<td class="admin-tire-size-reg-title admin-tire-size" style="border-right: 2px solid white;">사이즈</td>
									<td class="admin-tire-size-reg-title admin-tire-name" style="border-right: 2px solid white;">타이어
										이름</td>
									<td class="admin-tire-size-reg-title admin-tire-marking" style="border-right: 2px solid white;">마킹</td>
									<td class="admin-tire-size-reg-title admin-tire-pricefac" style="border-right: 2px solid white;">공장도가</td>
									<td class="admin-tire-size-reg-title admin-tire-pricegp" style="border-right: 2px solid white;">기표가격</td>
									<td class="admin-tire-size-reg-title admin-tire-vat" style="border-right: 2px solid white;">부가세</td>
									<td class="admin-tire-size-reg-title admin-tire-stock" style="border-right: 2px solid white;">재고</td>
									<td class="admin-tire-size-reg-title admin-tire-delete">삭제</td>
								</tr>
								<tr>
									<td class="admin-tire-size-reg-content">1</td>
									<td class="admin-tire-size-reg-content">2</td>
									<td class="admin-tire-size-reg-content">3</td>
									<td class="admin-tire-size-reg-content">4</td>
									<td class="admin-tire-size-reg-content">5</td>
									<td class="admin-tire-size-reg-content">6</td>
									<td class="admin-tire-size-reg-content">7</td>
									<td class="admin-tire-size-reg-content">8</td>
								</tr>
							</table>
						</td>
					</tr>
					<tr>
						<td class="admin_tire_table_title">리스트 이미지</td>
						<td>
							<div class="admin-tire-img-container">
								<div class="admin-tire-img-contain">
									<div class="admin-tire-img-title" style="border-right: 2px solid white;">현재 이미지</div>
									<div class="admin-tire-img-content"></div>
								</div>
								<div class="admin-tire-img-contain">
									<div class="admin-tire-img-title">이미지 등록</div>
									<div class="admin-tire-img-content">
										<div class="filebox1 bs3-primary">
							           		<input class="upload-name1" value="파일선택" disabled="disabled">
						            		<label for="ex_filename">업로드</label> 
						              		<input type="file" id="ex_filename" class="upload-hidden1"> 
						            	</div>
									</div>
								</div>
							</div>
						</td>
					</tr>
					<tr>
						<td class="admin_tire_table_title">상세 이미지</td>
						<td>
							<div class="admin-tire-img-container">
								<div class="admin-tire-img-contain">
									<div class="admin-tire-img-title" style="border-right: 2px solid white;">현재 이미지</div>
									<div class="admin-tire-img-content"></div>
								</div>
								<div class="admin-tire-img-contain">
									<div class="admin-tire-img-title">이미지 등록</div>
									<div class="admin-tire-img-content">
										<div class="filebox2 bs3-primary">
							            	<input class="upload-name2" value="파일선택" disabled="disabled">
							              	<label for="ex_filename">업로드</label> 
							              	<input type="file" id="ex_filename" class="upload-hidden2"> 
							            </div></div>
								</div>
							</div>
						</td>
					</tr>
				</table>
			</form>
		</div>
	</div>
</body>
</html>