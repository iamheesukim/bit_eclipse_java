import test.DefaultData;

public class ModifierTest { //0616-2(1)

	public ModifierTest() {
//		LottoOOP lotto = new LottoOOP();
//		lotto.lottoStart(); //lotto��ü�� ����� LottoOOP Ŭ������ �ִ� lottoStart �޼ҵ带 ����
		
		DefaultData dd = new DefaultData();
		
		//��ü��.�������
		
		//System.out.println("�̸�="+dd.name); -> ����
		//Ŭ������ public�̴��� ������ default�̸� ������ �� ����
		//������ public�̸� ��.
		
		System.out.println("�̸�="+dd.getName()); //�޼ҵ�� �� ��������
		//System.out.println("����ó="+dd.tel);
		
		DefaultData dd2 = new DefaultData("�̼���","010-8888-8888");
		//�����ڸ޼ҵ尡 default�̸� ����
		//public�̸� ����x
		
		//dd2.sum();
		DefaultData.sum();
		//�޼ҵ� �տ� static�� ������ �����̹Ƿ� ��ü��.�޼ҵ�()�� �ƴ϶�, Ŭ������.�޼ҵ�() !
		
		//DefaultData.getName();
	}

	public static void main(String[] args) {
		// ����������
		// Ŭ���� : public default(����)
		// �����ڸ޼ҵ�, (�Ϲ�)�޼ҵ�, ������� : public protected default private
		// �������� : X
		new ModifierTest();

	}

}
