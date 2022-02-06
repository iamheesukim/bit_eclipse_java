public class ArrayTest05 { 
	//2차원 배열의 행마다 다른 열의 수를 가질 수 있다
	public static void main(String[] args) {
		
		int num[][] = new int[5][]; //행의 5개
		
		//열의 생성
		num[0]= new int[3];
		num[1]= new int[5];
		num[2]= new int[4];
		num[3]= new int[1];
		num[4]= new int[6];
		
		for(int r=0; r<num.length; r++) {
			for (int c=0; c<num[r].length; c++) {
				System.out.print(num[r][c]+"\t");
			}
			System.out.println();
			
		}
	}
}