import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.TreeSet;
	public class Lotto0621 { //0621-10
		
		//�÷��� Ŭ���� Ȱ���Ͽ� �����

	Random random = new Random();
	Scanner scan = new Scanner(System.in);
	
	public Lotto0621() {
	}
	
	//1���� ����� + ���ʽ� ����, �ߺ��˻�
	public void lottoCreate(int i) {
		
		//�ߺ�����, ����
		TreeSet<Integer> lotto = new TreeSet<Integer>();
		int num=0;
		while(lotto.size()<7) {
			//�ζǹ�ȣ ����
			num = random.nextInt(45)+1;
			lotto.add(num);

		}
		//lotto TreeSet ��ȣ 7���� �ְ�, num���� ���������� ���� ��ȣ�� �ִ�.
		//bonus ��ȣ�� �ζ� ��ȣ���� �����. TreeSet ��ȣ 6���� �ִ�.
		lotto.remove(num);
		
		lottoPrint(i, lotto.toString(), num);
	}
	
	
	//���
	public void lottoPrint(int cnt, String lotto, int bonus) {
		System.out.print(cnt+"��° ���� = ");
		System.out.print(lotto);
		System.out.println(", bonus = "+bonus);
	}
	
	//�ݺ� ���� Ȯ�� �޼ҵ�
	public boolean yesNo() {
		do {
		System.out.print("��� �Ͻðڽ��ϱ�? (y:�� n:�ƴϿ�)"); //�̹��� ���ڰ� �ƴ� ���ڷ� �޾ƺ���
		String qa = scan.nextLine();
		//y�ݺ� n���� �׿ܴٽ�
		
		if(qa.equalsIgnoreCase("y")) { //��ҹ��� ���� ���� y�� ������ Ȯ��
			return true;
		}
		else if(qa.equalsIgnoreCase("n")) return false;
		} //do ��
		
		while(true);
	}

	public void lottoStart() {
		do {
			System.out.print("���Ӽ� = ");
			int game = Integer.parseInt(scan.nextLine());
			//����
			for(int i=1; i<=game; i++) {
				lottoCreate(i);
			}
			//��� ����
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
