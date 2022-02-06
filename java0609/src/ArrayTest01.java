
public class ArrayTest01 { //0609-1

	public static void main(String[] args) {
		//배열은 같은 데이터형의 변수를 여러개 선언할 때 필요
		//배열은 한번 생성되면 크기를 변경할 수 없다.

		//배열의 선언
		int[] data; //메모리할당
		int num[] = new int[5];
		//int[] num = new int[5]
		//정수:0 실수:0.0 논리형:false
		
		String name[] = new String[5]; //null
		
		num[2] = 100;
		name[1] = "홍길동";
		
		System.out.println("num[1] : "+num[1]);
		System.out.println("name[1] : "+name[1]);
		
		//num배열의 모든 값을 출력하라
		//num[0] num[1] num[2] num[3] num[4]
		
		/*
		
		for(int idx=0;idx<=4;idx++) {
			System.out.println("num["+idx+"] = "+num[idx]);
			
		*/
		
		//배열의 크기를 구하여 준다.
		//배열명.length -> 배열의 길이?갯수?를 구하여 준다.
			
		for(int idx=0;idx<num.length;idx++) {
			System.out.println("num["+idx+"] = "+num[idx]);
		
		}
		
		//배열 생성시 초기값 설정하는 방법1
		int[] data2 = new int[] {20,65,74,5,77,2}; //data2[0]~data2[5]
		for (int i=0; i<data2.length;i++) {
			System.out.println("data2["+i+"]= "+data2[i]);
		}
		
		//배열 생성시 초기값 설정하는 방법2
		int data3[] = {8,7,5,37,75};
		for (int i=0;i<data3.length;i++) {
			System.out.println("data3["+i+"]= "+data3[i]);
		}
		
		
	}
}