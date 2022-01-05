import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class ex03Update {
public static void main(String[] args) {
	System.out.println("ȸ����������");
    Scanner sc = new Scanner(System.in);
    System.out.print("ID : ");
    String id = sc.next();
    System.out.print("������ PW : ");
    String pw = sc.next();
    
    Connection conn = null;
    PreparedStatement psmt = null;

    try {
       Class.forName("oracle.jdbc.driver.OracleDriver");
       
       String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
       String dbid = "hr";
       String dbpw = "hr";

       conn = DriverManager.getConnection(url, dbid, dbpw);
       
       String sql = "update JDBC_member set pw = ?  where id = ?";
       psmt = conn.prepareStatement(sql);
       psmt.setString(1, pw);
       psmt.setString(2, id);
       
       int cnt = psmt.executeUpdate();
       
       if(cnt>0) {
          System.out.println("��������");
       }else {
          System.out.println("��������");
       }
       
    } catch (Exception e) {
       e.printStackTrace();
    } finally {

       try {
          psmt.close();
          conn.close();            
       } catch (Exception e2) {
          e2.printStackTrace();
       }
       
    }

	}

}