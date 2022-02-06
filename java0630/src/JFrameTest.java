import java.awt.*;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.*;
								//default : BorderLayout
public class JFrameTest extends JFrame { //0630-1 어제 배운거 이어서..!
	//일반 Frame과 차이는? x(종료)버튼이 작동함
	
	ImageIcon icon1 = new ImageIcon("img/img.png");
	ImageIcon icon2 = new ImageIcon("img/title2.png");
	ImageIcon icon3 = new ImageIcon("img/delight.png");
	
	public JFrameTest() {
		
		//JFrame은 기본 BorderLayout
		GridLayout layout = new GridLayout(3,2);
		//행 열 수평간격 수직간격
		//3행 2열 그리드 생성
		//그리드는 창 크기를 바꾸면 버튼 사이즈도 같이 바뀜
		//일단 3행은 무조건 지킴
		setLayout(layout);
		
		
		JButton btn1 = new JButton("버튼1");
		add(btn1);
		JButton btn2 = new JButton(icon1);
		add(btn2);
		
		//마우스로 버튼 누를 때만 활성화
		btn2.setPressedIcon(icon2);
		
		//마우스 오버시 icon 바꾸기 (버튼 위에 마우스 올리기만 해도 이미지 바뀜)
		btn2.setRolloverIcon(icon3);
		
		
		JButton btn3 = new JButton("꽃병",icon1);
		add(btn3);
		//이미지,꽃병 이렇게 보임
		//창이 작으면 글씨 잘려서 안보임
		
		//버튼을 활성화 비활성화
		//setEnabled 기본값이 true
		btn3.setEnabled(false);
		//false가 되면 버튼이 비활성화돼서 안눌림
		
		JButton btn4 = new JButton("네번째 버튼");
		add(btn4);
		
		//라디오버튼
		JPanel pane = new JPanel(new GridLayout(3,1)); //테두리가 없는 컨테이너
		//Panel은 일종의 한 묶음!
		//3행 1열짜리 한 묶음 -> Frame엔 이 Panel 하나를 통째로 인식
		
		JRadioButton rBtn1 = new JRadioButton("ONE");
		JRadioButton rBtn2 = new JRadioButton("TWO");
		JRadioButton rBtn3 = new JRadioButton("THREE");
		
		//라디오 버튼 그룹 만들기
		ButtonGroup bg = new ButtonGroup();
		bg.add(rBtn1);
		bg.add(rBtn2);
		bg.add(rBtn3);
		//ButtonGroup이 없으면 각 라디오버튼마다 따로따로라서, 별개로 작동함
		//그룹화를 하면 한 묶음 안 라디오버튼 3개라서, 중복 클릭 X
		
		pane.add(rBtn1);
		pane.add(rBtn2);
		pane.add(rBtn3);
		
		add(pane);
		
		//토글 버튼
		//누르면 누른 상태 유지하는 버튼
		JToggleButton tg = new JToggleButton("토글",icon3);
		tg.setRolloverIcon(icon1); //올리면 바뀜
		tg.setSelectedIcon(icon2); //누르면 바뀜 유지
		
		add(tg);
		
		
		//라벨 만들기
		JLabel lb = new JLabel("라벨표시",JLabel.CENTER);
		//위치 설정 안하면 기본 왼쪽
		add(lb);
		
		//배경색 색상 정하기
		btn1.setBackground(Color.ORANGE);
		
		//기본 색상 중에 없으면 Color 객체를 만들어서 사용함
		Color clr = new Color(100,100,200); //RGB
		tg.setBackground(clr);
		
		//글자색 컬러 설정하기
		btn1.setForeground(Color.WHITE);
		
		//라벨에 배경색 설정하기
		//라벨은 기본적으로 배경이 투명이라서, 먼저 투명 처리를 해제해야함
		lb.setOpaque(true); //true : 투명 처리 해제
		lb.setBackground(new Color(200,100,100));
		
		//Font : 글꼴(굴림체,돋움체..), 글자유형(기울임,진하게 등), 글자크기
		Font fnt = new Font("궁서체",Font.ITALIC+Font.BOLD,40);
		//ITALIC : 기울게
		//여러 글자 유형을 지정하려면, +로 연결
		lb.setFont(fnt);
		
		
		
		
		setSize(1000,500); //창 크기
		setVisible(true); //최종적으로 true로 보여줘여함
		
		//프로그램이 종료되면 자원해제하거나, 프로그램을 종료할 수 없도록 설정..
		
		//DISPOSE_ON_CLOSE : 프로그램 종료 시 자원을 해제하라
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		//DO_NOTHING_ON_CLOSE : 닫기가 수행되지 않는다.
		//setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
		
		//밀리초 만큼 일시정지
		try {
			Thread.sleep(5000);
			} catch (InterruptedException e) {}
			//sleep이라는 메소드는 무조건 예외처리 해줘야함
		//5초 만큼 멈추고, 이후 실행문이 실행됨.
		
		//버튼의 라벨, Label의 라벨을 변경하기
		btn1.setText("변경된 버튼 라벨");
		lb.setText("변경된 라벨");
		
		

		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new JFrameTest();

	}

}
