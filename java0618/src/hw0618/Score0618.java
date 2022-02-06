package hw0618;

import java.util.*;

public class Score0618 { //0618 성적표 구하기 과제

	public static void main(String[] args) {
		
		do {
		try {
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("학생수를 입력하세요 : ");
		int cnt = Integer.parseInt(s.nextLine());

		String name[] = new String[cnt]; //이름저장
		int score[][] = new int[cnt+2][6]; //점수저장
		
		//이름과 점수를 입력받아 배열에 저장
		String title[] = {"국어","영어","수학"};
		for(int i=0; i<cnt; i++) {
			System.out.print((i+1)+"번쨰 학생 이름을 입력하세요 : ");
			name[i] = s.nextLine();
			for (int j=0; j<title.length;j++) { //열번호
				System.out.print(title[j]+" 점수를 입력 하세요 : ");
				score[i][j] = Integer.parseInt(s.nextLine());
				if(score[i][j]<1 ||score[i][j]>100) 
					//강제 예외 만들기 1~100 예외
					throw new Exception("1~100 사이의 점수를 입력하세요!!\n========== 재실행합니다 ==========");
				
			}
			
		}
		
		//개인별 총점,평균
		//과목별 총점
		for(int i=0;i<cnt;i++) {
			for(int j=0;j<3;j++) { // 0 1 2
				score[i][3] += score[i][j];
				score[cnt][j] += score[i][j];
				
			}
			//개인별 평균
			score[i][4] = score[i][3]/3;
		}
		
		//과목별 평균
		for(int i=0;i<3;i++) {
			score[cnt+1][i] = score[cnt][i]/cnt;
		}
		
		//석차 구하기
		for (int i=0; i<cnt; i++) { //0 1 2 3
			//i가 본인 점수 위치
			for(int j=0; j<cnt; j++) {
				// 내점수     상대점수
				if(score[i][3] < score[j][3]) {
					score[i][5]++;
				}
			}
			score[i][5]++;
		}
		
		//석차순으로 정렬
		for(int i=0; i<cnt-1; i++) { //3명 -> 0 1
			//          3-1-0
			for (int j=0;j<cnt-1;j++) {
				if (score[j][5] > score[j+1][5]) {
					//교환
					//이름바꾸기
					for (int k=0;k<score[j].length; k++) {
						int temp = score[j][k];
						score[j][k] = score[j+1][k];
						score[j+1][k]=temp;
						
					}
				}
			}
		}
		
		
		//출력
		System.out.println("====================================================");
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균\t석차");
		System.out.println("====================================================");
		
		for(int i=0; i<cnt; i++) {
			//이름 출력
			System.out.print(name[i]+"\t");
			//점수 출력 국 영 수 총점 평균
			for (int j=0;j<score[i].length;j++) {
				System.out.print(score[i][j]+"\t");
			}
			System.out.println();
		}
		
		//과목별 총점
		System.out.print("총점 : \t");
		for(int i=0; i<3; i++) { //0 1 2 (과목이3개니까)
			System.out.print(score[cnt][i]+"\t");
		}
		
		System.out.println();
		//과목별 평균
		System.out.print("평균 : \t");
		for(int i=0;i<3;i++) {
			System.out.print(score[cnt+1][i]+"\t");
		}
		System.out.println(); break;
		
		}
		
		
		catch(NumberFormatException im) {
			System.out.println("숫자를 입력하세요!!");
			System.out.println("========== 재실행합니다 ==========");
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		}
		while(true);
		

}
}