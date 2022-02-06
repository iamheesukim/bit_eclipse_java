//0617-2(1) 총(2)까지있음
								//추상클래스 상속
public class AbstractMain extends AbstractTest {
	//상위 추상클래스의 메소드를 오버라이딩 하지 않았다면,
	//추상메소드를 상속받는 AbstractMain도 추상클래스

	public AbstractMain() {
		System.out.println("테스트2");
	}

	//상속받은 추상클래스 내의 모든 추상메소드를 오버라이딩한다
	public void print() {
		System.out.println("num="+num+", name = "+name);
	}
	
	public void setData(int num, String name) {
		this.num =num; //super.num=num
		this.name = name; //super.name=name
	}
	
	public void start() {
		numOutput();
		setData(5000,"이순신");
		print();
	}
	
	public static void main(String[] args) {
		AbstractMain am = new AbstractMain();
		
		//추상메소드는 객체를 생성할 수 없다.
		//AbstractTest at = new AbstractTest(); -> 오류
		
		am.start();
	}

}
