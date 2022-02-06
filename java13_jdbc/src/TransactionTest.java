import java.sql.SQLException;

public class TransactionTest extends DBConnection{ //0715-5

	public TransactionTest() {
		
		//a_bank : 5000 출금 /  b_bank : 5000 입금
		
		try {
			dbConn();
			
			//자동 commit 해제하기
			con.setAutoCommit(false); //t:자동커밋 f:자동커밋해제
			
			int abank = -5000, bbank=5000;
			
			//출금
			sql = "insert into a_bank(num,money) values (a_number.nextval,?)";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1,abank);
			int cnt = pstmt.executeUpdate();
			if(cnt>0) {
				System.out.println(Math.abs(abank)+"원이 출금되었습니다");
			}
			else System.out.println(Math.abs(abank)+"원 출금이 실패했습니다");
			
			if(cnt>0) throw new Exception();
			//에러가 생기면 catch로 감
			
			//입금
			sql = "insert into b_bank(num,money) values (b_number.nextval,?)";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1,bbank);
			int cnt2 = pstmt.executeUpdate();
			if(cnt>0) {
				System.out.println(Math.abs(abank)+"원이 입금되었습니다");
			}
			else System.out.println(Math.abs(abank)+"원 입금이 실패했습니다");
			
			con.commit();
			//에러 없으면 커밋
			
		} catch(Exception e) {
			e.printStackTrace();
			try {
				con.rollback();
				//입출금 어디라도 에러가 생기면 롤백
			} catch (SQLException ee) {
				ee.printStackTrace();
			}
		}
		finally {
			dbClose();
		}
	}

	public static void main(String[] args) {
		new TransactionTest();

	}

}
