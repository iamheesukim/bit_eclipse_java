import java.util.Calendar;

public class StaticTestMain { //0614-6

	public StaticTestMain() {
	}

	public static void main(String[] args) {
		StaticTest ss = new StaticTest();
		StaticTest ss2 = new StaticTest();

		ss.setAddr("영등포구");

		String address = ss2.getAddr();
		System.out.println("address = "+address);
		//StaticTest 6열에서 static있으면 영등포구 / 없으면 마포구

		//static 멤버변수는 객체생성하지 않고 사용할 수 있음
		System.out.println("addr = "+StaticTest.addr);

		Calendar now = Calendar.getInstance();
		System.out.println(now.get(Calendar.YEAR));
		//YEAR는 앞에 static있음
}}