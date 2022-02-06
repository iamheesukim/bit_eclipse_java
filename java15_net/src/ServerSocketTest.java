import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerSocketTest { //0722-2
	//������(?)

	public ServerSocketTest() {
		serverStart();
	}
	
	public void serverStart() {
		try {
			//0~6��5õ�� port
			ServerSocket ss = new ServerSocket(12000);
			System.out.println("Server Start...");
			
			while(true) {
				System.out.println("���Ӵ����");
				//Ŭ���̾�Ʈ�� ������ ��ٸ��� ��
				
				Socket s = ss.accept(); 
				System.out.println("Ŭ���̾�Ʈ�� �����Ͽ����ϴ�."); //�����ؾ� ��µ�
				//SocketTest Ŭ������ run�ϸ� ��µ�
				
				InetAddress ia = s.getInetAddress(); //Ŭ���̾�Ʈ�� ip
				System.out.println("�������� ip -> " + ia.getHostAddress());
				
				//�����ڿ��� ���� ������ -> outputStream
				OutputStream os = s.getOutputStream();
				OutputStreamWriter osw = new OutputStreamWriter(os);
				
				PrintWriter pw = new PrintWriter(osw);
				pw.println("welcome~~ �ȳ�!");
				pw.flush(); //����
				
				//Ŭ���̾�Ʈ�� ���� ���� �ޱ�
				InputStream is = s.getInputStream();
				InputStreamReader isr = new InputStreamReader(is);
				BufferedReader br = new BufferedReader(isr);
				
				String inData = br.readLine();
				System.out.println("Ŭ���̾�Ʈ�� ���� �޽��� : "+inData);
			}
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	

	public static void main(String[] args) {
		new ServerSocketTest();

	}

}
