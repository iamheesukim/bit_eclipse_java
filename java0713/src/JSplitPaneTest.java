import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTextArea;

public class JSplitPaneTest extends JFrame{ //0713-1
	
	//'수평 나누기'의 왼쪽에 '수직 나누기'를 넣을 것.
	
	JSplitPane sp1;
	JSplitPane sp2;
	
	CalculatorEx2 cal = new CalculatorEx2();
	SwingCalendar2 calendar = new SwingCalendar2();
	
	JTextArea ta = new JTextArea();
	JScrollPane sp = new JScrollPane(ta);
	
	public JSplitPaneTest() {
		//수직(위아래) 나누기
		//					나누기 형태	(수직)				위	아래
		sp2 = new JSplitPane(JSplitPane.VERTICAL_SPLIT,cal,calendar);
		
		//수평(좌우) 나누기 
		//					나누기 형태(수평)				왼	오
		sp1 = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,sp2,sp);
		
		add(sp1);
		
		//경계선의 위치 설정
		sp2.setDividerLocation(350); //위쪽이 350px
		sp1.setDividerLocation(800); //왼쪽이 800px
		
		//경계선의 두께 설정
		sp2.setDividerSize(1); //수직 나눠주는 가로선 1px
		sp1.setDividerSize(20); //수평 나눠주는 세로선 20px
		
		//원터치
		sp1.setOneTouchExpandable(true);
		//각 방향으로 최대로 갈 수 있는 화살표 생김
		
		setSize(1000,800);
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
	}

	public static void main(String[] args) {
		new JSplitPaneTest();

	}

}
