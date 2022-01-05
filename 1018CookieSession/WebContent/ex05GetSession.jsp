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
		String id = (String)session.getAttribute("id");
		String pw = (String)session.getAttribute("pw");
		Integer age = (Integer)session.getAttribute("age");
	%>
	
	아이디 : <%=id %><br>
	비밀번호 : <%=pw %><br>
	나이 : <%=age %><br>
	
	<a href = "Ex06RemoveSession.jsp">세션 삭제</a>
	<a href = "Ex07InvalidateSession.jsp">세션 모두 삭제</a>

</body>
</html>