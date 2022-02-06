import java.sql.SQLException;

public class TransactionTest extends DBConnection{ //0715-5

	public TransactionTest() {
		
		//a_bank : 5000 ��� /  b_bank : 5000 �Ա�
		
		try {
			dbConn();
			
			//�ڵ� commit �����ϱ�
			con.setAutoCommit(false); //t:�ڵ�Ŀ�� f:�ڵ�Ŀ������
			
			int abank = -5000, bbank=5000;
			
			//���
			sql = "insert into a_bank(num,money) values (a_number.nextval,?)";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1,abank);
			int cnt = pstmt.executeUpdate();
			if(cnt>0) {
				System.out.println(Math.abs(abank)+"���� ��ݵǾ����ϴ�");
			}
			else System.out.println(Math.abs(abank)+"�� ����� �����߽��ϴ�");
			
			if(cnt>0) throw new Exception();
			//������ ����� catch�� ��
			
			//�Ա�
			sql = "insert into b_bank(num,money) values (b_number.nextval,?)";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1,bbank);
			int cnt2 = pstmt.executeUpdate();
			if(cnt>0) {
				System.out.println(Math.abs(abank)+"���� �ԱݵǾ����ϴ�");
			}
			else System.out.println(Math.abs(abank)+"�� �Ա��� �����߽��ϴ�");
			
			con.commit();
			//���� ������ Ŀ��
			
		} catch(Exception e) {
			e.printStackTrace();
			try {
				con.rollback();
				//����� ���� ������ ����� �ѹ�
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
