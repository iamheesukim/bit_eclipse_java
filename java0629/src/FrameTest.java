import java.awt.*;
import java.awt.Frame;
import java.awt.Image;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.Toolkit;

// 컨테이너 Frame 상속받아 구현하기
public class FrameTest extends Frame{ //0629-1
	Point xy = new Point(500,300);
	Dimension wh = new Dimension(500,300);
	Rectangle rect = new Rectangle(100,100,400,400);
			
	public FrameTest() {
		//창의 제목
		//setTitle("프레임 생성 연습중");
		super("하위에서 제목 설정"); //Frame("하위에서 제목 설정");
		
		//창의 크기 (pixel)
		//setSize(500,400);
		//setSize(wh);
		
//		setBounds(200, 200, 500, 400); //x,y,w,h Rectangle
		setBounds(rect);
//		
//		setSize(500,500); //w,h Dimension 폭과 높이
//		setLocation(300,300); //x,y -> Point x좌표 좌표 (창이 열리는 위치)

		//타이틀바에 이미지 추가
		
		//이렇게 2줄로 써도 됌.
//		Toolkit tk = Toolkit.getDefaultToolkit();
//		Image icon = tk.getImage("img/img.png");
		
		Image icon = Toolkit.getDefaultToolkit().getImage("img/img.png");
		
		setIconImage(icon);
		
		
		//버튼의 위치는 5곳, 동서남북+센터
		Button btn = new Button("버튼");
		add(btn);
		//그냥 add하면 center
		
		Button btn1 = new Button("111111");
		Button btn2 = new Button("222222");
		Button btn3 = new Button("333333");
		Button btn4 = new Button("444444");
		
		//add(BorderLayout.NORTH, btn1); //북쪽에 btn1 추가
		add("South",btn2);
		add(BorderLayout.EAST, btn3);
		add(BorderLayout.WEST, btn4);
		
		
		//창을 화면에 보여주기
		setVisible(true); // t:보여줌 / f:안보여줌
		
	}

	public static void main(String[] args) {
		new FrameTest();
	}

}
