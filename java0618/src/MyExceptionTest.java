import java.util.Scanner;

public class MyExceptionTest { //0618-9 (8연관)
	Scanner scan = new Scanner(System.in);

	public MyExceptionTest() {
	}
	
	public void start() {
		do {
			//임의의 정수 (1~100) 사이의 값을 입력받아 그 수까지의 합을 궇여 출력
			try {
				System.out.print("정수를 입력하세요 (1~100) --> ");
				int max = Integer.parseInt(scan.nextLine()); //NumberForematException	
				//1~100
				
				if(max<1 || max>100) {
					//throw : 예외를 강제로 발생시킨다
					throw new MyException();
				}
				else sum(max);
			}
			catch(NumberFormatException nfe) {
				System.out.println("숫자를 입력하세요..");
			}
			catch(MyException me) {
				System.out.println(me.getMessage());
			}
		}
		
		while(true);
	}
	
	public void sum(int max) {
		int tot=0;
		for(int i=1; i<=max ; i++) {
			tot+=i;
		}
		System.out.println("1~"+max+"까지의 합은 = "+tot);
	}
	
	

	public static void main(String[] args) {
		new MyExceptionTest().start();
	}

}
