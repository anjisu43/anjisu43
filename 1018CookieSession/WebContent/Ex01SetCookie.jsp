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
		//1. ��Ű ��ü ����
		//Cookie(name(String), value(String))
		Cookie cookie = new Cookie("testcookie", "firstcookie");
	
		//2. ��ȿ�Ⱓ ����(�ʴ���)
		cookie.setMaxAge(60*60*24*365); //��ȿ�Ⱓ 1��
		
		//3. (server->client)Ŭ���̾�Ʈ���� ��Ű ����(����-response)
		response.addCookie(cookie);
		
		//4. ��Ű ������ �� �ٷ� Ŭ���̾�Ʈ�� ����
		response.addCookie(new Cookie("id", "test"));
		
	%>
	
	<a href = "Ex02GetCookie.jsp">��ŰȮ��</a>
	<a href = "Ex07InvalidateSession.jsp">���� ��� ����</a>

</body>
</html>