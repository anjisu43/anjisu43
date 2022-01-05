package com.example;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/ex06")
public class ex06 extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("euc-kr"); //무조건 제일 처음에 써줘야 함, 값을 받은 다음 써주면 이미 값이 깨진 다음 받는 것이라서 소용이 없다
		
		String ID = request.getParameter("id");
		String NAME = request.getParameter("name");
		String EMAIL = request.getParameter("email");
		String TEL = request.getParameter("tel");
		String GENDER = request.getParameter("gender");
		String COUNTRY = request.getParameter("country");
		String[] hobby = request.getParameterValues("hobby");
		String BIRTH = request.getParameter("birth");
		String COLOR = request.getParameter("color");
		String TALK = request.getParameter("talk");
		
		String res_hobby = "";

		for (int i = 0; i < hobby.length; i++) {
			res_hobby += hobby[i];
		}
		
		response.setContentType("text/html;charset=euc-kr");
		
		PrintWriter out = response.getWriter();
		
		out.print("ID : " + ID +"<br>");
		out.print("NAME : " + NAME +"<br>");
		out.print("EMAIL : " + EMAIL +"<br>");
		out.print("TEL : " + TEL +"<br>");
		out.print("GENDER : " + GENDER +"<br>");
		out.print("COUNTRY : " + COUNTRY +"<br>");
		out.print("BIRTH : " + BIRTH +"<br>");
		out.print("COLOR : " + COLOR +"<br>");
		out.print("HOBBY : " + res_hobby +"<br>");
		out.print("TALK : " + TALK);
	
		
	}

}
