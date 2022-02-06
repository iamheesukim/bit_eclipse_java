public class MethodTest2 { //0614-3(1)

	boolean power = false;

	//채널
	//상수화 : 변경될 수 없는 값
	//데이터형 왼쪽에 final
	//상수화된 변수는 모든 변수명을 대문자로 표시.

	final int CHANNEL_MIN = 1; //고정
	final int CHANNEL_MAX = 20; //고정
	int channelNow = 11; //계속 변하는 데이터

	public MethodTest2() { //생성자메소드
		//클래스명과 같다
	}

	//power 버튼을 누른 경우

	//void : 반환형이 없다.
	//소문자로 시작, 합성어일경우 두번째단어부터 대문자로 ()가 있다
	void powerStart() {

		power = !power;

		/* 이렇게 코드를 짤 수도 있음
		if(power) {
			power=false;
		}
		else power=true;
	}
	*/
		
	System.out.println("power = "+power);
	}
	
	//채널 번호 올리기
	void channelUp() {
		if (channelNow == CHANNEL_MAX) {
			channelNow = CHANNEL_MIN;
		}
		else channelNow++;
		channelPrint();
	}

	//채널 번호 내리기
	void channelDown() {
		if (channelNow == CHANNEL_MIN) {
			channelNow = CHANNEL_MAX;
		}
		else channelNow--;
		channelPrint();
	}

	//채널번호 출력
	void channelPrint() {
		System.out.println("채널 번호 : "+channelNow);
	}
}