<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
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
	<button id="searchCarType">차종으로 검색</button>
	<dialog id="carTypeDialog">
		검색창?
	</dialog>
</body>
</html>