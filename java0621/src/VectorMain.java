import java.util.Calendar;
import java.util.Vector;

public class VectorMain { //0621-4 (2, 3����)

	public VectorMain() {
		//VectorTset Ŭ������ start()�޼ҵ带 ȣ���ϸ� Vector ���ϵȴ�.
		VectorTest vt = new VectorTest();
		Vector vvv = vt.start();
		//���� ĸ�� �������
		
		String aaa = (String)vvv.elementAt(0);
		//Vector v�� Ÿ���� �������� �ʾ����Ƿ� �⺻ Object Ÿ��
		//���� String �ȿ� �ַ��� �ݵ�� ����ȯ
		//[0]�� �ִ� ������ -> String ��ü
		System.out.println("aaa = "+aaa);
		
//		Calendar ccc = (Calendar)vvv.get(1);
//		System.out.println("ccc = "+ccc);
		
		Integer iii = (Integer)vvv.elementAt(2); //vvv�� Vector���̴ϱ� (integer)
		System.out.println("iii = "+iii);
		
		MemberVo vo = (MemberVo)vvv.elementAt(3);
		vo.memberPrint();
		
		Integer ttt = (Integer)vvv.elementAt(4);
		System.out.println("ttt = "+ttt);
		
		System.out.println(vvv.toString()); //�迭ó�� ������ [ȫ�浿,...,25010,MemberVo�ּ�]
	}

	public static void main(String[] args) {
	
		new VectorMain();
		
	}

}
