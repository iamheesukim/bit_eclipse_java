public class BubbleSortTest {

	public static void main(String[] args) {
		
		int num[] = new int[10];
		
		System.out.println("정렬 전 데이터 출력");
		
		//난수생성 1~100
		for(int i=0; i<num.length; i++) { //i=0 1 2 3 4...9 i<10
			int ran = (int)(Math.random()*(100-1+1))+1;
			num[i]=ran;
			
			//정렬 전 데이터 출력
			System.out.printf("%d\t", num[i]);
		}
		System.out.println();
		System.out.println();
		
		
		for(int i=0;i<num.length-1;i++) { // 0 1 2 3 4  ...8
			if (num[i]>num[i+1]) { //교환
				int tmp = num[i];
				num[i]=num[i+1];
				num[i+1]=tmp;
			}
				
		}
		
		System.out.println("정렬 후 데이터");
		
		
		for(int i =0;i<num.length;i++) {
		System.out.printf("%d\t",num[i]);
		}
		
		for(int j=0;j<num.length-1;j++) {// 0 1 2 3 4  ...8
			for(int i=0;i<num.length-1-j;i++) { 
				if (num[i]>num[i+1]) { //교환
					int tmp = num[i];
					num[i]=num[i+1];
					num[i+1]=tmp;
				}
					
			}
			
			System.out.println();
			System.out.println();
			
			for(int i =0;i<num.length;i++) {
				System.out.printf("%d\t",num[i]);
				}
		}
	}
}

//https://medium.com/@fiv3star/%EC%A0%95%EB%A0%AC%EC%95%8C%EA%B3%A0%EB%A6%AC%EC%A6%98-sorting-algorithm-%EC%A0%95%EB%A6%AC-8ca307269dc7