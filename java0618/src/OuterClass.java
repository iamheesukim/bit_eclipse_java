public class OuterClass { //0618-1
	//�ܺ�Ŭ����
	
	int num = 100;
	String name = "ȫ�浿";

	public OuterClass() { //0618-1
		System.out.println("OuterClass ������ �޼ҵ� �����.");
	}
	
	public void print() {
		System.out.println("num="+num);
		System.out.println("name="+name);
		
		//�ܺ� Ŭ������ ����Ŭ������ ���� ���� �Ұ�. (��ü �����ؼ� ��ü ���ؼ��� ����)
		//System.out.println("tel="+tel);
	}
	
	public void createInner() {
		//Ŭ���������� ����Ŭ���� ��ü �����ϱ�
		InnerClass cc = new InnerClass();
		cc.output();
		cc.tel = "9999"; //�̷��� ��ü�� ���ؼ��� ���� Ŭ���� ���� ���� ����
		cc.output();
	}
	
	//����Ŭ����
	class InnerClass {
		
		//�������
		String tel = "010-1234-5678";
		String name = "�̼���";
		
		//������ �޼ҵ�
		InnerClass() {
			System.out.println("InnerClass ������ �޼ҵ� ����");
		}
		
		//�޼ҵ�
		public void output() {
			System.out.println("tel="+tel);
			
			//�ܺ�Ŭ������ ��������� ����Ŭ�������� ������ �� �ִ�.
			//���οܺ� �Ѵ� ������ ���� ���� �ҷ���.
			System.out.println("num="+num);
			System.out.println("name="+name);
		}
	}

	public static void main(String[] args) {

		OuterClass oc = new OuterClass(); //7��
		//�ܺ� Ŭ������ ��ü�� �����ǰ� ����Ŭ������ ����x
		oc.print(); //11��
		
		System.out.println("===========================");
		
		//���� Ŭ���� ��ü �����ϱ�
		//1. 				�ܺ�Ŭ���� ��ü ���� -> ����Ŭ���� ��ü����
		InnerClass ic = new OuterClass().new InnerClass();
		ic.output();
		
		System.out.println("===========================");
		
		//2.				�ܺ�Ŭ���� ��ü
		OuterClass oc2 = new OuterClass();
		InnerClass ic2 = oc2.new InnerClass();
		ic2.output();
		
		System.out.println("===========================");
		
		//3.
		oc2.createInner();
		

	}

}
