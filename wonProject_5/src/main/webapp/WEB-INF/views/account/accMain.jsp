<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>   
<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">
<head>
    <title>Main</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
</head>
<body>
<p>개의 목표 진행중</p>
<button onclick="location.href='/goal/goalList'">목표 목록</button><br>
<button> 목표 이름 </button>
<button> 목표 이름2 </button><br><br>
<form>
    연도
    <select name="year" >
        <option value="none">== 선택 ==</option>
        <option value="zero">2020</option>
        <option value="one">2021</option>
        <option value="two">2022</option>
        <option value="three">2023</option>
    </select> 
    월 
    	<select name="month">
			<option value="none">== 선택 ==</option>
			<option value="one">1</option>
			<option value="two">2</option>
			<option value="three">3</option>
			<option value="four">4</option>
			<option value="five">5</option>
			<option value="six">6</option>
			<option value="seven">7</option>
			<option value="eight">8</option>
			<option value="nine">9</option>
			<option value="ten">10</option>
			<option value="eleven">11</option>
			<option value="twelve">12</option>
		</select>
	</form>
<a href="/account/accAdd">가계부 내역 추가</a>
<pre>날짜          수입          지출          합계</pre>
<c:forEach items="${accList}" var = "accList">
	<fmt:formatDate pattern="dd" value="${accList.ac_date}"/>
	${accList.ac_content}
	<c:choose>
		<c:when test="${accList.ac_classify eq 'income'}"><a href="/account/accModify?ac_num=${accList.ac_num}">수입</a></c:when>
		<c:when test="${accList.ac_classify eq 'outcome'}"><a href="/account/accModify?ac_num=${accList.ac_num}">지출</a></c:when>
		<c:otherwise>저금</c:otherwise>
	</c:choose>
	${accList.ac_price}
	<br>
</c:forEach>
<hr>

<script>
<!--https://goodsgoods.tistory.com/249-->
</script>

</body>
</html>