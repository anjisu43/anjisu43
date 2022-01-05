package com;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ChatInputService")
public class ChatInputService extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// �г��Ӱ� ä�ó����� �����´�
		// DAO �ȿ� chatInput�̶�� �޼ҵ带 ���ؼ�
		// andChat ���̺� �ȿ� �г��Ӱ� ä�ó����� �����Ų��
		
		request.setCharacterEncoding("utf-8");
		
		String nick = request.getParameter("nick");
		String edt_chat = request.getParameter("edt_chat");
		System.out.println(nick+"/"+edt_chat);
		
		AndMemberDAO dao = new AndMemberDAO();
		int cnt = dao.chatInput(nick, edt_chat);
		
		if(cnt>0) {
			System.out.println(nick+"/"+edt_chat);
		}else {
			System.out.println("���ФФ�");
		}
	
	}

}
