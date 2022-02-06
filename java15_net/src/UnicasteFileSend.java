import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;

public class UnicasteFileSend extends JFrame implements ActionListener { //0723-5
	JButton btn = new JButton("파일보내기");
	
	public UnicasteFileSend() {
		add(btn);
		setSize(400,300);
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		btn.addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent ae) {
		JFileChooser fc = new JFileChooser();
		int state = fc.showOpenDialog(this);
		if(state==0) {
			try {
				DatagramSocket ds = new DatagramSocket();
				InetAddress ia = InetAddress.getByName("192.168.0.16");
				
				File f = fc.getSelectedFile(); //경로+파일명
				FileInputStream fis = new FileInputStream(f);
				String filename = "FN##"+f.getName();//파일명
				
				//파일 보내기
				DatagramPacket dp = new DatagramPacket(filename.getBytes(), filename.getBytes().length,ia,16000);
				ds.send(dp);
				
				while(true) {
					//파일내용 보내기 $%#$
					byte fileContent[] = new byte[512];
					fileContent[0]='$';
					fileContent[1]='%';
					fileContent[2]='#';
					fileContent[3]='$';
					
					int cnt = fis.read(fileContent,4,508);
					
					if(cnt<=0) break;
					dp = new DatagramPacket(fileContent, cnt+4, ia, 16000);
					ds.send(dp);
					System.out.println("cnt --> "+cnt+"bytes");
				}
				fis.close();
				//마지막 메시지 보내기
				dp = new DatagramPacket("^%$&".getBytes(),4,ia,16000);
				ds.send(dp);
				ds.close();
				System.out.println("파일 전송 완료");
			}
			catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}

	public static void main(String[] args) {
		new UnicasteFileSend();

	}

	

}
