import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.TreeSet;
	public class Lotto0621 { //0621-10
		
		//컬렉션 클래스 활용하여 만들기

	Random random = new Random();
	Scanner scan = new Scanner(System.in);
	
	public Lotto0621() {
	}
	
	//1게임 만들기 + 보너스 포함, 중복검사
	public void lottoCreate(int i) {
		
		//중복제거, 정렬
		TreeSet<Integer> lotto = new TreeSet<Integer>();
		int num=0;
		while(lotto.size()<7) {
			//로또번호 생성
			num = random.nextInt(45)+1;
			lotto.add(num);

		}
		//lotto TreeSet 번호 7개가 있고, num에는 마지막으로 만든 번호가 있다.
		//bonus 번호는 로또 번호에서 지운다. TreeSet 번호 6개가 있다.
		lotto.remove(num);
		
		lottoPrint(i, lotto.toString(), num);
	}
	
	
	//출력
	public void lottoPrint(int cnt, String lotto, int bonus) {
		System.out.print(cnt+"번째 게임 = ");
		System.out.print(lotto);
		System.out.println(", bonus = "+bonus);
	}
	
	//반복 여부 확인 메소드
	public boolean yesNo() {
		do {
		System.out.print("계속 하시겠습니까? (y:예 n:아니오)"); //이번엔 숫자가 아닌 문자로 받아보기
		String qa = scan.nextLine();
		//y반복 n종료 그외다시
		
		if(qa.equalsIgnoreCase("y")) { //대소문자 구분 없이 y랑 같은지 확인
			return true;
		}
		else if(qa.equalsIgnoreCase("n")) return false;
		} //do 끝
		
		while(true);
	}

	public void lottoStart() {
		do {
			System.out.print("게임수 = ");
			int game = Integer.parseInt(scan.nextLine());
			//게임
			for(int i=1; i<=game; i++) {
				lottoCreate(i);
			}
			//계속 여부
			if(!yesNo()) {
				break;
			}
		}
		while(true);
	}
	

	public static void main(String[] args) {
		Lotto0621 oop = new Lotto0621();
		
		oop.lottoStart();
	}

}
