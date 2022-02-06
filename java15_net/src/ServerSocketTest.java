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
	//관리자(?)

	public ServerSocketTest() {
		serverStart();
	}
	
	public void serverStart() {
		try {
			//0~6만5천대 port
			ServerSocket ss = new ServerSocket(12000);
			System.out.println("Server Start...");
			
			while(true) {
				System.out.println("접속대기중");
				//클라이언트의 접속을 기다리는 중
				
				Socket s = ss.accept(); 
				System.out.println("클라이언트가 접속하였습니다."); //접속해야 출력됨
				//SocketTest 클래스를 run하면 출력됨
				
				InetAddress ia = s.getInetAddress(); //클라이언트의 ip
				System.out.println("접속자의 ip -> " + ia.getHostAddress());
				
				//접속자에게 문자 보내기 -> outputStream
				OutputStream os = s.getOutputStream();
				OutputStreamWriter osw = new OutputStreamWriter(os);
				
				PrintWriter pw = new PrintWriter(osw);
				pw.println("welcome~~ 안녕!");
				pw.flush(); //전송
				
				//클라이언트가 보낸 문자 받기
				InputStream is = s.getInputStream();
				InputStreamReader isr = new InputStreamReader(is);
				BufferedReader br = new BufferedReader(isr);
				
				String inData = br.readLine();
				System.out.println("클라이언트가 보낸 메시지 : "+inData);
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
