import java.util.Scanner;
public class EmailCheckEx { //0615-3
	
	public EmailCheckEx() {
	}
	
	public void start() {
		do {
			String email = inputEmail();
			if(emailCheck(email)) { //정상 이메일
				//아이디, 도메인 분리 출력
				emailPrint(email);
			}
			else {
				errorMailMessage(email);
			} //비정상 이메일
		}//do 끝
		
		while(true);
	}
	
	//아이디와 도메인 분리해서 출력
	public void emailPrint(String email) {
		/*//split 방법
		String emailSplit[] =email.split("@");
		System.out.println("아이디 = "+emailSplit[0]);
		System.out.println("도메인 = "+emailSplit[1]);
		*/
		
		//split없이 나눠보기
		int atMark = email.indexOf("@");
		String id = email.substring(0,atMark);
		String domain = email.substring(atMark+1);
		System.out.println("아이디 = "+id);
		System.out.println("도메인 = "+domain);
		
	}
	
	//이메일 입력
	public String inputEmail() {
		Scanner scan = new Scanner(System.in);
		System.out.println("이메일 입력 : ");
		return scan.nextLine();
	}
	
	//이메일 정상, 잘못 확인
	public boolean emailCheck(String email) {
		//정상 true
		int atMark = email.indexOf("@"); //골뱅이의 위치가 나옴,  없으면? -1
		int point = email.indexOf(".");
		
		//잘못된 메일주소입력
		if(atMark==-1 || point ==-1 || atMark>point || point-atMark<=2) {//@가 .보다 앞에 있어야함, 그 사이에 문자가 없어도 안됨.
			return false;
		}
		//정상 메일 일때
		else return true; 
	}
	
	//잘못된 메일 메시지
	public void errorMailMessage(String email) {
		System.out.println(email+"은 잘못된 이메일 주소입니다");
	}

	public static void main(String[] args) {
		new EmailCheckEx().start();

	}

}

/*
 실행
 
 이메일 입력 = goguma@nate
 이메일을 잘못입력했습니다
 
 이메일 입력 = goguma.nate@com
 이메일을 잘못입력했습니다
 
 이메일 입력 = goguma@nate.com
 아이디 : goguma
 도메인 : nate.com
 
 이메일 입력 = 
 
 +) @가 .보다 뒤에 나와도 잘못됨
 */
