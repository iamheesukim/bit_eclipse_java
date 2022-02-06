import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;

public class GraphicsTest extends JFrame { //0707-3 swing
	
	MyCanvas canvas = new MyCanvas();

	public GraphicsTest() {
		System.out.println("GraphicsTest");
		add(canvas);
		setSize(700,700);
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	}
	
	public class MyCanvas extends Canvas {
		public MyCanvas() {
			System.out.println("MyCanvas");
		}
		public void paint(Graphics g) {
			//g : 이 공간 안에서 그림을 그림
			
			//직선그리기
			g.drawLine(100, 100, 500, 500); //시작 xy 끝 xy
			
			//그림을 그리기 전에 색상 먼저 설정
			g.setColor(Color.red);
			g.drawLine(100, 500, 500, 100);
			
			g.drawOval(200, 200, 300, 300); //x y w h
			
			g.drawRect(200,200,300,300); //x t w h
			
			g.setColor(Color.green);
			g.fillOval(300, 300, 300, 300);
			g.fillRect(100, 100, 300, 300);
			
			g.setColor(Color.blue);
			int[] x = {100,170,250,50};
			int[] y = {50,50,230,200};
			g.drawPolygon(x,y,x.length);
		}
	}

	public static void main(String[] args) {
		new GraphicsTest();
	}

}
