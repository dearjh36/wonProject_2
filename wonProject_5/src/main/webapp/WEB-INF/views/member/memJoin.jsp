<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="/resources/css/member/join.css">
</head>
<body>
	<div class="wrapper">
		<form method="post" id="joinFrm" role="form" name="joinFrm">
			<div class="wrap">
				<div class="subjecet">
					<span>회원가입</span>
				</div>
				<div class="id_wrap">
					<div class="id_name">아이디</div>
					<div class="id_input_box">
						<input class="id_input" name="id" id="id">
					</div>
				</div>
				<div class="pw_wrap">
					<div class="pw_name">비밀번호</div>
					<div class="pw_input_box">
						<input class="pw_input" name="m_pw" id="n_name">
					</div>
				</div>
				<div class="pwck_wrap">
					<div class="pwck_name">비밀번호 확인</div>
					<div class="pwck_input_box">
						<input class="pwck_input">
					</div>
				</div>
				<div class="user_wrap">
					<div class="user_name">이름</div>
					<div class="user_input_box">
						<input class="user_input" name="m_name" id="m_name">
					</div>
				</div>
				전화번호 : <input type="text" id="m_phone" name="m_phone">
				생일 : <input type="text" id="m_birth" name="m_birth">
				<div class="mail_wrap">
					<div class="mail_name" >이메일</div>
					<div class="mail_input_box">
						<input class="mail_input" name="m_email" id="m_email">
					</div>
				</div>
				<!-- 
				<input class="hidden" name="m_sub" id="m_sub">
				<input class="hidden" name="m_state" id="m_state"> -->
				
				<div class="join_button_wrap">
					<input type="submit" class="join_button" value="가입하기">
					<input type="reset" value="취소하기" >
				</div>

			</div>
		</form>
	</div>
<!-- 
<script>
	$(document).ready(function()){
		$(".join_button").click(function(){
			$("#joinFrm").attr("action","/member/join");
			$("#joinFrm").submit();
		})
	}
</script> -->

</body>
</html>