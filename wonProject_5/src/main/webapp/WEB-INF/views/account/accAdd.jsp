<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>   
<!DOCTYPE html>
<html>
<head>
    <title>Account</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
</head>
<body>
<form method="post" id="accAddFrm" action="/account/accAdd">
<input type="radio" name="ac_classify" value="income">수입
<input type="radio" name="ac_classify"  value="outcome">지출
<c:if test="${cnt ne 0}">
<input type="radio" name="ac_classify" value="saving">목표 저금
	<select id = "ac_goalNum" name="ac_goalNum" disabled="true">
		<c:forEach items="${goalList}" var = "goalList">
		
			<option value="goalList.g_num">${goalList.g_name}</option>
			<input type="hidden" id="ac_goalNum" name="ac_goalNum" value="${goalList.g_num}"><br><br><br>
		</c:forEach>
	</select>
</c:if>

날짜 : <input type="date" id="ac_date" name="ac_date"><br><br>
금액 : <input type="text" id="ac_price" name="ac_price"><br><br>
내용 : <input type="text" id="ac_content" name="ac_content"><br><br><br>


	<input type="hidden" id="ac_goalNum" name="ac_goalNum" value="1"><br><br><br>


<input type="submit" value = "저장하기">
<button onclick="location.href='/account/accDelete'">삭제하기</button>
</form>
</body>

<script>
	$("input:radio[class=saving]").click(function(){
	
		if($("input:radio[class=saving : checked").val() == 'saving'){
			$("#ac_goalNum").attr("disabled",false);
			$("#ac_goalNum").removeClass("readonly");			
		}
	});
	
</script>

</html>