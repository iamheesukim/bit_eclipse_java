import java.awt.Font;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class DigitalClock extends JFrame implements Runnable { //0712-1 (0709 ���� ��) thread
   Font fnt = new Font("����",Font.BOLD,100) ;
   Calendar now= Calendar.getInstance();
   JLabel lbl = new JLabel("", JLabel.CENTER);
   TimeZone time;//����ð� ���ϴ� �޼���

   
public DigitalClock(int x,int y,String h) {
   
   //super("�ð�");
   add(lbl); 
   lbl.setFont(fnt);
   setSize(500,200);
   setVisible(true);
   setLocation(x,y);
   setTitle(h);
   setDefaultCloseOperation(DISPOSE_ON_CLOSE);
   
   time=TimeZone.getTimeZone(h);
   
   //���� ��ü�� �����ؼ� Thread �ȿ� �־ ������,
   //this�� �̿��ؼ� ��ü ���� ���� �ٷ� ����
   Thread t = new Thread(this);
   t.start();
   
   }

   @Override
   public void run() {
      do {
         lbl.setText(getTimer());
         try {
                  Thread.sleep(1000);
         }catch(InterruptedException e) {
            
         }
         
      }while(true);
   }
   
   public String getTimer() {

      now= Calendar.getInstance(); 
      SimpleDateFormat fmt= new SimpleDateFormat("HH:mm:ss");
      fmt.setTimeZone(time);
      return fmt.format(now.getTime());
            
   }
      
   
   
   
   public static void main(String[] args) {
//      DigitalClock ck1 = new DigitalClock(100,100,"Asia/Seoul");
//      DigitalClock ck2 = new DigitalClock(650,100,"America/New_York");
//      DigitalClock ck3 = new DigitalClock(1200,100,"Eourpe/Berlin");
//      
//      Thread t1= new Thread(ck1);
//      Thread t2= new Thread(ck2);
//      Thread t3= new Thread(ck3);
//            
//      
//      t1.start();
//      t2.start();
//      t3.start();
      
	   new DigitalClock(0,0,"Asia/Seoul");
	   new DigitalClock(500,0,"America/New_York");
	   new DigitalClock(1000,0,"Eourpe/Berlin");

   }



}