//1.�������̽� ���
public class RunableTest implements Runnable { //0709-7 thread
	
	String msg;
	
	public RunableTest() {
	}
	
	public RunableTest(String msg) {
		this.msg = msg;
	}
	
//2.������ ���� ������ run()�޼ҵ忡 �������̵�
	@Override
	public void run() {
		int i=1;
		while(true) {
			System.out.println(msg+"==>"+i++);
		}
		
	}

	public static void main(String[] args) {
		RunableTest rt1 = new RunableTest("ù��°������");
		RunableTest rt2 = new RunableTest("�ι�°������");
		
		Thread t1 = new Thread(rt1);
		Thread t2 = new Thread(rt2);
		//rt1�� ������ ��ü�� ����
		
		t1.start();
		t2.start();
	}

}
