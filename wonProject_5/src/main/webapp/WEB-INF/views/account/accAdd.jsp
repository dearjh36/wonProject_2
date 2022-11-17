<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Account</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
</head>
<body>
<form method="post" id="accAddFrm" action="/account/accAdd">
<input type="radio" name="ac_classify" id="ac_classify" value="income">수입
<input type="radio" name="ac_classify" id="ac_classify" value="outcome">지출

날짜 : <input type="date" id="ac_date" name="ac_date"><br><br>
금액 : <input type="text" id="ac_price" name="ac_price"><br><br>
내용 : <input type="text" id="ac_content" name="ac_content"><br><br><br>
<input type="hidden" id="ac_goalNum" name="ac_goalNum" value="1"><br><br><br>

<input type="submit" value = "저장하기">
<button onclick="location.href='/account/accDelete'">삭제하기</button>
</form>
</body>
</html>