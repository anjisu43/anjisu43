package com.example;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.org.apache.bcel.internal.generic.Select;


@WebServlet("/ex03")
public class ex03 extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String num1 = request.getParameter("num1");
		String num2 = request.getParameter("num2");
		
		response.setContentType("text/html;charset=euc-kr");
		
		int num3 = Integer.parseInt(num1);
		int num4 = Integer.parseInt(num2);
		String select = request.getParameter("select");
		
		PrintWriter out = response.getWriter();

		if(select.equals("+")) {
			out.print("합계 : "+ (num3+num4));
		}else if(select.equals("-")) {
			out.print("합계 : "+ (num3-num4));
		}else if(select.equals("*")) {
			out.print("합계 : "+ (num3*num4));
		}else if(select.equals("/")) {
			out.print("합계 : "+ (num3/num4));
		}
		
		
	}

}
