
public class BBB extends AAA { //0516-7(2)
	int num = 200;
	String tel = "010-1234-1234";

	public BBB() {
	}
	
	public void output() {
		//하위는 상위에 있는 name을 쓸 수 있음.
		System.out.println("번호 = "+num+", 연락처 = "+tel+", 이름 = "+name);
	}

}
