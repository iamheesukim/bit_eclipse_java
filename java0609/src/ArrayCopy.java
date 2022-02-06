
public class ArrayCopy { //0609-4

	public static void main(String[] args) {
		//배열의 복사
		
		int num[] = {20, 67,15,95,36,48,23,14};
		
		//기본 System에 있는 메소드(?)
		//arraycopy(Object src, int srcPos, Object dest, int destPos, int length)
		//			원본 배열이름	복사 시작 지점	복사할 배열이름	복사 넣을 지점		얼만큼?
		//			num			2			target		5				3
		
		//num배열에서 index2에서부터 3개만 복사를 하여 새로운 배열에 index5부터 대입
		int target[] = new int[10]; //0~9
		
		System.arraycopy(num, 2, target, 5, 3);
		
		for(int i=0;i<target.length;i++) {
			System.out.println("target["+i+"]= "+target[i]);
		}

	}

}
