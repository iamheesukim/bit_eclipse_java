import java.util.Random;
public class SelectionSortAnswer {

	public static void main(String[] args) {
		Random ran = new Random();
		
		int ranInt[]=new int[10];
		
		for(int i=0; i<ranInt.length;i++) {
			ranInt[i]=ran.nextInt(100)+1; //0~99니까 +1
		}
		
		/*나는 앞뒤 비교해서 최소값을 찾고 그 최소값 자리를 알아내서
		n번째 반복일때 n번째 자리와 교환하는 방식으로 코딩함.
		
		강사님은 n번째 반복일때 n자리와 뒤에만 비교해서 더 작으면 바꿈
		 
		 */
		
		//정렬
		for (int point=0;point<ranInt.length-1;point++) { //0 1 2 ..8
			
			//비교하며 교환
			for(int i=point+1; i<ranInt.length; i++) { //0 ->1 2 3 ..9
				if(ranInt[point] > ranInt[i]) {        //1 ->2 3 4 ..9
					int temp = ranInt[point];
					ranInt[point] = ranInt[i];
					ranInt[i] = temp;
				}
			}
		}
		
		//출력
		for(int data : ranInt) {
			System.out.print(data+"\t");
		}
		System.out.println();

	}

}