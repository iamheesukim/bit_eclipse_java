import java.util.ArrayList;
import java.util.List;

public class CollectionData { //0621-6 (2,5)

	public CollectionData() {
	}
	
	public List<MemberVo> getMember() {
		//ArrayList���� ��������� ��Ƽ� �����Ѵ�.
		
		//ArrayList<MemberVo> al = new ArrayList<MemberVo>();
		//�Ʒ�ó�� ���°Ŷ� �Ȱ���. �̿��̸� �� ª��.
		
		List<MemberVo> al2 = new ArrayList<MemberVo>(); //List�� ArrayList���� �� ����
		
		al2.add(new MemberVo("AAAA", "��ȹ��", "2021-05-10", 5000));
		al2.add(new MemberVo("BBBB", "�ѹ���", "2021-01-01", 6000));
		al2.add(new MemberVo("CCCC", "�λ��", "2020-10-10", 7000));
		al2.add(new MemberVo("DDDD", "�ѹ���", "2021-02-02", 5500));
		al2.add(new MemberVo("EEEE", "�λ��", "2021-03-02", 6500));
		
		return al2;
	}

}
