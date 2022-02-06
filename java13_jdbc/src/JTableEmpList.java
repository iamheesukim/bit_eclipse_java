import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class JTableEmpList extends JFrame{ //0715-1 (0714 과제 답)
	
	JTable table;
	JScrollPane sp;
	DefaultTableModel model;
	
	String title[] = {"사원명", "급여", "보너스", "입사일"};
	
	static { //멤버 영역이지만 실행문을 표기할 수 있는 영역
		try {
			//드라이브 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
		}
		catch(ClassNotFoundException cnfe) {
			System.out.println("jdbc 드라이브 로딩 실패");
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
		//setTitle("사원관리 (7/14 과제)");
		
		setSize(500,400);
	    setVisible(true);
	    setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	    
	    empAllSelect();
	}
	
	public void empAllSelect() {
		//드라이브 로딩
		try {
			//DB연결
			conn = DriverManager.getConnection(url,"c##scott","tiger");
			//쿼리문
			String sql = "select ename,sal,comm,to_char(hiredate,'YYYY/MM/DD') from emp order by hiredate";
			//statement 생성
			ps = conn.prepareStatement(sql);
			//실행
			rs = ps.executeQuery();
			while(rs.next()) {
				String ename = rs.getString(1);
				int sal = rs.getInt(2);
				int comm = rs.getInt(3);
				String hiredate = rs.getString(4);
				Object[] emp = {ename,sal,comm,hiredate};
				//Object[] emp = {rs.getString(1), rs.getInt(2).. 이런식으로 넣어도 ㅇㅋ
			    model.addRow(emp);
			}
			
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		finally { //에러가 생기든말든 일단 종료는 해야하니까!
			try {
				//종료
				if(rs!=null) rs.close();
				if(ps!=null) ps.close();
				if(conn!=null) conn.close();
			}
			catch (SQLException s) {
				System.out.println("닫기 예외 발생");
			}
		}
	}

	public static void main(String[] args) {
		new JTableEmpList();

	}

}
