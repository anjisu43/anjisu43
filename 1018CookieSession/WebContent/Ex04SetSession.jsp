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
		//session ���尴ü ���
		//1. ���� �� ���� setAttribute(name(String), value(Object))
		session.setAttribute("id", "test");
		session.setAttribute("pw", "12345");
		session.setAttribute("age", 25);
		
	%>
	
	<a href = "ex05GetSession.jsp">���� Ȯ��</a>

</body>
</html>