
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
	
	
	
	//<E> �߰� �ϱ� ��
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
////	username�� String���� ����Ǿ��ٸ� set() �Ű������� 1234�� ������
////	1234�� int���̶� ������ �߻���.
////	������ Object�� ����Ǹ�, 1234�� �ڵ����� integer�� ����ڽ̵Ǿ� �Ű������� ����
//	
//	//�׶��׶� ���ϴ� ���������� �޴°�, �װ� ���׸�.

