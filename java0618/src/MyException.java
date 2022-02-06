// 1. 예외 클래스 생성시 반드시 Exception 클래스를 상속 받아 상속받아 생긴다.
public class MyException extends Exception{ //0618-8 (9연관)
	public MyException() {
		super("1~100 사이의 값이여야 합니다.");
	}

	public MyException(String message) {
		super(message);
}
}