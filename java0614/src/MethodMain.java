public class MethodMain { //0614-2

   public static void main(String[] args) {
      // ��ü��=instance=reference����
      //         ������ �޼ҵ�
      
      MethodTest mt = new MethodTest();
      //�̰� ����ɶ� MethodTest 13�� ����
      //MethodTest() �ȿ� �ƹ��͵� ��� ����ɰ� x
      
      MethodTest mt2 = new MethodTest("010-1234-5555");
      //�̰� ����ɶ� MethodTest 15�� ����
      //MethodTest(String tel)���� 010~�� tel�� ��.
      //����ó : 010~ �� ���
      
      //��ü ���� ��������� ������ �ٸ� �����ͷ� ����
      mt.name = "�̼���";
      //mt��� ��ü�ȿ� �ִ� name �������
      //�̷��� ���� ȫ�浿�� ������� �̼��� String�����Ͱ� ��
      
      System.out.println();
      
      System.out.println("mt.name="+mt.name); //17������ �̼������� ����
      System.out.println("mt2.name="+mt2.name); //mt2�� �״�� ȫ�浿
      
      MethodTest mt3 = new MethodTest(100,"�������");
      //MethodTest 24�� ����
      //MethodTest(int num, String name) ���� num�� 100, name�� �������
      
      System.out.println();
      
      System.out.println("mt3.num : "+mt3.num); //100
      System.out.println("mt3.name : "+mt3.name); //�������
      System.out.println("mt3.tel : "+mt3.tel); //02-1234-5678
      
      System.out.println();
      
      MethodTest mt4 = new MethodTest("�念��",200);
      //MethodTest 42�� ����
      System.out.println("mt4.num: "+mt4.num); //200
      System.out.println("mt4.name: "+mt4.name); //�念��
      System.out.println("mt4.tel: "+mt4.tel);
      //26���� ����Ǹ鼭 this.tel�� ���� ����
   }

}