import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

public class PackMan extends JFrame implements KeyListener { //0709-1 (0708 과제 답안) swing
	
	MyCanvas mc = new MyCanvas();
	Dimension dim;
	
	//캔버스의 x좌표, y좌표
	int x,y;
	//이미지 포인트로 사용할 변수
	int p=0;
	
	public PackMan() {
		
		add(mc);
		
		setLocation(1350,300); //내가 편하려고 설정해둔 값
		setSize(500,500);
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		//캔버스의 크기를 구한다.
		dim = mc.getSize();
		//처음 좌표 위치는 정중앙
		x=(int)(dim.getWidth()/2-25); //getWidth 반환이 double이라 int로 형변환
		y=(int)(dim.getHeight()/2-25);
		
		//이벤트 등록
		mc.addKeyListener(this);
		
		//paint 메소드를 반복 호출
		while(true) {
			mc.repaint();
			//if(p==0) p++;
			//처음 짤 땐, 왼쪽의 경우만 생각해서 0101 이었지만,
			//왼오위아 다 생각하면 01 23 45 67 -> 짝홀
			if(p%2==0) p++;
			else p--;
			//증가 감소 증가 감소... 반복하면서 입이 껌뻑껌뻑하는 것처럼 보임
			
			// 좌표 이동
			if(p<=1) { //0또는 1로 설정해도 됨
				x -=5; //왼쪽으로 이동
				if(x<=-50) x=(int)dim.getWidth();
			}
			else if (p<=3) {
				x +=5; //오른쪽으로 이동
				if(x>=dim.getWidth()) x=-50;
			}
			else if (p<=5) {
				y -=5; //위쪽으로 이동
				if(y<=-50) y=(int)dim.getHeight();
			}
			else if (p<=7) {
				y +=5; //아래쪽으로 이동
				if(y>=dim.getHeight()) y=-50;
			}

			//시간 지연
			try {
				Thread.sleep(200);
			}catch(Exception e) {}
		}
	}
	
	class MyCanvas extends Canvas {
		Image packMan;
		MyCanvas() {
			packMan = Toolkit.getDefaultToolkit().getImage("img/packman.jpg");
		}
		
		public void paint(Graphics g) {
			//캔버스 크기와 위치를 먼저 정해주고, 그 캔버스에 이미지를 넣는다는 느낌
			//이미지의 좌표는 원본 이미지 기준으로 어디서부터 어디까지?
			//					캔버스의 좌표			이미지의 좌표
			//								p=0 0 0 50 50 왼
			//								p=1 50 0 100 50 왼
			//								p=2 100,0,150,50 오
			//								p=3 150,0,200,50 오
			g.drawImage(packMan, x,y,x+50,y+50, p*50,0,p*50+50,50, this);
		}
	}
	
	//키 이벤트
	@Override
	public void keyTyped(KeyEvent e) {
	}

	@Override
	public void keyPressed(KeyEvent e) {
	}

	@Override
	public void keyReleased(KeyEvent e) {
		int code = e.getKeyCode();
		if(code==KeyEvent.VK_LEFT || code==KeyEvent.VK_A) { //왼쪽
			p=0;
		}
		else if(code==KeyEvent.VK_RIGHT || code==KeyEvent.VK_D) { //오
			p=2;
		}
		else if(code==KeyEvent.VK_UP || code==KeyEvent.VK_W) { //위
			p=4;
		}
		else if(code==KeyEvent.VK_DOWN || code==KeyEvent.VK_S) { //아
			p=6;
		}
	}

	
	public static void main(String[] args) {
		new PackMan();

	}

}
