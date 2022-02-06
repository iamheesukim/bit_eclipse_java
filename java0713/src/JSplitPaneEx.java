import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSplitPane;

public class JSplitPaneEx extends JFrame { //0713-2
	
	JSplitPane sp1;
	JSplitPane sp2;
	JSplitPane sp3;
	JSplitPane sp4;
	
	CalculatorEx2 cal = new CalculatorEx2();
	DigitalClock2 clock = new DigitalClock2(0,0);
	PackMan2 pm = new PackMan2();
	SwingCalendar2 calen = new SwingCalendar2();
	ImageIcon ii = new ImageIcon("img/dftf.png");
	JLabel lbl = new JLabel(ii);

	public JSplitPaneEx() {
		sp1 = new JSplitPane(JSplitPane.VERTICAL_SPLIT,clock,calen);
		sp2 = new JSplitPane(JSplitPane.VERTICAL_SPLIT,sp1,cal);
		
		sp3 = new JSplitPane(JSplitPane.VERTICAL_SPLIT,lbl,pm);
		sp4 = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,sp2,sp3);
		
		add(sp4);
		
		setSize(1200,1000);
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setResizable(false); //t:â ũ�� ���� ����, f:����
		
		//pm.setCanvasSize();
		//Thread t = new Thread(pm);
		//t.start();
		//���⼭ setCanvasSizw�� ���ְ� �����带 ���� ������,
		//�Ѹ� Ŭ���� ��ü�� ���ο� �޼ҵ带 �������
		pm.packmanStart(pm);
		
		//���� ÷�� �ð� ��ü ������ DigitalClock2 clock = new DigitalClock2(); �̷��� �ؼ�
		//�����带 �� �����߾����
		//(0,0) ���� �ڷ� �����尡 �ִ� �ð� ������ �޼ҵ� ����
		//Thread t2 = new Thread(clock);
		//t2.start();
		
	}

	public static void main(String[] args) {
		new JSplitPaneEx();

	}

}
