public class StaticTest { //0614-5

	int num = 1234;
	String name = "ȫ�浿";

	static String addr = "������";
	//static�� ������ �� Ŭ���� �ٱ�(?)���� ����
	//��ü�� 2�� �����ϸ� ��� ��ü�� ���� (����)
	//�ϳ��� ��ü���� �����ϸ� ��� ��ü���� ����

	public StaticTest() {
	}

	//�ּҸ� �����ϴ� �޼ҵ�
	void setAddr(String addr) {
		this.addr=addr;
	}

	//���ּҸ� �о���� �޼ҵ�
	String getAddr() {
		return addr;
	}
}