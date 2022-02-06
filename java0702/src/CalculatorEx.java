import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class CalculatorEx extends JFrame implements ActionListener{ //0702-1 어제 과제 답
	Font fnt = new Font("굴림체",Font.BOLD,25);
	
	JTextField tf = new JTextField("0.0");
	
	JPanel allBtnPane = new JPanel();
		JPanel northPane = new JPanel(new GridLayout(1,3));
		JPanel centerPane = new JPanel(new GridLayout(4,4));
		
	//버튼목록 List
		String btnStr[] = {"BackSpace","Clear","End",
							"7","8","9","+",
							"4","5","6","-",
							"1","2","3","*",
							"0",".","=","/" };
		double result; //-.-
		String operator; //null
		
	public CalculatorEx() {
		setTitle("계산기");
		add(BorderLayout.NORTH,tf);
		tf.setHorizontalAlignment(JTextField.RIGHT);
		tf.setFont(fnt);
		
		add(allBtnPane);
		allBtnPane.setLayout(new BorderLayout());
		allBtnPane.add(BorderLayout.NORTH,northPane);
		allBtnPane.add(centerPane);
		
		//버튼을 JPanel에 추가
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
		case "End" : //프로그램 종료
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
	
	//숫자버튼 클릭 시
	public void inNumber(String btnLbl) {
		String tfTxt = tf.getText();
		if(tfTxt.equals("0.0")) { //초기값 0.0일 땐 방금 이벤특 발생한 버튼의 값을 셋팅
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
	
	//"."찍었을 때
	public void setPoint() {
		String str = tf.getText();
		int idx = str.indexOf("."); //.가 있으면 인덱스 위치 구함
		
		if(idx==-1) {
			tf.setText(str+".");
		}
	}
	
	//연산자 선택했을 때
	public void setResultOperator(String btnLbl) {
		double second = Double.parseDouble(tf.getText());
		if(operator==null) { //처음으로 연산자 선택
			result = second;//tf의 값을 보관
		}
		else {
			//이미 연산자가 있으면 보관값과 tf값을 계산하여 result에 보관
			calcu(second);
		}
		operator = btnLbl; //연산자보관
		tf.setText("");//tf값을 초기화한다.
	}
	
	//=연산자가 선택되면 result,operator,tf값을 계산
	public void setResult() {
		double num2 = Double.parseDouble(tf.getText());
		calcu(num2);
		
		//결과를 tf에 보여주기
		tf.setText(String.valueOf(result));
		operator=null;
	}
	
	//clear 버튼
	public void setClear() {
		result = 0.0;
		operator = null;
		tf.setText("0.0");
	}


	public static void main(String[] args) {
		new CalculatorEx();

	}

}
