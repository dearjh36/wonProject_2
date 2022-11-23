<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %> 

<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>내 정보</title>
  </head>
  <body>
  
    이름 <input type="text" value="${member.m_name}" readonly> <br>
    ID <input type="text" value="${member.id}" readonly/> <br />
    생년월일 <input type="text" value="${member.m_birth}" readonly/> <br>
    전화번호 <input type="text" value="${member.m_phone }" readonly/> <br />
    이메일 <input type="text" value="${member.m_email }" readonly> <br /><br />
   
	<c:choose>
    	<c:when test="${member.m_sub eq 'ing'}">
			구독 날짜 ${sub.s_startDate} ~ ${sub.s_lastDate}<br><br>
			다음 결재일 ${payDay }<br><br>
			결재 수단 
			<c:choose>
			<c:when test="${sub.s_pay eq 'card'}"> 카드 결제</c:when>
			<c:when test="${sub.s_pay eq 'bank'}"> 무통장 입금 </c:when>
			<c:when test="${sub.s_pay eq 'phone'}"> 휴대폰 결제 </c:when>
			</c:choose>
			<br><br>
			<button onclick="location.href='/sub/subStop'">해지하기</button>
		</c:when>
		<c:otherwise>
			3개 이상의 목표를 작성하고 싶을때는 구독하세요!! -> <button onclick="location.href='/sub/subAdd'">구독하기</button>
		</c:otherwise>
    </c:choose>
  </body>
</html>
