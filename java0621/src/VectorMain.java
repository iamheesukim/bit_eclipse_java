import java.util.Calendar;
import java.util.Vector;

public class VectorMain { //0621-4 (2, 3연관)

	public VectorMain() {
		//VectorTset 클래스의 start()메소드를 호출하면 Vector 리턴된다.
		VectorTest vt = new VectorTest();
		Vector vvv = vt.start();
		//사진 캡쳐 순서대로
		
		String aaa = (String)vvv.elementAt(0);
		//Vector v의 타입을 지정하지 않았으므로 기본 Object 타입
		//따라서 String 안에 주려면 반드시 형변환
		//[0]에 있는 데이터 -> String 객체
		System.out.println("aaa = "+aaa);
		
//		Calendar ccc = (Calendar)vvv.get(1);
//		System.out.println("ccc = "+ccc);
		
		Integer iii = (Integer)vvv.elementAt(2); //vvv는 Vector형이니까 (integer)
		System.out.println("iii = "+iii);
		
		MemberVo vo = (MemberVo)vvv.elementAt(3);
		vo.memberPrint();
		
		Integer ttt = (Integer)vvv.elementAt(4);
		System.out.println("ttt = "+ttt);
		
		System.out.println(vvv.toString()); //배열처럼 보여줌 [홍길동,...,25010,MemberVo주소]
	}

	public static void main(String[] args) {
	
		new VectorMain();
		
	}

}
