
public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//�迭�� ����
		int[] data; //�޸��Ҵ�

		int num[] = new int[5];
		//int []num = new int[5];
		
		//num �迭�� ��� ���� ����϶�
		for(int idx=0;idx<num.length;idx++) {
			System.out.println("num["+idx+"] = "+num[idx]);
		
		}
		
		//�迭 ���� �� �ʱⰪ�� �����ϴ� ���1
		int[] data2 = new int[] {20,65,74,5,77,2}; //data2[0]~data2[5]
		for (int i=0; i<data2.length;i++) {
			System.out.println("data2["+i+"]= "+data2[i]);
		}
		
		//���2
		int data3[] = {8,7,5,37,75};
		for (int i=0;i<data3.length;i++) {
			System.out.println("data3["+i+"]= "+data3[i]);
		}
		
		//Array Copy
		//num�迭���� index2�������� 3���� ���縦 �Ͽ� ���ο� �迭�� index5���� ����
				int target[] = new int[10]; //0~9
				
				System.arraycopy(num, 2, target, 5, 3);
				
				for(int i=0;i<target.length;i++) {
					System.out.println("target["+i+"]= "+target[i]);
				}
	}

}
