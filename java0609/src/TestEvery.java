public class TestEvery { //아무거나 연습용
	
	public TestEvery() {
	}
		
		public void start() { //반환형 없는 메소드
			String st1 = "서울시 마포구 신수동"; //일반 데이터
			String st3 = new String("서울시 마포구 신수동"); //객체
			String stData = st3; //객체를 주면 주소도 같아짐
			
			// '=='로는 일반데이터와 객체는 다르게 인식.
			if(st1==st3) System.out.println("일반데이터, 객체는 같다");
			else System.out.println("일반데이터, 객체는 다르다");
			
			// .equals() 는 내용만 확인해서 비교한다.
			if(st1.equals(st3)) System.out.println("equal를 쓰면 같다");
			else System.out.println("equal를 써도 다르다");
		}
		
	
	
	

	public static void main(String[] args) {
		new TestEvery().start();
	}
}
