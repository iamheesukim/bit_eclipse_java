import java.util.Scanner;
public class ArrayEx01 { 
	//7������ ������ �Է¹޾Ƽ� ����, ����� ���϶�

	public static void main(String[] args) {
    
		Scanner s = new Scanner(System.in);
		
		//������ �������� ���� �����͸� �迭�� ����
		String[] title = {"����","����","����","����","����","�ѱ���","����"};
		
		//�� ������ ������ ������ �迭
		int score[] = new int[7]; //0~6
		
		int sum=0;
		
		for(int idx=0;idx<title.length;idx++) {
			System.out.print(title[idx]+"=");
			score[idx]=s.nextInt();
			sum = sum+score[idx];
		}
		
		System.out.println("���� : "+sum);
		System.out.println("��� : "+sum/7);
	}

}