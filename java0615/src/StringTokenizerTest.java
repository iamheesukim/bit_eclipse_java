import java.util.StringTokenizer;
public class StringTokenizerTest { //0615-5

	public StringTokenizerTest() {
		
		String txt = "서울시, 마포구, 신수동. 거구빌딩, 3층, 비트캠프, 교육센터";
		
		//st 객체 선언
		StringTokenizer st = new StringTokenizer(txt,",."); //,와 .로 구분 (하나만 써도됨)
		
		//countTokens() : 토큰 수(나눠진 갯수)
		int tokenCount = st.countTokens();
		System.out.println("토큰수 : "+tokenCount);

		//각 토큰마다 하나씩
		while(st.hasMoreElements()) { //true : 남은 토큰이 있을때, false : 남은 토큰이 없을때
			String token = st.nextToken();
			System.out.println(token);
			
		}
		
		
	}

	public static void main(String[] args) {
		new StringTokenizerTest();

	}

}
