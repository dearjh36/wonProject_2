<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>목표 추가하기</title>
</head>
<body>
<form>
목표명<input type="text">
<br>
목표 금액<input type="text">
<br>
목표 기간<input type="text" placeholder="2022-10-12">
<br>
목표 기간222  <input type='date' id='currentDate' />
<br>
<input type="submit" value="등록하기"><input type="reset" value="취소하기">
<script>
document.getElementById('currentDate').value = new Date().toISOString().substring(0, 10);
</script>
</form>
</body>
</html>