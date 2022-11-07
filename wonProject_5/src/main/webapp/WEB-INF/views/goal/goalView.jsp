<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상세보기</title>
<style>
.div1 {
	float: left;
}

.div2 {
	float: right;
}

.div4 {
	float: right;
}

.div3 {
	display: block;
	clear: both;
}

#dall {
	background-color: #40FF00;
}
</style>
</head>
<body>
	<h2>친구와 제주도 여행</h2>
	<div class="div1">
		2022년 9월 30일 기준<br> 목표 달성까지 112일<br> 목표 금액 2,000,000원<br>
		현재 달성 금액 205,000원<br> 목표 달성률 10%<br>
	</div>
	<div class="div2">
		목표달성 금액<br>
		<table border="1">
			<tr>
				<td>하루(1일)</td>
				<td>일주일(7일)</td>
				<td>한달(30일)</td>
			</tr>
			<tr>
				<td>-</td>
				<td>-</td>
				<td>-</td>
			</tr>
		</table>
	</div>
	<br>
	<div class="div3">
	<table border="1">
		<tr>
			<td>No.</td>
			<td>날짜</td>
			<td>금액</td>
			<td>내용</td>
		</tr>
		<!-- foreach -->
		<tr>
			<td>1</td>
			<td>2022/09/01</td>
			<td>20000</td>
			<td>-</td>
		</tr>
		<tr>
			<td>2</td>
			<td>2022/09/03</td>
			<td>30000</td>
			<td>-</td>
		</tr>
	</table>
	</div>
	<div class="div3">
		<button>수정하기</button>
	</div>
</body>
</html>