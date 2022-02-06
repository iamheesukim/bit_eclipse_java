import java.util.Scanner;

public class DeleteTest extends DBConnection{ //0715-4
	
	public DeleteTest() {
		try {
			//이번에는 스캐너로
			Scanner scan = new Scanner(System.in);
			System.out.print("삭제할 사원명 = ");
			String name = scan.nextLine();
			
			//DB 연결
			dbConn(); //상속받은 DBConnection에 있음
			
			sql = "delete from emp where ename=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, name);
			
			int result = pstmt.executeUpdate();
			System.out.println(result+"개의 레코드가 삭제됨.");
			//없는 이름을 입력해도 에러는 아님. 단지 0개의 레코드가 삭제됨.
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			dbClose(); //상속받은 DBConnection에 있음
		}
		
	}

	public static void main(String[] args) {
		new DeleteTest();
	}

}
