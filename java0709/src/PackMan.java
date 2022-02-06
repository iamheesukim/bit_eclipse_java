import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

public class PackMan extends JFrame implements KeyListener { //0709-1 (0708 ���� ���) swing
	
	MyCanvas mc = new MyCanvas();
	Dimension dim;
	
	//ĵ������ x��ǥ, y��ǥ
	int x,y;
	//�̹��� ����Ʈ�� ����� ����
	int p=0;
	
	public PackMan() {
		
		add(mc);
		
		setLocation(1350,300); //���� ���Ϸ��� �����ص� ��
		setSize(500,500);
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		//ĵ������ ũ�⸦ ���Ѵ�.
		dim = mc.getSize();
		//ó�� ��ǥ ��ġ�� ���߾�
		x=(int)(dim.getWidth()/2-25); //getWidth ��ȯ�� double�̶� int�� ����ȯ
		y=(int)(dim.getHeight()/2-25);
		
		//�̺�Ʈ ���
		mc.addKeyListener(this);
		
		//paint �޼ҵ带 �ݺ� ȣ��
		while(true) {
			mc.repaint();
			//if(p==0) p++;
			//ó�� © ��, ������ ��츸 �����ؼ� 0101 �̾�����,
			//�޿����� �� �����ϸ� 01 23 45 67 -> ¦Ȧ
			if(p%2==0) p++;
			else p--;
			//���� ���� ���� ����... �ݺ��ϸ鼭 ���� ���������ϴ� ��ó�� ����
			
			// ��ǥ �̵�
			if(p<=1) { //0�Ǵ� 1�� �����ص� ��
				x -=5; //�������� �̵�
				if(x<=-50) x=(int)dim.getWidth();
			}
			else if (p<=3) {
				x +=5; //���������� �̵�
				if(x>=dim.getWidth()) x=-50;
			}
			else if (p<=5) {
				y -=5; //�������� �̵�
				if(y<=-50) y=(int)dim.getHeight();
			}
			else if (p<=7) {
				y +=5; //�Ʒ������� �̵�
				if(y>=dim.getHeight()) y=-50;
			}

			//�ð� ����
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
			//ĵ���� ũ��� ��ġ�� ���� �����ְ�, �� ĵ������ �̹����� �ִ´ٴ� ����
			//�̹����� ��ǥ�� ���� �̹��� �������� ��𼭺��� ������?
			//					ĵ������ ��ǥ			�̹����� ��ǥ
			//								p=0 0 0 50 50 ��
			//								p=1 50 0 100 50 ��
			//								p=2 100,0,150,50 ��
			//								p=3 150,0,200,50 ��
			g.drawImage(packMan, x,y,x+50,y+50, p*50,0,p*50+50,50, this);
		}
	}
	
	//Ű �̺�Ʈ
	@Override
	public void keyTyped(KeyEvent e) {
	}

	@Override
	public void keyPressed(KeyEvent e) {
	}

	@Override
	public void keyReleased(KeyEvent e) {
		int code = e.getKeyCode();
		if(code==KeyEvent.VK_LEFT || code==KeyEvent.VK_A) { //����
			p=0;
		}
		else if(code==KeyEvent.VK_RIGHT || code==KeyEvent.VK_D) { //��
			p=2;
		}
		else if(code==KeyEvent.VK_UP || code==KeyEvent.VK_W) { //��
			p=4;
		}
		else if(code==KeyEvent.VK_DOWN || code==KeyEvent.VK_S) { //��
			p=6;
		}
	}

	
	public static void main(String[] args) {
		new PackMan();

	}

}
