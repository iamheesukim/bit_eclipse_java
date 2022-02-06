import java.util.Scanner;
import java.util.*;

class MyException2 extends Exception{ //0621-1 (0618 과제답)

	public MyException2(String message) {
		super(message);
}
}

public class ScoreAnswer extends Exception { //0621-1 (0618 과제 답)
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		do {
			try {
				System.out.print("학생수 = ");
				int cnt = Integer.parseInt(scan.nextLine());
			
				
				//데이터 저장할 공간 확보
				String name[] = new String[cnt]; //이름저장
				int jumsu[][] = new int[cnt+2][6]; //점수저장
				
				//이름과 점수를 입력받아 배열에 저장
				String title[] = {"국어","영어","수학"};
				for(int i=0; i<cnt; i++) {
					System.out.print("이름 = ");
					name[i] = scan.nextLine();
					for (int j=0; j<title.length;j++) { //열번호
						try {
						System.out.print(title[j]+"=");
						jumsu[i][j] = Integer.parseInt(scan.nextLine());
						//한 줄에 여러 정보를 입력해서 인식 할때.
						 //int a = Integer.parseInt(scan.nextLine());
						 //일단 문자로 읽어오고 숫자로 바꿔서 인식
						
						// 현재 입력받는 과목명 알아내기
						if(jumsu[i][j]<0 || jumsu[i][j]>100) {
							// 강제 예외 발생
							throw new MyException2(title[j]+"점수는 0~100 사이의 값이어야 합니다.");
						}
					} //try
						catch(NumberFormatException ne) {
							System.out.println("점수는 0~100 사이의 값이어야 합니다!");
						}
						catch(MyException2 me) {
							System.out.println(me.getMessage());
							//다시 해당 과목의 점수를 입력받기 위해 j의 값 감소
							j--;
						}
				} }
			
			
			//개인별 총점,평균
			//과목별 총점
			for(int i=0;i<cnt;i++) {
				for(int j=0;j<3;j++) { // 0 1 2
					jumsu[i][3] += jumsu[i][j];
					jumsu[cnt][j] += jumsu[i][j];
					
				}
				//개인별 평균
				jumsu[i][4] = jumsu[i][3]/3;
			}
			
			//과목별 평균
			for(int i=0;i<3;i++) {
				jumsu[cnt+1][i] = jumsu[cnt][i]/cnt;
			}
			
			//석차 구하기
			for (int i=0; i<cnt; i++) { //0 1 2 3
				//i가 본인 점수 위치
				for(int j=0; j<cnt; j++) {
					// 내점수     상대점수
					if(jumsu[i][3] < jumsu[j][3]) {
						jumsu[i][5]++;
					}
				}
				jumsu[i][5]++;
			}
			
			//석차순으로 정렬
			for(int i=0; i<cnt-1; i++) { //3명 -> 0 1
				//          3-1-0
				for (int j=0;j<cnt-1;j++) {
					if (jumsu[j][5] > jumsu[j+1][5]) {
						//교환
						//이름바꾸기
						for (int k=0;k<jumsu[j].length; k++) {
							int temp = jumsu[j][k];
							jumsu[j][k] = jumsu[j+1][k];
							jumsu[j+1][k]=temp;
							
						}
					}
				}
			}
			
			
			//출력
			System.out.println("================");
			System.out.println("이름\t국어\t영어\t수학\t총점\t평균\t석차");
			System.out.println("================");
			
			for(int i=0; i<cnt; i++) {
				//이름 출력
				System.out.print(name[i]+"\t");
				//점수 출력 국 영 수 총점 평균
				for (int j=0;j<jumsu[i].length;j++) {
					System.out.print(jumsu[i][j]+"\t");
				}
				System.out.println();
			}
			
			//과목별 총점
			System.out.print("총점 : \t");
			for(int i=0; i<3; i++) { //0 1 2 (과목이3개니까)
				System.out.print(jumsu[cnt][i]+"\t");
			}
			
			System.out.println();
			//과목별 평균
			System.out.print("평균 : \t");
			for(int i=0;i<3;i++) {
				System.out.print(jumsu[cnt+1][i]+"\t");
			}
			System.out.println();
			
		}
		catch(InputMismatchException im) {
			System.out.println("0보다 큰 정수를 입력하세요");
		}
		}
		
		while (true);

	}

}
