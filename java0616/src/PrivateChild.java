
public class PrivateChild extends PrivateParent{ //0516-8(3)

	public PrivateChild() {
		//����Ŭ���� private ��������� ��ӵ��� �ʴ´�.
		//System.out.println("pp.num2 = "+pp.num2);
		
		getData();
	}

	private void getData() {
		System.out.println("Private Child~~");

	}

}
