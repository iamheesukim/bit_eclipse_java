public class MethodTest2 { //0614-3(1)

	boolean power = false;

	//ä��
	//���ȭ : ����� �� ���� ��
	//�������� ���ʿ� final
	//���ȭ�� ������ ��� �������� �빮�ڷ� ǥ��.

	final int CHANNEL_MIN = 1; //����
	final int CHANNEL_MAX = 20; //����
	int channelNow = 11; //��� ���ϴ� ������

	public MethodTest2() { //�����ڸ޼ҵ�
		//Ŭ������� ����
	}

	//power ��ư�� ���� ���

	//void : ��ȯ���� ����.
	//�ҹ��ڷ� ����, �ռ����ϰ�� �ι�°�ܾ���� �빮�ڷ� ()�� �ִ�
	void powerStart() {

		power = !power;

		/* �̷��� �ڵ带 © ���� ����
		if(power) {
			power=false;
		}
		else power=true;
	}
	*/
		
	System.out.println("power = "+power);
	}
	
	//ä�� ��ȣ �ø���
	void channelUp() {
		if (channelNow == CHANNEL_MAX) {
			channelNow = CHANNEL_MIN;
		}
		else channelNow++;
		channelPrint();
	}

	//ä�� ��ȣ ������
	void channelDown() {
		if (channelNow == CHANNEL_MIN) {
			channelNow = CHANNEL_MAX;
		}
		else channelNow--;
		channelPrint();
	}

	//ä�ι�ȣ ���
	void channelPrint() {
		System.out.println("ä�� ��ȣ : "+channelNow);
	}
}