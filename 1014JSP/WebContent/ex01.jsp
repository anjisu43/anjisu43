<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

		<%//스크립틀릿(Scriptlet) : Jsp안에서 Java코드를 구현할 수 있는 영역
			int num1 = 10;
			int num2 = 5;
			int result = num1 + num2;
			
		%>
		num1과 num2의 합 : <b><%=result %></b>
		<%--표현식(expression) : JSP내에서 변수를 출력할 수 있는 영역--%>
		
		<%
			int sum = 0;
			for(int i = 1; i<=100; i++){
				sum +=i;
			}
			%>
		<br>1~100까지의 합 : <b><%=sum %></b>
		
		<table border = "1">
			<tr>
			<!--td 태그를 10번 반복하시오  -->
			
			
			<%for(int i = 0; i<=10; i++){%>
			<td>1</td>
			<%}%>
			</tr>
		</table>
		
		<%
			request.getParameter("");
			response.setContentType("");
		%>


		<script>
 			//JavaScript
		</script>

		<style>
     		/* CSS */ 
		</style>
		

</body>
</html>