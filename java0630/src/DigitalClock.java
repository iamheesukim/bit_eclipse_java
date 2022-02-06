import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.*;

public class DigitalClock extends JFrame { //0630-2
	//시:분:초 출력되고 1초 단위로 시간 바뀜
	
	Font ft = new Font("굴림",Font.BOLD,100);
	Calendar now;
	JLabel lbl = new JLabel("00:00:00",JLabel.CENTER);
	
	
	public DigitalClock() {
		super("시계"); //setTitle
		add(lbl);
		lbl.setFont(ft);
		
		setSize(500,200);
		setVisible(true);
		
		startClock();
	}
	
	public void startClock() {
		do {
			//시간 변경
			lbl.setText(getTimer());
			//getTimer()을 통해 알게된 시간정보를 라벨에 텍스트로 설정함
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {}
			//1초간 쉬었다가 작동하는 스레드
		}
		while(true);
	}
	
	//현재시간(시분초)를 추가
	public String getTimer() {
		now = Calendar.getInstance();
		//현재 달력(시간) 정보 갖고오기
		SimpleDateFormat fmt = new SimpleDateFormat("HH:mm:ss");
		//어떤 포맷으로 설정할 건지
		return fmt.format(now.getTime());
		//HH:MM:ss로 설정한 포맷으로 현재 시간내용을 리턴함.
	}

	public static void main(String[] args) {
		new DigitalClock();

	}

}
