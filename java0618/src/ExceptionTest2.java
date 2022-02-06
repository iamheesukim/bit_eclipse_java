import java.util.*;
import java.util.Scanner;

public class ExceptionTest2 { //0618-6 (5�� ����)
	
	Scanner scan = new Scanner(System.in);

	public ExceptionTest2() {
	}
	
	public void start() {
		do {
			try {
				//�� ���� �Է¹޾� ��Ģ������ ����϶�
				System.out.print("ù��° �� ="); //�����߻� ����
				int n1 = Integer.parseInt(scan.nextLine());
				System.out.print("�ι�° �� = "); //�����߻� ����
				int n2 = Integer.parseInt(scan.nextLine());
			
				int plus = n1+n2;
				int minus = n1-n2;
				int mul = n1*n2;
				int devide = n1/n2;
			
				System.out.println(n1+"+"+n2+"="+plus);
				System.out.println(n1+"-"+n2+"="+minus);
				System.out.println(n1+"*"+n2+"="+mul);
				System.out.println(n1+"/"+n2+"="+devide); //�����߻� ����
				
				String names[] = {"ȫ�浿","��浿"};
				for(int i=0; i<=names.length;i++) {
					System.out.println("names["+i+"]="+names[i]);
				}
			} //try ��
			
			catch(ArrayIndexOutOfBoundsException aioo) { //�̰� Exception���� ���� ������ ������ �� ��� ����
				System.out.println("�迭�� ÷�ڰ� �����Դϴ�.");
			}
			catch (Exception e) { //NumberException, ArithmeticExcpetion //�� ���ܴ� ��� ���ܸ� �����ϹǷ� ���� �ڿ� �����
				System.out.println("Exception --> "+e.getMessage());
				}
			
				

			
		} while(true);
		
		//System.out.println("���α׷� ����");
		//���ѷ��� �����鼭 �ʿ������
	}
	
	

	public static void main(String[] args) {

		ExceptionTest2 et = new ExceptionTest2();
		et.start();
	}

}

/*
 ���� : �ϵ����ó�� ���α׷����� ������ �� ���� ������ ���Ѵ�.
 ����ó�� : ���α׷����� ������ �� �ִ� ������ Exception�̶�� �Ѵ�.
 
 ����ó���ϴ� ���
 1. try {
 	//���๮;
  	���� �߻��� ������ �ִ� ��ɾ�, �Ǵ� ���� �߻��� ���ɼ��� ���� ��� -> ��� �� ǥ�� ����
 	} catch (���� ����) {
 		���ܰ� �߻��ϸ� ������ ���๮
 	} catch(���� ����) {
 	}... �ʿ��� ��ŭ
 	finally {
 		���ܰ� �߻��ϵ� ���ϵ� ������ ����Ǵ� ���๮;
 		���� ������.
 		} -> ���߿� DB���� ���־�.
 
 */
