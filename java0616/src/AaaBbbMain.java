
public class AaaBbbMain {//0516-7(3)

	public AaaBbbMain() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		BBB b = new BBB();
		//b.output();
		
		//����Ŭ������ ��ü�� �����ϸ� ����Ŭ������ ���Եȴ�.
		//��ĳ����
		AAA a = new BBB(); //String �ȿ� int ������ (����>����)
		a.output();
		//�������̵��� BBB�� output()�޼ҵ尡 ����ȴ�.
		
		//BBB a = AAA BBB(); -> �̰� ����
		
		System.out.println("b.tel = "+b.tel);
		//System.out.println("a.tel = "+a.tel); -> ����
		
		System.out.println("a.name = "+a.name); //hong (AAA name)
		System.out.println("a.num = "+a.num); //100 (AAA b)
		
		//�ٿ�ĳ����
		BBB c = (BBB)a; //int�ȿ� String ������ (int) ����ȯ
		c.output();
		
		Object obj = new BBB(); //object�� ����
		BBB d = (BBB)obj;
		d.output();
	}

}
