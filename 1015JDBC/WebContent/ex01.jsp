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
		
			//response.setContentType("text/html; charset=euc-kr")
			//PrintWriter out1 = response.getWriter();
			// 외부페이지 이동
			//response.sendRedirect("http://www.naver.com");
			// 내부페이지 이동 
			response.sendRedirect("ex02.jsp");
			
			//로그인시스템
			//1.로그인 할 수 있는 HTML
			//2. 아이디와 패스워드가 맞는지 체크하는 JSP
			//3. 성공했을 때 JSP
			//4. 실패했을 때 JSP
		%>

</body>
</html>