package Book;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/JoinCon")
public class JoinCon extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("euc-kr");
		
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String nick = request.getParameter("nick");
		String email = request.getParameter("email");
		String tel = request.getParameter("tel");
		
		BookDAO dao = new BookDAO();
		int cnt = dao.insert_member(id, pw, nick, email, tel);

		if(cnt>0) {
			System.out.println("���Լ���!");
		
			RequestDispatcher rd =  request.getRequestDispatcher("Question4_Login.jsp");
		
		
			request.setAttribute("id", id);
		
		
			rd.forward(request, response);
			response.sendRedirect("Question4_Login.jsp");
			
	
		}else {
			System.out.println("���Խ��Ф�");
			
		}
	

	
	}

}
