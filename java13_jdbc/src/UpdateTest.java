import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateTest { //0715-3
	
	static { //��� ���������� ���๮�� ǥ���� �� �ִ� ����
		try {
			//����̺� �ε�
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
			//�μ��ڵ� 30�� �μ��� �ӱ޿��� 10% �λ��� �ݾ����� ������Ʈ�϶�
			conn = DriverManager.getConnection(url,userid,pwd);
			String sql = "update emp set sal=sal*1.1 where deptno=30";
			pstmt = conn.prepareStatement(sql);
			
			int cnt = pstmt.executeUpdate();
			//������Ʈ�� ���� ������ŭ ��
			
			if(cnt>0) {
				System.out.println(cnt+"���� ���ڵ� ���� �Ϸ�");
			}
			else System.out.println("������ ������ ����");
		}
		catch(Exception e) {
			e.printStackTrace();
			}
		finally {
			try {
				if(pstmt!=null)pstmt.close();
				if(conn!=null)conn.close();
			}
			catch(Exception e) { System.out.println("�ݱ� ����");
			}
		}
	}

	public static void main(String[] args) {
		new UpdateTest();

	}

}
