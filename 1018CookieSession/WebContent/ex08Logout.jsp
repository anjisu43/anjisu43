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
		session.invalidate();	
		/* response.sendRedirect("ex08Loginform.html"); */
	%>
	<script>
	alert("로그아웃 !");
	location.href="ex08Loginform.html";
	</script>
	
	

</body>
</html>