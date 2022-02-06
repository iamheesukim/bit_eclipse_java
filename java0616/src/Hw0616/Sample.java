package Hw0616;

class Test2 {
	int x;
	public void setX(int x) {
		this.x = x;
	}
	public int getX() {
		return x;
	}
}

class Ex2 {
	Test2 y;
	public void setY(Test2 y) {
		this.y = y;
	}
	public Test2 getY() {
		return y;
	}
}

public class Sample {
	public static void main(String[] args) {
		Ex2 o = new Ex2();
		Test2 i = new Test2();
		int n = 10;
		i.setX(n);
		o.setY(i);
		System.out.println(o.getY().getX());
	}

}
