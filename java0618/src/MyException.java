// 1. ���� Ŭ���� ������ �ݵ�� Exception Ŭ������ ��� �޾� ��ӹ޾� �����.
public class MyException extends Exception{ //0618-8 (9����)
	public MyException() {
		super("1~100 ������ ���̿��� �մϴ�.");
	}

	public MyException(String message) {
		super(message);
}
}