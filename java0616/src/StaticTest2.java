
public class StaticTest2 { //0616-4
	
	//static
	
	//멤버 변수의 데이터형 왼쪽
	//	public static int a= 100
	//	static int  = 200
	
	//메소드의 반황형 왼쪽에 표기한다.
	//	public static void method() {}
	//	static void method() {}
	
	//멤버영역에 실행 표기 할 수 없지만,
	//꼭 실행문을 써야한다면 static {} 안에 표기한다
	static { //생성자 메소드보다 먼저 실행
	for(int i=1;i<10;i++) {
		System.out.println(i);
	}}

	public StaticTest2() {
		System.out.println("StaticTes2() 메소드 실행");
	}
	
	public static void main(String a[]) {
		new StaticTest2();
		//static 이 먼저 실행된다. 그 다음 생성자메소드.
	}

}
