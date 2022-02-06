import java.io.File;
import java.io.RandomAccessFile;

public class RamdonAccessFileTest {

	public RamdonAccessFileTest() {
		//원하는 위치의 데이터를 읽고 쓰기가 가능하다.
		File f = new File("E://testFile/acess.txt");
		try {
			RandomAccessFile raf = new RandomAccessFile(f, "rw");
			
			String str = "Java input output test programing";
			raf.writeBytes(str);
			raf.writeInt(12345);
			
			//쓰기할 위치 이동
			raf.seek(10);
			raf.writeBytes("홍길동");
			//콘솔 위치를 10으로 이동 후 홍길동 삽입
			
			//커서를 마지막으로 옮기기
			raf.seek(raf.length());
			//배열도 넣을 수 있음
			byte[] data = {65,66,67,68};
			raf.write(data);
			
			raf.close();
			
			//콘솔엔 아무것도 출력안되는 거 맞음!
			// 8열만 있으면 처음에 acess.txt가 생성되고,
			// 그 뒤로 실행문 하나씩 문자가 추가됨.
			//txt 파일 열어보면 추가되어 있음.
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new RamdonAccessFileTest();

	}

}
