import java.util.Scanner;

public class MethodException { //0618-7

	public MethodException() throws ArithmeticException, NumberFormatException {
		start();
	}
	
	public void start() throws ArithmeticException, NumberFormatException {
		Scanner scan = new Scanner(System.in);
		System.out.print("정수 입력 = ");
		int n = Integer.parseInt(scan.nextLine()); //라인으로 받는걸 int로 전환
		plus(150,n);
		
	}
	 
	public void plus(int i, int j) throws ArithmeticException {
		int result = i+j;
		System.out.println(i+"+"+j+"="+result);
		devide(i,j);
	}
	
	public void devide(int i, int j) throws ArithmeticException {
		int result =i/j; //여기서 생긴 예외처리가 연달아 일어나서 메소드마다 throws ArithmeticException
		System.out.println(i+"/"+j+"="+result);
	}

	public static void main(String[] args) throws ArithmeticException, NumberFormatException {
		try {
			MethodException me = new MethodException();
		}
		catch(Exception e) {
			System.out.println("에러가 발생했습니다 --> "+e.getMessage());
		}
		

	}

}
