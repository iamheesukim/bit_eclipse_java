
public class PrivateParent {//0516-8(1)
	
	int num =200;
	
	//private 접근제한자는 다른 클래스에 객체를 통하여 접근할 수 없다.
	private int num2 = 300;
	//캡슐화
	
//	//생성자 메소드에 private 접근제한자는 객체를 생성할 수 없다.
//	private PrivateParent() {
//	}
	
	PrivateParent() {}
	
	//객체를 통한 접근 불가
	private void getData() {
		System.out.println("번호 = "+num);
	}

}
