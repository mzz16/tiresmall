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
<link rel="stylesheet"
	href="resources/css/admin/store/branch-findselect.css">
<script src="resources/js/admin/store/admin_store.js"></script>
<script type="text/javascript">
	function deletebranch(iddd) {
		let ok = confirm('정말 삭제하시겠습니까?');
		if (ok) {
			location.href = 'admin.store.delete.go?b_id=' + iddd;
		}
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

			<button class="branchRegButton" onclick="regbranchopen()">신규등록</button>
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
				<button class = "updatebranchbutton"
					onclick="window.open('admin.store.update.go?b_id=${b.b_id}', 'window_name', 'width=430, height=500');">수정</button>
				<button class = "updatebranchbutton" onclick="deletebranch('${b.b_id}')">삭제</button>
			</div>

		</div>
	</c:forEach>



</body>
</html>