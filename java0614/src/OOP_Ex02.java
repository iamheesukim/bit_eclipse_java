import java.util.Scanner;

public class OOP_Ex02 { //0614-9

	int dan; // 입력받은 단을 저장할 변수 = 0;
	String gugu = ""; // 구구단을 저장할 변수

	public OOP_Ex02() {

		/*
		int dan = danInput();
		String result = gugudan(dan);
		System.out.println(result);
		*/

		//System.out.println(gugudan(danInput()));
	}

	// 단 입력 받기
	int danInput() {
		Scanner scan = new Scanner(System.in);
		System.out.print("단 입력 =");
		return scan.nextInt();
	}

	// 구구단 출력하기
	void gugudan() {
		for(int i=2;i<=9;i++) {
			gugu = gugu+ dan+"*"+i+"="+dan*i+"\n";
		}
	}

	void start() {
		dan = danInput();
		gugudan();
		System.out.println(gugu);
	}

	public static void main(String[] args) {

		OOP_Ex02 oop = new OOP_Ex02();
		oop.start();

		//System.out.println(oop.gugudan(oop.danInput()));

	}
}

/*
 콘솔에서 단을 입력받아 입력받은 구구단을 출력하라
 */