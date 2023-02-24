<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="resources/css/main/search/main_search.css" />
<script src="https://code.jquery.com/jquery-3.6.3.js" integrity="sha256-nQLuAZGRRcILA+6dMBOvcRh5Pe310sBpanc6+QBmyVM=" crossorigin="anonymous"></script>
<script type="text/javascript">
$(function() {	
	$("#searchCarType").click(function() {
		$("#carTypeDialog")[0].showModal();
	});
});
</script>

</head>
<body>
	<div class="searchContainer">
		<label id="searchCarType">
			<div class="searchIng">단면폭</div><input class="ingBox" readonly></input>
			<div class="searchIng">단면폭</div><input class="ingBox" readonly></input>
			<div class="searchIng">단면폭</div><input class="ingBox" readonly></input>
		</label>
		<dialog id="carTypeDialog">dd</dialog>
		<button class="searchIng">검색</button>
	</div>
</body>
</html>