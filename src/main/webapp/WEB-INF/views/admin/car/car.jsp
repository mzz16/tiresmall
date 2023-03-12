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
	href="resources/css/admin/car/admin_car.css">
<script src="resources/js/admin/car/admin_car.js"></script>

</head>
<body>



		<div class="car-findselect">
			<div class="car-findarea">


			<form action="car.search.do">
				<div class="car-text1">메이커</div>
				<select name="carbrandInput" style="float: left;">
				<c:forEach var="cblist" items="${carbrand}">
				<option value="${cblist.cb_name}">${cblist.cb_name}</option>
				</c:forEach>
			
				</select> 
				<input name="carnameInput" value=""  type="hidden">
				<button class="car-findareabutton" style="float: left;">메이커 검색</button>

				</form>
			</div>
			<div class="car-text2" style="float: left;">차종</div>

			<form name="carsearchform" action="car.search.do">

				<input name="carnameInput" style="text-align: center; height: 38px;"
					onkeypress="JavaScript:press(this.form)">
				<button class="carsearchButton">차종 검색</button>
			<input name="carbrandInput" value=""  type="hidden">
			</form>



			<div class="carRegButton1" style="float: right;">
				<button class="carRegButton">신규등록</button>
			</div>



		</div>




		<div class="cardata_div_outter">
			<div class="cardata_div" style="float: left; margin-top: 5px;">

				<div class="cardata_div1"
					style="border: 1px solid gray; float: left;">No.</div>
				<div class="cardata_div2"
					style="border: 1px solid gray; float: left;">메이커</div>
				<div class="cardata_div3"
					style="border: 1px solid gray; float: left;">연식</div>
				<div class="cardata_div4"
					style="border: 1px solid gray; float: left;">차종</div>
				<div class="cardata_div5"
					style="border: 1px solid gray; float: left;">옵션</div>
				<div class="cardata_div6"
					style="border: 1px solid gray; float: left;">타이어사이즈</div>
				<div class="cardata_div7"
					style="border: 1px solid gray; float: left;">관리</div>

</div>
</div>

	<c:if test="${empty cars}">
		<table>
			<tr>
				<td colspan="5" style="text-align: center;">데이터가 존재하지않습니다.</td>
			</tr>
		</table>
	</c:if>




	<c:forEach var="c" items="${cars }" varStatus="status">
		<div class="cardatalist_div"
			style="border: 1px solid gray; float: left;">
			<div class="cardatalist_div1" style="float: left;">${status.count } </div>
			<div class="cardatalist_div2" style="float: left;">${c.c_brand } </div>
			<div class="cardatalist_div3" style="float: left;">${c.c_year1 } ~ ${c.c_year2 }</div>
			<div class="cardatalist_div4" style="float: left;">${c.c_name }</div>

			<div class="cardatalist_div5" style="float: left;">${c.c_option }  </div>
			<div class="cardatalist_div6" style="float: left;"> 앞 :${c.c_ft } 뒤 :${c.c_bt } </div>
			<div class="cardatalist_div7" style="float: left;"> <button class="updatecarbutton"
					onclick="updatecar('${c.c_id}','${c.c_name }',
					'${c.c_year1 }','${c.c_year2 } ',
					'${c.c_option }','${c.c_brand }',
					'${c.c_ft }','${c.c_bt }')">수정</button>
				<button type="button" class="updatecarbutton"
					id="updatecar('${c.c_id}')" onclick="deletecar('${c.c_id}')">삭제</button> </div>

				
			</div>
	</c:forEach>

	<div id="paging-box" class="car-paging-box">
		<c:if test="${curPage != 1 }">
			<a href="car.page.change?p=${curPage - 1 }">이전</a>
		</c:if>

		<c:forEach var="page" begin="1" end="${pageCount }">
			<c:choose>
				<c:when
					test="${page eq param.p or (curPage == 1 and curPage == page)}">
					<a style="color: black" href="car.page.change?p=${page }">${page }
					</a>
				</c:when>
				<c:otherwise>
					<a href="car.page.change?p=${page }">${page } </a>
				</c:otherwise>
			</c:choose>
		</c:forEach>
		<c:if test="${curPage != pageCount }">
			<a href="car.page.change?p=${curPage + 1 }">다음</a>
		</c:if>
	</div>

	
	
	
	<div id="carregpopup01" class="carregbuttonarea">
		<div class="close">X</div>

		<div>
			<form action="reg.car.do" method="post" name="regform"
				onsubmit="return carregcall();" enctype="multipart/form-data">
				<table border="1" class="">
				<tr>
					<td>임시 ID</td>
					<td><input name="c_id" id="c_id"></td>
					</tr>
					<tr>
					<td>메이커</td>
					<td>	<select name="c_brand" id ="c_brand" style="float: left;">
				<c:forEach var="cblist" items="${carbrand}">
				<option value="${cblist.cb_name}">${cblist.cb_name}</option>
				</c:forEach>
					</select></td>

					</tr>
					<tr>
						<td>차종</td>
						<td><input name="c_name" id="c_name"></td>
					</tr>
					<tr>
						<td>차종옵션</td>
						<td><input name="c_option" id="c_option"></td>
					</tr>
					<tr>
						<td>연식</td>
						<td><input name="c_year1" id="c_year1">~<input
							name="c_year2" id="c_year2"></td>
					</tr>
					<tr>

					<td>출력</td>
					<td><select name="c_print" id="c_print">
					<option value='출력'>출력</option>
					<option value='숨김'>숨김</option>
					</select></td>
					</tr>
					<tr>
					<td>타이어사이즈</td>
					<td>
					
					<div class = "ftbttmstyle">
					<div class = "ftstyle" style=" border: 1px solid gray;">앞타이어</div>
					<div class = "btstyle" style=" border: 1px solid gray;">뒤타이어</div>
					<div class = "tmstyle"  style="  border: 1px solid gray;">관리</div>
					</div>
					<div style="display: block;">
					</div>
					<div style="display: block;">
					<div class = "ftinputstyle" style="float: left; width: 20%;" ><input name="c_ft" id="c_ft"></div>
					<div class = "btinputstyle" style="float: left; width: 20%;"><input name="c_bt" id="c_bt"></div>
					<div class = "tminputstyle" style="float: left; width: 10%;"><button>삭제</button></div>
					</div>
					
					
					</td>
					</tr>
					<tr>
					<td>차종이미지</td>
					<td>
					
					<div>
					<div style="float: left;">현재 이미지</div>
					<div>이미지 등록</div>
					</div>
					<div style="float: left;">
					<div style="float: left;">없음</div>
					<div style="float: left;"><input type="file" name="file"></div>
					</div>
					
					
					
					</tr>
					
					<tr>
					<td colspan=2><div class="carregokbutton">
								<button class="carregokbutton1" id="regcar">등록</button>
							</div></td>
					</tr>
					
				</table>
			</form>
		</div>

		</div>  
