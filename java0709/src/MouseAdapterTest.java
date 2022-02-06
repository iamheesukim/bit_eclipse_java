import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;

import javax.swing.JFrame;

public class MouseAdapterTest extends JFrame{ //0709-2 익명내부클래스로 마우스이벤트
   int x,y;
   MyCanvas mc= new MyCanvas(); //얘가 캔버스니깐 마우스 이벤트 처리를 해야된다.
   public MouseAdapterTest() {
      add(mc);
      setSize(500,500);
      setVisible(true);
      setDefaultCloseOperation(DISPOSE_ON_CLOSE);
      
      //상속을 받지 않고 하는게 익명의 내부클래스 
      mc.addMouseListener(new MouseAdapter() {
         //여기에 오버라이딩을 구현해준다.
         public void mouseReleased(MouseEvent me) {
            //getButton(); 왼쪽버튼 :1, 가운데 휠:2, 오른쪽버튼:3
            //마우스가 클릭된곳의 좌표를 가져온다. 
            if(me.getButton()==1) {
               x=me.getX();
               y=me.getY();
               mc.repaint();

            }

         }
      }); //new~ 여기에 오버라이딩을 해놓음 실제 구현하지 않은 것들이 다 들어가있음.

   }
   public class MyCanvas extends Canvas {
         public void paint(Graphics g) {
            Random ran= new Random();
            g.setColor(new Color(ran.nextInt(256),ran.nextInt(256),ran.nextInt(256)));
            g.fillOval (x-25,y-25,50,50);

      }   
   
   public void update(Graphics g){
               paint(g);
      }
   
   }
   public static void main(String[] args) {
        new MouseAdapterTest();

   }
}

/*
내부클래스-익명의 내부클래스로 구현하는법.
*/