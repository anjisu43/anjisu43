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
	%>



<table border>
<tr align="center">
<td><%=id%>�� ȯ���մϴ�!</td>
</tr>
<tr align="center">
<td><input type="submit" value="�α׾ƿ�"></td>
</tr>
</table>

</body>
</html>