package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.MemberDAO;

@WebServlet("/Delete")
public class Delete extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		request.setCharacterEncoding("euc-kr");

		String id = request.getParameter("id");

		MemberDAO dao = new MemberDAO();

		int cnt = dao.delete(id);

		if (cnt > 0) {
			System.out.println("��������!");
			response.sendRedirect(".jsp"); // ����
		} else {
			System.out.println("��������!");
			response.sendRedirect(".jsp"); // ����
		}
	}
}
