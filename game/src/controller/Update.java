package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.MemberDAO;
import model.MemberVO;

@WebServlet("/Update")
public class Update extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("euc-kr");
		
		HttpSession session = request.getSession(); 
		
		MemberVO vo = (MemberVO)session.getAttribute("member");
		
		String id = vo.getId();
		
		String Id = request.getParameter("id"); // �ҹ��ڸ� ���� �� ������ ���� ����
		String pw = request.getParameter("pw");
		String nick = request.getParameter("nick");
		
		
		MemberDAO dao = new MemberDAO();
		
		int cnt = dao.update(id, pw, nick);
		
		if (cnt > 0) {
			System.out.println("��������!");
			
			MemberVO vo2 = new MemberVO(id, pw, nick);
			
			session.setAttribute("member", vo2);
			
			response.sendRedirect(".jsp"); // ����
		} else {
			System.out.println("��������!");
			response.sendRedirect(".jsp"); // ����
		}
	}

}
