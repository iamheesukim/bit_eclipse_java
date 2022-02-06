import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.StringTokenizer;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class JListTest extends JFrame implements ActionListener{ //0707-2 swing
	
	//JPanel pane = new JPanel(new GridLayout(2,1));
	JPanel pane = new JPanel();
	JButton leftBtn = new JButton("<--");
	JButton rightBtn = new JButton("-->");
	
	//JList는 DefaultListModel를 선언해줌
	DefaultListModel<String> leftModel = new DefaultListModel<String>();
	JList<String> leftList = new JList<String>(leftModel);
	JScrollPane sp1 = new JScrollPane(leftList);
	
	DefaultListModel<String> rightModel = new DefaultListModel<String>();
	JList<String> rightList = new JList<String>(rightModel);
	JScrollPane sp2 = new JScrollPane(rightList);

	String data[] = {"사과","포도","망고","파인애플","바나나","체리","키위","오렌지","토마토","수박"};
	String data2 = "장미/백합/튤립/코스모스/맨드라미";
	
	public JListTest() {
		//leftModel에 담기
		for(int i=0;i<data.length;i++) {
			leftModel.addElement(data[i]);
		}
		
		//rightModel에 담기
		StringTokenizer st = new StringTokenizer(data2,"/");
		while(st.hasMoreTokens()) {
			rightModel.addElement(st.nextToken());
		}
		
		pane.add(leftBtn);
		//leftBtn.setLocation(EXIT_ON_CLOSE, ABORT)
		pane.add(rightBtn);
		add(pane);
		
//		//스크롤이 없다면
//		add(BorderLayout.WEST,leftList);
//		add(BorderLayout.EAST,rightList);
		add(BorderLayout.WEST,sp1);
		add(BorderLayout.EAST,sp2);
		
	      //기본
	      setSize(400,500);
	      setVisible(true);
	      setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	      
	      leftBtn.addActionListener(this);
	      rightBtn.addActionListener(this);
	}



	@Override
	public void actionPerformed(ActionEvent ae) {
		Object event = ae.getSource();
		if(event==leftBtn) {
			listDataChanged(rightList, leftList); //왼 <- 오
		}
		else if(event==rightBtn) {
			listDataChanged(leftList, rightList); //왼 -> 오
		}
		
	}
	
	//							원데이터			옮길곳
	public void listDataChanged(JList orgList, JList tarList) {
		DefaultListModel<String> orgModel = (DefaultListModel)orgList.getModel();
		DefaultListModel<String> tarModel = (DefaultListModel)tarList.getModel();
		//getModel()의 반환형식이 ListModel이므로 addElement 메소드를 써주기 위해선 DefaultListModel로 형변환을 해줘여한다.
		
		List<String> list = orgList.getSelectedValuesList(); //만약 사과 키위 오렌지를 선택했으면 각각 0 1 2
		for(int i=0; i<list.size(); i++) {
			tarModel.addElement(list.get(i)); //추가
			orgModel.removeElement(list.get(i)); //삭제
		}
	}
	
	
	
	public static void main(String[] args) {
		new JListTest();
	}
}
