import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReaderTest {

	public InputStreamReaderTest() { //0705-1 IO
		//문자(char)단위로 입력
		InputStreamReader isr = new InputStreamReader(System.in);
		try {
			System.out.print("입력=");
			while(true) {
//				int code = isr.read();
//				if(code==-1) break;
//				System.out.println(code+"-->"+(char)code); //한번애 1문자씩 입력 받는다.
				//enter도 인식돼서 끝엔 13 10 출력
				
//				//배열을 이용하여 입력받기
				 char[] data = new char[5];
				 int cnt = isr.read(data);
				 if(cnt<=0) break;					//new String(data)
				 System.out.println("cnt:"+cnt+"-->"+String.valueOf(data)+"-->"+data);
			}
			
		} catch(IOException e) {}
	}

	public static void main(String[] args) {
		new InputStreamReaderTest();

	}

}
