
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

	<%--
		//1.����ڰ� �Է��� ID, PW�� �������ÿ�.
		
		request.setCharacterEncoding("euc-kr");
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		
		try {

			Class.forName("oracle.jdbc.driver.OracleDriver");

			String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
			String dbid = "hr";
			String dbpw = "hr";

			Connection conn = DriverManager.getConnection(url, dbid, dbpw);

			String sql = "select * from JDBC_member where id =? and pw = ?";
			//3. sql ����/�غ�(PreparedStatment) ��ü ����
		
			PreparedStatement psmt = conn.prepareStatement(sql);
			psmt.setString(1,id);
			psmt.setString(2,pw);
			
			ResultSet rs = psmt.executeQuery();
			
			// System.out.println("�α��� ���� ���� : "+ rs.next()); �궧�� �ȴ���� �ּ�ó��
			
			if(rs.next()==true){
				response.sendRedirect("ex02LoginS.jsp");
			}else{
				response.sendRedirect("ex02LoginF.jsp");
			} 
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
	--%>

</body>
</html>