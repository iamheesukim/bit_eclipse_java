
public class Method2Test2Main { //0614-3(2)
   
   //1,2번체크

   public Method2Test2Main() { //생성자메소드
      //클래스명과 같다
   }

   public static void main(String[] args) {
      MethodTest2 mt = new MethodTest2();
      // 생성자 메소드 선언

      //반환형이 없는 메소드 호출
      mt.powerStart();
      //void 돌아오는 데이터가 없어서 변수 선언 x
      
      mt.channelUp();
      mt.channelUp();
      mt.channelDown();

   }

}