<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

	<%
		//session 내장객체 사용
		//1. 세션 값 설정 setAttribute(name(String), value(Object))
		session.setAttribute("id", "test");
		session.setAttribute("pw", "12345");
		session.setAttribute("age", 25);
		
	%>
	
	<a href = "ex05GetSession.jsp">세션 확인</a>

</body>
</html>