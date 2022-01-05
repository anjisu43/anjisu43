package com;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;


@WebServlet("/ChatList")
public class ChatList extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		// 채팅 내용을 전체 가져와서 보기
		AndMemberDAO dao = new AndMemberDAO();
		ArrayList<ChatVO> list = dao.chatList();
		
		Gson gson = new Gson();
		String result = gson.toJson(list);
		response.setCharacterEncoding("UTF-8");
		response.getWriter().print(result);
		
		
	}

}
