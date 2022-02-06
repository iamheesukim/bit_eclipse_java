//인터페이스는 추상메소드로 static final 변수가 있는 클래스
public interface Interface1 { //0617-3(1) 총(4)
	
	//final 변수
	
	//public static final -> 생략가능
	int MAX=100;
	public static final String LOGO="비트캠프";

	//추상메소드
	//(abstract) public -> 생략가능
	void output();
	public int sum();
}
