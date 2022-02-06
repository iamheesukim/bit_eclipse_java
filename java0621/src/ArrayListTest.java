import java.util.List;

public class ArrayListTest { //0621-5 (2,6)

	public ArrayListTest() {
		CollectionData data = new CollectionData();
		List<MemberVo> lst= data.getMember();
		
		MemberVo vo2 = new MemberVo("ZZZZ","기획부", "2020-01-02", 5000);
		lst.add(2,vo2);
		//lst.add(2, new MemberVo("ZZZZ","기획부", "2020-01-02", 5000));
		//[2]에 들어가짐.
		
		lst.remove(1); //인덱스로 삭제
		lst.remove(vo2); //객체명으로 삭제
		
		
		
		for(int i=0; i<lst.size(); i++) {
			MemberVo vo = lst.get(i);
			vo.memberPrint();
			System.out.println();
		}
	}

	public static void main(String[] args) {
		new ArrayListTest();

	}

}
