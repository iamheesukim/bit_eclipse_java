//package

//필요한 클래스의 위치( 패키지명과 클래스명을 정의한다)
import java.util.Scanner;
import java.lang.String; //컴파일러가 컴파일과정에 자동으로 import해준다
import java.util.Random;
import java.util.*;

public class ClassTest { //0611-5
	//멤버영역 (주로 위)
	//멤버변수 = 전역변수
	int a = 100;
	String name="홍길동";
	//멤버변수는 초기값이 자동으로 설정된다
	//정수형 : 0, 실수 : 0.0, 논리 : false, 문자 : 
	//String Scanner Random = null;
	int b;
	double c;
	String nameStr; //null
	Scanner scan; //null
	Random ran; //null
	
	//객체생성
	Scanner scanner = new Scanner(System.in);
	//실행문은 멤버에서 사용불가
	//System.out.println("콘솔문자 출력하기"); -> 오류
	//for(int z=1; z<10;z++) {} - 오류
	
	int k = 100+500;
	//int dd[] = new int[10];
	//dd[3]=200;
	
	//생성자 메소드 : 객체를 생성할 때 한번 실행되는 메소드
	//				메소드명이 반드시 클래스명과 같아야 한다.
	//				객체 생성시 객체의 데이터 초기화할 수 있다.
	// 생성자 메소드를 구현하지 않으면 컴파일시 컴파일러가 매개변수가 없는 생성자메소드를 자동으로 추가
	//ClassTest(){}

	ClassTest(){
		//실행문
		System.out.println("생성자 메소드 실행");
		b=1234;
	}
	
	ClassTest(int a) {
		System.out.println(a+"메소드 실행");
	}
	
	
	
	/*메소드 : 하나의 실행단위
	 클래스를 객체 생성 후 메소드를 호출하여야 실행된다.
	 
	 반환형 메소드명(매개변수,매개변수) {}
	 
	 메소드명 생성 규칙 : 소문자로 시작한다. 합성어 일 땐 두번때 단어에서부터 첫번째 글자를 대문자로
	 
	 */
	
	void sum() {
		System.out.println("sum()메소드가 실행됨");
	}
	void total (int a, int b) {
		System.out.println("합은"+(a+b));
	}
	

}
