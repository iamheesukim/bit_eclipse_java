import java.io.IOException;
import java.io.InputStream;

public class InputStreamTest { //0702-2 IO

	public InputStreamTest() {
		try {
			//InputStream : byte 단위 문자를 입력받는다
			InputStream is = System.in;
			
			System.out.print("입력 = ");
			while (true) {
//				//read한 값이 없을 경우 -1이 리턴
//				int code = is.read(); //1byte읽어온다.
//				if(code==-1) {
//				System.out.println(code); //enter도 인식돼서 끝엔 13 10 출력
//				break;
//				}
				//System.out.println((char)code);
				byte data[] = new byte[8];
				//read : 데이터수, data 배열에 읽은 값이 있다.
				int cnt = is.read(data);
				//int cnt = is.read(data,2,3);
				System.out.println(cnt+"-->"+new String(data));
			}		
				
		}catch(IOException e) {}
		System.out.println("---------------");
	}

	public static void main(String[] args) {
		new InputStreamTest();
	}

}
