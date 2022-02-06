import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class FileTest { //0705-4 IO

	public FileTest() {
		try {
			//File : ���ϰ�ο� ���ϸ����� ��ü�� �����Ͽ� ��ü�� ������ ���� �� �ִ�
			File f1 = new File("D://testFile");
			File f2 = new File("D://");
			File f3 = new File("D://testFile/Gugudan.java");
			File f4 = new File("D://testFile","Gugudan.java");
			File f5 = new File(f1,"Gugudan.java");
			//�ݵ�� �����ּ�
			
			File f6 = new File("D://testfile/createJava");
			//���� �����ϱ�
			if(!f6.exists()) {//���� ���� Ȯ�� (������ t, ������ f)
				//������(false) ���� �����
				if(f6.mkdirs()) {//���� �����ϱ� (�����Ǹ� t, �����ϸ� f
					System.out.println("������ �����Ǿ����ϴ�.");
				}
				else {
					System.out.println("���� ���� �����߽��ϴ�.");
				}
			}
			//���� �����ϱ�
			File f7 = new File(f6,"abcd.txt");
			if(!f7.exists()) {
				if(f7.createNewFile()) {
					System.out.println("������ �����Ǿ����ϴ�.");
				}
				else System.out.println("���� ������ �����߽��ϴ�.");
			}
			
			//������ ������ �˾Ƴ���
			long lastDate = f3.lastModified(); //lastModified()�� long���� ����
			//�и���
			System.out.println("lastDate:"+lastDate);
			
			Calendar now = Calendar.getInstance();
			now.setTimeInMillis(lastDate); //lastdate ��¥�� �ٲ�
			
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a hh:mm:ss");
			String modifiedDate = sdf.format(now.getTime());
			System.out.println("������ ������ = "+modifiedDate);
			
			boolean exe = f5.canExecute();
			boolean read = f5.canRead();
			boolean write = f5.canWrite();
			System.out.println(exe+":"+read+":"+write);
			
			//Ư�� ����̺� Ȥ�� ������ �ִ� ���� �� ���� ���� ������
			File f8 = new File("C://");
			File[] fileList = f8.listFiles();
			
			/*
			 getPath() : ������ + ���ϸ�
			 getName() : ���ϸ�
			 getAbsolutePath() : ������ : ���ϸ�
			 getPatent() : ������
			 */
			
			//�����غ��� ���� ���̴� �ͺ��� ���� ��µ��ٵ�, ���� ������ ���̱� ����
//			for(File f:fileList) {
//				if(f.isDirectory()) {//�������� Ȯ��
//					System.out.println(f.getPath() + "[����]");
//				}
//				else if(f.isFile()) {
//					System.out.println(f.getPath()+"[����]");
//				}
//			}
			
			//���� ������ �����غ���
			for(File f:fileList)  {
				if(f.isDirectory()) {//�������� Ȯ��
					System.out.println(f.getPath());
					if(f.isHidden()) {
						System.out.println("[��������]");
					}
					else System.out.println("[����]");
				}
				else if(f.isFile()) {
					System.out.println(f.getPath());
					if(f.isHidden()) {
						System.out.println("[��������]");
					}
					else System.out.println("[����]");
				}
			}
			
			//���� �ý����� ����̺긦 ���Ѵ�.
			File[] root = File.listRoots();
			for(File ff:root) {
				System.out.println(ff.getPath());
			}
			
			//���� ũ�� : byte
			long size = f3.length();
			System.out.println("size="+size);
			
			//���� ����
			boolean result = f3.delete();
			if(result) {
				System.out.println("������ �����Ǿ����ϴ�");
			}
			else System.out.println("���� ���� �����߽��ϴ�");
			
			
		} catch(IOException i) {
			i.printStackTrace();
		}
		
		System.out.println("~~~~~"); //�̹� �����ϸ� �ƿ� if���� ���� ����� �ٷο�.
	}

	public static void main(String[] args) {
		new FileTest();

	}

}
