public class ArrayEx02 { //0609-7

	public static void main(String[] args) {
		/*
		 ���� 1~1000 ������ ���� 100�� ����� �迭�� �����ϰ�
		 ������ ���� �� ���� ū ���� ���� ���� ��, ����� ����϶�
		 */
		
		//100���� ������ ������ �迭
		int data[] = new int[100];
		
		for(int i=0;i<data.length;i++) {
			data[i]=(int)(Math.random()*1000)+1;
			System.out.println(data[i]);
		}
		
		//ū�� ������ ���
		int sum=0;
		int max=data[0];
		int min=data[0];
		
		
		for(int i=0;i<data.length;i++) {
			sum += data[i];
			if(max<data[i]) max=data[i];
			if(min>data[i]) min=data[i];
		}
		int avg = sum/data.length;
	
		
		System.out.printf("���� : %d\n",sum);
		System.out.printf("��� : %d\n",avg);
		System.out.printf("�ִ� : %d\n",max);
		System.out.printf("�ּ� : %d\n",min);
		

	}

}