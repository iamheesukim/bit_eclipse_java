import java.awt.Rectangle;
import java.awt.*;

import javax.swing.*;

public class SwingComponent { //0701-1 swing
	JFrame frm = new JFrame ("���۳�Ʈ ������");
	Rectangle frmSize = new Rectangle(200,200,500,500);

	public SwingComponent() {
		frm.setTitle("Component");
		
		//JFrame -> FlowLayout�� ����
		frm.setLayout(new FlowLayout());
		
		//JTextField : ������ ���ڿ��� �Է��� �� �ִ� ���۳�Ʈ
		JTextField tf = new JTextField(10); //10ĭ
		frm.add(tf);
		
		JTextField tf2 = new JTextField("ABCDEFG",20); //20ĭ, �⺻���� ABC.. ��������
		
		//�����ִ� ���� �ٲ㺸��
		tf2.setText("�ؽ�Ʈ �ʵ��� ���� ����Ǿ����ϴ�.");
		try {
			String str1 = tf2.getText();
			String str2 = tf2.getText(2,3); //index, count
			System.out.println("str1-->"+str1); //�̰� �ֿܼ� ���
			System.out.println("str2-->"+str2);
		}
		catch(Exception e) {}
		frm.add(tf2);
		
		//JPasswordField : ���ڸ� ��ũ�� ���ش�
		JPasswordField pf = new JPasswordField(20);
		frm.add(pf);
		
		//JTextArea : �������� ���ڿ��� �Է��ϴ� ���۳�Ʈ
		JTextArea ta = new JTextArea(5,30);
		JScrollPane sp = new JScrollPane(ta);
		//frm.add(ta);
		frm.add(sp); //������ �������� ��ũ�ѹ� ����
		
		//JCheckBox : �������� ������ �� �ִ� ���۳�Ʈ
		JCheckBox cb1 = new JCheckBox("���");
		JCheckBox cb2 = new JCheckBox("��",true); //true�� üũ�� ���·� ����
		frm.add(cb1);
		frm.add(cb2);
		
		//JSlider : ��ƽ�� �̿��� �� ����
		JSlider s1 = new JSlider(JSlider.HORIZONTAL, 1,10,5); //���� 1~10 �⺻5
		frm.add(s1);

		
		frm.setBounds(frmSize); //x y w h
		frm.setVisible(true);
		frm.setDefaultCloseOperation(frm.DISPOSE_ON_CLOSE);
	}

	public static void main(String[] args) {
		new SwingComponent();

	}

}
