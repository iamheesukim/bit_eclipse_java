
public class MathRandomTest { //0609-5

	public static void main(String[] args) {
		
		for(int i=1; i<1000; i++) {
			double ran = Math.random();
			//MathŬ������ random�޼ҵ�
			//Math�� java.lang�� �����̶� ���� import���ٰ� ����
			//System.out.println(ran);
			//��ǻ�Ͱ� ����Ǵ� ������ 0.0~1.0 ������ ���� ������.
			//����� 0.473294237 �̷���
			int ranInt = (int)(ran*10); //0~9 ����
			//*50�̸� 0~49 / 100�̸� 0~99 ��ʽ� �����ϱ�
			System.out.println(ranInt);
		}
			
			/*�׷��ٸ� 50~100 ���̴�?
			m=ū��-������+1=100-50+151
			(����)(����*m)+50
			(����)(����*51)+50
			*/
		for(int i=1; i<1000; i++) {
			double ran = Math.random();
			int ranInt2 = (int)(ran*(100-50+1))+50;
			System.out.println(ranInt2);
		}

	}

}