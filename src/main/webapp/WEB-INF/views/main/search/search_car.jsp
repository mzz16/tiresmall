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
	var sectionWide = ['145','155','165','175','185','195','205','215','225','235','245','255','265','275','285','295','305','315','325','335','345','355','500']
	
	$("#item_list li").each(sectionWide, function(i, obj) {
		console.log(obj);
	})
});
</script>

</head>
<body>
	<div class="searchContainer">
		<div class="searchBar">
			<div class="searchIng">단면폭</div><input class="ingBox" readonly></input>
			<div class="searchIng">편평비</div><input class="ingBox" readonly></input>
			<div class="searchIng">인치</div><input class="ingBox" readonly></input>
			<button class="searchIng">검색</button>
		</div>
	</div>
	<div class="searchSelectConditionContainer">
		<h2>단면폭</h2>
		<ul id="item_list">
		</ul>
	</div>
		
</body>
</html>