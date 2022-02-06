
public class Arr2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//2차원 배열
		int data[][] = new int [5][5]; //int 25개를 저장가능한 변수 생성
		
		data[0][3]=100;
		data[1][2]=85;
		data[1][4]=84;
		data[2][3]=77;
		//값을 안 준 곳은 기본 0

			//2차원 배열 출력
		for(int r=0; r<data.length;r++) { //행의 수 만큼 반복
			//1차원 배열일 땐, length : 변수의 갯수 / 2차원 배열일 땐, length : 행의 수
			for (int c=0; c<data[r].length;c++) { //data[r].length : r행의 칸 수
				System.out.print(data[r][c]+"\t");
			}
			System.out.println();
		}
		
		//초기값 설정
		String[][] jusorok = { 
				{"홍길동","010-1234-5678","abcd@aa.com"},
				{"이순신","010-1111-2222","efgh@aa.com"},
				{"세종대왕","010-3333-4444","qwer@aa.com"} };
		
		for(int r=0; r<jusorok.length; r++) {
			for (int c=0; c<jusorok[r].length;c++) {
				System.out.print(jusorok[r][c]+"\t");
			}
			System.out.println();
		}
		
	}

}
