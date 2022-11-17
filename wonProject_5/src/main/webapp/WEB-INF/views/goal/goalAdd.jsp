<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>목표 추가하기</title>
</head>

<body>

	<form method="post">
		목표명<input type="text" id="g_name" name="g_name">
		<br>
		목표 금액<input type="text" id="g_goalAmount" name="g_goalAmount">
		<br>
		시작 날짜<input type="date" id="g_regisDate" name="g_regisDate">
		<br>
		목표 날짜  <input type='date' id="g_goalDate" name="g_goalDate">
		<br>
		
		<input type="submit" value="등록하기">
		<input type="reset" value="취소하기">
		
	</form>
	
</body>

<script>
	document.getElementById('g_goalDate').value = new Date().toISOString().substring(0, 10);
	document.getElementById('g_regisDate').value = new Date().toISOString().substring(0, 10);
</script>
		
</html>