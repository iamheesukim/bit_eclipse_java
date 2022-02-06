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
		super("�Ǹ޴�");
		
		//tp = new JTabbedPane(JTabbedPane.TOP);
		tp = new JTabbedPane(JTabbedPane.LEFT);
		
		//�� �߰�
		lbl = new JLabel(ii);
		tp.addTab("���̺�",lbl);
		
		btn = new JButton(iii);
		tp.addTab("��ư",btn);
		
		tp.addTab("�ð�", dc);
		tp.addTab("����", cal);
		tp.addTab("�޷�", null, calendar, "�޷�");
		//null�� ���� �������� �ְ�ʹٸ� ������ ��ġ
		
		tp.addTab("�Ѹ�",pm);
		
		//�� ����
		tp.insertTab("Button", null, new JButton("�߰��� ��ư"), "�߰��� �Ǹ޴� �߰�",3);
		//tp.insertTab("�Ѹ�", null, pm, "�Ѹ�",4);
		
		//���� Ȱ��ȭ �� ��Ȱ��ȭ
		//t:Ȱ��ȭ f:��Ȱ��ȭ
		//				��,t or f
		//tp.setEnabledAt(2,false);
		//tp.setEnabled(false); //�� ��Ȱ��ȭ
	
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
//		//�� ����
//		tp.removeTabAt(3);
	}

	public static void main(String[] args) {
		new JTabbedPaneTest();

	}

}
