import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;

public class FileInputStreamTest { //0705-6 IO

	public FileInputStreamTest() {
		//파일의 내용을 읽어 파일로 출력하기
		
		try {
		
			File srcFile = new File("D://javaSrc/0602/Test2.java");
			File tarFile = new File("D://testfile/CalendarTestEx.java"); //쓸것
			
			FileReader fr = new FileReader(srcFile);
			BufferedReader br = new BufferedReader(fr);
			
			FileWriter fw = new FileWriter(tarFile);
			
			while(true) {
				String str = br.readLine();
				//읽은 데이터가 없을 때 null
				if(str==null) break;
				fw.write(str+"\n");
				System.out.println(str);
			}
			
			fw.close();
			br.close();
			fr.close();
		
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}

	public static void main(String[] args) {
		new FileInputStreamTest();

	}

}
