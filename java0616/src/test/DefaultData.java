package test;

public class DefaultData { //0616-2(2)
	String name = "홍길동"; //default : 같은 패키지
	//public String name = "홍길동"; //모든 패키지, 클래스
	String tel = "010-1234-5678";
	//public String tel = "010-1234-5678";
	
	//보통 전역변수는 public를 하지않음!!!! (메소드로 가져감)

	public DefaultData() { //생성자 메소드
	}
	
	public DefaultData (String name, String tel) {
		this.name = name; //전역 지역
		this.tel = tel; //전역 지역
	}
	
	public static void sum() {
		int tot =0;
		
		for(int i=1; i<100; i++) {
			tot += i;
		}
		System.out.println("tot="+tot);
	}
	
	public String getName() {
		return name;
		//변수 값을 가져가고 싶으면 보통 이렇게 return으로 값을 주는 메소드를 생성함
		
		//메소드를 static으로 하면 name 값을 찾을 수가 없음.
		//name이 static이 아니기 때문.
	}

}
