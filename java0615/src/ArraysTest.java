import java.util.Arrays;

public class ArraysTest { //0615-6

	public ArraysTest() {
		//Arrays : 배열 관련 처리 클래스
		int[] data = {15,90,45,75,26,9,48,95,12,40};
		Arrays.sort(data); //오름차순
		
		System.out.println(data); //[I@2401f4c3(16진수) 배열 생성 주소(해시코드)
		System.out.println(Arrays.toString(data));
		
		int[] data2 = {15,90,45,75,26,9,48,95,12,40};
		Arrays.sort(data2,2,5); //[2]부터 [5]직전까지 오름차순
		System.out.println(Arrays.toString(data2));
		//Arrays.toString(배열명) : 배열 문자열로 출력
		//copyOfRange(배열명,0,0) : [0]부터 [0]까지 일부 범위만
		//Arrays.toString(copyOfRange(배열명,0,0)) : 0부터 0까지 문자열로 출력
	}

	public static void main(String[] args) {
		new ArraysTest();

	}

}
