<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>

<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<script src="https://code.jquery.com/jquery-3.6.3.min.js"
	integrity="sha256-pvPw+upLPUjgMXY0G+8O0xUf+/Im1MZjXxxgOcBQBXU="
	crossorigin="anonymous"></script>
<script type="text/javascript" src="jquery/jquery-ui.js"></script>
<link rel="stylesheet" type="text/css" href="jquery/jquery-ui.css" />
<link rel="stylesheet"
	href="resources/css/admin/store/branch-findselect.css">
<script src="resources/js/admin/store/admin_store.js"></script>
<script type="text/javascript">
	function deletebranch(iddd) {
		let ok = confirm('정말 삭제하시겠습니까?');
		if (ok) {
			location.href = 'admin.store.delete.go?b_id=' + iddd;
		}

	}
	
	
	

	$(document).ready(
			function($) {
				$(".branchRegButton").on("click", function(event) { //팝업오픈 버튼 누르면
					$("#regpopup01").show(); //팝업 오픈
					$("body").append('<div class="backon"></div>'); //뒷배경 생성
				});

				$("body").on(
						"click",
						function(event) {
							if (event.target.className == 'close'
									|| event.target.className == 'backon') {
								$("#regpopup01").hide(); //close버튼 이거나 뒷배경 클릭시 팝업 삭제
								$(".backon").hide();
							}
						});

			});

	//<button class="updatebranchbutton" onclick="window.open('admin.store.update.go?b_id=${b.b_id}', 'window_name', 'width=430, height=500');">
</script>
</head>
<body>


	<div class="branch-findselect">


		<div class="branch-text1">주소 선택</div>

		<select name="b_area1" id="sido1"></select> <select name="b_area2"
			id="gugun1"></select>


		<div class="branch-text2" style="float: left;">장착점명</div>
		<form action="branch.search.branchname">


			<input name="b_branchname" style="text-align: center; height: 38px;">
			<button class="branchsearchButton" style="float: right;">검색</button>

		</form>

		<div class="branchRegButton1">

			<button class="branchRegButton">신규등록</button>
		</div>


	</div>







	<div class="branchdata_div_outter">
		<div class="branchdata_div" style="float: left; margin-top: 5px;">

			<div class="branchdata_div1"
				style="border: 1px solid gray; float: left;">No.</div>
			<div class="branchdata_div2"
				style="border: 1px solid gray; float: left;">장착점명</div>
			<div class="branchdata_div3"
				style="border: 1px solid gray; float: left;">연락처</div>
			<div class="branchdata_div4"
				style="border: 1px solid gray; float: left;">지역</div>
			<div class="branchdata_div5"
				style="border: 1px solid gray; float: left;">관리</div>
		</div>
	</div>

	<c:forEach var="b" items="${branchs }" varStatus="status">
		<div class="branchdatalist_div"
			style="border: 1px solid gray; float: left;">
			<div class="branchdatalist_div1" style="float: left;">${status.count }</div>
			<div class="branchdatalist_div2" style="float: left;">[${b.b_sortation}]
				${b.b_branchname }</div>
			<div class="branchdatalist_div3" style="float: left;">${b.b_branchnumber }
			</div>
			<div class="branchdatalist_div4" style="float: left;">${b.b_area }</div>
			<div class="branchdatalist_div5" style="float: left;">
				<button class="updatebranchbutton"
					onclick="window.open('admin.store.update.go?b_id=${b.b_id}', 'window_name', 'width=430, height=500');">수정</button>
				<button class="updatebranchbutton"
					onclick="deletebranch('${b.b_id}')">삭제</button>
			</div>

		</div>
	</c:forEach>


	<div id="regpopup01">
		<div class="close">close</div>
		<div>
			<form action="reg.branch.do">
				<table border="1" class="">
					<tr>
						<td>구분</td>
						<td><input type='radio' name='b_sortation' value='직영점(당일장착점)' />직영점(당일장착점)
							<input type='radio' name='b_sortation' value='제휴장착점' /> 제휴장착점</td>
					</tr>
					<tr>
						<td>임시 id</td>
						<td><input name="b_id"></td>
					</tr>


					<tr>
						<td>지역</td>
						<td><div style='float: left'>
								<select name="b_area1" id="sido1" style="width: 120px"></select>
								<select name="b_area2" id="gugun1" style="width: 120px"></select>
							</div></td>
					</tr>


					<tr>
						<td>장착점명</td>
						<td><input name="b_name" id="inputname"></td>
					</tr>

					<tr>
						<td>상세주소</td>
						<td><input name="b_addr" id="inputaddr"></td>
					</tr>

					<tr>
						<td>영업시간</td>
						<td><input name="b_time" id= "inputregtime"></td>
					</tr>

					<tr>
						<td>취급서비스</td>
						<td><input name="b_service"></td>
					</tr>

					<tr>
						<td>지도데이터</td>
						<td><input name="b_mapdata" id="inputmapdata"></td>
					</tr>

					<tr>
						<td>연락처명</td>
						<td>담당자명	<input name="b_manager"> 전화번호 <input
							name="b_managernumber"></td>
					</tr>

					<tr>
						<td>사업자정보</td>
						<td>업체명	 <input name="b_branchname"> 사업자번호	 <input
							name="b_branchnumber"><br>대표자명		<input name="b_cr">
							사업자이메일	<input name="b_email"></td>
					</tr>


				</table>
				<button id="regbranch">등록</button>
			</form>
		</div>
	</div>






	<%-- <div class="openPopup">클릭하면 팝업이 나와요</div>   
<div id="popup01">
   <div class="close">close</div>
   <div>팝업 내용</div>
 </div>  --%>





	<form action="admin.store.update.do">
		<table border="1">
			<tr>
				<td>구분</td>
				<td><input type='radio' name='b_sortation'
					value="${branch1.b_sortation }" />직영점(당일장착점) <input type='radio'
					name='b_sortation' value="${branch1.b_sortation }" /> 제휴장착점</td>
			</tr>


			<tr>
				<td>지역</td>
				<td><select name="b_area1" id="sido1"></select> <select
					name="b_area2" id="gugun1"></select></td>
			</tr>


			<tr>
				<td>장착점명</td>
				<td><input name="b_name" value="${branch1.b_name }"></td>
			</tr>

			<tr>
				<td>상세주소</td>
				<td><input name="b_addr" value="${branch1.b_addr }"></td>
			</tr>

			<tr>
				<td>영업시간</td>
				<td><input name="b_time" value="${branch1.b_time }"></td>
			</tr>

			<tr>
				<td>취급서비스</td>
				<td><input name="b_service" value="${branch1.b_service }"></td>
			</tr>

			<tr>
				<td>지도데이터</td>
				<td><input name="b_mapdata" value="${branch1.b_mapdata }"></td>
			</tr>

			<tr>
				<td>연락처</td>
				<td>담당자명 <input name="b_manager" value="${branch1.b_manager }">
					전화번호 <input name="b_managernumber"
					value="${branch1.b_managernumber }"></td>
			</tr>

			<tr>
				<td>사업자정보</td>
				<td>업체명<input name="b_branchname"
					value="${branch1.b_branchname }">사업자번호<input
					name="b_branchnumber" value="${branch1.b_branchnumber }"><br>대표자명<input
					name="b_cr" value="${branch1.b_cr }">사업자이메일<input
					name="b_email" value="${branch1.b_email }"></td>
			</tr>


		</table>
		<button name="b_id" id="updateb_id" value="${branch1.b_id }">수정</button>
		
		


























</body>

</html>