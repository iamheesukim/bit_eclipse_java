package test;

public class DefaultData { //0616-2(2)
	String name = "ȫ�浿"; //default : ���� ��Ű��
	//public String name = "ȫ�浿"; //��� ��Ű��, Ŭ����
	String tel = "010-1234-5678";
	//public String tel = "010-1234-5678";
	
	//���� ���������� public�� ��������!!!! (�޼ҵ�� ������)

	public DefaultData() { //������ �޼ҵ�
	}
	
	public DefaultData (String name, String tel) {
		this.name = name; //���� ����
		this.tel = tel; //���� ����
	}
	
	public static void sum() {
		int tot =0;
		
		for(int i=1; i<100; i++) {
			tot += i;
		}
		System.out.println("tot="+tot);
	}
	
	public String getName() {
		return name;
		//���� ���� �������� ������ ���� �̷��� return���� ���� �ִ� �޼ҵ带 ������
		
		//�޼ҵ带 static���� �ϸ� name ���� ã�� ���� ����.
		//name�� static�� �ƴϱ� ����.
	}

}
