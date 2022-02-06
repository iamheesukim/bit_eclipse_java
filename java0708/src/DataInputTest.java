import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;

public class DataInputTest { //0708-4

	public DataInputTest() {
		try {
			File f = new File("E://testFile","data.txt");
			FileInputStream fis = new FileInputStream(f);
			DataInputStream dis = new DataInputStream(fis);
			
			//int, double, boolean, char 이 순서대로 가져와야함
			int intData = dis.readInt();
			double douData = dis.readDouble();
			boolean booData = dis.readBoolean();
			char charData = dis.readChar();
			
			System.out.println(intData);
			System.out.println(douData);
			System.out.println(booData);
			System.out.println(charData);
			
		}
		catch(Exception e) {
		}
	}

	public static void main(String[] args) {
		new DataInputTest();
	}

}
