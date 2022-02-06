import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JComboBox;
import javax.swing.JDesktopPane;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JToggleButton;
import javax.swing.JToolBar;

public class JInternalFrameTest extends JFrame implements ActionListener{ //0713-3 �̾ 0714-1
	JDesktopPane dp = new JDesktopPane();
	JInternalFrame if1, if2, if3;
	
	ImageIcon openii = new ImageIcon("img/open01.gif");
	ImageIcon saveii = new ImageIcon("img/save01.gif");
	JToolBar tb = new JToolBar();
		JButton openBtn = new JButton(openii);
		JButton saveBtn = new JButton(saveii);
		JButton foreColor = new JButton("���ڻ�");
		
	//�۲� ��ư
	JToggleButton boldBtn = new JToggleButton("A"); //���ϰ�
	JToggleButton italicBtn = new JToggleButton("A"); //����Ӳ�
	JComboBox<String> fontCombo = new JComboBox<String>(); //�۲�
	JComboBox<Integer> sizeCombo = new JComboBox<Integer>(); //����ũ��
	DefaultComboBoxModel<String> fontModel = new DefaultComboBoxModel<String>();
	DefaultComboBoxModel<Integer> sizeModel = new DefaultComboBoxModel<Integer>();
	
	//�޷� ��ư �����
    JButton calBtn= new JButton("�޷�"); //ī���ٹ�ư�ֱ�
	
	int bold = 0; //1,0
	int italic = 0; //2,0
	
