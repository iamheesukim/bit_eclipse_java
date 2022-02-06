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
		JButton btn1 = new JButton("원본 이미지");
		JButton btn2 = new JButton("축소");
		JButton btn3 = new JButton("확대");
		JButton btn4 = new JButton("좌우반전");
		JButton btn5 = new JButton("상하반전");
		JButton btn6 = new JButton("일부 그리기");
		
	Image img;
	MyCanvas mc = new MyCanvas();
	
	//선택한 버튼의 정보를 저장할 변수
	String selectBtn = "원본 이미지";
	

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
		mc.repaint();//paint()메소드 호출
	}
	
	public class MyCanvas extends Canvas {
		
		public MyCanvas() {
			img = Toolkit.getDefaultToolkit().getImage("img/suho.png");
			
		}
		
		public void paint(Graphics g) {
			//이미지를 '그림으로 그린다'라고 생각하고 갖고올 수 캔버스에 갖고옴
			
			//이미지 크기 구하기 : 반드시 paint() 안에서 구해야함.
			int imgW = img.getWidth(this);
			int imgH = img.getHeight(this);
			
			if(selectBtn.equals("원본 이미지")) { //원본으로 그리기
				g.drawImage(img,1,1,this);
			}
			else if(selectBtn.equals("축소")) {
				g.drawImage(img,1,1,imgW/2,imgH/2,this);
			}
			else if(selectBtn.equals("확대")) {
				g.drawImage(img,1,1,imgW*2,imgH*2,this);
			}
			else if(selectBtn.equals("좌우반전")) {
				//				 캔버스크기				이미지
				g.drawImage(img, 1,1,imgW,imgH,		imgW,1,1,imgH, this);
			}
			else if(selectBtn.equals("상하반전")) {
				g.drawImage(img, 1,1,imgW,imgH, 	1,imgH,imgW,1,	this);
			}
			else if(selectBtn.equals("일부 그리기")) {
				g.drawImage(img, 1,1,imgW/2,imgH/2,		imgW/5,imgH/5,imgW/2,imgH/2,	this);
			}
			
		}
		
		//repaint() -> update() -> paint();
		//repaint() -> paint();
//		public void update(Graphics g) {
//			paint(g);
//		}
		//이전 그림들이 차곡차곡 쌓임
	}


	public static void main(String[] args) {
		new ImageDrawTest();
	}

}