import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.KeyStroke;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;


public class Memo extends JFrame implements ActionListener{ //0706-2 �̾ 0707-1 swing
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
         JMenuItem chromeMenuItem = new JMenuItem("����");
         JMenuItem editplusMenuItem= new JMenuItem("����Ʈ�÷���");
   
   //�ؽ�Ʈ �ʵ�
   JTextArea ta= new JTextArea();
   JScrollPane sp = new JScrollPane(ta);
   
   static String buffer; 
   
   
   public Memo() {
	  //�޴��ٴ� add�� �ƴ϶� set
      setJMenuBar(mb);
      mb.add(fileMenu); mb.add(editMenu); mb.add(runMenu);
      
      //�޴������� �ٿ��ֱ�
      fileMenu.add(newMenuItem); fileMenu.add(openMenuItem); fileMenu.add(saveMenuItem);
      fileMenu.addSeparator();
      fileMenu.add(endMenuItem);
      
      editMenu.add(cutMenuItem); editMenu.add(copyMenuItem); editMenu.add(pasteMenuItem); 
      
      runMenu.add(chromeMenuItem); runMenu.add(editplusMenuItem);
      
      add(sp);
      
      //����Ű ����
      setShortCut();
      
      //�⺻
      setSize(700,700);
      setVisible(true);
      setDefaultCloseOperation(DISPOSE_ON_CLOSE);
      
      //�׼Ǹ����� �߰����ֱ�
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
		   fileOpen();
	   }
	   else if (event==saveMenuItem) {
		   fileSave();
	   }
	   else if (event==endMenuItem) {
		   System.exit(0);
	   }
	   else if (event==cutMenuItem) {
		   stringCut();
	   }
	   else if (event==copyMenuItem) {
		   stringCopy();
	   }
	   else if (event==pasteMenuItem) {
		   stringPaste();
	   }
	   else if (event==chromeMenuItem) {
		   processStart("C://Program Files (x86)/Microsoft/Edge/Application/msedge.exe");
	   }
	   else if (event==editplusMenuItem) {
		   processStart("C://Program Files/EditPlus/editplus.exe");
	   }
   	
   }
   
   //�ܺ����� �����ϱ�
   public void processStart(String url) {
	   Runtime runtime = Runtime.getRuntime();
	   try {
		   runtime.exec(url);
		   //() �ȿ� �ٷ� �ּҸ� �־ ������, �츮�� �����÷����� ���� �Ѵ� �����ϱ� ����� ä���ֱ�
	   }
	   catch(Exception e) {}
   }
   
   //�����ϱ�
   public void stringCopy() {
	   buffer = ta.getSelectedText();
   }
   
   //�ٿ��ֱ�
   public void stringPaste() {
	 //buffer������ �ִ� ���ڸ� Ŀ���� �ִ� ���� ����
	   ta.replaceSelection(buffer);
   }
   
   
   //�����α�
   public void stringCut() {
	   //���ÿ����� ���ڸ�  buffer������ �����ϰ�
	   buffer = ta.getSelectedText();
	   //���ÿ����� ���ڸ� �������Ѵ�.
	   ta.replaceSelection("");
   }
   
   //���� ����
   public void fileSave() {
	 //������ ���� ���۳�Ʈ						//ó�� ���� ��ġ
	   JFileChooser fc = new JFileChooser(new File("D://javaSrc"));
	   int state = fc.showSaveDialog(this);
	   
	   if(state==0) { //0:����, 1:���
		   try {
			   File ff = fc.getSelectedFile();
			   FileWriter fw = new FileWriter(ff);
			   fw.write(ta.getText());
			   fw.close();
		   }
		   catch(IOException e) {
			   System.out.println(e.getMessage());
		   }
	   }
   }
   
   //���� ����
   public void fileOpen() {
	   //������ ���� ���۳�Ʈ						//ó�� ���� ��ġ
	   JFileChooser fc = new JFileChooser(new File("D://javaSrc"));
	   
	   //������ ������ �ѹ��� ���� �����ϵ��� �����ϱ�
	   //true : ���߼���, false : �ϳ��� ����
	   fc.setMultiSelectionEnabled(true);
	   
	   //���͸� (���ϸ�)									//(m,n1.n2,...) -> m:���͸� n:���Ϳ� ���� Ȯ���ڸ�
	   FileFilter filter = new FileNameExtensionFilter("�ڹ�(*.java)","java","Java","JAVA");
	   fc.setFileFilter(filter);
	   FileFilter filter2 = new FileNameExtensionFilter("Ŭ����","class");
	   fc.setFileFilter(filter2);
	   
	   int choose = fc.showOpenDialog(this);
	   if(choose==0) { //����0, ���1
		   try {
			   
			 
			   //������ ǥ�õ� ������ �����
			   ta.setText("");
			   
			 //���� ������ ���� ���� �ּ�ó��
			   //������ ���ϰ�ο� ���ϸ��� ������
			   File f = fc.getSelectedFile();
			   FileReader fr = new FileReader(f);
			   BufferedReader br = new BufferedReader(fr);
			   while(true) {
				   String inData = br.readLine();
				   if(inData==null) break;
				   ta.append(inData+"\n");
			   }
			   
			   //���� ������ ���� ���
//			   File[] f = fc.getSelectedFiles();
//			   for(File ff : f) {
//				   FileReader fr = new FileReader(ff);
//				   BufferedReader br = new BufferedReader(fr);
//				   while(true) {
//					   String txt = br.readLine();
//					   if(txt==null) break;
//					   ta.append(txt+"\n");
//				   }
//				   ta.append("-------------------------------------------------------------\n");
//			   }
		   }
		   catch (Exception e) {
			   e.printStackTrace();
		   }
		   
	   }
   }
   
   //����Ű �����ϱ�
   public void setShortCut() {
	   
	   //���� : ����Ű�� ����� Ű E
	   //1. �޴��� ����Ű�� ����� Ű ����
	   endMenuItem.setMnemonic(KeyEvent.VK_E);
	   //2. mask Ű ����									//����Ű			,Mask		
	   endMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_E,ActionEvent.CTRL_MASK));
	   
	   
   }

   public static void main(String[] args) {
         new Memo();

   }

}