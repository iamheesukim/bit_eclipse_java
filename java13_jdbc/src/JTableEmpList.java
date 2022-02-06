import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class JTableEmpList extends JFrame{ //0715-1 (0714 ���� ��)
	
	JTable table;
	JScrollPane sp;
	DefaultTableModel model;
	
	String title[] = {"�����", "�޿�", "���ʽ�", "�Ի���"};
	
	static { //��� ���������� ���๮�� ǥ���� �� �ִ� ����
		try {
			//����̺� �ε�
			Class.forName("oracle.jdbc.driver.OracleDriver");
		}
		catch(ClassNotFoundException cnfe) {
			System.out.println("jdbc ����̺� �ε� ����");
			cnfe.printStackTrace();
		}
	}
	
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	PreparedStatement ps;
	ResultSet rs;
	Connection conn;
	
	
	public JTableEmpList() {
		model = new DefaultTableModel(title,0);
	    table = new JTable(model);
	    sp = new JScrollPane(table);
		add(sp);
		//setTitle("������� (7/14 ����)");
		
		setSize(500,400);
	    setVisible(true);
	    setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	    
	    empAllSelect();
	}
	
	public void empAllSelect() {
		//����̺� �ε�
		try {
			//DB����
			conn = DriverManager.getConnection(url,"c##scott","tiger");
			//������
			String sql = "select ename,sal,comm,to_char(hiredate,'YYYY/MM/DD') from emp order by hiredate";
			//statement ����
			ps = conn.prepareStatement(sql);
			//����
			rs = ps.executeQuery();
			while(rs.next()) {
				String ename = rs.getString(1);
				int sal = rs.getInt(2);
				int comm = rs.getInt(3);
				String hiredate = rs.getString(4);
				Object[] emp = {ename,sal,comm,hiredate};
				//Object[] emp = {rs.getString(1), rs.getInt(2).. �̷������� �־ ����
			    model.addRow(emp);
			}
			
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		finally { //������ ����縻�� �ϴ� ����� �ؾ��ϴϱ�!
			try {
				//����
				if(rs!=null) rs.close();
				if(ps!=null) ps.close();
				if(conn!=null) conn.close();
			}
			catch (SQLException s) {
				System.out.println("�ݱ� ���� �߻�");
			}
		}
	}

	public static void main(String[] args) {
		new JTableEmpList();

	}

}
