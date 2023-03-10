<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet"
	href="resources/css/admin/car/admin_car_brand.css">
	
<script src="resources/js/admin/car/admin_car.js"></script>
	



</head>
<body>
	<div class="container sub">
		<h1>차종브랜드관리페이지</h1>
	</div>
	
	<div class="brandRegButton1" style="float: right;">
			<button class="brandRegButton">신규등록</button>
		</div>
	
	
	<div class="branddata_div_outter">
		<div class="branddata_div" style="float: left; margin-top: 5px;">

			<div class="branddata_div1"
				style="border: 1px solid gray; float: left;">메이커명</div>
			<div class="branddata_div2"
				style="border: 1px solid gray; float: left;">등록차종수</div>
			<div class="branddata_div3"
				style="border: 1px solid gray; float: left;">표시순서</div>
			<div class="branddata_div4"
				style="border: 1px solid gray; float: left;">관리</div>
		</div>
	</div>
	
	
	 	<c:forEach var="cb" items="${carbrands }" varStatus="status"> 
		<div class="branddatalist_div"
			style="border: 1px solid gray; float: left;">
			<div class="branddatalist_div1" style="float: left;">${cb.cb_name } </div>
			<div class="branddatalist_div2" style="float: left;">1 </div>
			<div class="branddatalist_div3" style="float: left;">2 
			</div>
			<div class="branddatalist_div4" style="float: left;">
				
				<button type="button" onclick="deletecb1('${cb.cb_name}')">삭제</button>
			</div>

		</div>
	 </c:forEach> 
	 
	 
	 
	 
	 
	 <div id="brandregpopup01" class="carbrandregbuttonarea">
		<div class="close">X</div>
		<div>
			<form action="reg.brand.do"  name="regform"
				onsubmit="return carbrandregcall();" >
				<table border="1" class="">
				<tr>
					<td>브랜드 명</td>
					<td><input name="cb_name" id="cb_name"></td>
					</tr>
					<tr>
					<td>표시순서</td>
					<td><input name="cb_order" id="cb_order"></td>
					
		
					</tr>
					
					<tr>
					<td colspan=2><div class="carbrandregokbutton">
								<button class="carbrandregokbutton1" id="regcarbrand">등록</button>
							</div></td>
					</tr>
					
				</table>
			</form>
		</div>
	 </div>
	 
	 
	 
	 
	
</body>
</html>