package test;

public class ProtectedTest2 { //0617-1(3)
	
	protected String tel = "010-1234-8959";
	
	protected ProtectedTest2() {
		System.out.println("다른 패키지의 생성자 메소드");
	}
	
	protected void telOutput() {
		System.out.println("전화번호 = "+tel);
	}
	
	public String getTel() {
		return tel;
	}
	
	public static ProtectedTest2 getInstance() {
		return new ProtectedTest2();
	}
}
