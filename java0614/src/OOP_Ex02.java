import java.util.Scanner;

public class OOP_Ex02 { //0614-9

	int dan; // �Է¹��� ���� ������ ���� = 0;
	String gugu = ""; // �������� ������ ����

	public OOP_Ex02() {

		/*
		int dan = danInput();
		String result = gugudan(dan);
		System.out.println(result);
		*/

		//System.out.println(gugudan(danInput()));
	}

	// �� �Է� �ޱ�
	int danInput() {
		Scanner scan = new Scanner(System.in);
		System.out.print("�� �Է� =");
		return scan.nextInt();
	}

	// ������ ����ϱ�
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
 �ֿܼ��� ���� �Է¹޾� �Է¹��� �������� ����϶�
 */