	public JInternalFrameTest() {
		add(dp);
		
		if1 = new JInternalFrame(); //âũ������ �ּ�ȭ �ִ�ȭ ������ȭ ��� �Ұ�
		dp.add(if1);
		
		//Frame ������ ������ Size,Visible�� ��������� ����
		if1.setSize(300,200);
		if1.setVisible(true);		
		//------------------------------------------
		if2 = new JInternalFrame("�޸���",true); //â ũ�� ���� ����
		if2.add(new JScrollPane(new JTextArea()));
		dp.add(if2);
		
		if2.setBounds(100,200,500,400);
		if2.setVisible(true);
		//------------------------------------------
		if3 = new JInternalFrame("����",true,true,true,true); //âũ������ �ּ�ȭ �ִ�ȭ ������ȭ ��� ����
		if3.add(new CalculatorEx2());
		dp.add(if3);
		//���� ������ Ȱ��ȭ ��Ű��
		//Ȱ��ȭ ���� ���� ���� �� �ؿ� ��
		try { //����ó�� �������
			if3.setSelected(true);
		}
		catch (Exception e) {}
		
		if3.setBounds(0,0,400,350);
		if3.setVisible(true);
		//------------------------------------------
		//���� �߰�
		tb.add(openBtn);
		tb.add(saveBtn);
		tb.addSeparator();
		tb.add(foreColor);
		add(BorderLayout.NORTH,tb);
		//------------------------------------------
		//�۲� ���� �޴�
		boldBtn.setFont(new Font("Arial",Font.BOLD,14));
		italicBtn.setFont(new Font("Arial",Font.ITALIC,14));
		tb.add(boldBtn);
		tb.add(italicBtn);
		
		//------------------------------------------
		//�۲� �޺��ڽ�(������ �ü������ �����ϴ� �۲��� �̿��Ͽ� �޺��ڽ������)
        
        GraphicsEnvironment ge =GraphicsEnvironment.getLocalGraphicsEnvironment();
        String fontName [] =ge.getAvailableFontFamilyNames();// ��Ʈ���� ������ 
        fontModel= new DefaultComboBoxModel<String>(fontName); // ����ȿ� ��Ʈ���� �� ������(�����쿡 ���ִ±۲�)
        fontCombo.setModel(fontModel);
        fontCombo.setSelectedItem("����");//��Ʈ ����â�� ���� �ٷζ߰��ϱ�
        tb.add(fontCombo);
		//------------------------------------------
      //����ũ�� (�ݺ������� �����Ŵ�)
        for(int size=8; size<100; size+=2) {
           sizeModel.addElement(size); 
        }
        sizeCombo.setModel(sizeModel);
        sizeCombo.setSelectedItem(12);
        tb.add(sizeCombo);
		//------------------------------------------
		//�޷� ��ư
		tb.add(calBtn);
		//------------------------------------------
		setSize(1000,800);
		setVisible(true);
		//setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
		//------------------------------------------
		//�̺�Ʈ ���
		openBtn.addActionListener(this);
		saveBtn.addActionListener(this);
		foreColor.addActionListener(this);
		boldBtn.addActionListener(this);
		italicBtn.addActionListener(this);
		fontCombo.addActionListener(this);
	    sizeCombo.addActionListener(this);
		calBtn.addActionListener(this);
		
		//�͸��� ���� Ŭ����
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				JOptionPane op = new JOptionPane();
				//						���� ������Ʈ, ����			,Ÿ��Ʋ,		�ɼ�
				int que = op.showConfirmDialog(if1,"�����Ͻðڽ��ϱ�?","���� Ȯ��",JOptionPane.OK_CANCEL_OPTION);
				if(que== JOptionPane.YES_OPTION) { //yes 0
					//���� �� ����
					fileSave();
					dispose(); //�ڿ� ����
					System.exit(0);
				}
				else if(que== JOptionPane.NO_OPTION) { //no 1
					//����
					dispose();
					System.exit(0);
				}
				else if(que==JOptionPane.CANCEL_OPTION) {} //cancel 2
			}
		});
	}
	

	@Override
	public void actionPerformed(ActionEvent ae) {
		Object event = ae.getSource();
		if(event instanceof JButton) { //����� Object�� JButton�ΰ�?
			if(event==openBtn) {
				fileOpen();
			}
			else if(event==saveBtn) {
				fileSave();
			}
			else if(event==foreColor) {
				setFontFore();
			}
			else if(event==calBtn) {
				getCalendarDialog();
			}
		}
		else if (event instanceof JToggleButton) {
			if(event==boldBtn) {
				if(boldBtn.isSelected()) {
					//���ϰ� ���õǾ��� ��
					bold=1;
				}
				else {
						//���� ����
					bold=0;
				}
				fontSetting();
			}
			else if(event==italicBtn) {
				if(italicBtn.isSelected()) {
					italic = 2;
				}
				else { italic = 0;
				}
				fontSetting();
			}

		}
		else if(event instanceof JComboBox) {
			if(event==fontCombo || event==sizeCombo) {
				fontSetting();
			}
		}
		
	}
	
	public void  getCalendarDialog() {
		SwingCalendar2 cal = new SwingCalendar2();
		JDialog dialog = new JDialog(this,"�޷�",true);
		//���̾Ʒα״� â�� ���, �ڿ� â�� ��Ȱ��ȭ
		dialog.add(cal);
		dialog.setSize(400,350);
		dialog.setVisible(true);
	}
	
	 public void fontSetting() {
	      //DeskTop���� ���õ� JInternalFrame�� ������ TextArea ������
	      JInternalFrame activeIf=dp.getSelectedFrame();
	      JTextArea ta=(JTextArea) activeIf.getFocusOwner();
	      
	      ta.setFont(new Font((String)fontCombo.getSelectedItem(),bold+italic,(Integer)sizeCombo.getSelectedItem()));
	      //����ȯ�� �Ǳ� �ص��Ǵµ� ���ʸ��� �׷� ���� �ʿ䰡 ����
	   }

	
	//���ڻ� �ٲٱ�
	public void setFontFore() {
		JColorChooser cc = new JColorChooser(Color.green);
		Color selectColor = cc.showDialog(this, "���ڻ�", Color.pink);
		
		JInternalFrame selectIf = dp.getSelectedFrame();
		JTextArea ta = (JTextArea)selectIf.getFocusOwner();
		ta.setForeground(selectColor);
	}
	//���� ����
	public void fileSave() {
		JFileChooser fc = new JFileChooser();
		if(fc.showSaveDialog(this)==0) { //0:���� 1:���
			try {
				File f = fc.getSelectedFile();
				FileWriter fw = new FileWriter(f); //�̰� ������ ����ó��
				//���� Ȱ��ȭ�� Frame ������
				JInternalFrame selectIf = dp.getSelectedFrame();
				JTextArea eventTa = (JTextArea)selectIf.getFocusOwner(); //Ȱ��ȭ�� â�� ���� eventTa��
				fw.write(eventTa.getText());
				fw.close();
			}
			catch (Exception e) {}
		}
	}
	
	//���� ����
	public void fileOpen() {
		JFileChooser fc = new JFileChooser();
		//
		if(fc.showOpenDialog(this)==0) { //0:���� 1:���
			//������ ���� ��ü ������
			JTextArea ta = new JTextArea();
			File f = fc.getSelectedFile(); //������ ������ f�� ����ͼ�
			try {
				FileReader fr = new FileReader(f); //����°� �б�
				BufferedReader br = new BufferedReader(fr); //���پ� �о��
				while(true) {
					String readData = br.readLine(); //���پ� �о�� readData�� ���
					if(readData == null) break; //�� �о null�̸� break�� Ż��
					ta.append(readData+"\n"); //ta�� readData �ֱ�
				}
				JScrollPane sp2 = new JScrollPane(ta);
				JInternalFrame if5 = new JInternalFrame(f.getPath(),true,true,true,true);
				//getPath() : ���� ��� ������
				dp.add(if5);
				if5.add(sp2);
				if5.setSize(500,500);
				if5.setSelected(true); //����, ȭ�� ���� ���� �����ְԲ�
				if5.setVisible(true);
			}
			catch (Exception e) {}
		}
		
	}

	public static void main(String[] args) {
		new JInternalFrameTest();

	}


}
