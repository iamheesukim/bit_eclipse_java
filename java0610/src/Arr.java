
public class Arr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {85,6,92,65,12,74,35};
		
		for(int data : arr) {
			System.out.print(data+"\t");
		}
		
		int arr2[][] = {
				{60,80,40,60},
				{56,62,84,79},
				{36,58,78,95}
		};
		
		//1차원배열변수 : 2차원 배열명
		for(int[] data : arr2) {
			//배열의 데이터형 변수 : 1차원 배열명
			for(int z : data) {
				System.out.print(z+"\t");
			}
			System.out.println();
		}
	}

}
