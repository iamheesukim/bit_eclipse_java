public class ArrayEx04 { //내가 짠 코드

	public static void main(String[] args) {
		
		int[][] arr = new int[10][10];
		
		for(int r=0;r<arr.length-1;r++) {
			for(int c=0;c<arr[r].length-1;c++) {

				arr[r][c]= (r+1)*(c+1);
				arr[r][9] = arr[r][9] + arr[r][c];
				arr[9][c] = arr[9][c] + arr[r][c];
			}
			}
		
		for(int r=0;r<arr.length;r++) {
			for(int c=0;c<arr.length;c++) {
				System.out.printf("%d\t",arr[r][c]);
			}
			System.out.println();
		}		
	}
}