
public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//배열의 선언
		int[] data; //메모리할당

		int num[] = new int[5];
		//int []num = new int[5];
		
		//num 배열의 모든 값을 출력하라
		for(int idx=0;idx<num.length;idx++) {
			System.out.println("num["+idx+"] = "+num[idx]);
		
		}
		
		//배열 생성 시 초기값을 설정하는 방법1
		int[] data2 = new int[] {20,65,74,5,77,2}; //data2[0]~data2[5]
		for (int i=0; i<data2.length;i++) {
			System.out.println("data2["+i+"]= "+data2[i]);
		}
		
		//방법2
		int data3[] = {8,7,5,37,75};
		for (int i=0;i<data3.length;i++) {
			System.out.println("data3["+i+"]= "+data3[i]);
		}
		
		//Array Copy
		//num배열에서 index2에서부터 3개만 복사를 하여 새로운 배열에 index5부터 대입
				int target[] = new int[10]; //0~9
				
				System.arraycopy(num, 2, target, 5, 3);
				
				for(int i=0;i<target.length;i++) {
					System.out.println("target["+i+"]= "+target[i]);
				}
	}

}
