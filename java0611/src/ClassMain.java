
public class ClassMain { //0611-7

	public static void main(String[] args) {
		ClassTest ct = new ClassTest();
		//ClassTest() 39�� ����
		
		System.out.println("b="+ct.b);
		//ct�� ClassTest�ҷ��ͼ� �ű��ִ� b���
		
		ClassTest ct2 = new ClassTest(5678);
		//ClassTest(int a) ����
		
		//�޼ҵ�ȣ�� : ��ü��.�޼ҵ��();
		ct.sum();
		//60�� ����
		
		//63�� ����
		ct.total(100, 200); //100�� 200�� �Ű������� �ѱ�
		ct2.total(1000, 2000);
	}
}
