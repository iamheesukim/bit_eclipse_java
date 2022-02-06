import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class CanvasAapterTest implements MouseListener { //0709-4(3연결) 마우스이벤트 외부클래스
	
	MouseAdapterTest2.MyCanvas mc;
	
	public CanvasAapterTest() {	
	}
	
	public CanvasAapterTest(MouseAdapterTest2.MyCanvas mc)  {
		this.mc=mc;
	}

	//메소드 오버라이딩
	
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
