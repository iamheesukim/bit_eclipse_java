import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Hw0714 extends JFrame{ //0714 과제
	
	JTable table;
	JScrollPane sp;
	DefaultTableModel model;
	
	String title[] = {"사원명", "급여", "보너스", "입사일"};
	
	public Hw0714() {
		model = new DefaultTableModel(title,0);
	    table = new JTable(model);
	    sp = new JScrollPane(table);
		add(sp);
		setTitle("사원관리 (7/14 과제)");
	    
		try {
			//드라이브 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
		}
		catch(ClassNotFoundException cnfe) {
			System.out.println("jdbc 드라이브 로딩 실패 : "+cnfe.getMessage());
			}
		
		try {
			//DB 연결
			String dburl = "jdbc:oracle:thin:@localhost:1521:xe";
			Connection conn = DriverManager.getConnection(dburl,"c##scott","tiger");
			
			//쿼리문
			String sql = "select ename,sal,comm,to_char(hiredate,'YYYY/MM/DD') from emp";
			
			//PreparedStatement 객체
			PreparedStatement ps = conn.prepareStatement(sql);
			
			//실행
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				String ename = rs.getString(1);
				int sal = rs.getInt(2);
				int comm = rs.getInt(3);
				String hiredate = rs.getString(4);
				Object[] data = {ename,sal,comm,hiredate};
			    model.addRow(data);
			}
			
			//종료
			rs.close();
			ps.close();
			conn.close();
		}
		catch (SQLException se) {
			System.out.println("DB 연결 에러 발생");
		}

		
		setSize(500,400);
	    setVisible(true);
	    setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	}

	public static void main(String[] args) {
		new Hw0714();

	}

}
