import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class URLTest {

	public URLTest() {
		//url �ּ� (protocol, host, port, filename)���� �̿��Ͽ� ��ü�� �����ϸ�
		//�ش� ������ ���ҽ��� ���� �� �ִ�.
		
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
			System.out.println("file : "+file); //���+���ϸ�+������
			System.out.println("path : "+path); //���+���ϸ�
			
			//URLConnection ��ü�� ��������� ���� �� �ִ�.
			URLConnection connection = url.openConnection();
			connection.connect(); //���ä���� Ȯ���Ͽ��� ��������� ���� �� �ִ�.
			
			String type = connection.getContentType();
			System.out.println("type : "+type);
			
			//�ڵ� ������
			int idx = type.indexOf("charset=");
			String encode = type.substring(idx+8);
			System.out.println("encode : "+encode);
			
			//url ��ü�� resource ��������
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
