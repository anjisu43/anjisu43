import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class ex05SelectOne {

	public static void main(String[] args) {
		// Ư�� ȸ���� id�Է� - > �ش� id�� ���� ȸ���� ������ ���
		// id�� ��ġ�� �ʴ´�
		Scanner sc = new Scanner(System.in);
		System.out.print("ID : ");
		String inputid = sc.next();
		
		ResultSet rs = null;
		PreparedStatement psmt = null;
		Connection conn = null;
		//try~catch : ����ó��(��Ÿ�ӿ���)
		try {
			//������ �ڵ�
			//1. ����̹� �ε� -> ClassNotFoundException
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
			String dbid = "hr";
			String dbpw = "hr";
			//2. �����ͺ��̽� ����(Connection)��ü ����
			conn = DriverManager.getConnection(url,dbid,dbpw);
			
			String sql = "select * from JDBC_member where id =?";
			//3. sql ����/�غ�(PreparedStatment) ��ü ����
			psmt =  conn.prepareStatement(sql);
			psmt.setString(1,inputid);
			//executeUpdate() : insert, delete, update -> ���̺� ��ȭ o
			//-> ��ȯ��(Int) -> ��� �࿡�� ��ȭ�� �Ͼ����
			//executeQuery() : select -> ���̺� ��ȭx
			//-> ��ȯ��(Resultset(Object)) -> select�� ����� ����� + Ŀ��
			//next() : Ŀ���� ��ĭ ������(���� ���� ī��Ŵ)
			//-> Ŀ���� ����Ű�� �࿡ ���� �ִ��� ������ �Ǵ� -> ������ true��ȯ, ������ false ��ȯ
			
			//4. sql�� ����
			
			rs = psmt.executeQuery();
			
			//5. ���� ���
			if(rs.next()) {
	
				// ������ �÷��� �о����
				String id =  rs.getString(1); //�÷��� ����(1���� ����)->(resultset���� ����) ����
				String pw = rs.getString("pw");
				String nick = rs.getString(3);
				//int a = rs.getInt(1) -> ������ �� ������ �� �� 
				
				System.out.println("id : "+id);
				System.out.println("pw : "+pw);
				System.out.println("nick : "+nick);
				System.out.println("===================");
			
			}else {
				System.out.println("�ش� ȸ���� �������� �ʽ��ϴ�!");
			}
		} catch (Exception e) {
			//try�� �ȿ��� �߻��� ���� ��Ȳ�� ���� ó��
			e.printStackTrace();
		} finally{
			//try �ȿ��� ���� ��Ȳ�� �߻��ϴ��� �߻����� �ʴ��� ������ �����ϴ� ����
			//6. ����� ��ü �ݱ�(�ڿ� ��ȯ)
			try {
				rs.close(); //��ü ������ ���� ���� ��� -> ���ʿ��� ���� ��Ȳ �߻� -> close() ȣ��x -> ��Ÿ�� ����
				psmt.close();
				conn.close();				
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}

	}

}
