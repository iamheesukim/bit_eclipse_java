
//E : element
//K : key
//V : value

public class GenericTest<E> { //0622-6
	
	private E username;

	public GenericTest() {
	}
	
	public GenericTest(E username) {
		this.username = username;
	}
	
	public E getUsername() {
		return username;
	}

	public void setUsername(E username) {
	this.username = username;
  }


	}
	
	
	
	//<E> 추가 하기 전
//	//private String username;
//	private Object username;
//
//	public GenericTest() {
//	}
//	
//	public GenericTest(String username) {
//		this.username = username;
//	}
//	
//	public Object getUsername() {
//		return username;
//	}
//
//	public void setUsername(Object username) {
//	this.username = username;
//  }
//	
////	username이 String으로 선언되었다면 set() 매개변수로 1234를 받으면
////	1234는 int형이라 오류가 발생함.
////	하지만 Object로 선언되면, 1234가 자동으로 integer로 오토박싱되어 매개변수로 가능
//	
//	//그때그때 원하는 데이터형을 받는것, 그게 제네릭.

