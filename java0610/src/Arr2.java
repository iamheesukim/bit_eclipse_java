
public class Arr2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//2���� �迭
		int data[][] = new int [5][5]; //int 25���� ���尡���� ���� ����
		
		data[0][3]=100;
		data[1][2]=85;
		data[1][4]=84;
		data[2][3]=77;
		//���� �� �� ���� �⺻ 0

			//2���� �迭 ���
		for(int r=0; r<data.length;r++) { //���� �� ��ŭ �ݺ�
			//1���� �迭�� ��, length : ������ ���� / 2���� �迭�� ��, length : ���� ��
			for (int c=0; c<data[r].length;c++) { //data[r].length : r���� ĭ ��
				System.out.print(data[r][c]+"\t");
			}
			System.out.println();
		}
		
		//�ʱⰪ ����
		String[][] jusorok = { 
				{"ȫ�浿","010-1234-5678","abcd@aa.com"},
				{"�̼���","010-1111-2222","efgh@aa.com"},
				{"�������","010-3333-4444","qwer@aa.com"} };
		
		for(int r=0; r<jusorok.length; r++) {
			for (int c=0; c<jusorok[r].length;c++) {
				System.out.print(jusorok[r][c]+"\t");
			}
			System.out.println();
		}
		
	}

}
