
public class MethodInner { //0618-2
	
	String name = "�������";
	
	
	public MethodInner() {
		System.out.println("MethodInner");
	}
	
	//�޼ҵ� �ȿ� ���� Ŭ���� ����
	public void start() {
		//����Ŭ����
		class MethodInnerTest {
			int num = 20;
			String email = "aaa@nate.com";
			MethodInnerTest(){
		}
		
		MethodInnerTest(int num) {
			this.num=num;
		}
		
		void emailOutput() {
			System.out.println("num="+num);
			System.out.println("email="+email);
			System.out.println("name="+name);
		}
		
		} 
	
	//���� Ŭ���� ��ü�� ����
	MethodInnerTest mt = new MethodInnerTest(500); //20��
	mt.emailOutput();
	
	} //start() �޼ҵ� ��
	
	

	public static void main(String[] args) {
		
		MethodInner mi = new MethodInner();
		mi.start();

	}

}
