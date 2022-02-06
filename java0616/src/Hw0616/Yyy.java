package Hw0616; //3번문제

class Xxx { //내가 테스트좀하느라 막 바꿔둠
	Xxx() { //생성자메소드
		System.out.print(1);
	}
	
	Xxx(int x) {
		//this(); //Xxx()실행 ->1
		System.out.print(2);
	}
}

public class Yyy extends Xxx { //상위클래스 : Xxx

	Yyy() { //생성자 메소드
		//super(6); //Xxx(6) 실행
		System.out.print(3);
	}
	
	Yyy(int y) {
		super(y);
		//this(); //Yyy() 실행
		System.out.println(4);
		
	}

	public static void main(String[] args) {
		Yyy a = new Yyy(2);

	}

}
