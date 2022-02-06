public class StaticTest { //0614-5

	int num = 1234;
	String name = "홍길동";

	static String addr = "마포구";
	//static이 붙으면 이 클래스 바깥(?)에서 생성
	//객체를 2개 생성하면 모든 객체에 영향 (공통)
	//하나의 객체에서 변경하면 모든 객체에서 변경

	public StaticTest() {
	}

	//주소를 변경하는 메소드
	void setAddr(String addr) {
		this.addr=addr;
	}

	//현주소를 읽어오는 메소드
	String getAddr() {
		return addr;
	}
}