import java.util.Scanner;
public class ArrayEx01 { //0609-3

	public static void main(String[] args) {
		//배열을 이용하는 예제
		//7과목의 점수를 입력받아서 총점,평균을 구하라
		//국어 영어 수학 과학 물리 한국사 도덕
		
		Scanner s = new Scanner(System.in);
		
		//과목의 제목으로 나올 데이터를 배열에 보관
		String[] title = {"국어","영어","수학","과학","물리","한국사","도덕"};
		
		//각 과목의 점수를 보관할 배열
		int score[] = new int[7]; //0~6
		
		int sum=0;
		
		for(int idx=0;idx<title.length;idx++) {
			System.out.print(title[idx]+"=");
			score[idx]=s.nextInt();
			sum = sum+score[idx];
		}
		
		System.out.println("총점 : "+sum);
		System.out.println("평균 : "+sum/7);
		
		/*
		for(int idx=0;idx<title.length;idx++) {
			System.out.println(score[idx]);
		}
		*/

	}

}