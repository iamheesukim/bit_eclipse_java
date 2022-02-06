
public class AaaBbbMain {//0516-7(3)

	public AaaBbbMain() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		BBB b = new BBB();
		//b.output();
		
		//하위클래스로 객체를 생성하면 상위클래스에 대입된다.
		//업캐스팅
		AAA a = new BBB(); //String 안에 int 넣은격 (상위>하위)
		a.output();
		//오버라이딩된 BBB의 output()메소드가 실행된다.
		
		//BBB a = AAA BBB(); -> 이건 오류
		
		System.out.println("b.tel = "+b.tel);
		//System.out.println("a.tel = "+a.tel); -> 오류
		
		System.out.println("a.name = "+a.name); //hong (AAA name)
		System.out.println("a.num = "+a.num); //100 (AAA b)
		
		//다운캐스팅
		BBB c = (BBB)a; //int안에 String 넣을때 (int) 형변환
		c.output();
		
		Object obj = new BBB(); //object이 상위
		BBB d = (BBB)obj;
		d.output();
	}

}
