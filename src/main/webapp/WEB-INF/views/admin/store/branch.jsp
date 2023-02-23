<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>

<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<script src="https://code.jquery.com/jquery-3.6.3.min.js" integrity="sha256-pvPw+upLPUjgMXY0G+8O0xUf+/Im1MZjXxxgOcBQBXU=" crossorigin="anonymous"></script>
<link rel="stylesheet" href="resources/css/admin/store/branch-findselect.css">
<script src="resources/js/admin/store/admin_store.js"></script>
<script type="text/javascript">



</script>
</head>
<body>


<div class = "branch-findselect">


<div class ="branch-text1">
주소 선택
</div>

<select name="b_area1" id="sido1"></select>
<select name="b_area2" id="gugun1"></select> 

 
<form action = "branch.search.name">
<div class ="branch-text2">
 
장착점명 

</div>
<input name = "b_name" style="text-align:center;  height:38px;">
</form>

<div class = "branchsearchButton1">

<button class = "branchsearchButton">검색</button> 

</div>

<div class = "branchRegButton1">

<button class = "branchRegButton" onclick="regbranchopen()">신규등록</button>
</div>


</div>







<div class = "branchdata_div_outter" >
 <div class = "branchdata_div" style="float: left; margin-top : 5px;">

<div class = "branchdata_div1" style="border: 1px solid gray; float: left;">
No.
</div>
<div class = "branchdata_div2" style="border: 1px solid gray; float: left; ">
장착점명
</div>
<div class = "branchdata_div3" style="border: 1px solid gray; float: left;">
연락처
</div>
<div class = "branchdata_div4" style="border: 1px solid gray; float: left; ">
지역
</div>
<div class = "branchdata_div5" style="border: 1px solid gray; float: left;">
관리
</div>
</div>
</div>

<c:forEach var = "b" items = "${branchs }">
<div  class = "branchdatalist_div"  style="border: 1px solid gray; float:left;">
<div class = "branchdatalist_div1" style=" float:left;">${b.b_no }</div>
<div  class = "branchdatalist_div2" style=" float:left;">[${b.b_sortation}] ${b.b_branchname }</div>
<div class = "branchdatalist_div3" style=" float:left;">${b.b_branchnumber } </div>
<div class = "branchdatalist_div4" style=" float:left;">${b.b_area }</div>
<div class = "branchdatalist_div5" style=" float:left;"><button>수정</button><button>삭제</button></div>



</div>
</c:forEach>



</body>
</html>