<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %> 
<%@ page import="java.util.Date" %>
<%@ page import="java.text.SimpleDateFormat" %>
<%
	Date nowTime = new Date();
	SimpleDateFormat sf = new SimpleDateFormat("yyyy년 MM월 dd일");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상세보기</title>

</head>
<body>
	<h2>${goalView.g_name}</h2>
	<div class="div1">
		<%= sf.format(nowTime) %> 기준<br> 목표 달성까지 112일<br> 목표 금액 ${goalView.g_goalAmount}원<br>
		현재 달성 금액 ${goalView.g_currentAmount}<br> 목표 달성률 10%<br>
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
				<td>금액불러오기</td>
				<td>금액불러오기</td>
				<td>금액불러오기</td>
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
		<c:forEach items="${goalAmountList}" var="goalAmountList">
		<tr>
			<td>${goalAmountList.ac_date}</td>
			<td>${goalAmountList.ac_price}</td>
			<td><a href="/account/accModify?ac_num=${goalAmountList.ac_num}">${goalAmountList.ac_content}</a></td>
		</tr>
		</c:forEach>
	</table>
	</div>
	<div class="div3">
		<button onclick="location.href='/goal/goalModify?g_num=${goalAmountList.ac_goalNum}'">수정하기</button>
	</div>
</body>
</html>