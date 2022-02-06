import javax.swing.JFrame;
								//default : BorderLayout
public class JFrameTest extends JFrame { //0629-3
	//일반 Frame과 차이는? x(종료)버튼이 작동함
	
	public JFrameTest() {
		setSize(500,500);
		setVisible(true);
		
		//프로그램이 종료되면 자원해제하거나, 프로그램을 종료할 수 없도록 설정..
		//DISPOSE_ON_CLOSE : 프로그램 종료 시 자원을 해제하라
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);

		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
