
public class StaticTest2 { //0616-4
	
	//static
	
	//��� ������ �������� ����
	//	public static int a= 100
	//	static int  = 200
	
	//�޼ҵ��� ��Ȳ�� ���ʿ� ǥ���Ѵ�.
	//	public static void method() {}
	//	static void method() {}
	
	//��������� ���� ǥ�� �� �� ������,
	//�� ���๮�� ����Ѵٸ� static {} �ȿ� ǥ���Ѵ�
	static { //������ �޼ҵ庸�� ���� ����
	for(int i=1;i<10;i++) {
		System.out.println(i);
	}}

	public StaticTest2() {
		System.out.println("StaticTes2() �޼ҵ� ����");
	}
	
	public static void main(String a[]) {
		new StaticTest2();
		//static �� ���� ����ȴ�. �� ���� �����ڸ޼ҵ�.
	}

}
