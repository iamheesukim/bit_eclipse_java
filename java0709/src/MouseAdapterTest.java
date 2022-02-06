import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;

import javax.swing.JFrame;

public class MouseAdapterTest extends JFrame{ //0709-2 �͸���Ŭ������ ���콺�̺�Ʈ
   int x,y;
   MyCanvas mc= new MyCanvas(); //�갡 ĵ�����ϱ� ���콺 �̺�Ʈ ó���� �ؾߵȴ�.
   public MouseAdapterTest() {
      add(mc);
      setSize(500,500);
      setVisible(true);
      setDefaultCloseOperation(DISPOSE_ON_CLOSE);
      
      //����� ���� �ʰ� �ϴ°� �͸��� ����Ŭ���� 
      mc.addMouseListener(new MouseAdapter() {
         //���⿡ �������̵��� �������ش�.
         public void mouseReleased(MouseEvent me) {
            //getButton(); ���ʹ�ư :1, ��� ��:2, �����ʹ�ư:3
            //���콺�� Ŭ���Ȱ��� ��ǥ�� �����´�. 
            if(me.getButton()==1) {
               x=me.getX();
               y=me.getY();
               mc.repaint();

            }

         }
      }); //new~ ���⿡ �������̵��� �س��� ���� �������� ���� �͵��� �� ������.

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
����Ŭ����-�͸��� ����Ŭ������ �����ϴ¹�.
*/