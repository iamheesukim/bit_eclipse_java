import java.util.Scanner;

public class StandardWeightOOP {//0614-10
	//������ �����ߴ� ǥ��ü�� ���ϱ⸦ ���� �����ؼ� �ٽ� ¥����

   Scanner scan = new Scanner(System.in);
   int age, gender;
   double height,weight,idx;
 
   public StandardWeightOOP() {
	   
	   System.out.print("���̸� �Է��ϼ��� : ");
	   age = scan.nextInt();   

	   System.out.print("������ �Է��ϼ���(1:���� 2:����) : ");
	   gender = scan.nextInt();

	   System.out.print("Ű�� �Է��ϼ��� : ");
	   height = scan.nextDouble();

	   System.out.print("ü���� �Է��ϼ��� : ");
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
	  String result="������";
	  if (sWeightIdx>=126) result = "����";
	  else if (sWeightIdx>=116) result = "���� ����";
	  else if (sWeightIdx>=96) result="ǥ����";
	  else if (sWeightIdx>=86) result="���� ������";
	  
	  System.out.println("ǥ��ü�� = "+sWeight);
	  System.out.printf("����� ǥ��ü�������� %f���� %s�Դϴ�.",sWeightIdx,result);
   }

   public static void main(String[] args) {
	   StandardWeightOOP ww = new StandardWeightOOP();
	   ww.start();

   }
}