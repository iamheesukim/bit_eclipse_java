import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetTest { //0621-9
	
	String list[] = {"JAVA", "Spring", "스프링프레임", "JAVA", "자바", "ORACLE", "스프링", "ORACLE"};

	public TreeSetTest() {
		start();
	}
	
	public void start() {

		TreeSet<String> ts = new TreeSet<String>();
		
		//TreeSet 객체 추가
		for(String data : list) {
			ts.add(data);
		}
		
		//ts는 자동 오름차순 정렬되어 있다.
		
		System.out.println(ts.size());
		
		Iterator<String> ii = ts.iterator();
		
		while(ii.hasNext()) {
			String d = ii.next();
			System.out.println(d);
			//오름차순
			//숫자 -> 영어 -> 한글
			//중복은 제거
		}
		
		//내림차순으로 정렬하여 객체 가져오기
		Iterator<String> iii = ts.descendingIterator(); //역순
		while(iii.hasNext()) {
			String d = iii.next();
			System.out.println(d);
		}
	}

	
	
	
	public static void main(String[] args) {
		new TreeSetTest();

	}

}

//TreeSet
// : 입력순서 유지하지 않는다.
// : 중복 데이터 허용하지 않는다.
// : 오름차순 정렬한다.

