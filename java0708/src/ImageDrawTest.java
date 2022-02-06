import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ImageDrawTest extends JFrame implements ActionListener{ //0708-2 swing
	JPanel pane = new JPanel();
		JButton btn1 = new JButton("���� �̹���");
		JButton btn2 = new JButton("���");
		JButton btn3 = new JButton("Ȯ��");
		JButton btn4 = new JButton("�¿����");
		JButton btn5 = new JButton("���Ϲ���");
		JButton btn6 = new JButton("�Ϻ� �׸���");
		
	Image img;
	MyCanvas mc = new MyCanvas();
	
	//������ ��ư�� ������ ������ ����
	String selectBtn = "���� �̹���";
	

	public ImageDrawTest() {
		add(BorderLayout.NORTH,pane);
		pane.add(btn1);
		pane.add(btn2);
		pane.add(btn3);
		pane.add(btn4);
		pane.add(btn5);
		pane.add(btn6);
		
		add(mc);
		
		setSize(700,700);
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);
		btn4.addActionListener(this);
		btn5.addActionListener(this);
		btn6.addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent ae) {
		selectBtn = ae.getActionCommand();
		mc.repaint();//paint()�޼ҵ� ȣ��
	}
	
	public class MyCanvas extends Canvas {
		
		public MyCanvas() {
			img = Toolkit.getDefaultToolkit().getImage("img/suho.png");
			
		}
		
		public void paint(Graphics g) {
			//�̹����� '�׸����� �׸���'��� �����ϰ� ����� �� ĵ������ �����
			
			//�̹��� ũ�� ���ϱ� : �ݵ�� paint() �ȿ��� ���ؾ���.
			int imgW = img.getWidth(this);
			int imgH = img.getHeight(this);
			
			if(selectBtn.equals("���� �̹���")) { //�������� �׸���
				g.drawImage(img,1,1,this);
			}
			else if(selectBtn.equals("���")) {
				g.drawImage(img,1,1,imgW/2,imgH/2,this);
			}
			else if(selectBtn.equals("Ȯ��")) {
				g.drawImage(img,1,1,imgW*2,imgH*2,this);
			}
			else if(selectBtn.equals("�¿����")) {
				//				 ĵ����ũ��				�̹���
				g.drawImage(img, 1,1,imgW,imgH,		imgW,1,1,imgH, this);
			}
			else if(selectBtn.equals("���Ϲ���")) {
				g.drawImage(img, 1,1,imgW,imgH, 	1,imgH,imgW,1,	this);
			}
			else if(selectBtn.equals("�Ϻ� �׸���")) {
				g.drawImage(img, 1,1,imgW/2,imgH/2,		imgW/5,imgH/5,imgW/2,imgH/2,	this);
			}
			
		}
		
		//repaint() -> update() -> paint();
		//repaint() -> paint();
//		public void update(Graphics g) {
//			paint(g);
//		}
		//���� �׸����� �������� ����
	}


	public static void main(String[] args) {
		new ImageDrawTest();
	}

}