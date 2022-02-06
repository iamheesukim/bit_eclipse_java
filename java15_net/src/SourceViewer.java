import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

import javax.swing.*;

public class SourceViewer extends JFrame implements ActionListener{ //0722-1 (0721 과제 답안)
	JPanel pane = new JPanel(new BorderLayout());
		JLabel lbl = new JLabel("URL");
		JTextField tf = new JTextField();
		JButton btn = new JButton("소스보기");
		
	JTabbedPane tPane = new JTabbedPane();
	
	public SourceViewer() {
		pane.add(BorderLayout.WEST,lbl);
		pane.add(tf);
		pane.add(BorderLayout.EAST,btn);
		add(BorderLayout.NORTH, pane);
		
		add(tPane);
		
		setSize(800,600);
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		tf.addActionListener(this);
		btn.addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent ae) {
		Object obj = ae.getSource();
		if(obj==tf || obj==btn) {
			startSourceView();
		}	
	}
	
	public void startSourceView() {
		String urlAddr = tf.getText();
		if(!urlAddr.equals("")) { //공백이 아닐 때만 실행됨
			try {
				JTextArea ta = new JTextArea();
				JScrollPane sp = new JScrollPane(ta);
				
				tPane.addTab(urlAddr, sp); //제목, 컴포넌트
				tPane.setSelectedComponent(sp); //추가된 탭의 컴퍼넌트를 활성화
				
				URL url = new URL(urlAddr);
				URLConnection connection = url.openConnection();
				connection.connect();
				String headerType = connection.getContentType();
				int idx = headerType.indexOf("charset");
				String encode = headerType.substring(idx+8);
				
				BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream(),encode));
				
				while(true) {
					String data = br.readLine();
					if(data==null) break;
					ta.append(data+"\n");
				}
				br.close();
				tf.setText(""); //버튼 누른 후 검색창 지워주기
			}
			catch(Exception e) {
				e.printStackTrace();
			}
			
		}
	}

	public static void main(String[] args) {
		new SourceViewer();
	}



}
