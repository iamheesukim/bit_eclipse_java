import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class CanvasAapterTest implements MouseListener { //0709-4(3����) ���콺�̺�Ʈ �ܺ�Ŭ����
	
	MouseAdapterTest2.MyCanvas mc;
	
	public CanvasAapterTest() {	
	}
	
	public CanvasAapterTest(MouseAdapterTest2.MyCanvas mc)  {
		this.mc=mc;
	}

	//�޼ҵ� �������̵�
	
	@Override
	public void mouseClicked(MouseEvent e) {
	}

	@Override
	public void mousePressed(MouseEvent e) {
	}

	@Override
	public void mouseReleased(MouseEvent me) {
		if(me.getButton()==1) {
			mc.x = me.getX();
			mc.y = me.getY();
			mc.repaint();
		}
	}

	@Override
	public void mouseEntered(MouseEvent e) {	
	}

	@Override
	public void mouseExited(MouseEvent e) {	
	}

}
