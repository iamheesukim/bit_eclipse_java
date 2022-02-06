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

public class JInternalFrameTest extends JFrame implements ActionListener{ //0713-3 이어서 0714-1
	JDesktopPane dp = new JDesktopPane();
	JInternalFrame if1, if2, if3;
	
	ImageIcon openii = new ImageIcon("img/open01.gif");
	ImageIcon saveii = new ImageIcon("img/save01.gif");
	JToolBar tb = new JToolBar();
		JButton openBtn = new JButton(openii);
		JButton saveBtn = new JButton(saveii);
		JButton foreColor = new JButton("글자색");
		
	//글꼴 버튼
	JToggleButton boldBtn = new JToggleButton("A"); //진하게
	JToggleButton italicBtn = new JToggleButton("A"); //기울임꼴
	JComboBox<String> fontCombo = new JComboBox<String>(); //글꼴
	JComboBox<Integer> sizeCombo = new JComboBox<Integer>(); //글자크기
	DefaultComboBoxModel<String> fontModel = new DefaultComboBoxModel<String>();
	DefaultComboBoxModel<Integer> sizeModel = new DefaultComboBoxModel<Integer>();
	
	//달력 버튼 만들기
    JButton calBtn= new JButton("달력"); //카랜다버튼넣기
	
	int bold = 0; //1,0
	int italic = 0; //2,0
	
