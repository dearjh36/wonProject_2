<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE HTML>
<html>
<head>
<title>Login</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
</head>
<body>
	<br>
	<form method="post" id="loginFrm">
		id :<input type="text" id="id" name="id" required="required"><br> 
		pwd :<input type="password" id="m_pw" name="m_pw" required="required"><br>
		<input type="submit" value="로그인">
		<br>
		<c:if test="${msg == false}">
			<p style="color:#f00;">로그인에 실패했습니다.</p>
		</c:if>
	</form>
</body>
</html>