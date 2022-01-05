import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ex04SelcetAll {

	public static void main(String[] args) {
		//현재 가입되어 있는 모든 회원의 정보를 출력(콘솔)
		//JDBC_member 테이블에 모든 정보 출력 -> 조건x
		
		ResultSet rs = null;
		PreparedStatement psmt = null;
		Connection conn = null;
		//try~catch : 예외처리(런타임오류)
		try {
			//실행할 코드
			//1. 드라이버 로드 -> ClassNotFoundException
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
			String dbid = "hr";
			String dbpw = "hr";
			//2. 데이터베이스 연결(Connection)객체 생성
			conn = DriverManager.getConnection(url,dbid,dbpw);
			
			String sql = "select * from JDBC_member";
			//3. sql 실행/준비(PreparedStatment) 객체 생성
			psmt =  conn.prepareStatement(sql);
			
			//executeUpdate() : insert, delete, update -> 테이블에 변화 o
			//-> 반환값(Int) -> 몇개의 행에서 변화가 일어났는지
			//executeQuery() : select -> 테이블에 변화x
			//-> 반환값(Resultset(Object)) -> select문 실행시 결과값 + 커서
			//next() : 커서를 한칸 움직임(다음 행을 카리킴)
			//-> 커서가 가리키는 행에 값이 있는지 없는지 판단 -> 있으면 true반환, 없으면 false 반환
			
			//4. sql문 실행
			
			rs = psmt.executeQuery();
			
			//5. 값을 출력
		
			while(rs.next()) {
				// 각각의 컬럼값 읽어오기
				String id =  rs.getString(1); //컬럼의 순서(1부터 시작)->(resultset상의 순서) 지정
				String pw = rs.getString("pw");
				String nick = rs.getString(3);
				//int a = rs.getInt(1) -> 정수형 값 가지고 올 때 
				
				System.out.println("id : "+id);
				System.out.println("pw : "+pw);
				System.out.println("nick : "+nick);
				System.out.println("===================");
			
			}
		
		} catch (Exception e) {
			//try문 안에서 발생한 예외 상황에 대한 처리
			e.printStackTrace();
		} finally{
			//try 안에서 예외 상황이 발생하던지 발생하지 않던지 무조건 실행하는 구문
			//6. 사용한 객체 닫기(자원 반환)
			try {
				rs.close(); //객체 생성이 되지 않은 경우 -> 위쪽에서 예외 상황 발생 -> close() 호출x -> 런타임 오류
				psmt.close();
				conn.close();				
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}

		
		
		
		
		

	}

}
