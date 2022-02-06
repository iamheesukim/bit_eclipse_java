//0617-2(2)
//추상메소드를 1개 이상 포함하는 클래스는 추상클래스이다.
//추상클래는 class 키워드 왼쪽에 abstract를 표기하여야 한다.
public abstract class AbstractTest {
	
	int num = 100;
	String name = "홍길동";

	public AbstractTest() {
		System.out.println("테스트1");
	}
	
	public void numOutput() {
		System.out.println("num="+num);
	}
	
	//실행부가 없는 메소드는 추상메소드이다.
	//추상메소드는 반환형 왼쪽에 abstract 키워드를 표기해야 한다.
	public abstract void print();
	public abstract void setData(int num, String name);
	
	//인터페이스는 객체생성이 불가능

}
