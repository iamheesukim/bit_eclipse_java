package Hw0616; //3������

class Xxx { //���� �׽�Ʈ���ϴ��� �� �ٲ��
	Xxx() { //�����ڸ޼ҵ�
		System.out.print(1);
	}
	
	Xxx(int x) {
		//this(); //Xxx()���� ->1
		System.out.print(2);
	}
}

public class Yyy extends Xxx { //����Ŭ���� : Xxx

	Yyy() { //������ �޼ҵ�
		//super(6); //Xxx(6) ����
		System.out.print(3);
	}
	
	Yyy(int y) {
		super(y);
		//this(); //Yyy() ����
		System.out.println(4);
		
	}

	public static void main(String[] args) {
		Yyy a = new Yyy(2);

	}

}
