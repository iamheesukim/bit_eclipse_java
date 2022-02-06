import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class JTabbedPaneTest extends JFrame { //0712-3(5) swing
	JTabbedPane tp;
	JLabel lbl;
	ImageIcon ii = new ImageIcon("img/suho.png");
	
	JButton btn;
	ImageIcon iii = new ImageIcon("img/delight.png");
	
	DigitalClock2 dc = new DigitalClock2(0,0);
	CalculatorEx2 cal = new CalculatorEx2();
	SwingCalendar2 calendar = new SwingCalendar2();
	PackMan2 pm = new PackMan2();
	
	public JTabbedPaneTest() {
		super("탭메뉴");
		
		//tp = new JTabbedPane(JTabbedPane.TOP);
		tp = new JTabbedPane(JTabbedPane.LEFT);
		
		//탭 추가
		lbl = new JLabel(ii);
		tp.addTab("레이블",lbl);
		
		btn = new JButton(iii);
		tp.addTab("버튼",btn);
		
		tp.addTab("시계", dc);
		tp.addTab("계산기", cal);
		tp.addTab("달력", null, calendar, "달력");
		//null은 만약 아이콘을 넣고싶다면 아이콘 위치
		
		tp.addTab("팩맨",pm);
		
		//탭 삽입
		tp.insertTab("Button", null, new JButton("추가된 버튼"), "중간에 탭메뉴 추가",3);
		//tp.insertTab("팩맨", null, pm, "팩맨",4);
		
		//탭의 활성화 및 비활성화
		//t:활성화 f:비활성화
		//				탭,t or f
		//tp.setEnabledAt(2,false);
		//tp.setEnabled(false); //다 비활성화
	
		add(tp);
		setSize(500,500);
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);

		pm.setCanvasSize();
		Thread t = new Thread(pm);
		t.start();
		
//		try {
//			Thread.sleep(3000);
//		}
//		catch (Exception e) {}
//		
//		//탭 삭제
//		tp.removeTabAt(3);
	}

	public static void main(String[] args) {
		new JTabbedPaneTest();

	}

}
