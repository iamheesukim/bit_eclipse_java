import java.util.Random;
public class SelectionSortAnswer {

	public static void main(String[] args) {
		Random ran = new Random();
		
		int ranInt[]=new int[10];
		
		for(int i=0; i<ranInt.length;i++) {
			ranInt[i]=ran.nextInt(100)+1; //0~99�ϱ� +1
		}
		
		/*���� �յ� ���ؼ� �ּҰ��� ã�� �� �ּҰ� �ڸ��� �˾Ƴ���
		n��° �ݺ��϶� n��° �ڸ��� ��ȯ�ϴ� ������� �ڵ���.
		
		������� n��° �ݺ��϶� n�ڸ��� �ڿ��� ���ؼ� �� ������ �ٲ�
		 
		 */
		
		//����
		for (int point=0;point<ranInt.length-1;point++) { //0 1 2 ..8
			
			//���ϸ� ��ȯ
			for(int i=point+1; i<ranInt.length; i++) { //0 ->1 2 3 ..9
				if(ranInt[point] > ranInt[i]) {        //1 ->2 3 4 ..9
					int temp = ranInt[point];
					ranInt[point] = ranInt[i];
					ranInt[i] = temp;
				}
			}
		}
		
		//���
		for(int data : ranInt) {
			System.out.print(data+"\t");
		}
		System.out.println();

	}

}