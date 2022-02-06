import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataInputOutputTest { //0708-3

	public DataInputOutputTest() {
		try {
			//기본 데이터형의 값을 파일로 저장하기
			File file = new File("E://testFile","data.txt.");
			FileOutputStream fos = new FileOutputStream(file);
			DataOutputStream dos = new DataOutputStream(fos);
			
			int num = 1234;
			double data2 = 5628.34;
			boolean boo = true;
			char lastName = '홍';
			
			dos.writeInt(num);
			dos.writeDouble(data2);
			dos.writeBoolean(boo);
			dos.writeChar(lastName);
			
			dos.close();
			fos.close();
		}
		catch(FileNotFoundException fnfe) {
			System.out.println("파일이 없습니다.");
		}
		catch(IOException ie) {
			System.out.println("파일로 쓰기 에러");
		}
	}

	public static void main(String[] args) {
		new DataInputOutputTest();
	}

}
