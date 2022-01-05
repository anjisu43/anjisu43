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
//		//2. ID�� 'smart'�̰�, PW�� '123'�� ��,
//		//   ������ 'EX02LoginS.jsp'�� �̵�
//		//   ���н� 'EX02LoginF.jsp'�� �̵�
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
		
		
	}

}
