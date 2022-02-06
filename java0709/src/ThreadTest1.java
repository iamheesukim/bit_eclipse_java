//1.Thread 클래스 상속
public class ThreadTest1 extends Thread{ //0709-6 thread
	
	//Tread는 클래스!
	
	String msg;

	public ThreadTest1() {
	}
	
	public ThreadTest1(String msg) {
		this.msg=msg;
	}
	
	//2. 스레드 구현 코드를 run()에 오버라이딩
	public void run() {
		for(int i=1;;i++) {
			System.out.println(msg+"="+i);
		}
	}

	public static void main(String[] args) {
		ThreadTest1 tt1 = new ThreadTest1("첫번째 스레드");
		
		//3.스레드를 시작하기 위해서는 start() 메소드 호출
		tt1.start();
		//스레드에 있는 start()메소드는 객체의 run()을 실행하게 함.
		
		Thread tt2 = new ThreadTest1("두번째 스레드");
		tt2.start();
		
		//실행해보면 첫번째랑 두번째 뒤죽박죽
		//먼저 실행된다고 해서 꼭 먼저 나오진 않음
		
		Thread tt3 = new ThreadTest1("세번째 스레드");
		tt3.start();

	}

}