<div id="updatecarpopup01">
    <div class="close">close</div>
    <div>
    
    <div>
			<form action="admin.car.update.do" method="post" name="updateform"
				onsubmit="return carupdatecall();" enctype="multipart/form-data">
				<table border="1" class="">
				
					<tr>
					<td>메이커</td>
					<td><select name="c_brand" id="c_brand_u">
					<c:forEach var="cblist" items="${carbrand}">
				<option value="${cblist.cb_name}">${cblist.cb_name}</option>
				</c:forEach>
					</select></td>
					</tr>
					<tr>
					<td>차종</td>
					<td><input name="c_name" id="c_name_u"><input type="hidden" name="c_id" id="c_id_u"></td>
					</tr>
					<tr>
					<td>차종옵션</td>
					<td><input name="c_option" id="c_option_u"></td>
					</tr>
					<tr>
					<td>연식</td>
					<td><input name="c_year1" id="c_year1_u">~<input name="c_year2" id="c_year2_u"></td>
					</tr>
					<tr>
					<td>출력</td>
					<td><select name="c_print" id="c_print_u">
					<option value='출력'>출력</option>
					<option value='숨김'>숨김</option>
					</select></td>
					</tr>
					<tr>
					<td>타이어사이즈</td>
					<td>
					
					<div class = ftbttmstyle>
					<div class = "ftstyle" style="float: left; border: 1px solid gray;">앞타이어</div>
					<div class = "btstyle" style="float: left; border: 1px solid gray;">뒤타이어</div>
					<div class = "tmstyle" style="border: 1px solid gray;">관리</div>
					</div>
					
					<div style ="display:flex;">
					<div class = "ftinputstyle" style="float: left; width: 20%;"><input name="c_ft" id="c_ft_u"></div>
					<div class = "btinputstyle" style="float: left; width: 20%;"><input name="c_bt" id="c_bt_u"></div>
					<div class = "tminputstyle" style="float: left; width: 10%;" ><button>삭제</button></div>
					</div>
					
					</td>
					</tr>
						<tr>
						<td colspan=2><div class="updatecarokbutton">
								<button class="updatecarokbutton1" id="updatecar" value=>수정</button>
							</div></td>
					</tr>
					
				</table>
			</form>
		</div>
    
    
    </div>
</div>
    
    	
    
    
	
	

</body>
</html>