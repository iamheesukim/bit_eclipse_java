public class MethodMain { //0614-2

   public static void main(String[] args) {
      // 객체명=instance=reference변수
      //         생성자 메소드
      
      MethodTest mt = new MethodTest();
      //이게 실행될땐 MethodTest 13열 실행
      //MethodTest() 안에 아무것도 없어서 실행될게 x
      
      MethodTest mt2 = new MethodTest("010-1234-5555");
      //이게 실행될땐 MethodTest 15열 실행
      //MethodTest(String tel)에서 010~이 tel로 들어감.
      //연락처 : 010~ 이 출력
      
      //객체 내의 멤버여역의 변수를 다른 데이터로 수정
      mt.name = "이순신";
      //mt라는 객체안에 있는 name 멤버변수
      //이러면 이제 홍길동은 사라지고 이순신 String데이터가 들어감
      
      System.out.println();
      
      System.out.println("mt.name="+mt.name); //17열에서 이순신으로 변경
      System.out.println("mt2.name="+mt2.name); //mt2는 그대로 홍길동
      
      MethodTest mt3 = new MethodTest(100,"세종대왕");
      //MethodTest 24열 실행
      //MethodTest(int num, String name) 에서 num에 100, name에 세종대왕
      
      System.out.println();
      
      System.out.println("mt3.num : "+mt3.num); //100
      System.out.println("mt3.name : "+mt3.name); //세종대왕
      System.out.println("mt3.tel : "+mt3.tel); //02-1234-5678
      
      System.out.println();
      
      MethodTest mt4 = new MethodTest("장영실",200);
      //MethodTest 42열 실행
      System.out.println("mt4.num: "+mt4.num); //200
      System.out.println("mt4.name: "+mt4.name); //장영실
      System.out.println("mt4.tel: "+mt4.tel);
      //26열이 실행되면서 this.tel에 값이 생김
   }

}