import java.util.Calendar;
import java.util.Vector;

//Vector
//������ �ִ� �������� ����
//������ �ߺ� ���
//List �������̽�

public class VectorTest { //0621-3 (2, 4����)

	public VectorTest() {
	}

	public Vector start() {
		//Vecotr �÷���
		Vector v = new Vector();
		
		// ��ü 4��
		String username = "ȫ�浿";
		Integer num = 25010;
		Calendar cal = Calendar.getInstance();
		MemberVo vo = new MemberVo("�������","��ȹ��","2021-06-10",1000);
		
		//vector ��ü �߰��� add();
		//Vecotr ��ü�� �ٸ� ��ü �߰��ϱ�
		v.add(username); //[0]�� String
		v.addElement(num); //[1]�� ���� ��
		v.add(1, cal); //cal�� [1]�� ���Ƿ� [1]�� �ִ� num�� [2]�� �̵�
		v.addElement(vo); //[3]
		
		v.add(55); //[4]
		//������ ��ü�� �����ؼ� new Integer(55)�� �־��������, ����ڽ� ����� ���� ��������
		
//		v.remove(1); //�ε��� ��ȣ�� ������ �ǰ�
//		v.remove(cal); //��ü������ ������ ��.
		
		return v;
	}
//	public static void main(String[] args) {
//		new VectorTest().start();
//
//	}

}

/*

List(interface) : index�� �����Ѵ�
				 : ���� ������ �����Ѵ�.

*/