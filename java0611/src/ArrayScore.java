import java.util.Scanner;
public class ArrayScore { //0611-3 (문제풀기)

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("학생수 : ");
		int num = s.nextInt();
		int[][] score = new int [num+2][6];
		String[][] namearr = new String[num+2][1];
		namearr[num][0]="과목별 총점";
		namearr[num+1][0]="과목별 평균";
		
		for(int i=0;i<num;i++) { //입력
			 
			System.out.printf("%d번째 학생 정보 입력\n",i+1);
		
			System.out.print("이름 : ");
			namearr[i][0] = s.next();
		
			System.out.print("국어 점수 : ");
			score[i][0] = s.nextInt();
		
			System.out.print("영어 점수 : ");
			score[i][1] = s.nextInt();
		
			System.out.print("수학 점수 : ");
			score[i][2] = s.nextInt();
			
			score[i][3] = score[i][0]+score[i][1]+score[i][2]; //총점
			score[i][4] = score[i][3]/3; //평균
			
			score[i][5] = 0; //석차는 임시로 0
		
		}
		
		System.out.println("===================================================");
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균\t석차");
		System.out.println("===================================================");
		
		for(int r=0;r<num;r++) { //과목별 총점 평균
			for(int c=0;c<3;c++) {
				score[num][c] += score[r][c];
				score[num+1][c] = score[num][c]/num;
			}
		}
		
		//출력
		
		for(int r=0;r<score.length;r++) {
			System.out.print(namearr[r][0]+"\t");
			
			for(int c=0;c<score[r].length;c++) {
				System.out.print(score[r][c]+"\t");
			}
			System.out.println();
		}
		
		int cnt=1;
		
		
		//석차가 어렵네.... 이해는 되는데... 코드를 어떻게 짜지..
	}

}

/*
 한 줄에 여러 정보를 입력해서 인식 할때.
 int a = Integer.parseInt(scan.nextLine()); //일단 문자로 읽어오고 숫자로 바꿔서 인식
 */
