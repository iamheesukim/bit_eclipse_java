import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;

import javax.swing.JFrame;

public class MouseAdapterTest2 extends JFrame { //0709-3(4����) �ܺ�Ŭ������ ���콺�̺�Ʈ

	
	MyCanvas mc = new MyCanvas();
	
	public MouseAdapterTest2() {
		add(mc);
		setSize(500,500);
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		mc.addMouseListener(new CanvasAapterTest(mc));
	}
	
	public class MyCanvas extends Canvas{
		int x,y;
		public void paint(Graphics g) {
			Random ran = new Random();
			g.setColor(new Color(ran.nextInt(256), ran.nextInt(256), ran.nextInt(256)));
			g.fillOval(x-25, y-25, 50,50);
		}
		
		public void update(Graphics g) {
			paint(g);
		}
		
	}
		


	public static void main(String[] args) {
		new MouseAdapterTest2();

	}

}
