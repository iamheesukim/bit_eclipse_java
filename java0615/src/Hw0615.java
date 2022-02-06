import java.util.Arrays;
import java.util.Scanner;
public class Hw0615 { //0615과제(로또 번호 생성) : 김희수

	public Hw0615() {
	}
	
	public void start() {
		do {
			firstPrint();
			int game = inputGame();
			lotto(game);
			lastPick();
		}
		
		while (true);
	}
	
	public void firstPrint() {
		System.out.print("게임 수 : ");
	}
	
	public int inputGame() { //게임 횟수 입력
		Scanner s = new Scanner(System.in);
		return s.nextInt();
	}
	
	public void lotto(int game) { //반복
		for (int i=1; i<=game; i++) {
			System.out.printf(i+"번째 게임 : ");
			makeNumber();
		}
	}
	
	public void makeNumber() { //난수
		int[] num = new int[7];
		for (int i=0;i<num.length;i++) { //난수 배정
			num[i]=(int)(Math.random()*45)+1; //1~45
			
			//중복 제거
			for (int c=0;c<i;c++) {
				if(num[i]==num[c]) {
					i--; //그럼 다시 위의 for문으로 반복 -> 새로운 난수 -> 또 검사
				}}
		}
		
		//오름차순
		Arrays.sort(num,0,6); //[0]~[5]
		for (int i=0; i<num.length-1; i++) {
			System.out.print(num[i]+"\t");
		}
		System.out.print("보너스 숫자 : "+num[6]);
		System.out.println();
	}
	
	public void lastPick() {
		System.out.print("계속 하시겠습니까? (1.예 / 2.아니오) : ");
		Scanner s = new Scanner(System.in);
		int pick = s.nextInt();
		
		if(pick==2) {
			System.out.println("로또 번호 생성을 종료했습니다.");
			System.exit(0);
		}
	}
	

	public static void main(String[] args) {
		
		new Hw0615().start();

	}

}
