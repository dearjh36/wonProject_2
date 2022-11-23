<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>구독하기</title>
</head>
<body>
	<h3>구독하기</h3>
	<br>
	<form method="post" id="subAdd">
		구독 시작 날짜 <input type="date" name="s_startDate"><br><br>
		결제 수단 
		 <input type="radio" name="s_pay" value="card"> 카드 결제
		 <input type="radio" name="s_pay" value="bank"> 무통장 입금
		 <input type="radio" name="s_pay" value="phone"> 휴대폰 결제
		 
		 <br><br>
		 
		 <input type="submit" value = "구독하기">
		 <input type="reset" value = "취소하기">
	</form>
</body>
</html>