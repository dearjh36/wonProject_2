<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>목표 수정하기</title>
</head>

<body>

	<form method="post">
		목표명<input type="text" id="g_name" name="g_name" value="${goalView.g_name}">
		<br>
		목표 금액<input type="text" id="g_goalAmount" name="g_goalAmount" value="${goalView.g_name}">
		<br>
		시작 날짜<input type="date" id="g_regisDate" name="g_regisDate" required="required">
		<br>
		목표 날짜  <input type='date' id="g_goalDate" name="g_goalDate" required="required">
		<br>
		
		<input type="submit" value="수정하기">
		<button onclick="location.href='/goal/goalDelete?g_num=${goalView.g_num}'">삭제하기</button>
		
	</form>
	
</body>

<script>
	document.getElementById('g_goalDate').value = new Date().toISOString().substring(0, 10);
	document.getElementById('g_regisDate').value = new Date().toISOString().substring(0, 10);
</script>
		
</html>