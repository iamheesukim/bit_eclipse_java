
public class StringbufferTest { //0615-4

	public StringbufferTest() {
		start();
	}
	
	public void start() {
		StringBuffer sb1 = new StringBuffer(); //�⺻ 16byte
		StringBuffer sb2 = new StringBuffer(100); //100byte
		
		System.out.println("sb1.capacity = "+sb1.capacity());
				
		//append() : ���ڿ��߰�
		sb1.append("Buffer append Test..");
		sb2.append(123456);
		
		
		//insert() : index ��ġ�� ����
		sb1.insert(5,  "(��Ʈ������)");
		//Buffe(��Ʈ������)r append Test..
		
		//deleteCharAt() : []�ڸ��� ����
		sb1.deleteCharAt(6);
		//[6]�ڸ��� ����
		//Buffe(Ʈ������)r append Test..
		
		//delete() : ���� �ε��� ����
		sb1.delete(1,4); //"[1]���� [4]�������� �����"
		//Be(Ʈ������)r append Test..
		
		//replace() : [0]���� [0]�������� ġȯ
		sb1.replace(1,3,"(�ڹ�)"); //index 1���� 3�ձ����� "(�ڹ�)"�� ġȯ
		//B(�ڹ�)Ʈ������)r append Test..
		
		//reverse() : �Ųٷ� ���
		sb1.reverse();

		//Ȯ���� ���� Ȯ���ϱ�
		//capacity() : �뷮 ���
		//System.out.println("sb1.capacity = "+sb1.capacity()); //�뷮 ���
		System.out.println("sb2.capacity = "+sb2.capacity());
		System.out.println(sb1);
		System.out.println(sb2);
		
	}
	

	public static void main(String[] args) {
		new StringbufferTest();
	}

}
