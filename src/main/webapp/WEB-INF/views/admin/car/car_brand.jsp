<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet"
	href="resources/css/admin/car/admin_car_brand.css">

</head>
<body>
	<div class="container sub">



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


	</div>
	
	
	<%-- 	<c:forEach var="b" items="${cars }" varStatus="status"> --%>	
		<div class="branddatalist_div"
			style="border: 1px solid gray; float: left;">
			<div class="branddatalist_div1" style="float: left;"> </div>
			<div class="branddatalist_div2" style="float: left;"> </div>
			<div class="branddatalist_div3" style="float: left;"> 
			</div>
			<div class="branddatalist_div4" style="float: left;"> </div>
			<div class="branddatalist_div5" style="float: left;">

				
				<button type="button" onclick="deletecar('')">삭제</button>
			</div>

		</div>
	<%-- </c:forEach> --%>

</body>
</html>