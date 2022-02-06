import java.util.Scanner;
import java.util.Calendar;

public class Hw0614 { // 6월14일 과제 김희수 : 달력 출력 메소드 이용해서 만들기
	
	Scanner s = new Scanner(System.in);
	Calendar now = Calendar.getInstance();
	int year, month,week, lastday;
	
	public Hw0614() {
	}
	
	void setInput() {
		System.out.print("년도 = ");
		year = s.nextInt();
		System.out.print("월 = ");
		month = s.nextInt();
		now.set(year, month-1,1); //1일로 설정 1월 0, 2월 1, ...
		week = now.get(Calendar.DAY_OF_WEEK); //일월화수목금토 1234567
	}
	
	void printFirst(int a, int b) { //첫줄 입력
		System.out.println("\t\t"+a+"년 "+b+"월");
		System.out.println("일\t월\t화\t수\t목\t금\t토");
	}
	
	void lastDay() {
		lastday = 31;
		switch(month) {
		case 4:
		case 6:
		case 9:
		case 11: lastday = 30; break;
		case 2: lastday = 28;
		
		if ((year%4==0) && (year%100 != 0) || (year%400==0)) lastday = 29;
			break;
		}
	}
	
	void blankFirst() {
		for(int s=1; s<week; s++) {
			System.out.print("\t");
		}
	}
	
	void printOut() {
		for(int d=1;d<=lastday;d++) {
			System.out.print(d+"\t");
			if((d+week-1)%7==0){ //출력한 문자가 7의 배수면 줄 바꾸기
				System.out.println();
			}
		}
	}
	
	void start() {
		setInput();
		printFirst(year,month);
		lastDay();
		blankFirst();
		printOut();
	}

	public static void main(String[] args) {
		
		Hw0614 ca = new Hw0614();
		ca.start();

	}

}
