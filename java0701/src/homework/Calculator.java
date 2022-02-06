package homework;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Calculator extends JFrame implements ActionListener {
	JLabel lb = new JLabel("0.0",JLabel.RIGHT);
	JPanel mainpan = new JPanel(new BorderLayout());
	JPanel pane1 = new JPanel(new GridLayout(1,3));
	JPanel pane2 = new JPanel(new GridLayout(4,4));
	JButton btn1 = new JButton("BackSpace");
	JButton btn2 = new JButton("Clear");
	JButton btn3 = new JButton("End");
	//JButton numbtn = new JButton(num[i]);
	String inputnum="";
	double result;

	public Calculator() {
		//��� ��
		add(lb,BorderLayout.NORTH);
		
		//�߾� ��ư��
		add(mainpan);
		
		//��ư ù�� 1x3
		mainpan.add(pane1,BorderLayout.NORTH);
		JButton btn1 = new JButton("BackSpace");
		JButton btn2 = new JButton("Clear");
		JButton btn3 = new JButton("End");
		pane1.add(btn1);
		pane1.add(btn2);
		pane1.add(btn3);
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);
		
		//��ư ������ 4x4
		mainpan.add(pane2);
		
		String[] num = {"7","8","9","+","4","5","6","-","1","2","3","*","0",".","=","/"};
		for(int i=0;i<num.length;i++) {
			JButton numbtn = new JButton(num[i]);
			pane2.add(numbtn);
			numbtn.setBackground(Color.lightGray);
			numbtn.addActionListener(this);
		}
		
		setSize(500,300);
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	}
		
	public void actionPerformed(ActionEvent ae) {
		//Object obj = ae.getSource();
		String event = ae.getActionCommand();
		
		if(event.equals("BackSpace")) {
			//System.out.println("1 ����");
			//������ ���ڿ��� �����(?)
			}
		else if(event.equals("Clear")) {
			lb.setText("0.0");
			}
		else if(event.equals("End")) System.exit(0);
		else if(event.equals("=")) {
			double result = Double.valueOf(inputnum);
			//3+3 ������ ���ڷ� �ν� �Ұ���,,
			System.out.println(result);
			inputnum="";
			
			//�̰��ؾ� ������ �����ٵ�,,
		}
		else {
			Calculate(event);
			lb.setText(inputnum);
			System.out.println("������ ����");
			}
	}

	public void Calculate(String event) {
		inputnum = inputnum+event;
	}

	public static void main(String[] args) {
		new Calculator();

	}


}
