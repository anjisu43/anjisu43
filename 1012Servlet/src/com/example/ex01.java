package com.example;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/ex01")//���� ����� �Ӵ�!!
public class ex01 extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//Servlet(Server+Applet) : Server(WAS : Tomcat)���� Java�� ������� �۵��ϴ� �������α׷�
		//                         Java : main()  / Servlet:service()
		//Ip�ּ� : 211.227.224.252
		
		System.out.println("������ ex01 ���� ���α׷� ȣ��");
		String ip = request.getRemoteAddr();
		//request : Client�� ��� ������ ���� �ִ� ��ü(�Է��� data)
		
		System.out.println("������ ������� IP : "+ ip);
		
		response.setContentType("text/html;charset=euc-kr");
		//response : server�� Client���� ������ ����� �����ϴ� ��ü(����, �̵�)
		//������ �������� ���ڵ��������
		
		PrintWriter out = response.getWriter();
		out.write("���������� ���� ����");
		//PrintWriter��θ� ���ؼ� ������ HTML�� ���Է�
		
		
	}

}
