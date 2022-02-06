//package review;
//
//import java.util.Arrays;
//import java.util.Scanner;
//
//public class LottoReviewOOP {
//	Scanner s = new Scanner(System.in);
//	
//	public void start() {
//		do { 
//			int g = game();
//			printResult(g);
//			if(yesNo()) break;
//		}
//		
//		while(true);
//	}
//
//	// 게임 수 입력
//	public int game() {
//		System.out.print("게임 수 : ");
//		int game = s.nextInt();
//		return game;
//	}
//	
//	// 난수 생성
//	public int[] makeNum() {
//		int[] arr = new int[7]; //크기가 7
//		
//		for(int i=0; i<arr.length; i++) {
//			arr[i]=(int)(Math.random()*(45-1+1))+1; //1~45
//			
//			//중복검사
//			for(int j=0;j<i;j++) {
//				if(arr[i]==arr[j]) i--;
//			}
//		}
//		//정렬
//		Arrays.sort(arr,0,6);
//		return arr;
//	}
//	
//	public void printResult(int game) {
//		for(int i=1;i<=game;i++) {
//			int[] num = makeNum();
//			System.out.print(i+"번째 게임 : ");
//			System.out.print(Arrays.toString(Arrays.copyOfRange(num,0,6)));
//			System.out.println("보너스 : "+num[num.length-1]);
//		}
//	}
//
//	public String lastPick() {
// 
//			System.out.print("계속 하시겠습니까? (y or n) : ");
//			String pick = s.nextLine();
//			
//			return pick;
//	}
//	
//	public boolean yesNo() {
//		
//			String pick = lastPick();
//			
//			if(pick.equalsIgnoreCase("y")) {
//				System.out.println("게임을 재실행합니다.");
//				return true;
//			}
//			else if (pick.equalsIgnoreCase("n")) {
//				System.out.println("게임을 종료합니다.");
//				return false;
//			}
//	}
//
//	public static void main(String[] args) {
//		
//		LottoReviewOOP lr = new LottoReviewOOP();
//		lr.start();
//	}
//
//}
