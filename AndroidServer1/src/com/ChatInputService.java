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
		
		// 닉네임과 채팅내용을 가져온다
		// DAO 안에 chatInput이라는 메소드를 통해서
		// andChat 테이블 안에 닉네임과 채팅내용을 저장시킨다
		
		request.setCharacterEncoding("utf-8");
		
		String nick = request.getParameter("nick");
		String edt_chat = request.getParameter("edt_chat");
		System.out.println(nick+"/"+edt_chat);
		
		AndMemberDAO dao = new AndMemberDAO();
		int cnt = dao.chatInput(nick, edt_chat);
		
		if(cnt>0) {
			System.out.println(nick+"/"+edt_chat);
		}else {
			System.out.println("실패ㅠㅠ");
		}
	
	}

}
