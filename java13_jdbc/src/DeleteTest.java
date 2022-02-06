import java.util.Scanner;

public class DeleteTest extends DBConnection{ //0715-4
	
	public DeleteTest() {
		try {
			//�̹����� ��ĳ�ʷ�
			Scanner scan = new Scanner(System.in);
			System.out.print("������ ����� = ");
			String name = scan.nextLine();
			
			//DB ����
			dbConn(); //��ӹ��� DBConnection�� ����
			
			sql = "delete from emp where ename=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, name);
			
			int result = pstmt.executeUpdate();
			System.out.println(result+"���� ���ڵ尡 ������.");
			//���� �̸��� �Է��ص� ������ �ƴ�. ���� 0���� ���ڵ尡 ������.
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			dbClose(); //��ӹ��� DBConnection�� ����
		}
		
	}

	public static void main(String[] args) {
		new DeleteTest();
	}

}
