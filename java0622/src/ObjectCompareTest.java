import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ObjectCompareTest { //0624 - 5 
	//입사일 기준으로 정렬하기

	public ObjectCompareTest() {
		
		List<MemberVO> mem = new ArrayList<MemberVO>();

		mem.add(new MemberVO("홍길동","기획부","2020-10-10",5000));
		mem.add(new MemberVO("이순신","총골부","2020-01-01",6000));
		mem.add(new MemberVO("장영실","총무부","2020-07-08",3000));
		mem.add(new MemberVO("세종대왕","인사부","2020-02-01",7000));
		mem.add(new MemberVO("유승룡","기획부","2020-03-05",6000));
		mem.add(new MemberVO("김삿갓","영업부","2021-02-10",5000));
		
		System.out.println("=====정렬 전=====");
		for(MemberVO vo : mem) { //확장된 for문 : (제너릭객체 : 컬렉션객체)
			System.out.println(vo.toString());
		}
		
		//==========================================================================
	
		System.out.println("=====급여를 오름차순으로 정렬=====");
		
		// 				객체가 전체있는 컬렉션, 정렬할 기준이 되는 기능이 있느 Comparator 객체
		Collections.sort(mem, new CompareAscSal());
		
		for (MemberVO vo:mem) {
			System.out.println(vo.toString());
		}
		
		System.out.println("=====급여를 내림차순으로 정렬=====");
		
		// 				객체가 전체있는 컬렉션, 정렬할 기준이 되는 기능이 있느 Comparator 객체
		Collections.sort(mem, new CompareDesSal());
		
		for (MemberVO vo:mem) {
			System.out.println(vo.toString());
		}
		
		//============================================================================
		
		System.out.println("=====이름을 오름차순으로 정렬=====");
		
		// 				객체가 전체있는 컬렉션, 정렬할 기준이 되는 기능이 있느 Comparator 객체
		Collections.sort(mem, new CompareAscName());
		
		for (MemberVO vo:mem) {
			System.out.println(vo.toString());
		}
		
		System.out.println("=====이름을 내림차순으로 정렬=====");
		
		// 				객체가 전체있는 컬렉션, 정렬할 기준이 되는 기능이 있느 Comparator 객체
		Collections.sort(mem, new CompareDesName());
		
		for (MemberVO vo:mem) {
			System.out.println(vo.toString());
		}
		
		//=================================================
		
		System.out.println("=====입사일을 오름차순으로 정렬=====");
		
		// 				객체가 전체있는 컬렉션, 정렬할 기준이 되는 기능이 있느 Comparator 객체
		Collections.sort(mem, new CompareAscHire());
		
		for (MemberVO vo:mem) {
			System.out.println(vo.toString());
		}
	}
	
	
	
	//=================================================
	
	//정렬하는 클래스는 Comparator 인터페이스를 상속받아 만든다
	//숫자를 이용한 오름차순 정렬하는 클래스
	class CompareAscSal implements Comparator<MemberVO> {
		public int compare(MemberVO v1, MemberVO v2) {
			
			//		조건식
			//왼쪽의 값이 작으면 -, 왼쪽의 값이 크면 +, 같으면 0
			return (v1.getSal() < v2.getSal())? -1:((v1.getSal() > v2.getSal())? 1:0) ;
		}
	}

	
	//숫자를 이용한 내림차순 정렬하는 클래스
	class CompareDesSal implements Comparator<MemberVO> {
		public int compare(MemberVO v1, MemberVO v2) {
			
			//		조건식
			return (v1.getSal() < v2.getSal())? 1:((v1.getSal() > v2.getSal())? -1:0) ;
		}
	}
	
	//======================================================================================
	
	//이름을 오름차순으로 정렬하는 클래스
	class CompareAscName implements Comparator<MemberVO> {
		public int compare(MemberVO v1, MemberVO v2) {
			
			//어떻게 비교되는지 확인용
			//System.out.println(v1.getName()+", "+v2.getName()+" --> "+v1.getName().compareToIgnoreCase(v2.getName()));
			
			//		조건식
			return v1.getName().compareToIgnoreCase(v2.getName());
		}
	}
	
	//이름을 내림차순으로 정렬하는 클래스
	class CompareDesName implements Comparator<MemberVO> {
		public int compare(MemberVO v1, MemberVO v2) {
			
			//		조건식
			return v2.getName().compareToIgnoreCase(v1.getName());
		}
	}
	
	//=================================================================
	
	//입사일 기준으로 본인이 코딩해보기
	class CompareAscHire implements Comparator<MemberVO> {
		public int compare(MemberVO obj1, MemberVO obj2) {
			
			return (obj1.getHire().compareTo(obj2.getHire())) ;
		}
	}
	
	
	public static void main(String[] args) {
		new ObjectCompareTest();

	}

}
