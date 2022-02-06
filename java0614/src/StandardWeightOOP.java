import java.util.Scanner;

public class StandardWeightOOP {//0614-10
	//예전에 과제했던 표준체중 구하기를 배운걸 응용해서 다시 짜보기

   Scanner scan = new Scanner(System.in);
   int age, gender;
   double height,weight,idx;
 
   public StandardWeightOOP() {
	   
	   System.out.print("나이를 입력하세요 : ");
	   age = scan.nextInt();   

	   System.out.print("성별을 입력하세요(1:남성 2:여성) : ");
	   gender = scan.nextInt();

	   System.out.print("키를 입력하세요 : ");
	   height = scan.nextDouble();

	   System.out.print("체중을 입력하세요 : ");
	weight = scan.nextDouble();
   }

   void idxInput() {
      if(age<=35 && gender==2) idx=0.85;
      else if(age>=36 && gender==1) idx=0.95;
      else idx=0.90;
   }

  void start() {
      idxInput();
      result();
   }  

   void result() {

	  int sWeight = (int)((height - 100) * idx);
	  double sWeightIdx = (weight / sWeight)*100;
	  String result="마른형";
	  if (sWeightIdx>=126) result = "비만형";
	  else if (sWeightIdx>=116) result = "조금 비만형";
	  else if (sWeightIdx>=96) result="표준형";
	  else if (sWeightIdx>=86) result="조금 마른형";
	  
	  System.out.println("표준체중 = "+sWeight);
	  System.out.printf("당신의 표준체중지수는 %f으로 %s입니다.",sWeightIdx,result);
   }

   public static void main(String[] args) {
	   StandardWeightOOP ww = new StandardWeightOOP();
	   ww.start();

   }
}