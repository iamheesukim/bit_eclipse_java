import java.util.*;
import java.util.Scanner;

public class ExceptionTest { //0618-5
	
	Scanner scan = new Scanner(System.in);

	public ExceptionTest() {
	}
	
	public void start() {
		do {
			try {
				//두 수를 입력받아 사칙연산을 출력하라
				System.out.print("첫번째 수 ="); //오류발생 가능
				int n1 = Integer.parseInt(scan.nextLine());
				System.out.print("두번째 수 = "); //오류발생 가능
				int n2 = Integer.parseInt(scan.nextLine());
			
				int plus = n1+n2;
				int minus = n1-n2;
				int mul = n1*n2;
				int devide = n1/n2;
			
				System.out.println(n1+"+"+n2+"="+plus);
				System.out.println(n1+"-"+n2+"="+minus);
				System.out.println(n1+"*"+n2+"="+mul);
				System.out.println(n1+"/"+n2+"="+devide); //오류발생 가능
				
				String names[] = {"홍길동","김길동"};
				for(int i=0; i<=names.length;i++) {
					System.out.println("names["+i+"]="+names[i]);
				}
			}
			catch(InputMismatchException imie) {
				System.out.println("정수를 입력하세요");
				
				//어떤 에러인지 보고 싶으면?
				//imie.printStackTrace(); -> void형이라 안에 print가 있음
				System.out.println(imie.getMessage()); // -> getMessage() 반환값을 갖는 메소드라 출력해줘야함
				
			}
			catch(ArithmeticException ae) {
				System.out.println("0으로 나눌 수 없습니다.");
				
				//ae.printStackTrace();
				System.out.println(ae.getMessage());
			}
			catch(ArrayIndexOutOfBoundsException aioo) {
				System.out.println("배열의 첨자값이 잘못되었습니다");
				System.out.println(aioo.getMessage());
			}
			catch(NumberFormatException nfe) {
				System.out.println("숫자를 입력하여야 합니다.");
			}
			
			finally {
				System.out.println("finally 실행됨");
			}
			
		} while(true);
		
		//System.out.println("프로그램 종료");
		//무한루프 돌리면서 필요없어짐
	}
	
	

	public static void main(String[] args) {

		ExceptionTest et = new ExceptionTest();
		et.start();
	}

}

/*
 에러 : 하드웨어처럼 프로그램에서 제어할 수 없는 에러를 말한다.
 예외처리 : 프로그램에서 제어할 수 있는 에러를 Exception이라고 한다.
 
 예외처리하는 방법
 1. try {
 	//실행문;
  	예외 발생할 가능이 있는 명령어, 또는 예외 발생할 가능성이 없는 명령 -> 모두 다 표기 가능
 	} catch (예외 종류) {
 		예외가 발생하면 실행할 실행문
 	} catch(예외 종류) {
 	}... 필요한 만큼
 	finally {
 		예외가 발생하든 안하든 무조건 실행되는 실행문;
 		생략 가능함.
 		} -> 나중에 DB쓰면 자주씀.
 
 */
