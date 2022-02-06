package Hw0616; //2번 문제

class Test {
	public int a =3;
	public void print() {
		a+=5;
		System.out.print("f");
	}
}

class Ex extends Test {
	public int a = 8;
	public void print() {
		//System.out.print(this.a);
		this.a += 5; //8+5=13
		System.out.print("b"); //b
		
//		a=7;
//		this.a = 5;
//		System.out.print(a);
//		System.out.print(this.a);
//		System.out.print("b");
	}
}

public class Sam {

	public static void main(String[] args) {
		
		Test ob = new Ex(); //객체 생성 Double i = s s=1
		ob.print(); //Ex의 print()
		System.out.print(ob.a); //Test의 a
		
		//최종출력 b3

	}

}
