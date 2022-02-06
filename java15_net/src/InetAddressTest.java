import java.net.InetAddress;

public class InetAddressTest {

	public InetAddressTest() {
		//���� �� ��ǻ���� ip�� �̿��� InetAddress ��ü �����ϱ�
		try {
			InetAddress ia1 =  InetAddress.getLocalHost();
			
			String hostAddr1 = ia1.getHostAddress();
			String hostName1 = ia1.getHostName();
			
			System.out.println("hostAddr1 : "+hostAddr1);
			System.out.println("hostName1 : "+hostName1);
			
			//url �ּҷ� InetAddress ��ü�� �����ϸ� ip,url ������ ��ü�� ������ �ִ�.
			InetAddress nate = InetAddress.getByName("www.nate.com");
			
			System.out.println("nate addr : "+nate.getHostAddress());
			System.out.println("nate name : "+nate.getHostName());
			
			InetAddress nateIp = InetAddress.getByName("120.50.131.112");
			System.out.println("nate addr : "+nateIp.getHostAddress());
			System.out.println("nate name : "+nateIp.getHostName());
			//���������� ip�� ���Ҽ��� ������, �� �ݴ�� X
			
			//InetAddress ��ü ��ü ���ϱ�
			//ip�� ������ ���� ���� ���� -> ��ü ip���ϱ�
			System.out.println("-------------------------------");
			InetAddress[] ip = InetAddress.getAllByName("www.naver.com");
			
			for(InetAddress ia:ip) {
				System.out.println("address : "+ia.getHostAddress());
				System.out.println("name : "+ia.getHostName());
				System.out.println("===============");
			}
		
			
		} catch (Exception e) {
			System.out.println("ip �ּ� ã�� ����");
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new InetAddressTest();

	}

}
