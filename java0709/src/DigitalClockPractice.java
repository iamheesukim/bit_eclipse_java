import java.awt.Font;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class DigitalClockPractice extends JFrame implements Runnable { //0709 과제
   Font fnt = new Font("굴림",Font.BOLD,100) ;
   Calendar now= Calendar.getInstance();
   JLabel lbl = new JLabel("", JLabel.CENTER);
   TimeZone time;//세계시간 구하는 메서드

   
public DigitalClockPractice(int x,int y,String h) {
   
   //super("시계");
   add(lbl); 
   lbl.setFont(fnt);
   setSize(500,200);
   setVisible(true);
   setLocation(x,y);
   setTitle(h);
   setDefaultCloseOperation(DISPOSE_ON_CLOSE);
   
   time=TimeZone.getTimeZone(h);
   
   
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
      DigitalClockPractice ck1 = new DigitalClockPractice(100,100,"Asia/Seoul");
      DigitalClockPractice ck2 = new DigitalClockPractice(650,100,"America/New_York");
      DigitalClockPractice ck3 = new DigitalClockPractice(1200,100,"Eourpe/Berlin");
      
      Thread t1= new Thread(ck1);
      Thread t2= new Thread(ck2);
      Thread t3= new Thread(ck3);
            
      
      t1.start();
      t2.start();
      t3.start();
      
   

   }



}