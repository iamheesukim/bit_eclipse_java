//1.Thread Ŭ���� ���
public class ThreadTest1 extends Thread{ //0709-6 thread
	
	//Tread�� Ŭ����!
	
	String msg;

	public ThreadTest1() {
	}
	
	public ThreadTest1(String msg) {
		this.msg=msg;
	}
	
	//2. ������ ���� �ڵ带 run()�� �������̵�
	public void run() {
		for(int i=1;;i++) {
			System.out.println(msg+"="+i);
		}
	}

	public static void main(String[] args) {
		ThreadTest1 tt1 = new ThreadTest1("ù��° ������");
		
		//3.�����带 �����ϱ� ���ؼ��� start() �޼ҵ� ȣ��
		tt1.start();
		//�����忡 �ִ� start()�޼ҵ�� ��ü�� run()�� �����ϰ� ��.
		
		Thread tt2 = new ThreadTest1("�ι�° ������");
		tt2.start();
		
		//�����غ��� ù��°�� �ι�° ���׹���
		//���� ����ȴٰ� �ؼ� �� ���� ������ ����
		
		Thread tt3 = new ThreadTest1("����° ������");
		tt3.start();

	}

}
