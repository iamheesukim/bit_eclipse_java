package review;

import java.util.Scanner;

public class EmailCheck2 {
	
	Scanner s = new Scanner(System.in);

	public EmailCheck2() {
	}
	
	public void start() {
		
		do {
			System.out.print("이메일을 입력하세요 : ");
			String inputEmail = s.nextLine();
			
			if(checkEmail(inputEmail)) { //이메일 체크한게 참이면
				emailPrint(inputEmail); //이메일 출력
			}
			else { //이메일체크가 거짓(오류가 있으면)
				emailError(inputEmail); //에러 메시지 출력 다시 반복
			}
		}// do
		
		while(true);
		
	}//start 메소드
	
	public boolean checkEmail(String ee) {
		int atCheck = ee.indexOf("@");
		int pointCheck = ee.indexOf(".");
		
		if (atCheck==-1 || pointCheck==-1 || pointCheck-atCheck<1 || atCheck<2) {
			//@ 없거나, .없거나, @와.사이에 도메인 없거나, @앞에 아이디 없거나
			return false;
		}
		else return true;
	}
	
	public void emailPrint(String ee) {
		String arr[] = ee.split("@");
		String id = arr[0];
		String domain = arr[1];
		
		System.out.println("아이디 : "+id);
		System.out.println("도메인 : "+domain);
	}
	
	public void emailError(String ee) {
		System.out.println("잘못 입력했습니다. 다시 입력해주세요.");
	}
	

	public static void main(String[] args) {
		
		EmailCheck2 ec = new EmailCheck2();
		ec.start();
	}

}

//이메일 입력 = goguma@nate
//이메일을 잘못입력했습니다
//
//이메일 입력 = goguma.nate@com
//이메일을 잘못입력했습니다
//
//이메일 입력 = goguma@nate.com
//아이디 : goguma
//도메인 : nate.com
//
//이메일 입력 = 
//
//+) @가 .보다 뒤에 나와도 잘못됨