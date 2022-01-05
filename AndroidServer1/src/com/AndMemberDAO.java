package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class AndMemberDAO {
	
	private Connection conn = null;
	private PreparedStatement psmt = null;
	private ResultSet rs = null;
	

	public void connection() {
	     
		   try {
	         Class.forName("oracle.jdbc.driver.OracleDriver");
	         String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
	         String dbid = "hr";
	         String dbpw = "hr";
	         conn = DriverManager.getConnection(url, dbid, dbpw);
	         
	      }catch(Exception e) {
	         e.printStackTrace();
	      }
	   }

	   public void close() {
	      try {
	         if(rs!=null) {
	            rs.close();
	         }
	         if(psmt != null) {
	        	 psmt.close();
	         }
	         if(conn != null) {
	         conn.close();
	         }

	      } catch (Exception e2) {
	         e2.printStackTrace();
	      }
	   }
	  
	
	public int join(AndMemberVO vo) {
		int cnt = 0;
		try {				
			connection();
			
			//3. ������ sql�� ����(������ ������ ���� �޶����� �κ��� ? �����ָ� ��)
			String sql = "insert into andmember values (?,?,?,?)";
		
			//4. sql ���ఴü(PreparedStatement?)����
			psmt =  conn.prepareStatement(sql);
		
			//5.���ε� ����(?) ä���
			psmt.setString(1,vo.getId());
			psmt.setString(2,vo.getPw());
			psmt.setString(3,vo.getNick());
			psmt.setString(4,vo.getPhone());
		
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

	public AndMemberVO login(String id, String pw) {
		
		AndMemberVO vo = null;
		
		try {
			connection();

			String sql = "select * from andmember where id =? and pw = ?";
			//3. sql ����/�غ�(PreparedStatment) ��ü ����
		
			psmt = conn.prepareStatement(sql);
			psmt.setString(1,id);
			psmt.setString(2,pw);
			
			rs = psmt.executeQuery();
			
			if(rs.next()==true){
				System.out.println("DAO ����");
				
				String get_id = rs.getString("id");
				String get_pw = rs.getString("pw");
				String get_nick = rs.getString("nick");
				String get_phone = rs.getNString("phone");
				
				vo = new AndMemberVO(get_id, get_pw, get_nick, get_phone);
				
			}else{
				System.out.println("�α��� ����");		
			}
			
		} catch (Exception e) {
			System.out.println("�α��� ����!");
			
			e.printStackTrace();
		} finally {
			close();
		}
		return vo;
		
	}

	public ArrayList<AndMemberVO> memberList() {
		
		ArrayList<AndMemberVO> al = new ArrayList<AndMemberVO>();
		
		try {
			connection();
			
			String sql = "select * from andmember";
			
			psmt =  conn.prepareStatement(sql);
			
			rs = psmt.executeQuery();
		
			while(rs.next()) {				
				String id =  rs.getString(1); 
				String pw = rs.getString(2);
				String nick = rs.getString(3);
				String phone = rs.getString(4);
				
				//�� ȸ���� ���� ���� ����
				AndMemberVO vo = new AndMemberVO(id,pw,nick,phone);
				
				al.add(vo);
	
			}
		
		} catch (Exception e) {
			
			e.printStackTrace();
		} finally{
			close();
			
		}
		return al;
	}
	
	public int chatInput(String nick, String edt_chat) {
		int cnt = 0;
		try {				
			connection();
			
			//3. ������ sql�� ����(������ ������ ���� �޶����� �κ��� ? �����ָ� ��)
			String sql = "insert into andchat values (?,?,sysdate)";
		
			//4. sql ���ఴü(PreparedStatement?)����
			psmt =  conn.prepareStatement(sql);
			
			psmt.setString(1,nick);
			psmt.setString(2,edt_chat);
						
		
			//5.���ε� ����(?) ä���
		
		//6. sql�� ���� �� ��� ó��
			cnt = psmt.executeUpdate();
		
		} catch (Exception e) {
			e.printStackTrace();
		
		} finally {
			close();					
		}
		return cnt;
	}

	public ArrayList<ChatVO> chatList() {
		
		ArrayList<ChatVO> al = new ArrayList<ChatVO>();
		connection();
		try {				
			
			String sql = "select * from andchat order by day desc";
		
			//4. sql ���ఴü(PreparedStatement?)����
			psmt =  conn.prepareStatement(sql);
			
			rs = psmt.executeQuery();
			
			while(rs.next()) {				
				String nick =  rs.getString(1); 
				String content = rs.getString(2);
				String day = rs.getString(3);
				
				//�� ȸ���� ���� ���� ����
				ChatVO vo = new ChatVO(nick, content, day);
				
				al.add(vo);}
	
		
		} catch (Exception e) {
			e.printStackTrace();
		
		} finally {
			close();					
		}
		return al;
	}

	
}

