//0617-2(1) ��(2)��������
								//�߻�Ŭ���� ���
public class AbstractMain extends AbstractTest {
	//���� �߻�Ŭ������ �޼ҵ带 �������̵� ���� �ʾҴٸ�,
	//�߻�޼ҵ带 ��ӹ޴� AbstractMain�� �߻�Ŭ����

	public AbstractMain() {
		System.out.println("�׽�Ʈ2");
	}

	//��ӹ��� �߻�Ŭ���� ���� ��� �߻�޼ҵ带 �������̵��Ѵ�
	public void print() {
		System.out.println("num="+num+", name = "+name);
	}
	
	public void setData(int num, String name) {
		this.num =num; //super.num=num
		this.name = name; //super.name=name
	}
	
	public void start() {
		numOutput();
		setData(5000,"�̼���");
		print();
	}
	
	public static void main(String[] args) {
		AbstractMain am = new AbstractMain();
		
		//�߻�޼ҵ�� ��ü�� ������ �� ����.
		//AbstractTest at = new AbstractTest(); -> ����
		
		am.start();
	}

}
