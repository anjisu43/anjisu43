package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class MemberDAO {
	//DA0 : Data Access Object(
	//CRUD : INSERT, UPDATE, DLELET, SELECT 작업 수행
	//Database 연결
	//기능 정의(기능은 View에서 호출해서 사용)
	
	//1.회원가입
	public int insert(String id, String pw, String nick) {
		Connection conn = null;
		PreparedStatement psmt = null;
		int cnt = 0;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
			String dbid = "hr";
			String dbpw = "hr";
			
			conn = DriverManager.getConnection(url, dbid, dbpw);
	
			String sql = "insert into JDBC_member values(?,?,?)";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, id);
			psmt.setString(2, pw);
			psmt.setString(3, nick);
			
			cnt = psmt.executeUpdate();

		

		}catch (Exception e) {
			e.printStackTrace();
			System.out.println("Class 파일 확인 실패");
		}finally {
			try {
				psmt.close();
				conn.close();
				
			} catch (Exception e2) {
				e2.printStackTrace();
			}
			
		}
		return cnt;
		
		
	}
	//4. 전체 회원 정보
	public ArrayList<ModelVO> selectALL() {
		ResultSet rs = null;
		PreparedStatement psmt = null;
		Connection conn = null;
		
		ArrayList<ModelVO> al = new ArrayList<ModelVO>();
		
		try {
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
			String dbid = "hr";
			String dbpw = "hr";
			
			conn = DriverManager.getConnection(url,dbid,dbpw);
			
			String sql = "select * from JDBC_member";
			
			psmt =  conn.prepareStatement(sql);
			
			rs = psmt.executeQuery();
		
			while(rs.next()) {				
				String id =  rs.getString(1); 
				String pw = rs.getString("pw");
				String nick = rs.getString(3);
				
				ModelVO vo = new ModelVO(id,pw,nick);
				
				al.add(vo);
	
			}
		
		} catch (Exception e) {
			
			e.printStackTrace();
		} finally{
			
			try {
				rs.close(); 
				psmt.close();
				conn.close();				
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return al;

		
	}

	
	
	

}
