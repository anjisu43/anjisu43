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
		//���尴ü : ������������ ������ �� ���� ���Ǵ� ��ü�� �̸� ����
		//		  JSP -> WAS(Tomcat) -> Servlet*
		
		//out ���尴ü : ��ũ��Ʋ�� ���� �ȿ��� �� �������� ���
		out.print("Hello~");
	
	%>
	<br>
	Hello!
	<br>
	<table border = "1">
			<tr>
				<%--td �±׸� 10�� �ݺ��Ͻÿ� (��ũ��Ʋ��) --%>
				<%for(int i = 0; i<=10; i++){%>
					<td>1</td>
				<%}%>
			</tr>
			<tr>
				<%--td �±׸� 10�� �ݺ��Ͻÿ� (��ũ��Ʋ��) --%>
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
			
			out.print(year+"�� ");
			out.print(month+1+"�� ");
			out.print(date+"��"+"<br>");
			out.print(hour+"�� ");
			out.print(min+"�� ");
			out.print(sec+"�� "+"<br>");
			
			
		%>
		
		<!-- ǥ������ ����� ���  -->
		<%=year %>�� <%=month+1 %>�� <%=date %>��<br>
		<%=hour %>�� <%=min %>�� <%=sec %>��
		
		
		
		

</body>
</html>