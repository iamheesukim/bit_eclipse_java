import java.util.ArrayList;
import java.util.List;

public class CollectionData { //0621-6 (2,5)

	public CollectionData() {
	}
	
	public List<MemberVo> getMember() {
		//ArrayList에서 사원정보를 담아서 리턴한다.
		
		//ArrayList<MemberVo> al = new ArrayList<MemberVo>();
		//아래처럼 쓰는거랑 똑같음. 이왕이면 더 짧게.
		
		List<MemberVo> al2 = new ArrayList<MemberVo>(); //List가 ArrayList보다 더 상위
		
		al2.add(new MemberVo("AAAA", "기획부", "2021-05-10", 5000));
		al2.add(new MemberVo("BBBB", "총무부", "2021-01-01", 6000));
		al2.add(new MemberVo("CCCC", "인사부", "2020-10-10", 7000));
		al2.add(new MemberVo("DDDD", "총무부", "2021-02-02", 5500));
		al2.add(new MemberVo("EEEE", "인사부", "2021-03-02", 6500));
		
		return al2;
	}

}
