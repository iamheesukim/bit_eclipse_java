import java.util.Scanner;
import java.util.Calendar;

public class Hw0614 { // 6��14�� ���� ����� : �޷� ��� �޼ҵ� �̿��ؼ� �����
	
	Scanner s = new Scanner(System.in);
	Calendar now = Calendar.getInstance();
	int year, month,week, lastday;
	
	public Hw0614() {
	}
	
	void setInput() {
		System.out.print("�⵵ = ");
		year = s.nextInt();
		System.out.print("�� = ");
		month = s.nextInt();
		now.set(year, month-1,1); //1�Ϸ� ���� 1�� 0, 2�� 1, ...
		week = now.get(Calendar.DAY_OF_WEEK); //�Ͽ�ȭ������� 1234567
	}
	
	void printFirst(int a, int b) { //ù�� �Է�
		System.out.println("\t\t"+a+"�� "+b+"��");
		System.out.println("��\t��\tȭ\t��\t��\t��\t��");
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
			if((d+week-1)%7==0){ //����� ���ڰ� 7�� ����� �� �ٲٱ�
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
