import java.sql.CallableStatement;
import java.sql.Types;

public class InsertProcedure extends DBConnection { //0811-1

	public InsertProcedure() {
		try {
			//1. db연결
			dbConn();
			
			sql="{call mem_insert(?,?,?)}";
			CallableStatement cstmt = con.prepareCall(sql);
			
			cstmt.setString(1, "홍길동");
			cstmt.setString(2, "010-8888-9999");
			cstmt.registerOutParameter(3, Types.INTEGER);
			
			cstmt.executeUpdate();
			
			if(cstmt.getInt(3)==1) {
				System.out.println("레코드가 추가되었습니다.");
			}
			else System.out.println("레코드 추가 실패");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			dbClose();
		}
	}

	public static void main(String[] args) {
		new InsertProcedure();

	}

}


/*

0811.sql
create or replace procedure mem_insert(p_username in member.username%type, p_tel in member.tel%type, p_result out number)
is
begin
    --1:추가 / 0:추가실패
    p_result := 1;
    insert into member(mem_no, username, tel, write_date)
    values(memSq.nextVal, p_username, p_tel, sysdate);
    
    --레코드 추가시 에러가 발생하면,
    exception
        when others then
            p_result := 0;
end;

*/