
public class PrivateParent {//0516-8(1)
	
	int num =200;
	
	//private ���������ڴ� �ٸ� Ŭ������ ��ü�� ���Ͽ� ������ �� ����.
	private int num2 = 300;
	//ĸ��ȭ
	
//	//������ �޼ҵ忡 private ���������ڴ� ��ü�� ������ �� ����.
//	private PrivateParent() {
//	}
	
	PrivateParent() {}
	
	//��ü�� ���� ���� �Ұ�
	private void getData() {
		System.out.println("��ȣ = "+num);
	}

}
