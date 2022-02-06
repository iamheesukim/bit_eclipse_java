import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ObjectCompareTest { //0624 - 5 
	//�Ի��� �������� �����ϱ�

	public ObjectCompareTest() {
		
		List<MemberVO> mem = new ArrayList<MemberVO>();

		mem.add(new MemberVO("ȫ�浿","��ȹ��","2020-10-10",5000));
		mem.add(new MemberVO("�̼���","�Ѱ��","2020-01-01",6000));
		mem.add(new MemberVO("�念��","�ѹ���","2020-07-08",3000));
		mem.add(new MemberVO("�������","�λ��","2020-02-01",7000));
		mem.add(new MemberVO("���·�","��ȹ��","2020-03-05",6000));
		mem.add(new MemberVO("���","������","2021-02-10",5000));
		
		System.out.println("=====���� ��=====");
		for(MemberVO vo : mem) { //Ȯ��� for�� : (���ʸ���ü : �÷��ǰ�ü)
			System.out.println(vo.toString());
		}
		
		//==========================================================================
	
		System.out.println("=====�޿��� ������������ ����=====");
		
		// 				��ü�� ��ü�ִ� �÷���, ������ ������ �Ǵ� ����� �ִ� Comparator ��ü
		Collections.sort(mem, new CompareAscSal());
		
		for (MemberVO vo:mem) {
			System.out.println(vo.toString());
		}
		
		System.out.println("=====�޿��� ������������ ����=====");
		
		// 				��ü�� ��ü�ִ� �÷���, ������ ������ �Ǵ� ����� �ִ� Comparator ��ü
		Collections.sort(mem, new CompareDesSal());
		
		for (MemberVO vo:mem) {
			System.out.println(vo.toString());
		}
		
		//============================================================================
		
		System.out.println("=====�̸��� ������������ ����=====");
		
		// 				��ü�� ��ü�ִ� �÷���, ������ ������ �Ǵ� ����� �ִ� Comparator ��ü
		Collections.sort(mem, new CompareAscName());
		
		for (MemberVO vo:mem) {
			System.out.println(vo.toString());
		}
		
		System.out.println("=====�̸��� ������������ ����=====");
		
		// 				��ü�� ��ü�ִ� �÷���, ������ ������ �Ǵ� ����� �ִ� Comparator ��ü
		Collections.sort(mem, new CompareDesName());
		
		for (MemberVO vo:mem) {
			System.out.println(vo.toString());
		}
		
		//=================================================
		
		System.out.println("=====�Ի����� ������������ ����=====");
		
		// 				��ü�� ��ü�ִ� �÷���, ������ ������ �Ǵ� ����� �ִ� Comparator ��ü
		Collections.sort(mem, new CompareAscHire());
		
		for (MemberVO vo:mem) {
			System.out.println(vo.toString());
		}
	}
	
	
	
	//=================================================
	
	//�����ϴ� Ŭ������ Comparator �������̽��� ��ӹ޾� �����
	//���ڸ� �̿��� �������� �����ϴ� Ŭ����
	class CompareAscSal implements Comparator<MemberVO> {
		public int compare(MemberVO v1, MemberVO v2) {
			
			//		���ǽ�
			//������ ���� ������ -, ������ ���� ũ�� +, ������ 0
			return (v1.getSal() < v2.getSal())? -1:((v1.getSal() > v2.getSal())? 1:0) ;
		}
	}

	
	//���ڸ� �̿��� �������� �����ϴ� Ŭ����
	class CompareDesSal implements Comparator<MemberVO> {
		public int compare(MemberVO v1, MemberVO v2) {
			
			//		���ǽ�
			return (v1.getSal() < v2.getSal())? 1:((v1.getSal() > v2.getSal())? -1:0) ;
		}
	}
	
	//======================================================================================
	
	//�̸��� ������������ �����ϴ� Ŭ����
	class CompareAscName implements Comparator<MemberVO> {
		public int compare(MemberVO v1, MemberVO v2) {
			
			//��� �񱳵Ǵ��� Ȯ�ο�
			//System.out.println(v1.getName()+", "+v2.getName()+" --> "+v1.getName().compareToIgnoreCase(v2.getName()));
			
			//		���ǽ�
			return v1.getName().compareToIgnoreCase(v2.getName());
		}
	}
	
	//�̸��� ������������ �����ϴ� Ŭ����
	class CompareDesName implements Comparator<MemberVO> {
		public int compare(MemberVO v1, MemberVO v2) {
			
			//		���ǽ�
			return v2.getName().compareToIgnoreCase(v1.getName());
		}
	}
	
	//=================================================================
	
	//�Ի��� �������� ������ �ڵ��غ���
	class CompareAscHire implements Comparator<MemberVO> {
		public int compare(MemberVO obj1, MemberVO obj2) {
			
			return (obj1.getHire().compareTo(obj2.getHire())) ;
		}
	}
	
	
	public static void main(String[] args) {
		new ObjectCompareTest();

	}

}
