import java.util.Scanner;

public class StandardWeightOOP2 { //0614-11 (10�� ������ ����)
	
	Scanner scan = new Scanner(System.in);

	//������ �Է°� ����

	int age,gender;
	double height,weight,sWeight,sWeightIndex;
	String sWeightMsg;

	public StandardWeightOOP2() {
	}

	//������ �Է� �޼ҵ�

	double getConData(String msg) {
		System.out.print(msg+"=");
		return scan.nextDouble();
	}	

	void setData() {
		age = (int)getConData("����");
		gender = (int)getConData("����(1:���� 2:����)");
		height = getConData("Ű");
		weight = getConData("������");
	}
	
	//ǥ��ü�� index���ϱ�
	void setStandardWeight() {
		double index = 0.90;
		if(age<=35 && gender==2) index=0.85;
		else if (age>=36 && gender==1) index=0.95;	
		
		sWeight = (height-100)*index;
	}

	void setStandardWightMsg() {
		sWeightIndex = (weight/sWeight)*100;
		if (sWeightIndex>=126) sWeightMsg = "����";
		else if (sWeightIndex>=116) sWeightMsg = "���� ����";
		else if (sWeightIndex>=96) sWeightMsg="ǥ����";
		else if (sWeightIndex>=86) sWeightMsg="���� ������";
		else sWeightMsg="������";
	}

	//���
	void standardWeightOutput() {
		System.out.println("ǥ��ü�� = "+sWeight);
		System.out.printf("����� ǥ��ü�������� %f���� %s�Դϴ�.",sWeightIndex,sWeightMsg);
	}
	
	void startStandard() {
		setData();
		setStandardWeight();
		setStandardWightMsg();
		standardWeightOutput();	
	}

	public static void main(String[] args) {
		StandardWeightOOP2 sw = new StandardWeightOOP2();
		sw.startStandard();
	}
}