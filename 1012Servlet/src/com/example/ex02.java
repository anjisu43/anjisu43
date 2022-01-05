package com.example;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ex02")
public class ex02 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//Client에게 입력한 데이터를 받아오려면? -> HTML에서 입력받아와야한다
		//HTML 먼저 실행 하고 서버 실행
		
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		
		
		System.out.println("사용자가 입력한 ID : "+ id);
		System.out.println("사용자가 입력한 PW : "+ pw);
		//사용자가 입력한 ID와 PW를 응답해주는 페이지를 만드시오.
		response.setContentType("text/html;charset=euc-kr");
		
		PrintWriter out = response.getWriter();
		out.print("사용자가 입력한 ID : "+ id +"<br>");
		out.print("사용자가 입력한 PW : "+ pw);
		
		
	
	}

}
