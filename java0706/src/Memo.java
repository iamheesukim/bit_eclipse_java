import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;


public class Memo extends JFrame implements ActionListener{ //0607-2
	//�޴��ٿ� ���� �޴� ���, �� �޴��ȿ� �޴�������
	
   //���ϸ޴�
   JMenuBar mb = new JMenuBar();
      JMenu fileMenu= new JMenu("����");
         JMenuItem newMenuItem= new JMenuItem("����");
         JMenuItem openMenuItem= new JMenuItem("����");
         JMenuItem saveMenuItem= new JMenuItem("����");
         JMenuItem endMenuItem= new JMenuItem("����");
   //�����޴�
      JMenu editMenu = new JMenu("����");
         JMenuItem cutMenuItem= new JMenuItem("�����α�");
         JMenuItem copyMenuItem= new JMenuItem("�����ϱ�");
         JMenuItem pasteMenuItem= new JMenuItem("�ٿ��ֱ�");
   //����޴�
      JMenu runMenu = new JMenu("����");
         JMenuItem chromeMenuItem = new JMenuItem("ũ��");
         JMenuItem editplusMenuItem= new JMenuItem("����Ʈ�÷���");
   
   JTextArea ta= new JTextArea();
   JScrollPane sp = new JScrollPane(ta);
   
   public Memo() {
	  //�޴��ٴ� add�� �ƴ϶� set
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