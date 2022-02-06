import java.util.Scanner;
public class EmailCheckEx { //0615-3
	
	public EmailCheckEx() {
	}
	
	public void start() {
		do {
			String email = inputEmail();
			if(emailCheck(email)) { //���� �̸���
				//���̵�, ������ �и� ���
				emailPrint(email);
			}
			else {
				errorMailMessage(email);
			} //������ �̸���
		}//do ��
		
		while(true);
	}
	
	//���̵�� ������ �и��ؼ� ���
	public void emailPrint(String email) {
		/*//split ���
		String emailSplit[] =email.split("@");
		System.out.println("���̵� = "+emailSplit[0]);
		System.out.println("������ = "+emailSplit[1]);
		*/
		
		//split���� ��������
		int atMark = email.indexOf("@");
		String id = email.substring(0,atMark);
		String domain = email.substring(atMark+1);
		System.out.println("���̵� = "+id);
		System.out.println("������ = "+domain);
		
	}
	
	//�̸��� �Է�
	public String inputEmail() {
		Scanner scan = new Scanner(System.in);
		System.out.println("�̸��� �Է� : ");
		return scan.nextLine();
	}
	
	//�̸��� ����, �߸� Ȯ��
	public boolean emailCheck(String email) {
		//���� true
		int atMark = email.indexOf("@"); //������� ��ġ�� ����,  ������? -1
		int point = email.indexOf(".");
		
		//�߸��� �����ּ��Է�
		if(atMark==-1 || point ==-1 || atMark>point || point-atMark<=2) {//@�� .���� �տ� �־����, �� ���̿� ���ڰ� ��� �ȵ�.
			return false;
		}
		//���� ���� �϶�
		else return true; 
	}
	
	//�߸��� ���� �޽���
	public void errorMailMessage(String email) {
		System.out.println(email+"�� �߸��� �̸��� �ּ��Դϴ�");
	}

	public static void main(String[] args) {
		new EmailCheckEx().start();

	}

}

/*
 ����
 
 �̸��� �Է� = goguma@nate
 �̸����� �߸��Է��߽��ϴ�
 
 �̸��� �Է� = goguma.nate@com
 �̸����� �߸��Է��߽��ϴ�
 
 �̸��� �Է� = goguma@nate.com
 ���̵� : goguma
 ������ : nate.com
 
 �̸��� �Է� = 
 
 +) @�� .���� �ڿ� ���͵� �߸���
 */
