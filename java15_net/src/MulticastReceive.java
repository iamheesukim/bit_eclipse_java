import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.NetworkInterface;

public class MulticastReceive { //0723-8
	MulticastSocket ms;
	DatagramPacket dp;
	
	public MulticastReceive() {
		try {
			ms = new MulticastSocket(17000);
			
			InetAddress ia = InetAddress.getByName("225.0.0.11");
			InetSocketAddress isa = new InetSocketAddress(ia,17000);
			
			NetworkInterface ni = NetworkInterface.getByName("bitca");
			
			ms.joinGroup(isa,ni);
			
			//Packet, ���
			byte[] data = new byte[512];
			dp = new DatagramPacket(data, data.length);
			System.out.println("�ޱ� �����");
			
			ms.receive(dp);
			///////////////////
			byte[] inData = dp.getData();
			int len = dp.getLength();
			
			System.out.println(new String(inData,0,len));
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	public static void main(String[] args) {
		new MulticastReceive();

	}

}
