import java.io.BufferedInputStream;

public class BufferedInputStreamTest { //0705-2 IO

	public BufferedInputStreamTest() {
		try {
			//BufferedInputStream : 바이트 단위로 문자를 읽어 버퍼에 저장 후 한줄씩 읽을 수 있는 객체
			BufferedInputStream bis = new BufferedInputStream(System.in);
			byte[] data = new byte[10]; //한번에 10바이트를 읽어옴
			System.out.print("입력 = ");
			int cnt = bis.read(data); //test한글과영어 를 입력했다면 test한글과 까지!
			System.out.println(new String(data));
		} catch (Exception e) {}
	}

	public static void main(String[] args) {
		new BufferedInputStreamTest();

	}

}
