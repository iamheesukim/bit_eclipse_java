import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SwingCalendar extends JFrame implements ActionListener {

   Font fnt = new Font("굴림체",Font.BOLD,20);
   Calendar now = Calendar.getInstance();

   //Frane-North
   JPanel frmNorth = new JPanel();
      JButton prevMonth = new JButton("◀");
      JButton nextMonth = new JButton("▶");
      JLabel yearLbl = new JLabel("년");
      JLabel monthLbl = new JLabel("월");

   JComboBox<Integer> yearCombo = new JComboBox<Integer>();
   DefaultComboBoxModel<Integer> yearModel = new DefaultComboBoxModel<Integer>();

   JComboBox<Integer> monthCombo = new JComboBox<Integer>();
   DefaultComboBoxModel<Integer> monthModel = new DefaultComboBoxModel<Integer>();

   //Frame - Center
   JPanel frmCenter = new JPanel(new BorderLayout());
   JPanel weekTitlepane = new JPanel(new GridLayout(1,7));
   JPanel dayPane = new JPanel(new GridLayout(0,7)); 


   public SwingCalendar() {
      super("계산기");

      //Frame-North
      prevMonth.setFont(fnt);
      nextMonth.setFont(fnt);
      yearLbl.setFont(fnt);
      monthLbl.setFont(fnt);
      yearCombo.setFont(fnt);
      monthCombo.setFont(fnt);

      frmNorth.add(prevMonth);

      //년도 리스트
      int nowYear = setNowYear();
      yearCombo.setModel(yearModel);
      yearCombo.setSelectedItem(nowYear);//현재년도 선택
      frmNorth.add(yearCombo);

      frmNorth.add(yearLbl);

      //월리스트
      int nowMonth = setNowMonth();
      monthCombo.setModel(monthModel);
      monthCombo.setSelectedItem(nowMonth+1);
      frmNorth.add(monthCombo);

      frmNorth.add(monthLbl);
      frmNorth.add(nextMonth);

      add(BorderLayout.NORTH,frmNorth);

      //Frame - Center
      frmCenter.add(BorderLayout.NORTH,weekTitlepane);
      frmCenter.add(dayPane);
      add(frmCenter);

      setWeekTitle();//요일명만들기

      //날짜


      //해당월의 1일에 대한 요일
      int week = getOneDayWeek(nowYear, nowMonth);

      //해당월의 마지막날
      int lastDay = now.getActualMaximum(Calendar.DAY_OF_MONTH);





      setSpaceLable(week);
      setDayLabel(nowYear,nowMonth,lastDay);

      setSize(400,300);
      setVisible(true);
      setDefaultCloseOperation(DISPOSE_ON_CLOSE);


      //이벤트 등록
      prevMonth.addActionListener(this);
      nextMonth.addActionListener(this);
      yearCombo.addActionListener(this);
      monthCombo.addActionListener(this);


   }
   public void actionPerformed(ActionEvent ae) {
      Object obj = ae.getSource();//JButton, JComboBox
      //객체가 어떤 클래스로 생성 되었는지 비교하는 연산자.
      if(obj instanceof JButton) {

         if(obj==prevMonth) {
            setPrevMonth();
         }else if(obj==nextMonth) {
            setNextMonth();
         }
      }else if(obj instanceof JComboBox) {
         setNewDate();
      }
   }
   //왼쪽버튼을누를때
   public void setPrevMonth() {
      //현재 선택된 콤보박스의 값을 가져온다.
      int y= (int)yearCombo.getSelectedItem();
      int m= (int)monthCombo.getSelectedItem();

      if(m==1) {//1월이면 년도를 감소시킨다.
         y--;
         m=12;
      }else {
         m--;
      }
      setButtonEvent(y, m);
      
   }
   //오른쪽버튼을누를때
   public void setNextMonth() {
      int y = (int)yearCombo.getSelectedItem();
      int m = (int)monthCombo.getSelectedItem();
      
      if(m==12) {//12월이면
         y++;
         m=1;
      }else {
         m++;
      }
      setButtonEvent(y, m);
      
   }
   public void setButtonEvent(int y, int m) {
      //comboBox의 기존이벤트제거
      yearCombo.removeActionListener(this);
      monthCombo.removeActionListener(this);
      yearCombo.setSelectedItem(y);
      monthCombo.setSelectedItem(m);
      setNewDate();
      yearCombo.addActionListener(this);
      monthCombo.addActionListener(this);
   }
   public void setNewDate() {
      int year = (Integer)yearCombo.getSelectedItem();
      int month = (int)monthCombo.getSelectedItem();   
      now.set(year, month-1,1);
      //기존의 날짜 라벨을 모두 지워야한다.
      dayPane.removeAll();

      //패널숨기기
      dayPane.setVisible(false);
      setSpaceLable(now.get(Calendar.DAY_OF_WEEK));
      setDayLabel(year, month-1,now.getActualMaximum(Calendar.DAY_OF_MONTH));
      dayPane.setVisible(true);
   }   
   //공배을 추가하는 라벨
   public void setSpaceLable(int w) {
      for(int i=1;i<w;i++) {
         JLabel lbl = new JLabel("");
         dayPane.add(lbl);
      }
   }
   //날짜를 추가하는 라벨
   public void setDayLabel(int year, int month,int lastDay) {
      for(int day = 1; day<=lastDay;day++) {
         JLabel lbl= new JLabel(String.valueOf(day),JLabel.CENTER);
         lbl.setFont(fnt);
         now.set(year,month, day);
         int week = now.get(Calendar.DAY_OF_WEEK);//요일
         if(week==1)lbl.setForeground(Color.RED);
         if(week==7)lbl.setForeground(Color.BLUE);
         dayPane.add(lbl);

      }
   }
   //요일구하기
   public int getOneDayWeek(int y, int m) {
      now.set(y,m,1);
      return now.get(Calendar.DAY_OF_WEEK);//요일
   }
   public void setWeekTitle() {
      String weekName = "일월화수목금토";
      for(int i=0;i<weekName.length();i++) {//0,1,2,3,4,5,6
         JLabel lbl = new JLabel(weekName.substring(i,i+1),JLabel.CENTER);
         lbl.setFont(fnt);
         if(i==0) lbl.setForeground(Color.red);
         if(i==6) lbl.setForeground(Color.blue);
         weekTitlepane.add(lbl);
      }
   }
   public int setNowYear() {
      int year = now.get(Calendar.YEAR);
      //for(int y = year-100;y<=year+20;y++) {
      for(int y= year+20; y>=year-100;y--) {
         yearModel.addElement(y);
      }
      return year;
   }
   public int setNowMonth() {
      for(int m=1;m<=12;m++) {
         monthModel.addElement(m);
      }
      return now.get(Calendar.MONTH);
   }
   public static void main(String[] args) {
      new SwingCalendar();
   }
}