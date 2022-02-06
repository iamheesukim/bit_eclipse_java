import java.awt.*;

public class FrameTest2 { //0629-2
	Frame frm = new Frame("제목"); //상속 안 받고 객체 생성해서 만듬
	Button btn = new Button("객체를 이용한 컨테이너 만들기");

	public FrameTest2() {
		frm.add(btn); //객체니까 앞에 frm. 붙임
		
		frm.setSize(500,300);
		frm.setVisible(true);
		
	}
	public static void main(String[] args) {
		new FrameTest2();
	}

}
