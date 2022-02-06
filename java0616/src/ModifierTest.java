import test.DefaultData;

public class ModifierTest { //0616-2(1)

	public ModifierTest() {
//		LottoOOP lotto = new LottoOOP();
//		lotto.lottoStart(); //lotto객체와 연결된 LottoOOP 클래스에 있는 lottoStart 메소드를 실행
		
		DefaultData dd = new DefaultData();
		
		//객체명.멤버변수
		
		//System.out.println("이름="+dd.name); -> 오류
		//클래스가 public이더라도 변수가 default이면 가져올 수 없음
		//변수가 public이면 됨.
		
		System.out.println("이름="+dd.getName()); //메소드로 값 가져오기
		//System.out.println("연락처="+dd.tel);
		
		DefaultData dd2 = new DefaultData("이순신","010-8888-8888");
		//생성자메소드가 default이면 오류
		//public이면 오류x
		
		//dd2.sum();
		DefaultData.sum();
		//메소드 앞에 static이 있으면 공통이므로 객체명.메소드()가 아니라, 클래스명.메소드() !
		
		//DefaultData.getName();
	}

	public static void main(String[] args) {
		// 접근제한자
		// 클래스 : public default(생략)
		// 생성자메소드, (일반)메소드, 멤버변수 : public protected default private
		// 지역변수 : X
		new ModifierTest();

	}

}
