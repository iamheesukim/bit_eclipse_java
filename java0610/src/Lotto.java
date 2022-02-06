import java.util.Scanner;
public class Lotto { //0610-2

	public static void main(String[] args) {
		//로또 번호 생성기
		
		Scanner s = new Scanner(System.in);
		int last;
		
		do {
			System.out.print("게임 수 = ");
			int game = s.nextInt();
			
			int[] num = new int [7];
			for (int j=1;j<=game;j++) {
				
				System.out.printf("%d 게임 : ",j);
				
				for (int i=0;i<num.length;i++) { //난수 배정
					num[i]=(int)(Math.random()*45)+1; //1~45
					
					//중복 제거
					//새로 생성된 난수와 그 전 앞선걸 비교하면 됨
					for (int c=0;c<i;c++) {
						if(num[i]==num[c]) {
							i--; //그럼 다시 위의 for문으로 반복 -> 새로운 난수 -> 또 검사
						}
					}
					}
										 
				//정렬 : 보너스 제외해야하므로 반복은 전체길이-2
				for (int k=0;k<num.length-2;k++) {
				for (int i=0;i<num.length-2;i++) {
					if(num[i]>num[i+1]) {
						int tmp = num[i];
						num[i]=num[i+1];
						num[i+1]=tmp; }
					} }
				
				//출력
				for (int i=0;i<num.length-1;i++) {
					System.out.printf("%d\t", num[i]);
				}
				System.out.printf("보너스 : %d\n",num[num.length-1]);
					
			} //게임수 반복
			
			System.out.print("계속 하시겠습니까? (1.예, 2.아니오) : ");
			last = s.nextInt();
			System.out.println();
			
			
			
		} //do 끝
		
		while (last==1);
		// 이부분을 true로 무한반복 돌리고 위에서 if문 써서 2번 누르면 break해도 됨.
	}
}