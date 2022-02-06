import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class URLTest {

	public URLTest() {
		//url 주소 (protocol, host, port, filename)등을 이용하여 객체를 생성하면
		//해당 서버의 리소스를 얻어올 수 있다.
		
		try {
			//URL url = new URL("https://theninemall.com/product/detail.html?product_no=3929&cate_no=201&display_group=1");
			URL url = new URL("https://www.nate.com/");
			
			String protocol = url.getProtocol();
			String host = url.getHost();
			int port = url.getPort();
			String file = url.getFile();
			String path = url.getPath();
			
			System.out.println("protocol : "+protocol);
			System.out.println("host : "+host);
			System.out.println("port : "+port);
			System.out.println("file : "+file); //경로+파일명+데이터
			System.out.println("path : "+path); //경로+파일명
			
			//URLConnection 객체로 헤더정보를 얻어올 수 있다.
			URLConnection connection = url.openConnection();
			connection.connect(); //통신채널을 확보하여야 헤드정보를 얻어올 수 있다.
			
			String type = connection.getContentType();
			System.out.println("type : "+type);
			
			//코드 얻어오기
			int idx = type.indexOf("charset=");
			String encode = type.substring(idx+8);
			System.out.println("encode : "+encode);
			
			//url 객체서 resource 가져오기
			InputStream is = url.openStream();
			
			//InputStreamReader isr = new InputStreamReader(is,"utf-8");
			InputStreamReader isr = new InputStreamReader(is,encode);
			BufferedReader br = new BufferedReader(isr);
			
			while (true) {
				String readData = br.readLine();
				if(readData==null) break;
				System.out.println(readData);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	public static void main(String[] args) {
		URLTest url = new URLTest();

	}

}
