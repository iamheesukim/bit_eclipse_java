import java.io.BufferedInputStream;

public class BufferedInputStreamTest { //0705-2 IO

	public BufferedInputStreamTest() {
		try {
			//BufferedInputStream : ����Ʈ ������ ���ڸ� �о� ���ۿ� ���� �� ���پ� ���� �� �ִ� ��ü
			BufferedInputStream bis = new BufferedInputStream(System.in);
			byte[] data = new byte[10]; //�ѹ��� 10����Ʈ�� �о��
			System.out.print("�Է� = ");
			int cnt = bis.read(data); //test�ѱ۰����� �� �Է��ߴٸ� test�ѱ۰� ����!
			System.out.println(new String(data));
		} catch (Exception e) {}
	}

	public static void main(String[] args) {
		new BufferedInputStreamTest();

	}

}
