
public class ArrayCopy { //0609-4

	public static void main(String[] args) {
		//�迭�� ����
		
		int num[] = {20, 67,15,95,36,48,23,14};
		
		//�⺻ System�� �ִ� �޼ҵ�(?)
		//arraycopy(Object src, int srcPos, Object dest, int destPos, int length)
		//			���� �迭�̸�	���� ���� ����	������ �迭�̸�	���� ���� ����		��ŭ?
		//			num			2			target		5				3
		
		//num�迭���� index2�������� 3���� ���縦 �Ͽ� ���ο� �迭�� index5���� ����
		int target[] = new int[10]; //0~9
		
		System.arraycopy(num, 2, target, 5, 3);
		
		for(int i=0;i<target.length;i++) {
			System.out.println("target["+i+"]= "+target[i]);
		}

	}

}
