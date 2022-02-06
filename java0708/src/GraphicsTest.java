import java.awt.Canvas;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JFrame;

public class GraphicsTest extends JFrame { //0707 �̾ 0708-1 swing
	MyCanvas canvas = new MyCanvas();
	
	public GraphicsTest() {
		add(canvas);
		setSize(700,700);
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	}
	
	public class MyCanvas extends Canvas {
		
		public MyCanvas() {
		}
		
		public void paint(Graphics g) {
			
			//������� ���� �߰��� ����
			
			//�𼭸��� �ձ� �簢��
			g.drawRoundRect(300,300,500,500,50,50);
			
			//���ڸ� �׸���
			String txt = "JAVA ���α׷���";
			g.setColor(Color.magenta);
			g.setFont(new Font("����ü",Font.BOLD,40));
			g.drawString(txt, 100, 200);
		}
		
	}

	public static void main(String[] args) {
		new GraphicsTest();

	}

}
