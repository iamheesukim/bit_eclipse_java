import java.awt.Font;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class DigitalClock extends JFrame implements Runnable { //0712-1 (0709 과제 답) thread
   Font fnt = new Font("굴림",Font.BOLD,100) ;
   Calendar now= Calendar.getInstance();
   JLabel lbl = new JLabel("", JLabel.CENTER);
   TimeZone time;//세계시간 구하는 메서드

   
public DigitalClock(int x,int y,String h) {
   
   //super("시계");
   add(lbl); 
   lbl.setFont(fnt);
   setSize(500,200);
   setVisible(true);
   setLocation(x,y);
   setTitle(h);
   setDefaultCloseOperation(DISPOSE_ON_CLOSE);
   
   time=TimeZone.getTimeZone(h);
   
   //각각 객체를 생성해서 Thread 안에 넣어도 되지만,
   //this를 이용해서 객체 생성 없이 바로 가능
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