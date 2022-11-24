<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 목록</title>
</head>
<body>
	<h2>총 회원 수 ${memberCount}</h2>
	<h2>구독자 수 ${subCount}</h2>

	<form action="/admin/memberSearch" method="get">
		<select name="searchType">
			<option value="id" >ID</option>
			<option value="name">이름</option>
		</select>
		<input type="text" name="keyword"> <input type="submit" value="검색하기">
	</form>
	<c:forEach items="${memberList}" var = "memberList">
		<table>
			<tr>
				<td><a href="/admin/memberView?id=${memberList.id}">${memberList.id}</a></td>
				<td>${memberList.m_name}</td>
				<td>${memberList.m_birth}</td>
				<td>${memberList.m_phone}</td>
				<td>${memberList.m_email}</td>
				<td>${memberList.m_sub}</td>
			</tr>
		</table>
	</c:forEach>
	
</body>
</html>