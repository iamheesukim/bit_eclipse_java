import java.util.Scanner;
public class Lotto { //0610-2

	public static void main(String[] args) {
		//�ζ� ��ȣ ������
		
		Scanner s = new Scanner(System.in);
		int last;
		
		do {
			System.out.print("���� �� = ");
			int game = s.nextInt();
			
			int[] num = new int [7];
			for (int j=1;j<=game;j++) {
				
				System.out.printf("%d ���� : ",j);
				
				for (int i=0;i<num.length;i++) { //���� ����
					num[i]=(int)(Math.random()*45)+1; //1~45
					
					//�ߺ� ����
					//���� ������ ������ �� �� �ռ��� ���ϸ� ��
					for (int c=0;c<i;c++) {
						if(num[i]==num[c]) {
							i--; //�׷� �ٽ� ���� for������ �ݺ� -> ���ο� ���� -> �� �˻�
						}
					}
					}
										 
				//���� : ���ʽ� �����ؾ��ϹǷ� �ݺ��� ��ü����-2
				for (int k=0;k<num.length-2;k++) {
				for (int i=0;i<num.length-2;i++) {
					if(num[i]>num[i+1]) {
						int tmp = num[i];
						num[i]=num[i+1];
						num[i+1]=tmp; }
					} }
				
				//���
				for (int i=0;i<num.length-1;i++) {
					System.out.printf("%d\t", num[i]);
				}
				System.out.printf("���ʽ� : %d\n",num[num.length-1]);
					
			} //���Ӽ� �ݺ�
			
			System.out.print("��� �Ͻðڽ��ϱ�? (1.��, 2.�ƴϿ�) : ");
			last = s.nextInt();
			System.out.println();
			
			
			
		} //do ��
		
		while (last==1);
		// �̺κ��� true�� ���ѹݺ� ������ ������ if�� �Ἥ 2�� ������ break�ص� ��.
	}
}