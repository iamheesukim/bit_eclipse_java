import java.util.Calendar;

public class StaticTestMain { //0614-6

	public StaticTestMain() {
	}

	public static void main(String[] args) {
		StaticTest ss = new StaticTest();
		StaticTest ss2 = new StaticTest();

		ss.setAddr("��������");

		String address = ss2.getAddr();
		System.out.println("address = "+address);
		//StaticTest 6������ static������ �������� / ������ ������

		//static ��������� ��ü�������� �ʰ� ����� �� ����
		System.out.println("addr = "+StaticTest.addr);

		Calendar now = Calendar.getInstance();
		System.out.println(now.get(Calendar.YEAR));
		//YEAR�� �տ� static����
}}