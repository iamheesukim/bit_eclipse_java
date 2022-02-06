import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;

public class MulticastSend { //0723-7
	/*
	 224.0.0.0 ~239.255.255.255
	 
	 225.0.0.11
	 */

	MulticastSocket ms;
	DatagramPacket dp;
	InetAddress ia;
	
	
	public MulticastSend() {
		try {
			ms = new MulticastSocket();
			ia = InetAddress.getByName("225.0.0.11"); //이 IP를 통해서 전송함
			
			String data = "멀티캐스트 소켓을 이용한 데이터 전송";
			dp = new DatagramPacket(data.getBytes(), data.getBytes().length,ia,17000);
			
			ms.send(dp);
			System.out.println("보내기 완료");
			
		}
		catch(Exception e) {
			
		}
	}

	public static void main(String[] args) {
		new MulticastSend();

	}

}
