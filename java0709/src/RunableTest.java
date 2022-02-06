//1.인터페이스 상속
public class RunableTest implements Runnable { //0709-7 thread
	
	String msg;
	
	public RunableTest() {
	}
	
	public RunableTest(String msg) {
		this.msg = msg;
	}
	
//2.스레드 구현 영역을 run()메소드에 오버라이딩
	@Override
	public void run() {
		int i=1;
		while(true) {
			System.out.println(msg+"==>"+i++);
		}
		
	}

	public static void main(String[] args) {
		RunableTest rt1 = new RunableTest("첫번째스레드");
		RunableTest rt2 = new RunableTest("두번째스레드");
		
		Thread t1 = new Thread(rt1);
		Thread t2 = new Thread(rt2);
		//rt1을 스레드 객체로 마듬
		
		t1.start();
		t2.start();
	}

}
