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
		<c:forEach items="${goalList}" var = "goalList">
			${goalList.g_goalDate} <br>
			목표 날짜까지 ${goalWaitDay}일 남았습니다 <br>
			<a href="/goal/goalView?g_num=${goalList.g_num}">${goalList.g_name}</a> <br>
			진행 퍼센트 ${goalPrecent} %<br>
			${goalList.g_goalAmount}<br>
			${goalList.g_currentAmount}<br><br><br><br>
		</c:forEach>
</body>
</html>