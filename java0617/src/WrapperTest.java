
public class WrapperTest {//0617-4

	public WrapperTest() {
		
		//Wrapper Ŭ������ �⺻���������� ������ ��ü�� �����Ű�� Ŭ�����̴�.
		//Byte, Short, Integer, Long
		//Float, Double
		//Boolean
		//Character

		int a = 1234;
		Integer i = Integer.valueOf(a); //new Integer(a);
		
		//�׳� a�� �ָ� a�� ��ü�� �ƴϹǷ� ����
		
		System.out.println(a);
		System.out.println(i);
		
		Object obj = a; //����ڽ� : new Integer(a);���ص� �ڵ�
		Object obj2 = i;
		System.out.println(obj);
		System.out.println(obj2);
		
		int x = i; //�����ڽ�
		System.out.println(x);
	}

	public static void main(String[] args) {
		new WrapperTest();

	}

}
