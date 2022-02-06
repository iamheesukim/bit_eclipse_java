import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTextArea;

public class JSplitPaneTest extends JFrame{ //0713-1
	
	//'���� ������'�� ���ʿ� '���� ������'�� ���� ��.
	
	JSplitPane sp1;
	JSplitPane sp2;
	
	CalculatorEx2 cal = new CalculatorEx2();
	SwingCalendar2 calendar = new SwingCalendar2();
	
	JTextArea ta = new JTextArea();
	JScrollPane sp = new JScrollPane(ta);
	
	public JSplitPaneTest() {
		//����(���Ʒ�) ������
		//					������ ����	(����)				��	�Ʒ�
		sp2 = new JSplitPane(JSplitPane.VERTICAL_SPLIT,cal,calendar);
		
		//����(�¿�) ������ 
		//					������ ����(����)				��	��
		sp1 = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,sp2,sp);
		
		add(sp1);
		
		//��輱�� ��ġ ����
		sp2.setDividerLocation(350); //������ 350px
		sp1.setDividerLocation(800); //������ 800px
		
		//��輱�� �β� ����
		sp2.setDividerSize(1); //���� �����ִ� ���μ� 1px
		sp1.setDividerSize(20); //���� �����ִ� ���μ� 20px
		
		//����ġ
		sp1.setOneTouchExpandable(true);
		//�� �������� �ִ�� �� �� �ִ� ȭ��ǥ ����
		
		setSize(1000,800);
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
	}

	public static void main(String[] args) {
		new JSplitPaneTest();

	}

}
