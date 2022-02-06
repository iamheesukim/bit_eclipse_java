
public class GugudanMethodTest {//0614-4(1)
	
	//단을 입력하면 구구단을 구하여 반환하는 메소드를 생성
	
	public GugudanMethodTest() {
	}

	String gugudan(int dan) {
	/*반환형 메소드명 (매개변수 (있없상관무)) {
		실행문; //기능구현
	 	 }
	*/
		String result="";
		for(int i=2;i<10;i++) {
			result += dan+"*"+i+"="+dan*i+"\n";
		}
		return result;
		//어떤 데이터가 나가는가? ->
		//String result이니까 문자열로 나감
		
	}

	//static 키워드
	//객체 없이 호출 가능
	static void sum(int max) {
		int tot = 0;
		for (int i=1;i<max;i++) {
			tot +=i;
		}
		System.out.println("1~"+max+"의 합은 "+tot);
	}

}
