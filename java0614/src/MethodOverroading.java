public class MethodOverroading { //0614-7

	public MethodOverroading() {
	}

	int totalResult() {
		int result =0;
		for(int i=1; i<=100; i++) {
			result += i;
		}
		return result;
	}

	//1~max������ ���� ���Ѵ�.

	int totalResult(int max) {
		int result =0;
		for(int i=1; i<=max; i++) {
			result += i;
		}
		return result;
	}

	public static void main(String[] args) {
		MethodOverroading mo = new MethodOverroading();

		int r = mo.totalResult(); //6�� ���� : 1~100������ ��
		int rr = mo.totalResult(200); // 16�� ���� : 1~200������ ��
		System.out.println("r = "+r);
		System.out.println("rr = "+rr); 

		System.out.println(100);
		System.out.println(10.36);
		System.out.println('A');
	}
}

/*
�����ε�
���� Ŭ�������� �޼ҵ���� ���� �޼ҵ尡 ������ ������ �� �����ε��̶�� �Ѵ�.
�޼ҵ��� ��ȯ���� ���� �Ű������� ������ ���������� �޶���Ѵ�.
 */