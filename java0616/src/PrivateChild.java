
public class PrivateChild extends PrivateParent{ //0516-8(3)

	public PrivateChild() {
		//상위클래스 private 멤버변수는 상속되지 않는다.
		//System.out.println("pp.num2 = "+pp.num2);
		
		getData();
	}

	private void getData() {
		System.out.println("Private Child~~");

	}

}
