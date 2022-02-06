
public class MathRandomTest { //0609-5

	public static void main(String[] args) {
		
		for(int i=1; i<1000; i++) {
			double ran = Math.random();
			//Math클래스에 random메소드
			//Math는 java.lang에 포함이라 따로 import해줄게 없음
			//System.out.println(ran);
			//컴퓨터가 실행되는 시점에 0.0~1.0 사이의 값이 생성됨.
			//출력이 0.473294237 이런식
			int ranInt = (int)(ran*10); //0~9 사이
			//*50이면 0~49 / 100이면 0~99 비례식 생각하기
			System.out.println(ranInt);
		}
			
			/*그렇다면 50~100 사이는?
			m=큰값-작은값+1=100-50+151
			(정수)(난수*m)+50
			(정수)(난수*51)+50
			*/
		for(int i=1; i<1000; i++) {
			double ran = Math.random();
			int ranInt2 = (int)(ran*(100-50+1))+50;
			System.out.println(ranInt2);
		}

	}

}