//extends 키워드를 이용하여 클래스를 상속받는다.
//클래스는 1개만 상속받을 수 있다

public class Truck extends Car { //0616-6
	//하위클래스
	
	int speed=100;
	public Truck() {
		System.out.println("Truck()생성자 메소드 실행");
		System.out.println("Truck.speed = "+speed);
		super.speedUp(); //오버라이딩을 했어도 상위클래스의 메소드를 쓸 경우
	}
	
	public Truck(String carName) {
		//상위클래스의 생성자 메소드 호출
		super(carName); //super = 상위클래스
		//string 매개변수를 받는 Car(string)을 실행
		
		//super(string)없으면
		//가장 기본인 Car()실행 후 -> Truck(String) 실행
		
		System.out.println("Truck(String) 생성자 실행");
		
		System.out.println("Truck.speed = "+speed);
		//하위는 상위를 쓸 수 있지만, 상위는 하위를 쓸 수 없음.
	}
	
	//상위 클래스의 메소드를 하위클래스에서 재정의 (오버라이딩)
	//반황형, 메소드명, 매개변수가 같은 메소드를 재정의
	public void speedUp() {
		//System.out.println(speed); //확인용
		if(speed>=SPEED_MAX) speed=SPEED_MAX;
		
		System.out.println("truck.speed = "+speed);
	}
	public static void main(String a[]) {

		Truck t = new Truck();
		//상속관계에서 객체생성시 상위클래스 먼저 실행 후 -> 하위클래스 실행
		
		System.out.println("t.speed = "+t.speed);
		//상위클래스의 메소드 호출
		t.speedUp();
		t.speedUp();
		t.speedDown();
		
		//상위클래스의 생성자를 선택적으로 호출하기
		Truck tt = new Truck("소나타");
		System.out.println("tt.carName = "+tt.carName);
		//tt객체에서 그랜져는 사라짐.
		
		//메인메소드는 상속관계 제외므로 여기서 super x
		
		
	}

}