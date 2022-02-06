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
		
		//s1에 옵션 설정
		s1.setMajorTickSpacing(10); //주눈금 표시
		s1.setMinorTickSpacing(2); //보조 눈금
		s1.setPaintTicks(true); //눈금 보여주기
		s1.setPaintLabels(true); //주눈금 라벨 표시
		
		// s2
		// 라벨 만들기
		Hashtable<Integer,JLabel> ht = new Hashtable<Integer,JLabel>();
		//그래픽이기 때문에 value값에 문자값 그대로 넣을순 없다.
		//라벨에 글씨 넣어주고 그 라벨을 value에 넣어줘야함
		ht.put(0, new JLabel("하"));
		ht.put(50,new JLabel("중"));
		ht.put(100,new JLabel("상"));
		
		s2.setMajorTickSpacing(50); //눈금간격
		s2.setLabelTable(ht); //사용자정의 라벨설정
		s2.setPaintTicks(true); //눈금보이기
		s2.setPaintLabels(true); //라벨보이기
		
		s2.setSnapToTicks(true); //자동 눈금선으로 이동하기
		
		
		add(BorderLayout.NORTH, s1);
		add(BorderLayout.WEST,s2);
		
		setSize(500,500);
		setVisible(true);
	}

	public static void main(String[] args) {
		new JSliderTest();

	}

}
