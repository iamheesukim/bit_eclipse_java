
public class StringbufferTest { //0615-4

	public StringbufferTest() {
		start();
	}
	
	public void start() {
		StringBuffer sb1 = new StringBuffer(); //기본 16byte
		StringBuffer sb2 = new StringBuffer(100); //100byte
		
		System.out.println("sb1.capacity = "+sb1.capacity());
				
		//append() : 문자열추가
		sb1.append("Buffer append Test..");
		sb2.append(123456);
		
		
		//insert() : index 위치에 삽입
		sb1.insert(5,  "(스트링버퍼)");
		//Buffe(스트링버퍼)r append Test..
		
		//deleteCharAt() : []자리만 제거
		sb1.deleteCharAt(6);
		//[6]자리만 제거
		//Buffe(트링버퍼)r append Test..
		
		//delete() : 여러 인덱스 제거
		sb1.delete(1,4); //"[1]부터 [4]직전까지 지우기"
		//Be(트링버퍼)r append Test..
		
		//replace() : [0]부터 [0]직전까지 치환
		sb1.replace(1,3,"(자바)"); //index 1부터 3앞까지를 "(자바)"로 치환
		//B(자바)트링버퍼)r append Test..
		
		//reverse() : 거꾸로 출력
		sb1.reverse();

		//확보된 공간 확인하기
		//capacity() : 용량 출력
		//System.out.println("sb1.capacity = "+sb1.capacity()); //용량 출력
		System.out.println("sb2.capacity = "+sb2.capacity());
		System.out.println(sb1);
		System.out.println(sb2);
		
	}
	

	public static void main(String[] args) {
		new StringbufferTest();
	}

}
