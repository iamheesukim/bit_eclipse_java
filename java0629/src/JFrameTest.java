import javax.swing.JFrame;
								//default : BorderLayout
public class JFrameTest extends JFrame { //0629-3
	//�Ϲ� Frame�� ���̴�? x(����)��ư�� �۵���
	
	public JFrameTest() {
		setSize(500,500);
		setVisible(true);
		
		//���α׷��� ����Ǹ� �ڿ������ϰų�, ���α׷��� ������ �� ������ ����..
		//DISPOSE_ON_CLOSE : ���α׷� ���� �� �ڿ��� �����϶�
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);

		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
