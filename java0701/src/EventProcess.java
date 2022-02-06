import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;

public class EventProcess implements ActionListener{ //0701-5
	JLabel lbl;
	public EventProcess() {
		// TODO Auto-generated constructor stub
	}
	
	public EventProcess(JLabel lbl) {
		this.lbl = lbl;
	}
	
	public void actionPerformed(ActionEvent ae) {
		lbl.setText("이벤트가 발생함");
	}

}
