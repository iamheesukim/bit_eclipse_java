import java.util.Scanner;
public class ArrayScore { //0611-3 (����Ǯ��)

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("�л��� : ");
		int num = s.nextInt();
		int[][] score = new int [num+2][6];
		String[][] namearr = new String[num+2][1];
		namearr[num][0]="���� ����";
		namearr[num+1][0]="���� ���";
		
		for(int i=0;i<num;i++) { //�Է�
			 
			System.out.printf("%d��° �л� ���� �Է�\n",i+1);
		
			System.out.print("�̸� : ");
			namearr[i][0] = s.next();
		
			System.out.print("���� ���� : ");
			score[i][0] = s.nextInt();
		
			System.out.print("���� ���� : ");
			score[i][1] = s.nextInt();
		
			System.out.print("���� ���� : ");
			score[i][2] = s.nextInt();
			
			score[i][3] = score[i][0]+score[i][1]+score[i][2]; //����
			score[i][4] = score[i][3]/3; //���
			
			score[i][5] = 0; //������ �ӽ÷� 0
		
		}
		
		System.out.println("===================================================");
		System.out.println("�̸�\t����\t����\t����\t����\t���\t����");
		System.out.println("===================================================");
		
		for(int r=0;r<num;r++) { //���� ���� ���
			for(int c=0;c<3;c++) {
				score[num][c] += score[r][c];
				score[num+1][c] = score[num][c]/num;
			}
		}
		
		//���
		
		for(int r=0;r<score.length;r++) {
			System.out.print(namearr[r][0]+"\t");
			
			for(int c=0;c<score[r].length;c++) {
				System.out.print(score[r][c]+"\t");
			}
			System.out.println();
		}
		
		int cnt=1;
		
		
		//������ ��Ƴ�.... ���ش� �Ǵµ�... �ڵ带 ��� ¥��..
	}

}

/*
 �� �ٿ� ���� ������ �Է��ؼ� �ν� �Ҷ�.
 int a = Integer.parseInt(scan.nextLine()); //�ϴ� ���ڷ� �о���� ���ڷ� �ٲ㼭 �ν�
 */
