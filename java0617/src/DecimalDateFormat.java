import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DecimalDateFormat {//0617-5

	public DecimalDateFormat() {
		// 데이터를 원하는 출력형식으로 만들 수 있는 클래스
		
		// 예시 : 숫자를 화폐단위 만들기
		try {
			int data = 52123542;
			DecimalFormat fm = new DecimalFormat("#,###원");
			// 출력할 양식(?) 모양(?)
			
			String dataFormat = fm.format(data); //fm 객체의 format 메소드 실행
			System.out.println("dataFormat="+dataFormat);
			
			//패턴으로 변환된 데이터를 원래대로 바꾸기
			//52,123,542원 -> 52123542
			NumberFormat nf = NumberFormat.getInstance();
			Number num = nf.parse(dataFormat);
			//예외가 발생해버림.. 껄껄껄
			
			int dataParse = num.intValue();
			System.out.println("dataPaese = "+dataParse);
			
			//날짜 포맷
			//2021년 6월 4일 (금) 15:21
			Calendar now = Calendar.getInstance();
			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy년 MM월 dd일 (E) hh:mm:ss a");
			String dateStr = dateFormat.format(now.getTime()); //Date
			System.out.println("dateStr ---> "+dateStr);
		}
		catch(Exception e) {}
	
		
	}

	public static void main(String[] args) {
		new DecimalDateFormat();

	}

}
