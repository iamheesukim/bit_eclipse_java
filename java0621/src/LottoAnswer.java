import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class LottoAnswer {
	Random random = new Random(); //레퍼런스 변수
	Scanner scan = new Scanner(System.in); //레퍼런스 변수
	public LottoAnswer() {
	
	}
	//1게임만들기 + 보너스 포함, 중복검사
	public int[] lottoCreate() {
		int lotto[] = new int[7];
		for(int i=0; i<lotto.length; i++) {// 0,	6
			//로또번호 생성
			lotto[i] = random.nextInt(45)+1;
			//중복검사 호출 
			i = doubleCheck(lotto,i);
		}
		return lotto;
	}
	//중복검사
	public int doubleCheck(int lotto[], int i) {
		for(int j=0; j<i; j++) {
			if(lotto[j] == lotto[i]) {
				i--;
				break;
			}
		}
		return i;
	}
	
	//출력
	public void lottoPrint(int cnt, int lotto[]) {
		System.out.print(cnt+"게임=");
		System.out.print(Arrays.toString(Arrays.copyOfRange(lotto, 0, 6)));//번호
		System.out.println(", bonus="+lotto[6]);
	}

	//계속여부 확인하는 메소드
	public boolean yesNo() {
		do {
			System.out.print("계속하시겠습니까(y:예, n:아니오)?");
			String qa =  scan.nextLine();
			//y:계속(true), n:종료(false), 그외 다시 
			if(qa.equalsIgnoreCase("y")) {
				return true;
			}else if(qa.equalsIgnoreCase("n")){
				return false;
			}
		}while(true);
	}
	
	public void lottoStart() {
		do {
			try {
				System.out.print("게임수=");
				int game = Integer.parseInt(scan.nextLine()); // NumberFormatException
				// 게임
				for (int i = 1; i <= game; i++) {
					int lotto[] = lottoCreate();
					Arrays.sort(lotto, 0, 6); // 정렬
					lottoPrint(i, lotto); // 출력
				}
				// 계속여부
				if (!yesNo()) {
					break;
				}
			} catch (NumberFormatException nfe) {
				System.out.println("게임수는 양의 정수이여야 합니다.");
			}
		} while (true);
	}

	public static void main(String a[]) {
		LottoAnswer oop = new LottoAnswer();
		oop.lottoStart();

	}

}

/*
로또 번호 :1~45까지 번호 6개 보너스 1개

실행 게임수 = 3 
1게임 = 5,13,26,32,33,45, 보너스11 
2게임 = 11,23,26,32,35,41, 보너스9 
3게임 = 15,13,26,37,38,42, 보너스23 
계속하시겠습니까(1.예, 2.아니오)?1 
게임수 = 5 
1게임 =5,13,26,32,33,45, 보너스11 
2게임 = 11,23,26,32,35,41, 보너스9 
3게임 = 15,13,26,37,38,42, 보너스23 
4게임 = 1,23,26,32,35,41, 보너스27 
5게임 = 9,13,26,37,38,42, 보너스45 
계속하시겠습니까(1.예, 2.아니오)?1

*/