public class GugudanMethodMain {//0614-4(2)

	public static void main(String[] args) {
		
		GugudanMethodTest gg = new GugudanMethodTest();
	    String gugu = gg.gugudan(8); //�޼ҵ� ȣ��
	    //static���� �޼ҵ�� �ݵ�� ��ü�� ����� ȣ���ؾ��Ѵ�.
	    //�Ű������� 8 : 8�� ���
	    //���ڿ��� �����������
	      
	    System.out.println(gugu);
	      
	   
	    GugudanMethodTest.sum(50);
	    //static�� �޼ҵ带 ��ü �������� �ʰ� ȣ���� �� �ִ�.
	    //Ŭ������.�޼ҵ��(�Ű�����);
	   
	    GugudanMethodTest.sum(20);
	     
	}

}