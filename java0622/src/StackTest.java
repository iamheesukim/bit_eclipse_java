import java.util.Stack;

public class StackTest { //0622-3 (컬렉션 Stack)

	public StackTest() {
		Stack<String> stack = new Stack<String>();
		
		//stack은 먼저 입력된 정보가, 나중에 출력된다 (FILO)
		//queue : FIFO
		//push() : 입력 / pop() : 출력
		
		stack.push("홍길동");
		stack.push("세종대왕");
		stack.push("이순신");
		stack.push("김정희");
		
		
		//empty() : stack에 객체가 있으면 false / 없으면 true
		while(!stack.empty()) {
			String name = stack.pop();
			System.out.println(name);
		}
	}

	public static void main(String[] args) {
		new StackTest();

	}

}
