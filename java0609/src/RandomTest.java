import java.util.Random; //util 패키지? 안에 있음
public class RandomTest { //0609-6

	public static void main(String[] args) {
		// Random : 난수 생성 클래스 
		// 난수 생성엔 Math아님 Ramdom 클래스를 씀
		
		Random ran = new Random(); //Random은 ran이란 변수로 불러낼거임(?)
		
		for(int i=1; i<=100; i++) {
			
			//정수(int)를 구한다.
			//int ranInt= ran.nextInt(); // 정수 -21억~ 21억
			//int ranInt= ran.nextInt(100); //0~99
			//int ranInt= ran.nextInt(50); //0~49
			//boolean ranInt= ran.nextBoolean();
			
			//50~100 사이는? *큰값-작은값+1
			int random = ran.nextInt(51)+50; //0~50 +50 -> 50~100
			
			//System.out.print(ranInt+"\t");
			System.out.print(random+"\t");
			
			if(i%10==0){System.out.println(); //줄바꿈

			}
		}

	}

}
