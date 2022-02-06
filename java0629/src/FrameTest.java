import java.awt.*;
import java.awt.Frame;
import java.awt.Image;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.Toolkit;

// �����̳� Frame ��ӹ޾� �����ϱ�
public class FrameTest extends Frame{ //0629-1
	Point xy = new Point(500,300);
	Dimension wh = new Dimension(500,300);
	Rectangle rect = new Rectangle(100,100,400,400);
			
	public FrameTest() {
		//â�� ����
		//setTitle("������ ���� ������");
		super("�������� ���� ����"); //Frame("�������� ���� ����");
		
		//â�� ũ�� (pixel)
		//setSize(500,400);
		//setSize(wh);
		
//		setBounds(200, 200, 500, 400); //x,y,w,h Rectangle
		setBounds(rect);
//		
//		setSize(500,500); //w,h Dimension ���� ����
//		setLocation(300,300); //x,y -> Point x��ǥ ��ǥ (â�� ������ ��ġ)

		//Ÿ��Ʋ�ٿ� �̹��� �߰�
		
		//�̷��� 2�ٷ� �ᵵ ��.
//		Toolkit tk = Toolkit.getDefaultToolkit();
//		Image icon = tk.getImage("img/img.png");
		
		Image icon = Toolkit.getDefaultToolkit().getImage("img/img.png");
		
		setIconImage(icon);
		
		
		//��ư�� ��ġ�� 5��, ��������+����
		Button btn = new Button("��ư");
		add(btn);
		//�׳� add�ϸ� center
		
		Button btn1 = new Button("111111");
		Button btn2 = new Button("222222");
		Button btn3 = new Button("333333");
		Button btn4 = new Button("444444");
		
		//add(BorderLayout.NORTH, btn1); //���ʿ� btn1 �߰�
		add("South",btn2);
		add(BorderLayout.EAST, btn3);
		add(BorderLayout.WEST, btn4);
		
		
		//â�� ȭ�鿡 �����ֱ�
		setVisible(true); // t:������ / f:�Ⱥ�����
		
	}

	public static void main(String[] args) {
		new FrameTest();
	}

}
