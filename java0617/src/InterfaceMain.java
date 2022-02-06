//클래스에서 interface를 상속받을 경우 implements키워드를 사용한다
//interface는 여러개 상속받을 수 있다
//상속받은 모든 추상메소드는 오버라이딩을 하여야한다.
public class InterfaceMain implements Interface1, Interface2{ //0617-3(4)

	public InterfaceMain() {
	}
	
	//추상메소드 오버라이딩
	public void output() {}
	public int sum() {
		return 5050;
	}
	public void oddSum() {
		int sum = 0;
		for(int i=1;i<MAX; i+=2) {
			sum += i;
		}
		System.out.println("1에서 "+MAX+"까지의 합은 "+sum);
	}
	
	public int evenSum() {
		int sum = 0;
		for(int i=2;i<=MAX;i+=2) {
			sum+=i;
		}
		return sum;
	}
	
	public void resultPrint(int data) {
		System.out.println("결과값 = "+data);
	}
	
	public void start() {
		resultPrint(sum()); //합 1~100 결과값은 5050
		oddSum(); //2500
		resultPrint(evenSum()); //2550
	}

	public static void main(String[] args) {

		new InterfaceMain().start();

	}

}
