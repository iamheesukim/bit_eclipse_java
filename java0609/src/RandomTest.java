import java.util.Random; //util ��Ű��? �ȿ� ����
public class RandomTest { //0609-6

	public static void main(String[] args) {
		// Random : ���� ���� Ŭ���� 
		// ���� ������ Math�ƴ� Ramdom Ŭ������ ��
		
		Random ran = new Random(); //Random�� ran�̶� ������ �ҷ�������(?)
		
		for(int i=1; i<=100; i++) {
			
			//����(int)�� ���Ѵ�.
			//int ranInt= ran.nextInt(); // ���� -21��~ 21��
			//int ranInt= ran.nextInt(100); //0~99
			//int ranInt= ran.nextInt(50); //0~49
			//boolean ranInt= ran.nextBoolean();
			
			//50~100 ���̴�? *ū��-������+1
			int random = ran.nextInt(51)+50; //0~50 +50 -> 50~100
			
			//System.out.print(ranInt+"\t");
			System.out.print(random+"\t");
			
			if(i%10==0){System.out.println(); //�ٹٲ�

			}
		}

	}

}
