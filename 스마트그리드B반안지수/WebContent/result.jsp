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
		request.setCharacterEncoding("euc-kr");
		String Fruit[] = request.getParameterValues("fruit");
		
		String res_fruit = "";
		
		for(int i = 0; i<Fruit.length; i++){
			res_fruit += Fruit[i];
		}
		%>
		
	<table border>
	<tr align="center">
		<td>�̸�</td>
		<td>�ں���</td>
	</tr>
	<tr align="center">
		<td>�����ϴ� ����</td>
		<td><%=res_fruit %></td>
	</tr>
	

</body>
</html>