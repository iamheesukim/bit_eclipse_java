public class Hw0610 {
	//�������� ���� ¥����


	public static void main(String[] args) {
		
		int[] arr = new int [10]; //�迭 10�� (���� 10��)
		
		System.out.println("���� ����");
		

		for(int i=0;i<arr.length;i++) {
			arr[i] = (int)(Math.random()*(100-1+1))+1; //���� ���� 1~100
			System.out.printf("%d\t", arr[i]);
		}
		
		System.out.println();
		System.out.println();
		
		for(int j=0;j<arr.length;j++) {
			int min=arr[j];
		for(int i=0+j;i<arr.length-1;i++) {
			if(min>=arr[i+1]) {
				min = arr[i+1];
			}
			}
		
		int ch=0;
		
		for(int i=0+j;i<arr.length;i++) {
			if(arr[i]==min) ch=i;
		}
		
		int tmp=arr[j];
		arr[j]=arr[ch];
		arr[ch]=tmp;
		//System.out.println(ch);
		
		System.out.printf("%d��° ���� : ", j+1);
		for (int i=0;i<arr.length;i++) {
			System.out.printf("%d\t", arr[i]); }
		System.out.println();
		
		}}}