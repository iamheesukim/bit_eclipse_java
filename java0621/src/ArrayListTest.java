import java.util.List;

public class ArrayListTest { //0621-5 (2,6)

	public ArrayListTest() {
		CollectionData data = new CollectionData();
		List<MemberVo> lst= data.getMember();
		
		MemberVo vo2 = new MemberVo("ZZZZ","��ȹ��", "2020-01-02", 5000);
		lst.add(2,vo2);
		//lst.add(2, new MemberVo("ZZZZ","��ȹ��", "2020-01-02", 5000));
		//[2]�� ����.
		
		lst.remove(1); //�ε����� ����
		lst.remove(vo2); //��ü������ ����
		
		
		
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
