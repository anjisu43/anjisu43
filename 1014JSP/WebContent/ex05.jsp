<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<style>
	tr{
		height: 40px;
		text-align: center;
	}
	table{
		margin: 0 auto;
	}
</style>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

		<%
		request.setCharacterEncoding("euc-kr");
		String name = request.getParameter("name");
		String java = request.getParameter("java");
		String web = request.getParameter("web");
		String iot = request.getParameter("iot");
		String android = request.getParameter("android");
		
		
		int num1 = Integer.parseInt(request.getParameter("java"));
		int num2 = Integer.parseInt(request.getParameter("web"));
		int num3 = Integer.parseInt(request.getParameter("iot"));
		int num4 = Integer.parseInt(request.getParameter("android"));
		
		int avg = (num1+num2+num3+num4)/4;
		
		
	 	String score = "";
		if(avg>=95){
			score = "A+";
		}else if(avg>=85){
			score = "A";
		}else if(avg>=80){
			score = "B+";
		}else if(avg>=70){
			score = "C";
		}else{
			score = "F";
		}
		 
		
	%>
	
	
	
	<fieldset>
			<legend>����Ȯ�����α׷�</legend>
			<table width="500">	
				<tr>
					<td>�̸�</td>
					<td><%=name %></td>
				</tr>
				<tr>
					<td>JAVA����</td>
					<td><%=num1%></td>
				</tr>
				<tr>
					<td>WEB����</td>
					<td><%=num2 %></td>
				</tr>
					<tr>
					<td>IOT����</td>
					<td><%=num3 %></td>
				</tr>		
				<tr>
					<td>ANDROID����</td>
					<td><%=num4 %></td>
				</tr>	
				<tr>
					<td>���</td>
					<td><%=avg %></td>
				</tr>
				<tr>
					<td>����</td>
					<td><%=score %></td>
				</tr>			
																																					
			</table>
		</fieldset>

</body>
</html> 