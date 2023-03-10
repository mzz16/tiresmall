<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet"
	href="resources/css/admin/tire/admin_tire_reg.css">
</head>
<body>
	<input id="whatMenu" value="tire" type="hidden">
	<input id="sm" value="1" type="hidden">
	<div class="container sub">
		<div id="tire_container">


			<h1>타이어 상품 등록</h1>
			<div id="admin_tire_table_container">
				<table border="1" id="admin_tire_table">
					<tr>
						<td class="admin_tire_table_title">브랜드</td>
						<td>DB에서 브랜드 가져와서 그 브랜드 선택하게??</td>
					</tr>
					<tr>
						<td>모델명</td>
						<td><input type="text" name="" id="" /></td>
					</tr>
					<tr>
						<td>설명</td>
						<td>
							<div>
								<input type="text" name="" id="" /> 타이어 특성 고르기
							</div>
						</td>
					</tr>
					<tr>
						<td>출력</td>
						<td>출력<input type="radio" name="" id="" /> 미출력<input
							type="radio" name="" id="" />
						</td>
					</tr>
					<tr>
						<td>추천</td>
						<td>추력<input type="radio" name="" id="" /> 일반<input
							type="radio" name="" id="" />
						</td>
					</tr>
					<tr>
						<td>타이어사이즈</td>
						<td>
							<button>
								추가 누를때마다
								<div>추가</div>
							</button>
							<div></div>
						</td>
					</tr>
					<tr>
						<td>리스트 이미지</td>
						<td>
							<div>
								<div>현재이미지</div>
								<div>이미지 등록</div>
							</div>
						</td>
					</tr>
					<tr>
						<td>상세이미지</td>
						<td>
							<div>
								<div>현재이미지</div>
								<div>이미지 등록</div>
							</div>
						</td>
					</tr>
				</table>
			</div>
		</div>
	</div>
</body>
</html>