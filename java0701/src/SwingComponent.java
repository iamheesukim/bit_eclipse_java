import java.awt.Rectangle;
import java.awt.*;

import javax.swing.*;

public class SwingComponent { //0701-1 swing
	JFrame frm = new JFrame ("컴퍼넌트 연습중");
	Rectangle frmSize = new Rectangle(200,200,500,500);

	public SwingComponent() {
		frm.setTitle("Component");
		
		//JFrame -> FlowLayout을 변경
		frm.setLayout(new FlowLayout());
		
		//JTextField : 한줄의 문자열을 입력할 수 있는 컴퍼넌트
		JTextField tf = new JTextField(10); //10칸
		frm.add(tf);
		
		JTextField tf2 = new JTextField("ABCDEFG",20); //20칸, 기본으로 ABC.. 적혀있음
		
		//적혀있는 문구 바꿔보기
		tf2.setText("텍스트 필드의 값이 변경되었습니다.");
		try {
			String str1 = tf2.getText();
			String str2 = tf2.getText(2,3); //index, count
			System.out.println("str1-->"+str1); //이건 콘솔에 출력
			System.out.println("str2-->"+str2);
		}
		catch(Exception e) {}
		frm.add(tf2);
		
		//JPasswordField : 문자를 마크업 해준다
		JPasswordField pf = new JPasswordField(20);
		frm.add(pf);
		
		//JTextArea : 여러줄이 문자열을 입력하는 컴퍼넌트
		JTextArea ta = new JTextArea(5,30);
		JScrollPane sp = new JScrollPane(ta);
		//frm.add(ta);
		frm.add(sp); //내용이 많아지면 스크롤바 생김
		
		//JCheckBox : 여러개를 선택할 수 있는 컴퍼넌트
		JCheckBox cb1 = new JCheckBox("사과");
		JCheckBox cb2 = new JCheckBox("배",true); //true면 체크된 상태로 실행
		frm.add(cb1);
		frm.add(cb2);
		
		//JSlider : 스틱을 이용한 값 선택
		JSlider s1 = new JSlider(JSlider.HORIZONTAL, 1,10,5); //수평 1~10 기본5
		frm.add(s1);

		
		frm.setBounds(frmSize); //x y w h
		frm.setVisible(true);
		frm.setDefaultCloseOperation(frm.DISPOSE_ON_CLOSE);
	}

	public static void main(String[] args) {
		new SwingComponent();

	}

}
