<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

	<table border="1">
	<tr>
		<th>ID</th>
		<th>PW</th>
		<th>NICK</th>
	</tr>

	<%
	
		//JDBC(Select)
		
		request.setCharacterEncoding("euc-kr");

		String id = request.getParameter("id");

		try {

			Class.forName("oracle.jdbc.driver.OracleDriver");

			String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
			String dbid = "hr";
			String dbpw = "hr";

			Connection conn = DriverManager.getConnection(url, dbid, dbpw);

			String sql = "select * from JDBC_member where id =?";
			//3. sql 실행/준비(PreparedStatment) 객체 생성
		
			PreparedStatement psmt = conn.prepareStatement(sql);
			
			psmt.setString(1,id);
			ResultSet rs = psmt.executeQuery();
			
			while(rs.next()){
				
				String getid = rs.getString(1);
				String pw = rs.getString(2);
				String nick = rs.getString(3);
			%>	
				
				<tr>
					<td><%=getid %></td>
					<td><%=pw %></td>
					<td><%=nick %></td>
				</tr>
				
			<%	
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	%>
	</table>
</body>
</html>