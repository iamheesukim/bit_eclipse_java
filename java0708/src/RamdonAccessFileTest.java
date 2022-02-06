import java.io.File;
import java.io.RandomAccessFile;

public class RamdonAccessFileTest {

	public RamdonAccessFileTest() {
		//���ϴ� ��ġ�� �����͸� �а� ���Ⱑ �����ϴ�.
		File f = new File("E://testFile/acess.txt");
		try {
			RandomAccessFile raf = new RandomAccessFile(f, "rw");
			
			String str = "Java input output test programing";
			raf.writeBytes(str);
			raf.writeInt(12345);
			
			//������ ��ġ �̵�
			raf.seek(10);
			raf.writeBytes("ȫ�浿");
			//�ܼ� ��ġ�� 10���� �̵� �� ȫ�浿 ����
			
			//Ŀ���� ���������� �ű��
			raf.seek(raf.length());
			//�迭�� ���� �� ����
			byte[] data = {65,66,67,68};
			raf.write(data);
			
			raf.close();
			
			//�ֿܼ� �ƹ��͵� ��¾ȵǴ� �� ����!
			// 8���� ������ ó���� acess.txt�� �����ǰ�,
			// �� �ڷ� ���๮ �ϳ��� ���ڰ� �߰���.
			//txt ���� ����� �߰��Ǿ� ����.
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new RamdonAccessFileTest();

	}

}
