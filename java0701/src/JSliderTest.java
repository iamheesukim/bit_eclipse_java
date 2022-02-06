import java.awt.BorderLayout;
import java.util.Hashtable;
import java.util.*;

import javax.swing.JFrame;
import javax.swing.JSlider;
import javax.swing.*;

public class JSliderTest extends JFrame { //0701-2 swing
	JSlider s1 = new JSlider(JSlider.HORIZONTAL,0,100,40);
	JSlider s2 = new JSlider(JSlider.VERTICAL,0,100,50);

	public JSliderTest(){
		
		//s1�� �ɼ� ����
		s1.setMajorTickSpacing(10); //�ִ��� ǥ��
		s1.setMinorTickSpacing(2); //���� ����
		s1.setPaintTicks(true); //���� �����ֱ�
		s1.setPaintLabels(true); //�ִ��� �� ǥ��
		
		// s2
		// �� �����
		Hashtable<Integer,JLabel> ht = new Hashtable<Integer,JLabel>();
		//�׷����̱� ������ value���� ���ڰ� �״�� ������ ����.
		//�󺧿� �۾� �־��ְ� �� ���� value�� �־������
		ht.put(0, new JLabel("��"));
		ht.put(50,new JLabel("��"));
		ht.put(100,new JLabel("��"));
		
		s2.setMajorTickSpacing(50); //���ݰ���
		s2.setLabelTable(ht); //��������� �󺧼���
		s2.setPaintTicks(true); //���ݺ��̱�
		s2.setPaintLabels(true); //�󺧺��̱�
		
		s2.setSnapToTicks(true); //�ڵ� ���ݼ����� �̵��ϱ�
		
		
		add(BorderLayout.NORTH, s1);
		add(BorderLayout.WEST,s2);
		
		setSize(500,500);
		setVisible(true);
	}

	public static void main(String[] args) {
		new JSliderTest();

	}

}
