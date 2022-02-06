public class Review0615 { //
	
	public Review0615() {
	}
		
		public void start() { //��ȯ�� ���� �޼ҵ�
			
			
			//�ƽ�Ű�ڵ�
			byte[] byteData = {65, 66, 67, 68}; //�ƽ�Ű�ڵ� ABCD
			String str4 = new String(byteData); //ABCD
			
			char[] charData = {'X','Y','Z'};
			String str5 = new String(charData);
			
			int[] intData = {65, 66, 67, 68, 69, 70};
			//intData���� [2]���� 3�� ��� 67 68 69 -> CDE
			String str6 = new String(intData, 2, 3);
			
			
			System.out.println("byteData = "+str4);
			System.out.println("charData = "+str5);
			System.out.println("intData = "+str6);
			
			//--------------------------------------
			
			//String ���ϱ�
			String st1 = "����� ������ �ż���"; //�Ϲ� ������
			String st2 = "����� ������ �ż���";
			String st3 = new String("����� ������ �ż���"); //��ü
			String stData = st3; //��ü�� �ָ� �ּҵ� ������
			
			// '=='�δ� �Ϲݵ����Ϳ� ��ü�� �ٸ��� �ν�.
			// false
			if(st1==st3) System.out.println("�Ϲݵ�����, ��ü�� ����");
			else System.out.println("�Ϲݵ�����, ��ü�� �ٸ���");
			
			// equals() : �� ������ ���Ѵ�
			// true
			if(st1.equals(st3)) System.out.println("equal�� ���� ����");
			else System.out.println("equal�� �ᵵ �ٸ���");
			
			//true
			if(st3==stData) System.out.println("��ü�� (��ü�� ����)������ ����");
			else System.out.println("��ü�� (��ü�� ����)������ �ٸ���");
			
			st3 = "����� ���α�"; //���� �ٲ�� �ּҵ� �ٲ��.
			System.out.println(st3);
			System.out.println(stData); //������ ���� st3��
			
			//--------------------------------------
			
			//�پ��� string �޼ҵ�
			
			//String st1 = "����� ������ �ż���"; //�Ϲ� ������
			//charAt() : index ��ġ�� ���ڸ� 1�� ���´�.
			char c = st1.charAt(2); //[2]������ �ϳ��� �����
			System.out.println("st1.charAt(2) : "+c); //��
			
			//concat() : �ΰ��� �������ش�.
			String result = st1+st2;
			//�����ؼ� ����Ҷ� '+'�ص� ������, .contact() �޼ҵ带 �ᵵ ��.
			String result2 = st1.concat(st2); 
			
			System.out.println("result = "+result);
			System.out.println("result2 = "+result2);
			
			//--------------------------------------
			
			String data2 = ("Java String Test....");
			String data3 = ("java string test....");
			
			//�ٸ��� (��ҹ��� ������)
			if(data2.equals(data3)) System.out.println("����@");
			else System.out.println("�ٸ���@");
			
			// equalsIgnoreCase() : ��ҹ��� ���� X
			//����
			if(data2.equalsIgnoreCase(data3)) System.out.println("����@@");
			else System.out.println("�ٸ���@@");
			
			//--------------------------------------
			
			String data = "Java";
			// getBytes() : ���ڿ��� byte �迭�� �ٲ۴�.
			byte[] byteCode = data.getBytes(); 
			for (byte b : byteCode) { //Ȯ���� for��
				//(char)b ����ȯ : ���������� ����
				//b ����Ʈ��(����)�� ����
				System.out.println((char)b+" : "+b); }
			
			//--------------------------------------
			
			//String data2 = ("Java String Test....");
			//indexOf() : Ư�� ������ (���� �տ� �ִ�) �ε��� ��ġ�� ����, ������ -1
			int idx = data2.indexOf("t"); 
			System.out.println("indexOf : "+idx); //6
			int idxx = data2.indexOf("p");
			System.out.println("indexOf : "+idxx); //-1
			
			int idx2 = data2.indexOf("t",10); //t���ڸ� [10]���ĺ��� ã�´�
			System.out.println("indexOf2 : "+idx2); //15
			
			//lastIndexOf() : Ư�� ���� �ε����� �ڿ������� ã�´�.
			int idx3 = data2.lastIndexOf("t");
			System.out.println("lastIndexOf : "+idx3);
			
			//--------------------------------------
			
			//length() : �� ����
			//�ռ� for�������� ���� �����
			System.out.println("length : "+data2.length()); //20
			
			//--------------------------------------
			
			//replaceAll() : Ư�� ���ڸ� �ٸ� ���ڷ� ����
			data2 = data2.replaceAll("a","����");
			System.out.println("replaceAll : "+data2);
			
			
			//--------------------------------------
			
			String data4 = "010-1234-5678";
			
			//split() : Ư�� ���ڷ� ����
			String[] tel = data4.split("-"); //'-'�� ����
			for(int i=0; i<tel.length ; i++) {
				System.out.println("tel["+i+"]="+tel[i]);
			}
			
			//--------------------------------------
			
			//substring() : Ư�����ڿ����� �Ϻι��ڿ��� ���´�
			String tel1 = data4.substring(4); //[4]����~
			String tel2 = data4.substring(4,8); //[4]���� [8]��������
			System.out.println("tel : "+tel1); //1234-5678
			System.out.println("tel2 : "+tel2); //1234
			
			//--------------------------------------
			
			data2 = ("Java String Test....");
			//toCharArray() : ���ڿ��� char�迭�� �����ش�.
			char[] charData2 = data2.toCharArray();
			for (char cc:charData2) { //Ȯ��� for��
				System.out.println(cc); //���ٿ� �ϳ��� ���
			}
			
			//--------------------------------------
			
			//toLowerCase() : �ҹ��ڷ� / toUpperCase() : �빮�ڷ�
			String toLower = data2.toLowerCase();
			String toUpper = data2.toUpperCase();
			System.out.println("toLower : "+toLower);
			System.out.println("toUpperr : "+toUpper);
			
			//--------------------------------------
			
			//trim() : ���ڿ��� ���� ���鹮�� �����
			String data6 = "     Spring     FrameWoek     ";
			System.out.println("dataTrim : "+data6.trim());
			
			//--------------------------------------
			
			//String.valueOf() : ����ȭ
			//���� ���ڰ� �ƴ� �������� �ż� ��� �Ұ�
			int num = 1234;
			String s1 = num+""; //����ȭ (���̶� ��������)
			String s2 = String.valueOf(num);
			System.out.println(s1+1234); //12341234 ���� ���ڰ� �ƴ϶� �׳� �״�� ���
			System.out.println(s2+5678);
			
			//--------------------------------------
			
			char[] aa = {'S','T','U'};
			String sss = new String(aa); //������ �޼ҵ�
			String sss2 = String.valueOf(aa); //�Ϲ� �޼ҵ�
			
			//--------------------------------------
			
			//compareTo() : ��ü ũ�� ��
			String data7 = "Apple";
			String data8 = "apple";
			int r1 = data7.compareTo(data8); //data7-data8 : -32
			int r2 = data8.compareTo(data7); //32
			System.out.println(r1+" / "+r2);
			//���� 0�� ������ �� ��ü ũ�Ⱑ ����
			
			//compareToIgnoreCase() : ��ҹ��� ���� ���� ��ü ũ�� ��
			int rr1 = data7.compareToIgnoreCase(data8); //0
			int rr2 = data8.compareToIgnoreCase(data7); //0
			System.out.println(rr1+" / "+rr2);

		}

	public static void main(String[] args) {
		new Review0615().start();
	}
}
