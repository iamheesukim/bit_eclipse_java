
public class GugudanMethodTest {//0614-4(1)
	
	//���� �Է��ϸ� �������� ���Ͽ� ��ȯ�ϴ� �޼ҵ带 ����
	
	public GugudanMethodTest() {
	}

	String gugudan(int dan) {
	/*��ȯ�� �޼ҵ�� (�Ű����� (�־������)) {
		���๮; //��ɱ���
	 	 }
	*/
		String result="";
		for(int i=2;i<10;i++) {
			result += dan+"*"+i+"="+dan*i+"\n";
		}
		return result;
		//� �����Ͱ� �����°�? ->
		//String result�̴ϱ� ���ڿ��� ����
		
	}

	//static Ű����
	//��ü ���� ȣ�� ����
	static void sum(int max) {
		int tot = 0;
		for (int i=1;i<max;i++) {
			tot +=i;
		}
		System.out.println("1~"+max+"�� ���� "+tot);
	}

}
