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
			System.out.println("�������");
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
			
				//5.���ε� ����(?) ä���
				psmt.setString(1,id);
				psmt.setString(2,pw);
				psmt.setString(3,nick);
				psmt.setString(4,email);
				psmt.setString(5,tel);
			
			//6. sql�� ���� �� ��� ó��
				cnt = psmt.executeUpdate();
			
			} catch (Exception e) {
				System.out.println("���Խ��Ф̤�");
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
			//3. sql ����/�غ�(PreparedStatment) ��ü ����
		
			psmt = conn.prepareStatement(sql);
			psmt.setString(1,id);
			psmt.setString(2,pw);
			
			rs = psmt.executeQuery();
			
			// System.out.println("�α��� ���� ���� : "+ rs.next()); �궧�� �ȴ���� �ּ�ó��
			
			if(rs.next()==true){
				System.out.println("�α��� ����");
				
			}else{
				System.out.println("�α��� ����");
				
			}
			
		} catch (Exception e) {
			System.out.println("�α��� ����!");
			
			e.printStackTrace();
		} finally {
			close();
		}
		return dto;
		
	}

	

}
