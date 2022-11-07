<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>목표 목록</title>
<style>
	.div1 {float : left;}
	.div2 {float : right;}
	.div3 {display: block; clear:both;}
	#dall {background-color:#40FF00;}
</style>
</head>
<body>
<h2>(el태그 사용)2개의 목표 진행 중</h2>
<form>
<input type="submit" value="추가하기">
</form>
<!-- form으로 할까 <button>태그로 할까 -->
<div id="dall">
	<div>
		<div class="div1">2023/01/20</div>
		<div class="div2">목표 기간까지 112일 남았습니다</div>
	</div>
	<div class="div3">친구와 제주도 여행</div>
	<div>
		<div class="div1">60%<br><progress value="60"  max="100"></progress></div>
		<div class="div2">목표 금액 2,000,000<br>현재 금액 205,000</div>	
	</div>
</div>
</body>
</html>