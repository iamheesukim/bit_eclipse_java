import java.util.Calendar;
import java.util.Vector;

//Vector
//순서가 있는 데이터의 집합
//데이터 중복 허용
//List 인터페이스

public class VectorTest { //0621-3 (2, 4연관)

	public VectorTest() {
	}

	public Vector start() {
		//Vecotr 컬렉션
		Vector v = new Vector();
		
		// 객체 4개
		String username = "홍길동";
		Integer num = 25010;
		Calendar cal = Calendar.getInstance();
		MemberVo vo = new MemberVo("세종대왕","기획부","2021-06-10",1000);
		
		//vector 객체 추가는 add();
		//Vecotr 객체에 다른 객체 추가하기
		v.add(username); //[0]에 String
		v.addElement(num); //[1]에 값이 들어감
		v.add(1, cal); //cal이 [1]로 들어가므로 [1]에 있던 num이 [2]로 이동
		v.addElement(vo); //[3]
		
		v.add(55); //[4]
		//원래는 객체만 들어가야해서 new Integer(55)를 넣어야하지만, 오토박싱 기능을 인해 생략가능
		
//		v.remove(1); //인덱스 번호로 지워도 되고
//		v.remove(cal); //객체명으로 지워도 됨.
		
		return v;
	}
//	public static void main(String[] args) {
//		new VectorTest().start();
//
//	}

}

/*

List(interface) : index가 존재한다
				 : 저장 순서를 유지한다.

*/