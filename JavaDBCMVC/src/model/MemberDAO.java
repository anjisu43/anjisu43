package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class MemberDAO {
	//DA0 : Data Access Object(
	//CRUD : INSERT, UPDATE, DLELET, SELECT �۾� ����
	//Database ����
	//��� ����(����� View���� ȣ���ؼ� ���)
	
	ResultSet rs = null;
	Connection conn = null;
	PreparedStatement psmt = null;
	
	//Ŀ�ؼ� �޼ҵ�
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
	
	//��ü �ݴ� �޼ҵ�(����� �ڿ� ��ȯ)
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
	//1.ȸ������
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
			System.out.println("Class ���� Ȯ�� ����");
		}finally {
			close();
			
		}
		return cnt;
		
		
	}
	//2.ȸ����������
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
	//3.ȸ������
	public void delete() {
	}
	
	//4.��ü ȸ�� ����
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
				
				//�� ȸ���� ���� ���� ����
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
	
	//5.Ư��ȸ����ȣ��
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
				System.out.println("�ش� ȸ���� �������� �ʽ��ϴ�!");
			}
		} catch (Exception e) {
			
			e.printStackTrace();
		} finally{
			close();
		}

		return vo;
	}
	

	

}
