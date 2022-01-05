package Book;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;




@WebServlet("/LoginCon")
public class LoginCon extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		
		BookDAO dao = new BookDAO();
		BookDTO dto = dao.login_member(id, pw);
		
		if(dto!=null) {
			HttpSession session = request.getSession();
			
			//세션 값 설정
			session.setAttribute("nick", dto);
			
			response.sendRedirect("Question4_Main.jsp");

		}else {
			response.sendRedirect("");
		}
		
		
	}

}
