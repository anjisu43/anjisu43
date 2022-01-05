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
		//1. 쿠키 객체 생성
		//Cookie(name(String), value(String))
		Cookie cookie = new Cookie("testcookie", "firstcookie");
	
		//2. 유효기간 설정(초단위)
		cookie.setMaxAge(60*60*24*365); //유효기간 1년
		
		//3. (server->client)클라이언트에게 쿠키 전송(응답-response)
		response.addCookie(cookie);
		
		//4. 쿠키 생성한 후 바로 클라이언트에 전송
		response.addCookie(new Cookie("id", "test"));
		
	%>
	
	<a href = "Ex02GetCookie.jsp">쿠키확인</a>
	<a href = "Ex07InvalidateSession.jsp">세션 모두 삭제</a>

</body>
</html>