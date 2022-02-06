import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class CalculatorEx extends JFrame implements ActionListener{ //0702-1 ���� ���� ��
	Font fnt = new Font("����ü",Font.BOLD,25);
	
	JTextField tf = new JTextField("0.0");
	
	JPanel allBtnPane = new JPanel();
		JPanel northPane = new JPanel(new GridLayout(1,3));
		JPanel centerPane = new JPanel(new GridLayout(4,4));
		
	//��ư��� List
		String btnStr[] = {"BackSpace","Clear","End",
							"7","8","9","+",
							"4","5","6","-",
							"1","2","3","*",
							"0",".","=","/" };
		double result; //-.-
		String operator; //null
		
	public CalculatorEx() {
		setTitle("����");
		add(BorderLayout.NORTH,tf);
		tf.setHorizontalAlignment(JTextField.RIGHT);
		tf.setFont(fnt);
		
		add(allBtnPane);
		allBtnPane.setLayout(new BorderLayout());
		allBtnPane.add(BorderLayout.NORTH,northPane);
		allBtnPane.add(centerPane);
		
		//��ư�� JPanel�� �߰�
		for(int i=0; i<btnStr.length; i++) {
			JButton btn = new JButton(btnStr[i]);
			btn.setFont(fnt);
			btn.setBackground(Color.LIGHT_GRAY);
			if(i<=2) {
				northPane.add(btn);
			}
			else {
				centerPane.add(btn);
			}
			
			btn.addActionListener(this);
		}
		
		setSize(500,350);
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	}
	
	public void actionPerformed(ActionEvent ae) {
		JButton event = (JButton)ae.getSource();
		String btnLbl = event.getText();
		
		switch(btnLbl) {
		case "End" : //���α׷� ����
			System.exit(0);
			break;
		case "0": case "1": case "2": case "3": case"4":
		case "5": case "6": case "7": case "8": case"9":
			inNumber(btnLbl);
			break;
		case "BackSpace":
			setBackSpace();
			break;
		case ".":
			setPoint();
			break;
		case "+": case "-": case "*": case "/":
			setResultOperator(btnLbl);
			break;
		case "=":
			setResult();
			break;
		case "Clear":
			setClear();
		}
		
			
	}
	
	public void calcu (double second) {
		switch(operator) {
		case "+": result += second; break;
		case "-": result -= second; break;
		case "*": result *= second; break;
		case "/": result = result / second;
		}
	}
	
	//���ڹ�ư Ŭ�� ��
	public void inNumber(String btnLbl) {
		String tfTxt = tf.getText();
		if(tfTxt.equals("0.0")) { //�ʱⰪ 0.0�� �� ��� �̺�Ư �߻��� ��ư�� ���� ����
			tf.setText(btnLbl);
		}
		else {
			tf.setText(tfTxt+btnLbl);
		}
	}
	
	//backspace
	public void setBackSpace() {
		String str = tf.getText(); //4567
		int len = str.length(); //4
		String cutStr = str.substring(0,len-1); //456
		tf.setText(cutStr);
	}
	
	//"."����� ��
	public void setPoint() {
		String str = tf.getText();
		int idx = str.indexOf("."); //.�� ������ �ε��� ��ġ ����
		
		if(idx==-1) {
			tf.setText(str+".");
		}
	}
	
	//������ �������� ��
	public void setResultOperator(String btnLbl) {
		double second = Double.parseDouble(tf.getText());
		if(operator==null) { //ó������ ������ ����
			result = second;//tf�� ���� ����
		}
		else {
			//�̹� �����ڰ� ������ �������� tf���� ����Ͽ� result�� ����
			calcu(second);
		}
		operator = btnLbl; //�����ں���
		tf.setText("");//tf���� �ʱ�ȭ�Ѵ�.
	}
	
	//=�����ڰ� ���õǸ� result,operator,tf���� ���
	public void setResult() {
		double num2 = Double.parseDouble(tf.getText());
		calcu(num2);
		
		//����� tf�� �����ֱ�
		tf.setText(String.valueOf(result));
		operator=null;
	}
	
	//clear ��ư
	public void setClear() {
		result = 0.0;
		operator = null;
		tf.setText("0.0");
	}


	public static void main(String[] args) {
		new CalculatorEx();

	}

}
