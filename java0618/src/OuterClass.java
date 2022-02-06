public class OuterClass { //0618-1
	//외부클래스
	
	int num = 100;
	String name = "홍길동";

	public OuterClass() { //0618-1
		System.out.println("OuterClass 생성자 메소드 실행됨.");
	}
	
	public void print() {
		System.out.println("num="+num);
		System.out.println("name="+name);
		
		//외부 클래스는 내부클래스의 변수 접근 불가. (객체 생성해서 객체 통해서는 가능)
		//System.out.println("tel="+tel);
	}
	
	public void createInner() {
		//클래스내에서 내부클래스 객체 생성하기
		InnerClass cc = new InnerClass();
		cc.output();
		cc.tel = "9999"; //이렇게 객체를 통해서는 내부 클래스 변수 접근 가능
		cc.output();
	}
	
	//내부클래스
	class InnerClass {
		
		//멤버변수
		String tel = "010-1234-5678";
		String name = "이순신";
		
		//생성자 메소드
		InnerClass() {
			System.out.println("InnerClass 생성자 메소드 실행");
		}
		
		//메소드
		public void output() {
			System.out.println("tel="+tel);
			
			//외부클래스의 멤버변수는 내부클래스에서 접근할 수 있다.
			//내부외부 둘다 있으면 내부 변수 불러옴.
			System.out.println("num="+num);
			System.out.println("name="+name);
		}
	}

	public static void main(String[] args) {

		OuterClass oc = new OuterClass(); //7행
		//외부 클래스만 객체가 생성되고 내부클래스는 실행x
		oc.print(); //11행
		
		System.out.println("===========================");
		
		//내부 클래스 객체 생성하기
		//1. 				외부클래스 객체 생성 -> 내부클래스 객체생성
		InnerClass ic = new OuterClass().new InnerClass();
		ic.output();
		
		System.out.println("===========================");
		
		//2.				외부클랙스 객체
		OuterClass oc2 = new OuterClass();
		InnerClass ic2 = oc2.new InnerClass();
		ic2.output();
		
		System.out.println("===========================");
		
		//3.
		oc2.createInner();
		

	}

}
