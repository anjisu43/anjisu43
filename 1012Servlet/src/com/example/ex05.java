package com.example;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ex05")
public class ex05 extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setCharacterEncoding("euc-kr");

		String job = request.getParameter("job");
		String gender = request.getParameter("gender");
		String[] hobby = request.getParameterValues("hobby");

		String res_hobby = "";

		for (int i = 0; i < hobby.length; i++) {
			res_hobby += hobby[i];
		}

		System.out.println("JOB : " + job);
		System.out.println("GENDER : " + gender);
		System.out.println("HOBBY : " + res_hobby);

	}

}