	public JInternalFrameTest() {
		add(dp);
		
		if1 = new JInternalFrame(); //창크기조절 최소화 최대화 이이콘화 모두 불가
		dp.add(if1);
		
		//Frame 종류는 무조건 Size,Visible을 설정해줘야 보임
		if1.setSize(300,200);
		if1.setVisible(true);		
		//------------------------------------------
		if2 = new JInternalFrame("메모장",true); //창 크기 조절 가능
		if2.add(new JScrollPane(new JTextArea()));
		dp.add(if2);
		
		if2.setBounds(100,200,500,400);
		if2.setVisible(true);
		//------------------------------------------
		if3 = new JInternalFrame("계산기",true,true,true,true); //창크기조절 최소화 최대화 아이콘화 모두 가능
		if3.add(new CalculatorEx2());
		dp.add(if3);
		//계산기 프레임 활성화 시키기
		//활성화 설정 전엔 가장 맨 밑에 깔림
		try { //예외처리 해줘야함
			if3.setSelected(true);
		}
		catch (Exception e) {}
		
		if3.setBounds(0,0,400,350);
		if3.setVisible(true);
		//------------------------------------------
		//툴바 추가
		tb.add(openBtn);
		tb.add(saveBtn);
		tb.addSeparator();
		tb.add(foreColor);
		add(BorderLayout.NORTH,tb);
		//------------------------------------------
		//글꼴 관련 메뉴
		boldBtn.setFont(new Font("Arial",Font.BOLD,14));
		italicBtn.setFont(new Font("Arial",Font.ITALIC,14));
		tb.add(boldBtn);
		tb.add(italicBtn);
		
		//------------------------------------------
		//글꼴 콤보박스(윈도우 운영체제에서 지원하는 글꼴을 이용하여 콤보박스만들기)
        
        GraphicsEnvironment ge =GraphicsEnvironment.getLocalGraphicsEnvironment();
        String fontName [] =ge.getAvailableFontFamilyNames();// 폰트들이 들어가있음 
        fontModel= new DefaultComboBoxModel<String>(fontName); // 여기안에 폰트들이 쫙 들어가있음(윈도우에 들어가있는글꼴)
        fontCombo.setModel(fontModel);
        fontCombo.setSelectedItem("굴림");//폰트 실행창에 굴림 바로뜨게하기
        tb.add(fontCombo);
		//------------------------------------------
      //글자크기 (반복문으로 돌릴거다)
        for(int size=8; size<100; size+=2) {
           sizeModel.addElement(size); 
        }
        sizeCombo.setModel(sizeModel);
        sizeCombo.setSelectedItem(12);
        tb.add(sizeCombo);
		//------------------------------------------
		//달력 버튼
		tb.add(calBtn);
		//------------------------------------------
		setSize(1000,800);
		setVisible(true);
		//setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
		//------------------------------------------
		//이벤트 등록
		openBtn.addActionListener(this);
		saveBtn.addActionListener(this);
		foreColor.addActionListener(this);
		boldBtn.addActionListener(this);
		italicBtn.addActionListener(this);
		fontCombo.addActionListener(this);
	    sizeCombo.addActionListener(this);
		calBtn.addActionListener(this);
		
		//익명의 내부 클래스
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				JOptionPane op = new JOptionPane();
				//						이전 컴포넌트, 문구			,타이틀,		옵션
				int que = op.showConfirmDialog(if1,"저장하시겠습니까?","저장 확인",JOptionPane.OK_CANCEL_OPTION);
				if(que== JOptionPane.YES_OPTION) { //yes 0
					//저장 후 종료
					fileSave();
					dispose(); //자원 해제
					System.exit(0);
				}
				else if(que== JOptionPane.NO_OPTION) { //no 1
					//종료
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
		if(event instanceof JButton) { //갖고온 Object가 JButton인가?
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
					//진하게 선택되었을 때
					bold=1;
				}
				else {
						//선택 해제
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
		JDialog dialog = new JDialog(this,"달력",true);
		//다이아로그는 창이 띄면, 뒤에 창이 비활성화
		dialog.add(cal);
		dialog.setSize(400,350);
		dialog.setVisible(true);
	}
	
	 public void fontSetting() {
	      //DeskTop에서 선택된 JInternalFrame을 구한후 TextArea 얻어오기
	      JInternalFrame activeIf=dp.getSelectedFrame();
	      JTextArea ta=(JTextArea) activeIf.getFocusOwner();
	      
	      ta.setFont(new Font((String)fontCombo.getSelectedItem(),bold+italic,(Integer)sizeCombo.getSelectedItem()));
	      //형변환을 되긴 해도되는데 제너릭이 그럼 있을 필요가 없음
	   }

	
	//글자색 바꾸기
	public void setFontFore() {
		JColorChooser cc = new JColorChooser(Color.green);
		Color selectColor = cc.showDialog(this, "글자색", Color.pink);
		
		JInternalFrame selectIf = dp.getSelectedFrame();
		JTextArea ta = (JTextArea)selectIf.getFocusOwner();
		ta.setForeground(selectColor);
	}
	//파일 저장
	public void fileSave() {
		JFileChooser fc = new JFileChooser();
		if(fc.showSaveDialog(this)==0) { //0:저장 1:취소
			try {
				File f = fc.getSelectedFile();
				FileWriter fw = new FileWriter(f); //이거 때문에 예외처리
				//현재 활성화된 Frame 얻어오기
				JInternalFrame selectIf = dp.getSelectedFrame();
				JTextArea eventTa = (JTextArea)selectIf.getFocusOwner(); //활성화된 창의 내용 eventTa에
				fw.write(eventTa.getText());
				fw.close();
			}
			catch (Exception e) {}
		}
	}
	
	//파일 열기
	public void fileOpen() {
		JFileChooser fc = new JFileChooser();
		//
		if(fc.showOpenDialog(this)==0) { //0:열기 1:취소
			//선택한 파일 객체 얻어오기
			JTextArea ta = new JTextArea();
			File f = fc.getSelectedFile(); //선택한 파일을 f로 갖고와서
			try {
				FileReader fr = new FileReader(f); //갖고온걸 읽기
				BufferedReader br = new BufferedReader(fr); //한줄씩 읽어내기
				while(true) {
					String readData = br.readLine(); //한줄씩 읽어낸걸 readData에 담기
					if(readData == null) break; //다 읽어서 null이면 break로 탈출
					ta.append(readData+"\n"); //ta에 readData 넣기
				}
				JScrollPane sp2 = new JScrollPane(ta);
				JInternalFrame if5 = new JInternalFrame(f.getPath(),true,true,true,true);
				//getPath() : 파일 경로 보여줌
				dp.add(if5);
				if5.add(sp2);
				if5.setSize(500,500);
				if5.setSelected(true); //열면, 화면 제일 위로 보여주게끔
				if5.setVisible(true);
			}
			catch (Exception e) {}
		}
		
	}

	public static void main(String[] args) {
		new JInternalFrameTest();

	}


}
