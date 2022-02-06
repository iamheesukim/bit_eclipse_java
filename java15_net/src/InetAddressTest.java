import java.net.InetAddress;

public class InetAddressTest {

	public InetAddressTest() {
		//현재 내 컴퓨터의 ip를 이용한 InetAddress 객체 생성하기
		try {
			InetAddress ia1 =  InetAddress.getLocalHost();
			
			String hostAddr1 = ia1.getHostAddress();
			String hostName1 = ia1.getHostName();
			
			System.out.println("hostAddr1 : "+hostAddr1);
			System.out.println("hostName1 : "+hostName1);
			
			//url 주소로 InetAddress 객체를 생성하면 ip,url 정보를 객체가 가지고 있다.
			InetAddress nate = InetAddress.getByName("www.nate.com");
			
			System.out.println("nate addr : "+nate.getHostAddress());
			System.out.println("nate name : "+nate.getHostName());
			
			InetAddress nateIp = InetAddress.getByName("120.50.131.112");
			System.out.println("nate addr : "+nateIp.getHostAddress());
			System.out.println("nate name : "+nateIp.getHostName());
			//도메인으로 ip를 구할수는 있지만, 그 반대는 X
			
			//InetAddress 전체 객체 구하기
			//ip를 여러개 쓰는 곳도 있음 -> 전체 ip구하기
			System.out.println("-------------------------------");
			InetAddress[] ip = InetAddress.getAllByName("www.naver.com");
			
			for(InetAddress ia:ip) {
				System.out.println("address : "+ia.getHostAddress());
				System.out.println("name : "+ia.getHostName());
				System.out.println("===============");
			}
		
			
		} catch (Exception e) {
			System.out.println("ip 주소 찾기 오류");
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new InetAddressTest();

	}

}
