import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReaderTest {

	public InputStreamReaderTest() { //0705-1 IO
		//����(char)������ �Է�
		InputStreamReader isr = new InputStreamReader(System.in);
		try {
			System.out.print("�Է�=");
			while(true) {
//				int code = isr.read();
//				if(code==-1) break;
//				System.out.println(code+"-->"+(char)code); //�ѹ��� 1���ھ� �Է� �޴´�.
				//enter�� �νĵż� ���� 13 10 ���
				
//				//�迭�� �̿��Ͽ� �Է¹ޱ�
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
