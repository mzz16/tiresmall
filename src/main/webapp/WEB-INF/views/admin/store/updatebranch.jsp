<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
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
	$(function() {

		$('#updateb_id').click(function() {
			setTimeout('window.close()', 20);
			setTimeout('window.opener.location.reload()', 30);

		});

	});
	
	
	
</script>

</head>
<body>

	<form action="admin.store.update.do">
		<table border="1">
			<tr>
				<td>구분</td>
				<td><input type='radio' name='b_sortation'
					value="${branch1.b_sortation }" />직영점(당일장착점) <input type='radio'
					name='b_sortation' value="${branch1.b_sortation }" /> 제휴장착점</td>
			</tr>
			
			<tr>
				<td>사진</td>
				<td><img class="b_img_css" src="resources/web/${branch1.b_file }"></td>
			</tr>
			


			<tr>
				<td>지역</td>
				<td><select name="b_area1" id="sido1"></select> <select name="b_area2" id="gugun1"></select></td>
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

	</form>

</body>
</html>