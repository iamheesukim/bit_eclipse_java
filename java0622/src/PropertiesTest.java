import java.util.Enumeration;
import java.util.Properties;

public class PropertiesTest { //0622-4 (컬렉션 Properties (HashTable을 상속받음))

	public PropertiesTest() {
		//Properties 컬렉션 : key, value가 모두 String인 컬렉션
		
		Properties prop = new Properties();
		//어차피 String이라 <String>없음
		
		//setProperty() : 객체 추가
		prop.setProperty("네이버", "naver.com");
		prop.setProperty("네이트", "nate.com");
		prop.setProperty("다음", "daum.net");
		prop.setProperty("구글", "google.com");
		
		
		//getProperty() : 키를 이용하여 객체 얻어오기
		//결과를 얻어와도 String 형태
		System.out.println(prop.getProperty("다음"));
		
		//키 목록 전체 구하기
		Enumeration e = prop.propertyNames();
		//제네릭 안쓰고 String이 아닌 Object으로 담김
		//하위가 상위로 들어가는건 문제 없음
		
		while(e.hasMoreElements()) {//객체가 남아있으면 true
			//Object obj = e.nextElement();
			
			String str = (String)e.nextElement(); //오류
			//24행에서 Object로 바뀌었으므로 형 변환을 해줘야함
			System.out.println("key="+str+", value = "+prop.getProperty(str));
		}
		
	}

	public static void main(String[] args) {
		new PropertiesTest();

	}

}
