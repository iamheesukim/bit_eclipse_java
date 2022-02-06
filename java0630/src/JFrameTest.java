import java.awt.*;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.*;
								//default : BorderLayout
public class JFrameTest extends JFrame { //0630-1 ���� ���� �̾..!
	//�Ϲ� Frame�� ���̴�? x(����)��ư�� �۵���
	
	ImageIcon icon1 = new ImageIcon("img/img.png");
	ImageIcon icon2 = new ImageIcon("img/title2.png");
	ImageIcon icon3 = new ImageIcon("img/delight.png");
	
	public JFrameTest() {
		
		//JFrame�� �⺻ BorderLayout
		GridLayout layout = new GridLayout(3,2);
		//�� �� ���򰣰� ��������
		//3�� 2�� �׸��� ����
		//�׸���� â ũ�⸦ �ٲٸ� ��ư ����� ���� �ٲ�
		//�ϴ� 3���� ������ ��Ŵ
		setLayout(layout);
		
		
		JButton btn1 = new JButton("��ư1");
		add(btn1);
		JButton btn2 = new JButton(icon1);
		add(btn2);
		
		//���콺�� ��ư ���� ���� Ȱ��ȭ
		btn2.setPressedIcon(icon2);
		
		//���콺 ������ icon �ٲٱ� (��ư ���� ���콺 �ø��⸸ �ص� �̹��� �ٲ�)
		btn2.setRolloverIcon(icon3);
		
		
		JButton btn3 = new JButton("�ɺ�",icon1);
		add(btn3);
		//�̹���,�ɺ� �̷��� ����
		//â�� ������ �۾� �߷��� �Ⱥ���
		
		//��ư�� Ȱ��ȭ ��Ȱ��ȭ
		//setEnabled �⺻���� true
		btn3.setEnabled(false);
		//false�� �Ǹ� ��ư�� ��Ȱ��ȭ�ż� �ȴ���
		
		JButton btn4 = new JButton("�׹�° ��ư");
		add(btn4);
		
		//������ư
		JPanel pane = new JPanel(new GridLayout(3,1)); //�׵θ��� ���� �����̳�
		//Panel�� ������ �� ����!
		//3�� 1��¥�� �� ���� -> Frame�� �� Panel �ϳ��� ��°�� �ν�
		
		JRadioButton rBtn1 = new JRadioButton("ONE");
		JRadioButton rBtn2 = new JRadioButton("TWO");
		JRadioButton rBtn3 = new JRadioButton("THREE");
		
		//���� ��ư �׷� �����
		ButtonGroup bg = new ButtonGroup();
		bg.add(rBtn1);
		bg.add(rBtn2);
		bg.add(rBtn3);
		//ButtonGroup�� ������ �� ������ư���� ���ε��ζ�, ������ �۵���
		//�׷�ȭ�� �ϸ� �� ���� �� ������ư 3����, �ߺ� Ŭ�� X
		
		pane.add(rBtn1);
		pane.add(rBtn2);
		pane.add(rBtn3);
		
		add(pane);
		
		//��� ��ư
		//������ ���� ���� �����ϴ� ��ư
		JToggleButton tg = new JToggleButton("���",icon3);
		tg.setRolloverIcon(icon1); //�ø��� �ٲ�
		tg.setSelectedIcon(icon2); //������ �ٲ� ����
		
		add(tg);
		
		
		//�� �����
		JLabel lb = new JLabel("��ǥ��",JLabel.CENTER);
		//��ġ ���� ���ϸ� �⺻ ����
		add(lb);
		
		//���� ���� ���ϱ�
		btn1.setBackground(Color.ORANGE);
		
		//�⺻ ���� �߿� ������ Color ��ü�� ���� �����
		Color clr = new Color(100,100,200); //RGB
		tg.setBackground(clr);
		
		//���ڻ� �÷� �����ϱ�
		btn1.setForeground(Color.WHITE);
		
		//�󺧿� ���� �����ϱ�
		//���� �⺻������ ����� �����̶�, ���� ���� ó���� �����ؾ���
		lb.setOpaque(true); //true : ���� ó�� ����
		lb.setBackground(new Color(200,100,100));
		
		//Font : �۲�(����ü,����ü..), ��������(�����,���ϰ� ��), ����ũ��
		Font fnt = new Font("�ü�ü",Font.ITALIC+Font.BOLD,40);
		//ITALIC : ����
		//���� ���� ������ �����Ϸ���, +�� ����
		lb.setFont(fnt);
		
		
		
		
		setSize(1000,500); //â ũ��
		setVisible(true); //���������� true�� �����࿩��
		
		//���α׷��� ����Ǹ� �ڿ������ϰų�, ���α׷��� ������ �� ������ ����..
		
		//DISPOSE_ON_CLOSE : ���α׷� ���� �� �ڿ��� �����϶�
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		//DO_NOTHING_ON_CLOSE : �ݱⰡ ������� �ʴ´�.
		//setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
		
		//�и��� ��ŭ �Ͻ�����
		try {
			Thread.sleep(5000);
			} catch (InterruptedException e) {}
			//sleep�̶�� �޼ҵ�� ������ ����ó�� �������
		//5�� ��ŭ ���߰�, ���� ���๮�� �����.
		
		//��ư�� ��, Label�� ���� �����ϱ�
		btn1.setText("����� ��ư ��");
		lb.setText("����� ��");
		
		

		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new JFrameTest();

	}

}
