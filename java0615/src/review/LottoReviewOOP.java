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
//	// ���� �� �Է�
//	public int game() {
//		System.out.print("���� �� : ");
//		int game = s.nextInt();
//		return game;
//	}
//	
//	// ���� ����
//	public int[] makeNum() {
//		int[] arr = new int[7]; //ũ�Ⱑ 7
//		
//		for(int i=0; i<arr.length; i++) {
//			arr[i]=(int)(Math.random()*(45-1+1))+1; //1~45
//			
//			//�ߺ��˻�
//			for(int j=0;j<i;j++) {
//				if(arr[i]==arr[j]) i--;
//			}
//		}
//		//����
//		Arrays.sort(arr,0,6);
//		return arr;
//	}
//	
//	public void printResult(int game) {
//		for(int i=1;i<=game;i++) {
//			int[] num = makeNum();
//			System.out.print(i+"��° ���� : ");
//			System.out.print(Arrays.toString(Arrays.copyOfRange(num,0,6)));
//			System.out.println("���ʽ� : "+num[num.length-1]);
//		}
//	}
//
//	public String lastPick() {
// 
//			System.out.print("��� �Ͻðڽ��ϱ�? (y or n) : ");
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
//				System.out.println("������ ������մϴ�.");
//				return true;
//			}
//			else if (pick.equalsIgnoreCase("n")) {
//				System.out.println("������ �����մϴ�.");
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
