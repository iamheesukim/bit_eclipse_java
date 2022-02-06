import java.util.LinkedList;

public class LinkedListTest { //0621-7

	public LinkedListTest() {
		start();
	}
	
	public void start() {
//		LinkedList : List, Deque, Queue 상속 받음
//					: Queue일 땐, 입력 순서를 유지 / 출력은 먼저 입력된 객체부터 출력
//					: 출력된 객체는 컬렉션에 지워진다.
//					
//					: Deque일 땐, 양쪽에서 객체를 입력 또는 출력할 수 있음
//					: 출력된 객체는 컬렉션에 지워진다.
		
		LinkedList<String> ll = new LinkedList<String>();
		
		//객체 추가
		ll.offer("홍길동");
		ll.offer(new String("세종대왕"));
		ll.offer(String.valueOf(1234)); //그냥 1234는 string이 아니라서 오류
		ll.offer(5678+"");
		
		System.out.println("size -> "+ll.size()); //4
		
		//객체 얻어오기
//		String data = ll.pop(); //제일 앞에 있는 객체가 얻어지고 컬렉션에선 지워진다. 
//		System.out.println("data="+data); //앞에 있는 홍길동 출력
//		System.out.println("size --> "+ll.size()); //3
		
		//true : 컬렉션에 객체가 없다, false : 컬렉션에 남아있는 객체가 있다.
		while(!ll.isEmpty()) { //객체가 있을 때
			String data = ll.pop();
			int cnt = ll.size();
			System.out.println(data + ", 남은 객체수 = "+cnt);
		}
	}

	public static void main(String[] args) {

		new LinkedListTest();

	}

}
