package com.example;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/ex01")//절대 지우면 앙대!!
public class ex01 extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//Servlet(Server+Applet) : Server(WAS : Tomcat)에서 Java를 기반으로 작동하는 서버프로그램
		//                         Java : main()  / Servlet:service()
		//Ip주소 : 211.227.224.252
		
		System.out.println("누군가 ex01 서버 프로그램 호출");
		String ip = request.getRemoteAddr();
		//request : Client의 모든 정보를 갖고 있는 객체(입력한 data)
		
		System.out.println("접속한 사용자의 IP : "+ ip);
		
		response.setContentType("text/html;charset=euc-kr");
		//response : server가 Client에게 응답할 방식을 지정하는 객체(생성, 이동)
		//응답할 페이지와 인코딩방식지정
		
		PrintWriter out = response.getWriter();
		out.write("응답페이지 생성 성공");
		//PrintWriter통로를 통해서 생성된 HTML에 값입력
		
		
	}

}
