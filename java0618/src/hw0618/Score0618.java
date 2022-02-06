package hw0618;

import java.util.*;

public class Score0618 { //0618 ����ǥ ���ϱ� ����

	public static void main(String[] args) {
		
		do {
		try {
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("�л����� �Է��ϼ��� : ");
		int cnt = Integer.parseInt(s.nextLine());

		String name[] = new String[cnt]; //�̸�����
		int score[][] = new int[cnt+2][6]; //��������
		
		//�̸��� ������ �Է¹޾� �迭�� ����
		String title[] = {"����","����","����"};
		for(int i=0; i<cnt; i++) {
			System.out.print((i+1)+"���� �л� �̸��� �Է��ϼ��� : ");
			name[i] = s.nextLine();
			for (int j=0; j<title.length;j++) { //����ȣ
				System.out.print(title[j]+" ������ �Է� �ϼ��� : ");
				score[i][j] = Integer.parseInt(s.nextLine());
				if(score[i][j]<1 ||score[i][j]>100) 
					//���� ���� ����� 1~100 ����
					throw new Exception("1~100 ������ ������ �Է��ϼ���!!\n========== ������մϴ� ==========");
				
			}
			
		}
		
		//���κ� ����,���
		//���� ����
		for(int i=0;i<cnt;i++) {
			for(int j=0;j<3;j++) { // 0 1 2
				score[i][3] += score[i][j];
				score[cnt][j] += score[i][j];
				
			}
			//���κ� ���
			score[i][4] = score[i][3]/3;
		}
		
		//���� ���
		for(int i=0;i<3;i++) {
			score[cnt+1][i] = score[cnt][i]/cnt;
		}
		
		//���� ���ϱ�
		for (int i=0; i<cnt; i++) { //0 1 2 3
			//i�� ���� ���� ��ġ
			for(int j=0; j<cnt; j++) {
				// ������     �������
				if(score[i][3] < score[j][3]) {
					score[i][5]++;
				}
			}
			score[i][5]++;
		}
		
		//���������� ����
		for(int i=0; i<cnt-1; i++) { //3�� -> 0 1
			//          3-1-0
			for (int j=0;j<cnt-1;j++) {
				if (score[j][5] > score[j+1][5]) {
					//��ȯ
					//�̸��ٲٱ�
					for (int k=0;k<score[j].length; k++) {
						int temp = score[j][k];
						score[j][k] = score[j+1][k];
						score[j+1][k]=temp;
						
					}
				}
			}
		}
		
		
		//���
		System.out.println("====================================================");
		System.out.println("�̸�\t����\t����\t����\t����\t���\t����");
		System.out.println("====================================================");
		
		for(int i=0; i<cnt; i++) {
			//�̸� ���
			System.out.print(name[i]+"\t");
			//���� ��� �� �� �� ���� ���
			for (int j=0;j<score[i].length;j++) {
				System.out.print(score[i][j]+"\t");
			}
			System.out.println();
		}
		
		//���� ����
		System.out.print("���� : \t");
		for(int i=0; i<3; i++) { //0 1 2 (������3���ϱ�)
			System.out.print(score[cnt][i]+"\t");
		}
		
		System.out.println();
		//���� ���
		System.out.print("��� : \t");
		for(int i=0;i<3;i++) {
			System.out.print(score[cnt+1][i]+"\t");
		}
		System.out.println(); break;
		
		}
		
		
		catch(NumberFormatException im) {
			System.out.println("���ڸ� �Է��ϼ���!!");
			System.out.println("========== ������մϴ� ==========");
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		}
		while(true);
		

}
}