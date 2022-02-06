import test.ProtectedTest2;
public class ProtectedTestMain extends ProtectedTest2 { //0617-1(1) 총(3)까지있음
	ProtectedTestMain() {
		//같은 패키지 내의 다른 클래스는 default처럼 사용 가능
		ProtectedTest pt = new ProtectedTest();
		System.out.println("pt.num = "+pt.num);
		pt.print();
		
		//다른 패키지의 클래스는 객체를 생성할 수 없음
		//ProtectedTest2 pt2 = new ProtectedTest2();
	
		//protected 접근제한자는 다른 패키지일 경우 상속받아 사용한다.
		System.out.println("tel = "+tel);
		telOutput();
	
	}
	
	public static void main(String[] args) {
		new ProtectedTestMain();
		
		ProtectedTest2 ppt = ProtectedTest2.getInstance();
		System.out.println(ppt.getTel());

	}

}
