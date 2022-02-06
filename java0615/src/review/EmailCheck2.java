package review;

import java.util.Scanner;

public class EmailCheck2 {
	
	Scanner s = new Scanner(System.in);

	public EmailCheck2() {
	}
	
	public void start() {
		
		do {
			System.out.print("�̸����� �Է��ϼ��� : ");
			String inputEmail = s.nextLine();
			
			if(checkEmail(inputEmail)) { //�̸��� üũ�Ѱ� ���̸�
				emailPrint(inputEmail); //�̸��� ���
			}
			else { //�̸���üũ�� ����(������ ������)
				emailError(inputEmail); //���� �޽��� ��� �ٽ� �ݺ�
			}
		}// do
		
		while(true);
		
	}//start �޼ҵ�
	
	public boolean checkEmail(String ee) {
		int atCheck = ee.indexOf("@");
		int pointCheck = ee.indexOf(".");
		
		if (atCheck==-1 || pointCheck==-1 || pointCheck-atCheck<1 || atCheck<2) {
			//@ ���ų�, .���ų�, @��.���̿� ������ ���ų�, @�տ� ���̵� ���ų�
			return false;
		}
		else return true;
	}
	
	public void emailPrint(String ee) {
		String arr[] = ee.split("@");
		String id = arr[0];
		String domain = arr[1];
		
		System.out.println("���̵� : "+id);
		System.out.println("������ : "+domain);
	}
	
	public void emailError(String ee) {
		System.out.println("�߸� �Է��߽��ϴ�. �ٽ� �Է����ּ���.");
	}
	

	public static void main(String[] args) {
		
		EmailCheck2 ec = new EmailCheck2();
		ec.start();
	}

}

//�̸��� �Է� = goguma@nate
//�̸����� �߸��Է��߽��ϴ�
//
//�̸��� �Է� = goguma.nate@com
//�̸����� �߸��Է��߽��ϴ�
//
//�̸��� �Է� = goguma@nate.com
//���̵� : goguma
//������ : nate.com
//
//�̸��� �Է� = 
//
//+) @�� .���� �ڿ� ���͵� �߸���