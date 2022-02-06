import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataInputOutputTest { //0708-3

	public DataInputOutputTest() {
		try {
			//�⺻ ���������� ���� ���Ϸ� �����ϱ�
			File file = new File("E://testFile","data.txt.");
			FileOutputStream fos = new FileOutputStream(file);
			DataOutputStream dos = new DataOutputStream(fos);
			
			int num = 1234;
			double data2 = 5628.34;
			boolean boo = true;
			char lastName = 'ȫ';
			
			dos.writeInt(num);
			dos.writeDouble(data2);
			dos.writeBoolean(boo);
			dos.writeChar(lastName);
			
			dos.close();
			fos.close();
		}
		catch(FileNotFoundException fnfe) {
			System.out.println("������ �����ϴ�.");
		}
		catch(IOException ie) {
			System.out.println("���Ϸ� ���� ����");
		}
	}

	public static void main(String[] args) {
		new DataInputOutputTest();
	}

}
