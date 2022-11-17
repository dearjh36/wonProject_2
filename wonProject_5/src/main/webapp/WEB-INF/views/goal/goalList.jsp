<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>목표 목록</title>
</head>
<body>

<h2>${cnt}개의 목표 진행 중</h2>

<button onclick="location.href='/goal/goalAdd'">추가하기</button>
<br><br>
<!-- 
		<div class="div1">2023/01/20</div>
		<div class="div2">목표 기간까지 112일 남았습니다</div>
	<div class="div3">친구와 제주도 여행</div>
		<div class="div1">60%<br><progress value="60"  max="100"></progress></div>
		<div class="div2">목표 금액 2,000,000<br>현재 금액 205,000</div>	 -->
		
		<c:forEach items="${goalList}" var = "goalList">
			${goalList.g_goalDate} <br>
			목표 날짜까지 n일 남았습니다 <br>
			<a href="/goal/goalView?g_num=${goalList.g_num}">${goalList.g_name}</a> <br>
			진행 퍼센트 <br>
			${goalList.g_goalAmount}<br>
			${goalList.g_currentAmount}<br><br><br><br>
		</c:forEach>
</body>
</html>