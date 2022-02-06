import java.util.Arrays;

public class ArraysTest { //0615-6

	public ArraysTest() {
		//Arrays : �迭 ���� ó�� Ŭ����
		int[] data = {15,90,45,75,26,9,48,95,12,40};
		Arrays.sort(data); //��������
		
		System.out.println(data); //[I@2401f4c3(16����) �迭 ���� �ּ�(�ؽ��ڵ�)
		System.out.println(Arrays.toString(data));
		
		int[] data2 = {15,90,45,75,26,9,48,95,12,40};
		Arrays.sort(data2,2,5); //[2]���� [5]�������� ��������
		System.out.println(Arrays.toString(data2));
		//Arrays.toString(�迭��) : �迭 ���ڿ��� ���
		//copyOfRange(�迭��,0,0) : [0]���� [0]���� �Ϻ� ������
		//Arrays.toString(copyOfRange(�迭��,0,0)) : 0���� 0���� ���ڿ��� ���
	}

	public static void main(String[] args) {
		new ArraysTest();

	}

}
