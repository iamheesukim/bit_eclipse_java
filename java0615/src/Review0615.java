public class Review0615 { //
	
	public Review0615() {
	}
		
		public void start() { //반환형 없는 메소드
			
			
			//아스키코드
			byte[] byteData = {65, 66, 67, 68}; //아스키코드 ABCD
			String str4 = new String(byteData); //ABCD
			
			char[] charData = {'X','Y','Z'};
			String str5 = new String(charData);
			
			int[] intData = {65, 66, 67, 68, 69, 70};
			//intData에서 [2]부터 3개 출력 67 68 69 -> CDE
			String str6 = new String(intData, 2, 3);
			
			
			System.out.println("byteData = "+str4);
			System.out.println("charData = "+str5);
			System.out.println("intData = "+str6);
			
			//--------------------------------------
			
			//String 비교하기
			String st1 = "서울시 마포구 신수동"; //일반 데이터
			String st2 = "서울시 마포구 신수동";
			String st3 = new String("서울시 마포구 신수동"); //객체
			String stData = st3; //객체를 주면 주소도 같아짐
			
			// '=='로는 일반데이터와 객체는 다르게 인식.
			// false
			if(st1==st3) System.out.println("일반데이터, 객체는 같다");
			else System.out.println("일반데이터, 객체는 다르다");
			
			// equals() : 두 내용을 비교한다
			// true
			if(st1.equals(st3)) System.out.println("equal를 쓰면 같다");
			else System.out.println("equal를 써도 다르다");
			
			//true
			if(st3==stData) System.out.println("객체와 (객체를 받은)변수는 같다");
			else System.out.println("객체와 (객체를 받은)변수는 다르다");
			
			st3 = "서울시 종로구"; //값이 바뀌면 주소도 바뀐다.
			System.out.println(st3);
			System.out.println(stData); //이전에 받은 st3값
			
			//--------------------------------------
			
			//다양한 string 메소드
			
			//String st1 = "서울시 마포구 신수동"; //일반 데이터
			//charAt() : index 위치의 문자를 1개 얻어온다.
			char c = st1.charAt(2); //[2]데이터 하나만 갖고옴
			System.out.println("st1.charAt(2) : "+c); //시
			
			//concat() : 두개를 연결해준다.
			String result = st1+st2;
			//연결해서 출력할때 '+'해도 되지만, .contact() 메소드를 써도 됨.
			String result2 = st1.concat(st2); 
			
			System.out.println("result = "+result);
			System.out.println("result2 = "+result2);
			
			//--------------------------------------
			
			String data2 = ("Java String Test....");
			String data3 = ("java string test....");
			
			//다르다 (대소문자 구분함)
			if(data2.equals(data3)) System.out.println("같다@");
			else System.out.println("다르다@");
			
			// equalsIgnoreCase() : 대소문자 구별 X
			//같다
			if(data2.equalsIgnoreCase(data3)) System.out.println("같다@@");
			else System.out.println("다르다@@");
			
			//--------------------------------------
			
			String data = "Java";
			// getBytes() : 문자열을 byte 배열로 바꾼다.
			byte[] byteCode = data.getBytes(); 
			for (byte b : byteCode) { //확장형 for문
				//(char)b 형변환 : 문자형으로 보임
				//b 바이트형(정수)로 보임
				System.out.println((char)b+" : "+b); }
			
			//--------------------------------------
			
			//String data2 = ("Java String Test....");
			//indexOf() : 특정 문자의 (가장 앞에 있는) 인덱스 위치를 구함, 없으면 -1
			int idx = data2.indexOf("t"); 
			System.out.println("indexOf : "+idx); //6
			int idxx = data2.indexOf("p");
			System.out.println("indexOf : "+idxx); //-1
			
			int idx2 = data2.indexOf("t",10); //t문자를 [10]이후부터 찾는다
			System.out.println("indexOf2 : "+idx2); //15
			
			//lastIndexOf() : 특정 문자 인덱스를 뒤에서부터 찾는다.
			int idx3 = data2.lastIndexOf("t");
			System.out.println("lastIndexOf : "+idx3);
			
			//--------------------------------------
			
			//length() : 글 길이
			//앞서 for구문에서 많이 사용함
			System.out.println("length : "+data2.length()); //20
			
			//--------------------------------------
			
			//replaceAll() : 특정 문자를 다른 문자로 변경
			data2 = data2.replaceAll("a","에이");
			System.out.println("replaceAll : "+data2);
			
			
			//--------------------------------------
			
			String data4 = "010-1234-5678";
			
			//split() : 특정 문자로 나눔
			String[] tel = data4.split("-"); //'-'로 나눔
			for(int i=0; i<tel.length ; i++) {
				System.out.println("tel["+i+"]="+tel[i]);
			}
			
			//--------------------------------------
			
			//substring() : 특정문자열에서 일부문자열을 얻어온다
			String tel1 = data4.substring(4); //[4]부터~
			String tel2 = data4.substring(4,8); //[4]부터 [8]직전까지
			System.out.println("tel : "+tel1); //1234-5678
			System.out.println("tel2 : "+tel2); //1234
			
			//--------------------------------------
			
			data2 = ("Java String Test....");
			//toCharArray() : 문자열을 char배열로 구해준다.
			char[] charData2 = data2.toCharArray();
			for (char cc:charData2) { //확장된 for문
				System.out.println(cc); //한줄에 하나씩 출력
			}
			
			//--------------------------------------
			
			//toLowerCase() : 소문자로 / toUpperCase() : 대문자로
			String toLower = data2.toLowerCase();
			String toUpper = data2.toUpperCase();
			System.out.println("toLower : "+toLower);
			System.out.println("toUpperr : "+toUpper);
			
			//--------------------------------------
			
			//trim() : 문자열의 양쪽 공백문자 지운다
			String data6 = "     Spring     FrameWoek     ";
			System.out.println("dataTrim : "+data6.trim());
			
			//--------------------------------------
			
			//String.valueOf() : 문자화
			//이제 숫자가 아닌 문자형이 돼서 계산 불가
			int num = 1234;
			String s1 = num+""; //문자화 (밑이랑 같은거임)
			String s2 = String.valueOf(num);
			System.out.println(s1+1234); //12341234 이제 숫자가 아니라 그냥 그대로 출력
			System.out.println(s2+5678);
			
			//--------------------------------------
			
			char[] aa = {'S','T','U'};
			String sss = new String(aa); //생성자 메소드
			String sss2 = String.valueOf(aa); //일반 메소드
			
			//--------------------------------------
			
			//compareTo() : 객체 크기 비교
			String data7 = "Apple";
			String data8 = "apple";
			int r1 = data7.compareTo(data8); //data7-data8 : -32
			int r2 = data8.compareTo(data7); //32
			System.out.println(r1+" / "+r2);
			//만약 0이 나오면 두 객체 크기가 같음
			
			//compareToIgnoreCase() : 대소문자 구분 없이 객체 크기 비교
			int rr1 = data7.compareToIgnoreCase(data8); //0
			int rr2 = data8.compareToIgnoreCase(data7); //0
			System.out.println(rr1+" / "+rr2);

		}

	public static void main(String[] args) {
		new Review0615().start();
	}
}
