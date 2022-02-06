package homework;


import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.Calendar;

import javax.swing.*;

public class CalendarHW extends JFrame implements ItemListener, ActionListener{
	//김희수 0702 과제 : 달력만들기
	
	JPanel pane = new JPanel();
		JButton btn1 = new JButton("◀");
		JButton btn2 = new JButton("▶");
		JComboBox<Integer> cb1 = new JComboBox<Integer>();
		JComboBox<Integer> cb2 = new JComboBox<Integer>();
		JLabel lb1 = new JLabel("년 ");
		JLabel lb2 = new JLabel("월 ");
	JPanel pane2 = new JPanel(new BorderLayout()); //날짜 찍히는 메인패널
		JPanel weekpane = new JPanel(new GridLayout(1,7));
		JPanel daypane = new JPanel(new GridLayout(0,7));
	
	Calendar now = Calendar.getInstance();
	Font fnt = new Font("돋움체",Font.BOLD,20);
	
	public CalendarHW() {
		
		
		
		setTitle("카렌다");
		add(BorderLayout.NORTH,pane);
		add(pane2);
		
		pane.setBackground(Color.cyan);
		
		pane.add(btn1);
		pane.add(cb1);	
		pane.add(lb1);
		pane.add(cb2);
		pane.add(lb2);
		pane.add(btn2);
		
		btn1.setFont(fnt);
		cb1.setFont(fnt);
		lb1.setFont(fnt);
		cb2.setFont(fnt);
		lb2.setFont(fnt);
		btn2.setFont(fnt);
		
		//년 설정
		for (int i=1950;i<=2100; i++) {
			cb1.addItem(i);
		}
		
		
		//월 설정
		for (int i=1;i<=12;i++) {
			cb2.addItem(i);
		}
		
		int year = now.get(Calendar.YEAR); //2021
		int month = now.get(Calendar.MONTH);
		System.out.println(year+"/"+month);
		now.set(year,month,1);
		cb1.setSelectedItem(year);
		System.out.println(cb1.getSelectedItem());
		cb2.setSelectedItem(month+1);
		dayPrint();
		
		String week[] = {"일","월","화","수","목","금","토"};
		
		for(int i=0;i<week.length;i++) {
			JLabel lbl = new JLabel(week[i],JLabel.CENTER);
			lbl.setFont(fnt);
			if(i==0) lbl.setForeground(Color.red);
			else if(i==6) lbl.setForeground(Color.blue);
			weekpane.add(lbl);
		}
		
		pane2.add(BorderLayout.NORTH,weekpane);
		pane2.add(BorderLayout.CENTER,daypane);
		
		setLocation(1050,300);
		setSize(400,300);
	    setVisible(true);
	    setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	    
	    cb1.addItemListener(this);
	    cb2.addItemListener(this);
	    btn1.addActionListener(this);
	    btn2.addActionListener(this);
	    
	}
	
	public void itemStateChanged(ItemEvent ie) {
		Object event = ie.getSource();
		if(event.equals(cb1)) {
			int y = (int)cb1.getSelectedItem();
			int m = (int)cb2.getSelectedItem(); 
			now.set(y,m-1,1);
			//System.out.println(y);
			dayPrint();
		}
		else if(event.equals(cb2)) {
			int y = (int)cb1.getSelectedItem();
			int m = (int)cb2.getSelectedItem();
			now.set(y,m-1,1);
			//System.out.println(m);
			dayPrint();
		}
	}
	
	public void dayPrint() {
		//JLabel t = new JLabel("테스트");
		//daypane.add(t);
		daypane.setVisible(false); 
		daypane.removeAll();  
		
		int lastday = now.getActualMaximum(Calendar.DAY_OF_MONTH);
		int week = now.get(Calendar.DAY_OF_WEEK);
		
		for(int i=1; i<week; i++) {
			JLabel sp = new JLabel("");
			daypane.add(sp);
		}
		
		//날짜출력
		for(int i=1;i<=lastday;i++) {
			JLabel lbl = new JLabel(String.valueOf(i),JLabel.CENTER);
			//System.out.print(String.valueOf(i));
			lbl.setFont(fnt);
			daypane.add(lbl);
			
			if((i+week-1)%7==0) { 
				lbl.setForeground(Color.blue);
			}
			else if((i+week-1)%7==1) { 
				lbl.setForeground(Color.red);
			}
		}
		
		daypane.setVisible(true); 

	}
	
	public void actionPerformed(ActionEvent ae) {
		Object event = ae.getSource();
		if(event == btn1) {
			now.add(Calendar.MONTH, -1);
			if(cb2.getSelectedIndex()==0) {
				cb1.setSelectedIndex(cb1.getSelectedIndex()-1);
				cb2.setSelectedIndex(11);
			}
			else cb2.setSelectedIndex(cb2.getSelectedIndex()-1);
			dayPrint();
		}
		else if(event == btn2) {
			now.add(Calendar.MONTH, +1);
			if(cb2.getSelectedIndex()==11) {
				cb1.setSelectedIndex(cb1.getSelectedIndex()+1);
				cb2.setSelectedIndex(0);
			}
			else cb2.setSelectedIndex(cb2.getSelectedIndex()+1);
			dayPrint();
		}
	}

	public static void main(String[] args) {
		new CalendarHW();

	}



}
