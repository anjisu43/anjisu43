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
		
		request.setCharacterEncoding("euc-kr"); //������ ���� ó���� ����� ��, ���� ���� ���� ���ָ� �̹� ���� ���� ���� �޴� ���̶� �ҿ��� ����
		
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
