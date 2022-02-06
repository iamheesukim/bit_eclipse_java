
public class WrapperTest {//0617-4

	public WrapperTest() {
		
		//Wrapper 클래스는 기본데이터형의 정보를 객체로 변경시키는 클래스이다.
		//Byte, Short, Integer, Long
		//Float, Double
		//Boolean
		//Character

		int a = 1234;
		Integer i = Integer.valueOf(a); //new Integer(a);
		
		//그냥 a를 주면 a는 객체가 아니므로 에러
		
		System.out.println(a);
		System.out.println(i);
		
		Object obj = a; //오토박싱 : new Integer(a);안해도 자동
		Object obj2 = i;
		System.out.println(obj);
		System.out.println(obj2);
		
		int x = i; //오토언박싱
		System.out.println(x);
	}

	public static void main(String[] args) {
		new WrapperTest();

	}

}
