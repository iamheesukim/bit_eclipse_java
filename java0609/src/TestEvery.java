public class TestEvery { //�ƹ��ų� ������
	
	public TestEvery() {
	}
		
		public void start() { //��ȯ�� ���� �޼ҵ�
			String st1 = "����� ������ �ż���"; //�Ϲ� ������
			String st3 = new String("����� ������ �ż���"); //��ü
			String stData = st3; //��ü�� �ָ� �ּҵ� ������
			
			// '=='�δ� �Ϲݵ����Ϳ� ��ü�� �ٸ��� �ν�.
			if(st1==st3) System.out.println("�Ϲݵ�����, ��ü�� ����");
			else System.out.println("�Ϲݵ�����, ��ü�� �ٸ���");
			
			// .equals() �� ���븸 Ȯ���ؼ� ���Ѵ�.
			if(st1.equals(st3)) System.out.println("equal�� ���� ����");
			else System.out.println("equal�� �ᵵ �ٸ���");
		}
		
	
	
	

	public static void main(String[] args) {
		new TestEvery().start();
	}
}
