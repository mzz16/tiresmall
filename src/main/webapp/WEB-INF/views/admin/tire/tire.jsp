<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="resources/css/admin/tire/admin_tire.css">

</head>
<body>
	<div class="container sub">
		<div id="tire_container">
			<form action="admin.searchTire.do?m=auth" class="tire_form">
				<div id="tire_searchBox">
					<div class="tire_searchTitle">
						<div>
							브랜드 <select id="tire_brand" name="t_brand">
								<option value="1">미쉐린타이어</option>
								<option value="2">금호타이어</option>
								<option value="3">콘티넨탈타이어</option>
								<option value="4">한국타이어</option>
								<option value="5">넥센타이어</option>
								<option value="6">요코하마타이어</option>
								<option value="7">브리지스톤타이어</option>
								<option value="8">굳이어타이어</option>
								<option value="9">던롭타이어</option>
								<option value="10">피렐리타이어</option>
								<option value="11">BF굿리치타이어</option>
							</select>
						</div>
					</div>
					<div class="tire_searchTitle">
						<div class="tire_searchID">
							<label for="tire_searchid">모델명</label> <input id="tire_Name"
								name="t_name">
						</div>
					</div>
					<div id="searchBtn">
						<button>검색</button>
					</div>
				</div>
			</form>
		</div>
	</div>
</body>
</html>