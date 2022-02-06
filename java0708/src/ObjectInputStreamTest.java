import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ObjectInputStreamTest { //0708-6

	public ObjectInputStreamTest() {
		try {
			File f = new File("E://testFile/object.txt");
			FileInputStream fis = new FileInputStream(f);
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			Memo memo = (Memo)ois.readObject();
			memo.setVisible(true);
			
		}catch(Exception e) {}
	}

	public static void main(String[] args) {
		new ObjectInputStreamTest();

	}

}
