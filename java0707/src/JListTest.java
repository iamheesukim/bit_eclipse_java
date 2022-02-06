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
	
	//JList�� DefaultListModel�� ��������
	DefaultListModel<String> leftModel = new DefaultListModel<String>();
	JList<String> leftList = new JList<String>(leftModel);
	JScrollPane sp1 = new JScrollPane(leftList);
	
	DefaultListModel<String> rightModel = new DefaultListModel<String>();
	JList<String> rightList = new JList<String>(rightModel);
	JScrollPane sp2 = new JScrollPane(rightList);

	String data[] = {"���","����","����","���ξ���","�ٳ���","ü��","Ű��","������","�丶��","����"};
	String data2 = "���/����/ƫ��/�ڽ���/�ǵ���";
	
	public JListTest() {
		//leftModel�� ���
		for(int i=0;i<data.length;i++) {
			leftModel.addElement(data[i]);
		}
		
		//rightModel�� ���
		StringTokenizer st = new StringTokenizer(data2,"/");
		while(st.hasMoreTokens()) {
			rightModel.addElement(st.nextToken());
		}
		
		pane.add(leftBtn);
		//leftBtn.setLocation(EXIT_ON_CLOSE, ABORT)
		pane.add(rightBtn);
		add(pane);
		
//		//��ũ���� ���ٸ�
//		add(BorderLayout.WEST,leftList);
//		add(BorderLayout.EAST,rightList);
		add(BorderLayout.WEST,sp1);
		add(BorderLayout.EAST,sp2);
		
	      //�⺻
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
			listDataChanged(rightList, leftList); //�� <- ��
		}
		else if(event==rightBtn) {
			listDataChanged(leftList, rightList); //�� -> ��
		}
		
	}
	
	//							��������			�ű��
	public void listDataChanged(JList orgList, JList tarList) {
		DefaultListModel<String> orgModel = (DefaultListModel)orgList.getModel();
		DefaultListModel<String> tarModel = (DefaultListModel)tarList.getModel();
		//getModel()�� ��ȯ������ ListModel�̹Ƿ� addElement �޼ҵ带 ���ֱ� ���ؼ� DefaultListModel�� ����ȯ�� ���࿩�Ѵ�.
		
		List<String> list = orgList.getSelectedValuesList(); //���� ��� Ű�� �������� ���������� ���� 0 1 2
		for(int i=0; i<list.size(); i++) {
			tarModel.addElement(list.get(i)); //�߰�
			orgModel.removeElement(list.get(i)); //����
		}
	}
	
	
	
	public static void main(String[] args) {
		new JListTest();
	}
}
