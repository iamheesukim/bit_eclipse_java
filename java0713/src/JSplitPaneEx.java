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
		setResizable(false); //t:창 크기 조절 가능, f:고정
		
		//pm.setCanvasSize();
		//Thread t = new Thread(pm);
		//t.start();
		//여기서 setCanvasSizw를 해주고 스레드를 만들어도 되지만,
		//팩맨 클래스 자체에 새로운 메소드를 만들어줌
		pm.packmanStart(pm);
		
		//나는 첨에 시계 객체 생성을 DigitalClock2 clock = new DigitalClock2(); 이렇게 해서
		//스레드를 또 생성했어야함
		//(0,0) 넣은 뒤로 스레드가 있는 시계 생성자 메소드 실행
		//Thread t2 = new Thread(clock);
		//t2.start();
		
	}

	public static void main(String[] args) {
		new JSplitPaneEx();

	}

}
