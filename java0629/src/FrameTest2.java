import java.awt.*;

public class FrameTest2 { //0629-2
	Frame frm = new Frame("����"); //��� �� �ް� ��ü �����ؼ� ����
	Button btn = new Button("��ü�� �̿��� �����̳� �����");

	public FrameTest2() {
		frm.add(btn); //��ü�ϱ� �տ� frm. ����
		
		frm.setSize(500,300);
		frm.setVisible(true);
		
	}
	public static void main(String[] args) {
		new FrameTest2();
	}

}
