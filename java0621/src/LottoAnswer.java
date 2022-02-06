import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class LottoAnswer {
	Random random = new Random(); //���۷��� ����
	Scanner scan = new Scanner(System.in); //���۷��� ����
	public LottoAnswer() {
	
	}
	//1���Ӹ���� + ���ʽ� ����, �ߺ��˻�
	public int[] lottoCreate() {
		int lotto[] = new int[7];
		for(int i=0; i<lotto.length; i++) {// 0,	6
			//�ζǹ�ȣ ����
			lotto[i] = random.nextInt(45)+1;
			//�ߺ��˻� ȣ�� 
			i = doubleCheck(lotto,i);
		}
		return lotto;
	}
	//�ߺ��˻�
	public int doubleCheck(int lotto[], int i) {
		for(int j=0; j<i; j++) {
			if(lotto[j] == lotto[i]) {
				i--;
				break;
			}
		}
		return i;
	}
	
	//���
	public void lottoPrint(int cnt, int lotto[]) {
		System.out.print(cnt+"����=");
		System.out.print(Arrays.toString(Arrays.copyOfRange(lotto, 0, 6)));//��ȣ
		System.out.println(", bonus="+lotto[6]);
	}

	//��ӿ��� Ȯ���ϴ� �޼ҵ�
	public boolean yesNo() {
		do {
			System.out.print("����Ͻðڽ��ϱ�(y:��, n:�ƴϿ�)?");
			String qa =  scan.nextLine();
			//y:���(true), n:����(false), �׿� �ٽ� 
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
				System.out.print("���Ӽ�=");
				int game = Integer.parseInt(scan.nextLine()); // NumberFormatException
				// ����
				for (int i = 1; i <= game; i++) {
					int lotto[] = lottoCreate();
					Arrays.sort(lotto, 0, 6); // ����
					lottoPrint(i, lotto); // ���
				}
				// ��ӿ���
				if (!yesNo()) {
					break;
				}
			} catch (NumberFormatException nfe) {
				System.out.println("���Ӽ��� ���� �����̿��� �մϴ�.");
			}
		} while (true);
	}

	public static void main(String a[]) {
		LottoAnswer oop = new LottoAnswer();
		oop.lottoStart();

	}

}

/*
�ζ� ��ȣ :1~45���� ��ȣ 6�� ���ʽ� 1��

���� ���Ӽ� = 3 
1���� = 5,13,26,32,33,45, ���ʽ�11 
2���� = 11,23,26,32,35,41, ���ʽ�9 
3���� = 15,13,26,37,38,42, ���ʽ�23 
����Ͻðڽ��ϱ�(1.��, 2.�ƴϿ�)?1 
���Ӽ� = 5 
1���� =5,13,26,32,33,45, ���ʽ�11 
2���� = 11,23,26,32,35,41, ���ʽ�9 
3���� = 15,13,26,37,38,42, ���ʽ�23 
4���� = 1,23,26,32,35,41, ���ʽ�27 
5���� = 9,13,26,37,38,42, ���ʽ�45 
����Ͻðڽ��ϱ�(1.��, 2.�ƴϿ�)?1

*/