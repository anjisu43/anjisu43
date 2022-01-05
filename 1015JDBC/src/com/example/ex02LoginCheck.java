package com.example;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ex02LoginCheck")
public class ex02LoginCheck extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		
//		request.setCharacterEncoding("euc-kr");
//		String id = request.getParameter("id");
//		String pw = request.getParameter("pw");
//		
//		//2. ID가 'smart'이고, PW가 '123'일 때,
//		//   성공시 'EX02LoginS.jsp'로 이동
//		//   실패시 'EX02LoginF.jsp'로 이동
//		
//		if(id.equals("smart")&&pw.equals("123")){
//			response.sendRedirect("ex02LoginS.jsp");
//		}else{
//			response.sendRedirect("ex02LoginF.jsp");
//		}
//		
		
		
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
		
		
	}

}
