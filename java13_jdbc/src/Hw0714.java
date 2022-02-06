import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Hw0714 extends JFrame{ //0714 ����
	
	JTable table;
	JScrollPane sp;
	DefaultTableModel model;
	
	String title[] = {"�����", "�޿�", "���ʽ�", "�Ի���"};
	
	public Hw0714() {
		model = new DefaultTableModel(title,0);
	    table = new JTable(model);
	    sp = new JScrollPane(table);
		add(sp);
		setTitle("������� (7/14 ����)");
	    
		try {
			//����̺� �ε�
			Class.forName("oracle.jdbc.driver.OracleDriver");
		}
		catch(ClassNotFoundException cnfe) {
			System.out.println("jdbc ����̺� �ε� ���� : "+cnfe.getMessage());
			}
		
		try {
			//DB ����
			String dburl = "jdbc:oracle:thin:@localhost:1521:xe";
			Connection conn = DriverManager.getConnection(dburl,"c##scott","tiger");
			
			//������
			String sql = "select ename,sal,comm,to_char(hiredate,'YYYY/MM/DD') from emp";
			
			//PreparedStatement ��ü
			PreparedStatement ps = conn.prepareStatement(sql);
			
			//����
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				String ename = rs.getString(1);
				int sal = rs.getInt(2);
				int comm = rs.getInt(3);
				String hiredate = rs.getString(4);
				Object[] data = {ename,sal,comm,hiredate};
			    model.addRow(data);
			}
			
			//����
			rs.close();
			ps.close();
			conn.close();
		}
		catch (SQLException se) {
			System.out.println("DB ���� ���� �߻�");
		}

		
		setSize(500,400);
	    setVisible(true);
	    setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	}

	public static void main(String[] args) {
		new Hw0714();

	}

}
