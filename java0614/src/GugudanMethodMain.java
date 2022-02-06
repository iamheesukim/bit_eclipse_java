public class GugudanMethodMain {//0614-4(2)

	public static void main(String[] args) {
		
		GugudanMethodTest gg = new GugudanMethodTest();
	    String gugu = gg.gugudan(8); //메소드 호출
	    //static없는 메소드는 반드시 객체를 만들어 호출해야한다.
	    //매개변수로 8 : 8단 출력
	    //문자열로 선언해줘야함
	      
	    System.out.println(gugu);
	      
	   
	    GugudanMethodTest.sum(50);
	    //static은 메소드를 객체 생성하지 않고 호출할 수 있다.
	    //클래스명.메소드명(매개변수);
	   
	    GugudanMethodTest.sum(20);
	     
	}

}