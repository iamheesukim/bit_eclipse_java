import java.util.Enumeration;
import java.util.Properties;

public class PropertiesTest { //0622-4 (�÷��� Properties (HashTable�� ��ӹ���))

	public PropertiesTest() {
		//Properties �÷��� : key, value�� ��� String�� �÷���
		
		Properties prop = new Properties();
		//������ String�̶� <String>����
		
		//setProperty() : ��ü �߰�
		prop.setProperty("���̹�", "naver.com");
		prop.setProperty("����Ʈ", "nate.com");
		prop.setProperty("����", "daum.net");
		prop.setProperty("����", "google.com");
		
		
		//getProperty() : Ű�� �̿��Ͽ� ��ü ������
		//����� ���͵� String ����
		System.out.println(prop.getProperty("����"));
		
		//Ű ��� ��ü ���ϱ�
		Enumeration e = prop.propertyNames();
		//���׸� �Ⱦ��� String�� �ƴ� Object���� ���
		//������ ������ ���°� ���� ����
		
		while(e.hasMoreElements()) {//��ü�� ���������� true
			//Object obj = e.nextElement();
			
			String str = (String)e.nextElement(); //����
			//24�࿡�� Object�� �ٲ�����Ƿ� �� ��ȯ�� �������
			System.out.println("key="+str+", value = "+prop.getProperty(str));
		}
		
	}

	public static void main(String[] args) {
		new PropertiesTest();

	}

}
