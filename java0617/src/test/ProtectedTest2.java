package test;

public class ProtectedTest2 { //0617-1(3)
	
	protected String tel = "010-1234-8959";
	
	protected ProtectedTest2() {
		System.out.println("�ٸ� ��Ű���� ������ �޼ҵ�");
	}
	
	protected void telOutput() {
		System.out.println("��ȭ��ȣ = "+tel);
	}
	
	public String getTel() {
		return tel;
	}
	
	public static ProtectedTest2 getInstance() {
		return new ProtectedTest2();
	}
}
