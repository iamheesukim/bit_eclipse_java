//package

//�ʿ��� Ŭ������ ��ġ( ��Ű����� Ŭ�������� �����Ѵ�)
import java.util.Scanner;
import java.lang.String; //�����Ϸ��� �����ϰ����� �ڵ����� import���ش�
import java.util.Random;
import java.util.*;

public class ClassTest { //0611-5
	//������� (�ַ� ��)
	//������� = ��������
	int a = 100;
	String name="ȫ�浿";
	//��������� �ʱⰪ�� �ڵ����� �����ȴ�
	//������ : 0, �Ǽ� : 0.0, �� : false, ���� : 
	//String Scanner Random = null;
	int b;
	double c;
	String nameStr; //null
	Scanner scan; //null
	Random ran; //null
	
	//��ü����
	Scanner scanner = new Scanner(System.in);
	//���๮�� ������� ���Ұ�
	//System.out.println("�ֹܼ��� ����ϱ�"); -> ����
	//for(int z=1; z<10;z++) {} - ����
	
	int k = 100+500;
	//int dd[] = new int[10];
	//dd[3]=200;
	
	//������ �޼ҵ� : ��ü�� ������ �� �ѹ� ����Ǵ� �޼ҵ�
	//				�޼ҵ���� �ݵ�� Ŭ������� ���ƾ� �Ѵ�.
	//				��ü ������ ��ü�� ������ �ʱ�ȭ�� �� �ִ�.
	// ������ �޼ҵ带 �������� ������ �����Ͻ� �����Ϸ��� �Ű������� ���� �����ڸ޼ҵ带 �ڵ����� �߰�
	//ClassTest(){}

	ClassTest(){
		//���๮
		System.out.println("������ �޼ҵ� ����");
		b=1234;
	}
	
	ClassTest(int a) {
		System.out.println(a+"�޼ҵ� ����");
	}
	
	
	
	/*�޼ҵ� : �ϳ��� �������
	 Ŭ������ ��ü ���� �� �޼ҵ带 ȣ���Ͽ��� ����ȴ�.
	 
	 ��ȯ�� �޼ҵ��(�Ű�����,�Ű�����) {}
	 
	 �޼ҵ�� ���� ��Ģ : �ҹ��ڷ� �����Ѵ�. �ռ��� �� �� �ι��� �ܾ������ ù��° ���ڸ� �빮�ڷ�
	 
	 */
	
	void sum() {
		System.out.println("sum()�޼ҵ尡 �����");
	}
	void total (int a, int b) {
		System.out.println("����"+(a+b));
	}
	

}
