public class MethodTest { //0614-1

	//멤버영역
	int num =12;
	String name="홍길동";
	String tel;

	//생성자 메소드 : 생략시 자동추가 (JVM)
	//			상속관계가 아닐때만 추가해준다
	//	매개변수는 데이터형이 다르거나 변수의 갯수가 달라야함
	//MethodTest(~~){~~} -> 다 생성자 메소드

	MethodTest() {}

	MethodTest(String tel) {
		System.out.println("연락처:"+tel);
	}

	//MethodTest(String name) {
		//}

	MethodTest(int num) {}

	MethodTest(int num, String name) {

		//입력받은 num 값을 이클래스에 저장하고 싶을때!
		//num = num; ??
		//앞에 있는 애가 지역변수 -> 따라서 오류

		//이 클래스를 가리키는 예약어 : this
		this.num = num;
		//이 클래스의 전역변수 num에 입력받은 지역변수 데이터를 저장
		this.name=name;

		//이 안에 선언되지 않은(지역변수가 없는) 변수를 쓰면 this 안붙임

		String tel = "12345";
		this.tel="02-1234-1234"; //this. 붙였으므로 멤버tel
	}

	//순서가 바껴서 String, int도 가능
	MethodTest(String name, int num) {
		//생성자 메소드에서 다른 생성자 메소드 호출
		//생성자 메소드에서 타 생성자메소드를 호출할땐 메소드명을 직접 표기할 수 없음.
		//MethodTest(num,name); -> 오류

		//this()라는 키워드를 써야함 (this.이 아님)

		//this() 이용하여 다른 생성자 메소드를 호출할 땐 반드시 첫번째 실행문이여야함
		//System.out.println(); ->이렇게 위에 다른 실행문이 있으면 오류
		this(num,name);
		// 그럼 25열로감
	}

	//변수명이 중요하지 않음 : 어차피 ()안 지역변수
}