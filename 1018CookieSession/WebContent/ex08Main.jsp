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
	String nick = (String)session.getAttribute("nick");	
	%>
	<%=nick %>�� ȯ���մϴ�.

	
	<a href = "ex08Logout.jsp">�α׾ƿ�</a>

</body>
</html>