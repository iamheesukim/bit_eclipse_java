//0617-2(2)
//�߻�޼ҵ带 1�� �̻� �����ϴ� Ŭ������ �߻�Ŭ�����̴�.
//�߻�Ŭ���� class Ű���� ���ʿ� abstract�� ǥ���Ͽ��� �Ѵ�.
public abstract class AbstractTest {
	
	int num = 100;
	String name = "ȫ�浿";

	public AbstractTest() {
		System.out.println("�׽�Ʈ1");
	}
	
	public void numOutput() {
		System.out.println("num="+num);
	}
	
	//����ΰ� ���� �޼ҵ�� �߻�޼ҵ��̴�.
	//�߻�޼ҵ�� ��ȯ�� ���ʿ� abstract Ű���带 ǥ���ؾ� �Ѵ�.
	public abstract void print();
	public abstract void setData(int num, String name);
	
	//�������̽��� ��ü������ �Ұ���

}
