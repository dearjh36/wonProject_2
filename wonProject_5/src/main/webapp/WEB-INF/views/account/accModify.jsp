<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %> 
<!DOCTYPE html>
<html>
<head>
    <title>Account</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
</head>
<body>
<form method="post" id="accModifyFrm">
	<c:choose>
		<c:when test="${accView.ac_classify  eq 'income'}">
			<input type="radio" name="ac_classify" id="ac_classify" value="income" checked>수입
			<input type="radio" name="ac_classify" id="ac_classify" value="outcome">지출
		</c:when>
		<c:when test="${accView.ac_classify  eq 'outcome'}">
			<input type="radio" name="ac_classify" id="ac_classify" value="income">수입
			<input type="radio" name="ac_classify" id="ac_classify" value="outcome" checked>지출
		</c:when>
	</c:choose>

	날짜 : <input type="date" id="ac_date" name="ac_date" required="required"><br><br>
	금액 : <input type="text" id="ac_price" name="ac_price" value="${accView.ac_price }"><br><br>
	내용 : <input type="text" id="ac_content" name="ac_content" value="${accView.ac_content }"><br><br><br>
	<input type="hidden" id="ac_goalNum" name="ac_goalNum" value="1"><br><br><br>
<input type="submit" value = "수정하기">
<button onclick="location.href='/account/accDelete?ac_num=${accView.ac_num}'">삭제하기</button>
</form>
</body>
</html>