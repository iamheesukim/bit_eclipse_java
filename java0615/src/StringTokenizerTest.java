import java.util.StringTokenizer;
public class StringTokenizerTest { //0615-5

	public StringTokenizerTest() {
		
		String txt = "�����, ������, �ż���. �ű�����, 3��, ��Ʈķ��, ��������";
		
		//st ��ü ����
		StringTokenizer st = new StringTokenizer(txt,",."); //,�� .�� ���� (�ϳ��� �ᵵ��)
		
		//countTokens() : ��ū ��(������ ����)
		int tokenCount = st.countTokens();
		System.out.println("��ū�� : "+tokenCount);

		//�� ��ū���� �ϳ���
		while(st.hasMoreElements()) { //true : ���� ��ū�� ������, false : ���� ��ū�� ������
			String token = st.nextToken();
			System.out.println(token);
			
		}
		
		
	}

	public static void main(String[] args) {
		new StringTokenizerTest();

	}

}
