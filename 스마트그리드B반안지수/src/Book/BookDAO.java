package Book;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpSession;



public class BookDAO {
	Connection conn = null;
	PreparedStatement psmt = null;
	ResultSet rs = null;
	int cnt = 0;
	BookDTO dto = null;
	
	public void connection() {
		try {
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "hr";
		String password = "hr";
		
		
		conn = DriverManager.getConnection(url,user,password);
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("연결실패");
		}
	}
	public void close() {
		try {
			if(rs!=null) {
				rs.close();
			}
			if(psmt!=null) {
			psmt.close();
			}
			if(conn!=null) {
			conn.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}
	
	
	public int insert_member(String id, String pw, String nick, String email, String tel) {	

			try {				
				connection();
				
				
				String sql = "insert into book_member values (?,?,?,?,?)";
			
				
				psmt =  conn.prepareStatement(sql);
			
				//5.바인드 변수(?) 채우기
				psmt.setString(1,id);
				psmt.setString(2,pw);
				psmt.setString(3,nick);
				psmt.setString(4,email);
				psmt.setString(5,tel);
			
			//6. sql문 실행 후 결과 처리
				cnt = psmt.executeUpdate();
			
			} catch (Exception e) {
				System.out.println("가입실패ㅜㅜ");
				e.printStackTrace();
			
			} finally {
				close();
						
			}
			return cnt;
		}
public BookDTO login_member(String id, String pw) {	
		
		try {
			connection();

			String sql = "select * from book_member where id =? and pw = ?";
			//3. sql 실행/준비(PreparedStatment) 객체 생성
		
			psmt = conn.prepareStatement(sql);
			psmt.setString(1,id);
			psmt.setString(2,pw);
			
			rs = psmt.executeQuery();
			
			// System.out.println("로그인 성공 유무 : "+ rs.next()); 얘때매 안댄거임 주석처리
			
			if(rs.next()==true){
				System.out.println("로그인 성공");
				
			}else{
				System.out.println("로그인 실패");
				
			}
			
		} catch (Exception e) {
			System.out.println("로그인 실패!");
			
			e.printStackTrace();
		} finally {
			close();
		}
		return dto;
		
	}

	

}
