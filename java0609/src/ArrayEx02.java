public class ArrayEx02 { //0609-7

	public static void main(String[] args) {
		/*
		 난수 1~1000 사이의 값을 100개 만들어 배열에 저장하고
		 생성된 난수 중 제일 큰 값과 제일 작은 값, 평균을 출력하라
		 */
		
		//100개의 정수를 저장할 배열
		int data[] = new int[100];
		
		for(int i=0;i<data.length;i++) {
			data[i]=(int)(Math.random()*1000)+1;
			System.out.println(data[i]);
		}
		
		//큰값 작은값 평균
		int sum=0;
		int max=data[0];
		int min=data[0];
		
		
		for(int i=0;i<data.length;i++) {
			sum += data[i];
			if(max<data[i]) max=data[i];
			if(min>data[i]) min=data[i];
		}
		int avg = sum/data.length;
	
		
		System.out.printf("총합 : %d\n",sum);
		System.out.printf("평균 : %d\n",avg);
		System.out.printf("최대 : %d\n",max);
		System.out.printf("최소 : %d\n",min);
		

	}

}
