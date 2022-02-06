import java.awt.Canvas;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JFrame;

public class GraphicsTest extends JFrame { //0707 이어서 0708-1 swing
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
			
			//여기부터 오늘 추가한 내용
			
			//모서리가 둥근 사각형
			g.drawRoundRect(300,300,500,500,50,50);
			
			//문자를 그리기
			String txt = "JAVA 프로그래밍";
			g.setColor(Color.magenta);
			g.setFont(new Font("굴림체",Font.BOLD,40));
			g.drawString(txt, 100, 200);
		}
		
	}

	public static void main(String[] args) {
		new GraphicsTest();

	}

}
