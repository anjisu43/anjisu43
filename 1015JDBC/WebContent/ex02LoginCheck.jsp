
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
		//1.사용자가 입력한 ID, PW를 가져오시오.
		
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
			//3. sql 실행/준비(PreparedStatment) 객체 생성
		
			PreparedStatement psmt = conn.prepareStatement(sql);
			psmt.setString(1,id);
			psmt.setString(2,pw);
			
			ResultSet rs = psmt.executeQuery();
			
			// System.out.println("로그인 성공 유무 : "+ rs.next()); 얘때매 안댄거임 주석처리
			
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