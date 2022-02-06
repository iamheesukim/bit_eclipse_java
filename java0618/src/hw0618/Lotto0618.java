package hw0618;

import java.util.Arrays;
import java.util.Scanner;
import java.util.*;

public class Lotto0618 { //0618����(�ζ� ��ȣ ����) : �����

	public Lotto0618() {
	}
	
	public void start() {
		do {
			try {
				firstPrint();
				int game = inputGame();
				lotto(game);
				lastPick();
			}
			catch(InputMismatchException im) {
				System.out.println("���ڸ� �Է��ϼ���!!");
			}
		}
		
		while (true);
	}
	
	public void firstPrint() {
		System.out.print("���� �� : ");
	}
	
	public int inputGame() { //���� Ƚ�� �Է�
		Scanner s = new Scanner(System.in);
		return s.nextInt();
	}
	
	public void lotto(int game) { //�ݺ�
		for (int i=1; i<=game; i++) {
			System.out.printf(i+"��° ���� : ");
			makeNumber();
		}
	}
	
	public void makeNumber() { //����
		int[] num = new int[7];
		for (int i=0;i<num.length;i++) { //���� ����
			num[i]=(int)(Math.random()*45)+1; //1~45
			
			//�ߺ� ����
			for (int c=0;c<i;c++) {
				if(num[i]==num[c]) {
					i--; //�׷� �ٽ� ���� for������ �ݺ� -> ���ο� ���� -> �� �˻�
				}}
		}
		
		//��������
		Arrays.sort(num,0,6); //[0]~[5]
		for (int i=0; i<num.length-1; i++) {
			System.out.print(num[i]+"\t");
		}
		System.out.print("���ʽ� ���� : "+num[6]);
		System.out.println();
	}
	
	public void lastPick() {
		do {
		try {
			System.out.print("��� �Ͻðڽ��ϱ�? (1.�� / 2.�ƴϿ�) : ");
			Scanner s = new Scanner(System.in);
			int pick = s.nextInt();
		
			if(!(pick==1 || pick==2)) { // 1�Ǵ� 2 �ƴϸ� ���� ����
				throw new Exception("1�Ǵ� 2�� �Է��ϼ���!!");
			}
			
			if(pick==1) {
				System.out.println("������ ������մϴ�.");
				System.out.println("==============================");
				break;
			}
		
			if(pick==2) {
				System.out.println("�ζ� ��ȣ ������ �����߽��ϴ�.");
				System.exit(0);
			}
		}
			

		catch(InputMismatchException im) {
			System.out.println("���ڰ� �ƴ� 1 �Ǵ� 2�� �Է��ϼ���!!");
		}
		catch(Exception pe) {
			System.out.println(pe.getMessage());
		}
		
		}
		
		while(true);
	}
	

	public static void main(String[] args) {
		
		new Lotto0618().start();

	}

}
