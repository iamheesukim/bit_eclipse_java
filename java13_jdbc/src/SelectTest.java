import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SelectTest {

	public SelectTest() {
		try {
			//1. JVM에 jdbc 드라이브 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
		}
		catch(ClassNotFoundException cnfe) {
			System.out.println("jdbc 드라이브 로딩 실패 --> "+cnfe.getMessage());
		}
		
		try {
		
			//2. DB연결
			//DB서버에 대한 정보 ->	@까진 동일		ip주소:포트:전역변수(SID)
			String dbUrl = "jdbc:oracle:thin:@localhost:1521:xe";
			//									DB서버에 대한 정보, 계정, 비번
			Connection conn = DriverManager.getConnection(dbUrl,"c##scott","tiger");
			
			
			//3. "문자열"로 쿼리문을 만든다. 
			String sql = "select empno, ename, job, to_char(hiredate,'YYYY-MM-DD'), sal, comm, deptno"
					+ " from emp1 where sal>=? or job=? order by ename";
			//너무 길면 이렇게 2줄
			
			//4. 쿼리문을 이용하여 PreparedStatement 객체 생성
			PreparedStatement pstmt = conn.prepareStatement(sql);
			// ? 셋팅
			pstmt.setInt(1, 3000);
			pstmt.setString(2, "세일맨");
			
			//5. 실행하기
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				//한줄의 레코드를 처리
				int empno = rs.getInt(1); //rs.getInt("empno");
				String ename = rs.getString(2); //rs.getString("ename");
				String job = rs.getString(3);
				String hiredate = rs.getString(4); //자바에게 date는 그냥 문자
				//double sal = rs.getDouble(5);
				int sal = rs.getInt(5);
				double comm = rs.getDouble(6);
				int deptno = rs.getInt(7);
				
				System.out.println(empno+", "+ename+", "+job+", "+hiredate+", "+sal+", "+comm+", "+deptno);
			}
			
			//6.종료
			rs.close();
			pstmt.close();
			conn.close();
			
		}
		catch(SQLException se) {
			System.out.println("DB연결 에러 발생");
		}
	}

	public static void main(String[] args) {
		new SelectTest();
	}

}
