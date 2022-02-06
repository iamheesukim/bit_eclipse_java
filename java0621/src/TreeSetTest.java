import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetTest { //0621-9
	
	String list[] = {"JAVA", "Spring", "������������", "JAVA", "�ڹ�", "ORACLE", "������", "ORACLE"};

	public TreeSetTest() {
		start();
	}
	
	public void start() {

		TreeSet<String> ts = new TreeSet<String>();
		
		//TreeSet ��ü �߰�
		for(String data : list) {
			ts.add(data);
		}
		
		//ts�� �ڵ� �������� ���ĵǾ� �ִ�.
		
		System.out.println(ts.size());
		
		Iterator<String> ii = ts.iterator();
		
		while(ii.hasNext()) {
			String d = ii.next();
			System.out.println(d);
			//��������
			//���� -> ���� -> �ѱ�
			//�ߺ��� ����
		}
		
		//������������ �����Ͽ� ��ü ��������
		Iterator<String> iii = ts.descendingIterator(); //����
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
// : �Է¼��� �������� �ʴ´�.
// : �ߺ� ������ ������� �ʴ´�.
// : �������� �����Ѵ�.

