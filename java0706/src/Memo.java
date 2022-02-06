import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;


public class Memo extends JFrame implements ActionListener{ //0607-2
	//메뉴바에 각각 메뉴 담고, 그 메뉴안에 메뉴아이템
	
   //파일메뉴
   JMenuBar mb = new JMenuBar();
      JMenu fileMenu= new JMenu("파일");
         JMenuItem newMenuItem= new JMenuItem("새글");
         JMenuItem openMenuItem= new JMenuItem("열기");
         JMenuItem saveMenuItem= new JMenuItem("저장");
         JMenuItem endMenuItem= new JMenuItem("종료");
   //편집메뉴
      JMenu editMenu = new JMenu("편집");
         JMenuItem cutMenuItem= new JMenuItem("오려두기");
         JMenuItem copyMenuItem= new JMenuItem("복사하기");
         JMenuItem pasteMenuItem= new JMenuItem("붙여넣기");
   //실행메뉴
      JMenu runMenu = new JMenu("실행");
         JMenuItem chromeMenuItem = new JMenuItem("크롬");
         JMenuItem editplusMenuItem= new JMenuItem("에디트플러스");
   
   JTextArea ta= new JTextArea();
   JScrollPane sp = new JScrollPane(ta);
   
   public Memo() {
	  //메뉴바는 add가 아니라 set
      setJMenuBar(mb);
      mb.add(fileMenu); mb.add(editMenu); mb.add(runMenu);
      
      fileMenu.add(newMenuItem); fileMenu.add(openMenuItem); fileMenu.add(saveMenuItem);
      fileMenu.addSeparator();
      fileMenu.add(endMenuItem);
      
      editMenu.add(cutMenuItem); editMenu.add(copyMenuItem); editMenu.add(pasteMenuItem); 
      
      runMenu.add(chromeMenuItem); runMenu.add(editplusMenuItem);
      
      add(sp);
      
      setSize(700,700);
      setVisible(true);
      setDefaultCloseOperation(DISPOSE_ON_CLOSE);
      
      newMenuItem.addActionListener(this);
      openMenuItem.addActionListener(this);
      saveMenuItem.addActionListener(this);
      endMenuItem.addActionListener(this);
      
      cutMenuItem.addActionListener(this);
      copyMenuItem.addActionListener(this);
      pasteMenuItem.addActionListener(this);
      
      chromeMenuItem.addActionListener(this);
      editplusMenuItem.addActionListener(this);
   
   }
   
   @Override
   public void actionPerformed(ActionEvent ae) {
	   Object event = ae.getSource();
	   
	   if (event==newMenuItem) {
		   ta.setText("");
	   }
	   else if(event==openMenuItem) {
		   
	   }
	   else if (event==saveMenuItem) {
	   }
	   else if (event==endMenuItem) {
		   System.exit(0);
	   }
	   else if (event==cutMenuItem) {
	   
	   }
	   else if (event==copyMenuItem) {
		   
	   }
	   else if (event==pasteMenuItem) {
		   
	   }
	   else if (event==chromeMenuItem) {
		   
	   }
	   else if (event==editplusMenuItem) {
		   
	   }
   	
   }

   public static void main(String[] args) {
         new Memo();

   }

}