public class MethodTest { //0614-1

	//�������
	int num =12;
	String name="ȫ�浿";
	String tel;

	//������ �޼ҵ� : ������ �ڵ��߰� (JVM)
	//			��Ӱ��谡 �ƴҶ��� �߰����ش�
	//	�Ű������� ���������� �ٸ��ų� ������ ������ �޶����
	//MethodTest(~~){~~} -> �� ������ �޼ҵ�

	MethodTest() {}

	MethodTest(String tel) {
		System.out.println("����ó:"+tel);
	}

	//MethodTest(String name) {
		//}

	MethodTest(int num) {}

	MethodTest(int num, String name) {

		//�Է¹��� num ���� ��Ŭ������ �����ϰ� ������!
		//num = num; ??
		//�տ� �ִ� �ְ� �������� -> ���� ����

		//�� Ŭ������ ����Ű�� ����� : this
		this.num = num;
		//�� Ŭ������ �������� num�� �Է¹��� �������� �����͸� ����
		this.name=name;

		//�� �ȿ� ������� ����(���������� ����) ������ ���� this �Ⱥ���

		String tel = "12345";
		this.tel="02-1234-1234"; //this. �ٿ����Ƿ� ���tel
	}

	//������ �ٲ��� String, int�� ����
	MethodTest(String name, int num) {
		//������ �޼ҵ忡�� �ٸ� ������ �޼ҵ� ȣ��
		//������ �޼ҵ忡�� Ÿ �����ڸ޼ҵ带 ȣ���Ҷ� �޼ҵ���� ���� ǥ���� �� ����.
		//MethodTest(num,name); -> ����

		//this()��� Ű���带 ����� (this.�� �ƴ�)

		//this() �̿��Ͽ� �ٸ� ������ �޼ҵ带 ȣ���� �� �ݵ�� ù��° ���๮�̿�����
		//System.out.println(); ->�̷��� ���� �ٸ� ���๮�� ������ ����
		this(num,name);
		// �׷� 25���ΰ�
	}

	//�������� �߿����� ���� : ������ ()�� ��������
}