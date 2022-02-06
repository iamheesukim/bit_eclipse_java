
public class ClassMain { //0611-7

	public static void main(String[] args) {
		ClassTest ct = new ClassTest();
		//ClassTest() 39열 실행
		
		System.out.println("b="+ct.b);
		//ct는 ClassTest불러와서 거기있는 b출력
		
		ClassTest ct2 = new ClassTest(5678);
		//ClassTest(int a) 실행
		
		//메소드호출 : 객체명.메소드명();
		ct.sum();
		//60열 실행
		
		//63열 실행
		ct.total(100, 200); //100과 200를 매개변수로 넘김
		ct2.total(1000, 2000);
	}
}
