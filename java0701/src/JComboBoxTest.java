import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.Vector;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class JComboBoxTest extends JFrame implements ItemListener { //0701-6
   JPanel pane = new JPanel();
   JComboBox<String> cb1= new JComboBox<String>();
   JComboBox<String> cb2, cb3, cb4;
   
   JLabel lbl= new JLabel("선택값 표시되는 곳");
            // 0           1           2          3
   Color clr[]= {Color.red,Color.blue,Color.green,Color.white,Color.black};

   public JComboBoxTest() {
      add(BorderLayout.NORTH,pane); //패널을 만들어서 북쪽에 넣어둠
      pane.add(cb1);
      
      lbl.setOpaque(true);
      add(lbl);
      //목록추가
      cb1.addItem("자바");
      cb1.addItem("스프링");
      cb1.addItem("JSP");
      
      //배열의 데이터를 목록만들기   0      1      2       3        4
      String comboList[] = {"RED","BLUE","GREEN","WHITE","BLACK"};//cb2를 만든거
      cb2= new JComboBox(comboList); //이걸 선택하면 여기서 하나 여기서 백그라운드를 넣을거임
      pane.add(cb2);
      
      //컬렉션을 (Vector)을 이용한 목록만들기
      Vector<String> v = new Vector<String>(); //백터로 넣는거나 다 똑같음
      v.add("AAAAAA");
      v.add("BBBBBB");
      v.add("CCCCCC");
      
      cb3= new JComboBox(v);
      pane.add(cb3);
      
      //모델을 이용한 목록 만들기 
      DefaultComboBoxModel<String> model= new DefaultComboBoxModel<String>();
      model.addElement("장미");
      model.addElement("국화");
      model.addElement("튤립");
      
      cb4 = new JComboBox<String>(model);
      pane.add(cb4);// 어떤걸로 만들던 쓰는 방법은 마음대로 하면 된다.
      
      setSize(500,500);
      setVisible(true);
      setDefaultCloseOperation(DISPOSE_ON_CLOSE);
      
      //이벤트등록 
      cb2.addItemListener(this);
      cb4.addItemListener(this);
   }
      //오버라이딩
   public void itemStateChanged(ItemEvent ie) {
      JComboBox event=(JComboBox)ie.getSource();
      if(event.equals(cb2)) {
         int idx=cb2.getSelectedIndex();
         lbl.setBackground(clr[idx]);
         //선택목록에 index얻어오기.
         //라벨은 기본으로 투명처리가 되어있다. 라벨은 투명처리해제 해야됌.
      
      }else if(event.equals(cb4)) {
         //이벤드발생한 객체랑 얘랑 같느냐
         lbl.setText((String)cb4.getSelectedItem());
         System.out.println(cb4.getSelectedItem());
      }
      
   }
   public static void main(String[] args) {
      new JComboBoxTest();
   }

}