import java.util.LinkedList;

public class LinkedListTest { //0621-7

	public LinkedListTest() {
		start();
	}
	
	public void start() {
//		LinkedList : List, Deque, Queue ��� ����
//					: Queue�� ��, �Է� ������ ���� / ����� ���� �Էµ� ��ü���� ���
//					: ��µ� ��ü�� �÷��ǿ� ��������.
//					
//					: Deque�� ��, ���ʿ��� ��ü�� �Է� �Ǵ� ����� �� ����
//					: ��µ� ��ü�� �÷��ǿ� ��������.
		
		LinkedList<String> ll = new LinkedList<String>();
		
		//��ü �߰�
		ll.offer("ȫ�浿");
		ll.offer(new String("�������"));
		ll.offer(String.valueOf(1234)); //�׳� 1234�� string�� �ƴ϶� ����
		ll.offer(5678+"");
		
		System.out.println("size -> "+ll.size()); //4
		
		//��ü ������
//		String data = ll.pop(); //���� �տ� �ִ� ��ü�� ������� �÷��ǿ��� ��������. 
//		System.out.println("data="+data); //�տ� �ִ� ȫ�浿 ���
//		System.out.println("size --> "+ll.size()); //3
		
		//true : �÷��ǿ� ��ü�� ����, false : �÷��ǿ� �����ִ� ��ü�� �ִ�.
		while(!ll.isEmpty()) { //��ü�� ���� ��
			String data = ll.pop();
			int cnt = ll.size();
			System.out.println(data + ", ���� ��ü�� = "+cnt);
		}
	}

	public static void main(String[] args) {

		new LinkedListTest();

	}

}