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
	
	ResultSet rs = null;
	Connection conn = null;
	PreparedStatement psmt = null;
	
	//커넥션 메소드
	public void conn() {
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
		
		
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String dbid = "hr";
		String dbpw = "hr";
		
		conn = DriverManager.getConnection(url, dbid, dbpw);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	//객체 닫는 메소드(사용한 자원 반환)
	public void close() {
		try {
			if(rs!=null) {
				rs.close();
			}
			psmt.close();
			conn.close();				
		} catch (Exception e2) {
			e2.printStackTrace();
		}
	}
	//1.회원가입
	public int insert(ModelVO vo) {
		int cnt = 0;
		
		try {		
			conn();
			
			String sql = "insert into JDBC_member values(?,?,?)";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, vo.getId());
			psmt.setString(2, vo.getPw());
			psmt.setString(3, vo.getNick());
			
			cnt = psmt.executeUpdate();

		}catch (Exception e) {
			e.printStackTrace();
			System.out.println("Class 파일 확인 실패");
		}finally {
			close();
			
		}
		return cnt;
		
		
	}
	//2.회원정보수정
	public int update(String id, String choice, String data) {	
	
		int cnt = 0;
		try {
			conn();
			
			String sql = "";
			if(choice.equals("1")) {
				sql = "update JDBC_member set pw = ? where id = ?";			
				}
			else {
				sql = "update JDBC_member set nick = ? where id = ?";								
				}
			psmt = conn.prepareStatement(sql);
			psmt.setString(1,data);
			psmt.setString(2,id);
					
			cnt = psmt.executeUpdate();
	
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			close();
		}	
		return cnt;
	}
	//3.회원삭제
	public void delete() {
	}
	
	//4.전체 회원 정보
	public ArrayList<ModelVO> selectALL() {
		
	
		ArrayList<ModelVO> al = new ArrayList<ModelVO>();
		
		try {
			conn();
			
			String sql = "select * from JDBC_member";
			
			psmt =  conn.prepareStatement(sql);
			
			rs = psmt.executeQuery();
		
			while(rs.next()) {				
				String id =  rs.getString(1); 
				String pw = rs.getString("pw");
				String nick = rs.getString(3);
				
				//한 회원에 대한 정보 묶기
				ModelVO vo = new ModelVO(id,pw,nick);
				
				al.add(vo);
	
			}
		
		} catch (Exception e) {
			
			e.printStackTrace();
		} finally{
			close();
			
		}
		return al;
	}
	
	//5.특정회원정호출
	public ModelVO selectOne(String id) {
		ModelVO vo = null;;
		try {
			conn();
			
			String sql = "select * from JDBC_member where id =?";
			
			psmt =  conn.prepareStatement(sql);
			psmt.setString(1,id);
			
			rs = psmt.executeQuery();
			
			
			if(rs.next()) {
	
				String getid =  rs.getString(1); 
				String pw = rs.getString("pw");
				String nick = rs.getString(3);
				
				vo = new ModelVO(getid, pw, nick);
						
			}else {
				System.out.println("해당 회원이 존재하지 않습니다!");
			}
		} catch (Exception e) {
			
			e.printStackTrace();
		} finally{
			close();
		}

		return vo;
	}
	

	

}
