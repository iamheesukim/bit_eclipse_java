//extends Ű���带 �̿��Ͽ� Ŭ������ ��ӹ޴´�.
//Ŭ������ 1���� ��ӹ��� �� �ִ�

public class Truck extends Car { //0616-6
	//����Ŭ����
	
	int speed=100;
	public Truck() {
		System.out.println("Truck()������ �޼ҵ� ����");
		System.out.println("Truck.speed = "+speed);
		super.speedUp(); //�������̵��� �߾ ����Ŭ������ �޼ҵ带 �� ���
	}
	
	public Truck(String carName) {
		//����Ŭ������ ������ �޼ҵ� ȣ��
		super(carName); //super = ����Ŭ����
		//string �Ű������� �޴� Car(string)�� ����
		
		//super(string)������
		//���� �⺻�� Car()���� �� -> Truck(String) ����
		
		System.out.println("Truck(String) ������ ����");
		
		System.out.println("Truck.speed = "+speed);
		//������ ������ �� �� ������, ������ ������ �� �� ����.
	}
	
	//���� Ŭ������ �޼ҵ带 ����Ŭ�������� ������ (�������̵�)
	//��Ȳ��, �޼ҵ��, �Ű������� ���� �޼ҵ带 ������
	public void speedUp() {
		//System.out.println(speed); //Ȯ�ο�
		if(speed>=SPEED_MAX) speed=SPEED_MAX;
		
		System.out.println("truck.speed = "+speed);
	}
	public static void main(String a[]) {

		Truck t = new Truck();
		//��Ӱ��迡�� ��ü������ ����Ŭ���� ���� ���� �� -> ����Ŭ���� ����
		
		System.out.println("t.speed = "+t.speed);
		//����Ŭ������ �޼ҵ� ȣ��
		t.speedUp();
		t.speedUp();
		t.speedDown();
		
		//����Ŭ������ �����ڸ� ���������� ȣ���ϱ�
		Truck tt = new Truck("�ҳ�Ÿ");
		System.out.println("tt.carName = "+tt.carName);
		//tt��ü���� �׷����� �����.
		
		//���θ޼ҵ�� ��Ӱ��� ���ܹǷ� ���⼭ super x
		
		
	}

}