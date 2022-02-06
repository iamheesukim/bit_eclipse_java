import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateTest { //0715-3
	
	static { //멤버 영역이지만 실행문을 표기할 수 있는 영역
		try {
			//드라이브 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	Connection conn;
	PreparedStatement pstmt;
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	String userid = "c##scott";
	String pwd = "tiger";
	
	public UpdateTest() {
		try {
			//부서코드 30인 부서으 ㅣ급여를 10% 인상한 금액으로 업데이트하라
			conn = DriverManager.getConnection(url,userid,pwd);
			String sql = "update emp set sal=sal*1.1 where deptno=30";
			pstmt = conn.prepareStatement(sql);
			
			int cnt = pstmt.executeUpdate();
			//업데이트된 내용 갯수만큼 들어감
			
			if(cnt>0) {
				System.out.println(cnt+"개의 레코드 수정 완료");
			}
			else System.out.println("수정한 데이터 없음");
		}
		catch(Exception e) {
			e.printStackTrace();
			}
		finally {
			try {
				if(pstmt!=null)pstmt.close();
				if(conn!=null)conn.close();
			}
			catch(Exception e) { System.out.println("닫기 에러");
			}
		}
	}

	public static void main(String[] args) {
		new UpdateTest();

	}

}
