import java.util.Scanner;

public class StandardWeightOOP2 { //0614-11 (10의 교수님 예시)
	
	Scanner scan = new Scanner(System.in);

	//데이터 입력값 저장

	int age,gender;
	double height,weight,sWeight,sWeightIndex;
	String sWeightMsg;

	public StandardWeightOOP2() {
	}

	//데이터 입력 메소드

	double getConData(String msg) {
		System.out.print(msg+"=");
		return scan.nextDouble();
	}	

	void setData() {
		age = (int)getConData("나이");
		gender = (int)getConData("성별(1:남자 2:여자)");
		height = getConData("키");
		weight = getConData("몸무게");
	}
	
	//표준체중 index구하기
	void setStandardWeight() {
		double index = 0.90;
		if(age<=35 && gender==2) index=0.85;
		else if (age>=36 && gender==1) index=0.95;	
		
		sWeight = (height-100)*index;
	}

	void setStandardWightMsg() {
		sWeightIndex = (weight/sWeight)*100;
		if (sWeightIndex>=126) sWeightMsg = "비만형";
		else if (sWeightIndex>=116) sWeightMsg = "조금 비만형";
		else if (sWeightIndex>=96) sWeightMsg="표준형";
		else if (sWeightIndex>=86) sWeightMsg="조금 마른형";
		else sWeightMsg="마른형";
	}

	//출력
	void standardWeightOutput() {
		System.out.println("표준체중 = "+sWeight);
		System.out.printf("당신의 표준체중지수는 %f으로 %s입니다.",sWeightIndex,sWeightMsg);
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