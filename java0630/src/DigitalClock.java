import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.*;

public class DigitalClock extends JFrame { //0630-2
	//��:��:�� ��µǰ� 1�� ������ �ð� �ٲ�
	
	Font ft = new Font("����",Font.BOLD,100);
	Calendar now;
	JLabel lbl = new JLabel("00:00:00",JLabel.CENTER);
	
	
	public DigitalClock() {
		super("�ð�"); //setTitle
		add(lbl);
		lbl.setFont(ft);
		
		setSize(500,200);
		setVisible(true);
		
		startClock();
	}
	
	public void startClock() {
		do {
			//�ð� ����
			lbl.setText(getTimer());
			//getTimer()�� ���� �˰Ե� �ð������� �󺧿� �ؽ�Ʈ�� ������
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {}
			//1�ʰ� �����ٰ� �۵��ϴ� ������
		}
		while(true);
	}
	
	//����ð�(�ú���)�� �߰�
	public String getTimer() {
		now = Calendar.getInstance();
		//���� �޷�(�ð�) ���� �������
		SimpleDateFormat fmt = new SimpleDateFormat("HH:mm:ss");
		//� �������� ������ ����
		return fmt.format(now.getTime());
		//HH:MM:ss�� ������ �������� ���� �ð������� ������.
	}

	public static void main(String[] args) {
		new DigitalClock();

	}

}
