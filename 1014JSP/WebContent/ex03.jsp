<%@page import="java.util.Locale"%>
<%@page import="java.util.GregorianCalendar"%>
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
		//내장객체 : 서버페이지를 개발할 때 많이 사용되는 객체를 미리 선언
		//		  JSP -> WAS(Tomcat) -> Servlet*
		
		//out 내장객체 : 스크립틀릿 영역 안에서 웹 브라우저로 출력
		out.print("Hello~");
	
	%>
	<br>
	Hello!
	<br>
	<table border = "1">
			<tr>
				<%--td 태그를 10번 반복하시오 (스크립틀릿) --%>
				<%for(int i = 0; i<=10; i++){%>
					<td>1</td>
				<%}%>
			</tr>
			<tr>
				<%--td 태그를 10번 반복하시오 (스크립틀릿) --%>
				<%
				for(int i = 0; i<=10; i++){
					out.print("<td>1</td>");
				}%>
	
			</tr>
		</table>
		
		<%
			GregorianCalendar gre = new GregorianCalendar(Locale.KOREA);
			
			int year = gre.get(gre.YEAR);
			int month = gre.get(gre.MONTH);
			int date = gre.get(gre.DATE);
			int hour = gre.get(gre.HOUR);
			int min = gre.get(gre.MINUTE);
			int sec = gre.get(gre.SECOND);
			
			out.print(year+"년 ");
			out.print(month+1+"월 ");
			out.print(date+"일"+"<br>");
			out.print(hour+"시 ");
			out.print(min+"분 ");
			out.print(sec+"초 "+"<br>");
			
			
		%>
		
		<!-- 표현식을 사용한 출력  -->
		<%=year %>년 <%=month+1 %>월 <%=date %>일<br>
		<%=hour %>시 <%=min %>분 <%=sec %>초
		
		
		
		

</body>
</html>