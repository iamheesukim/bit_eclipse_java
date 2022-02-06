import java.util.Arrays;
import java.util.Scanner;
public class Hw0615 { //0615����(�ζ� ��ȣ ����) : �����

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
		System.out.print("��� �Ͻðڽ��ϱ�? (1.�� / 2.�ƴϿ�) : ");
		Scanner s = new Scanner(System.in);
		int pick = s.nextInt();
		
		if(pick==2) {
			System.out.println("�ζ� ��ȣ ������ �����߽��ϴ�.");
			System.exit(0);
		}
	}
	

	public static void main(String[] args) {
		
		new Hw0615().start();

	}

}
