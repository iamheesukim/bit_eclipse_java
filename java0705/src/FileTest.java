import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class FileTest { //0705-4 IO

	public FileTest() {
		try {
			//File : 파일경로와 파일명으로 객체를 생성하여 객체의 정보를 얻을 수 있다
			File f1 = new File("D://testFile");
			File f2 = new File("D://");
			File f3 = new File("D://testFile/Gugudan.java");
			File f4 = new File("D://testFile","Gugudan.java");
			File f5 = new File(f1,"Gugudan.java");
			//반드시 절대주소
			
			File f6 = new File("D://testfile/createJava");
			//폴더 생성하기
			if(!f6.exists()) {//존재 유무 확인 (있으면 t, 없으면 f)
				//없으면(false) 폴더 만들기
				if(f6.mkdirs()) {//폴더 생성하기 (생성되면 t, 실패하면 f
					System.out.println("폴더가 생성되었습니다.");
				}
				else {
					System.out.println("폴더 생성 실패했습니다.");
				}
			}
			//파일 생성하기
			File f7 = new File(f6,"abcd.txt");
			if(!f7.exists()) {
				if(f7.createNewFile()) {
					System.out.println("파일이 생성되었습니다.");
				}
				else System.out.println("파일 생성을 실패했습니다.");
			}
			
			//마지막 수정일 알아내기
			long lastDate = f3.lastModified(); //lastModified()는 long으로 받음
			//밀리초
			System.out.println("lastDate:"+lastDate);
			
			Calendar now = Calendar.getInstance();
			now.setTimeInMillis(lastDate); //lastdate 날짜로 바뀜
			
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a hh:mm:ss");
			String modifiedDate = sdf.format(now.getTime());
			System.out.println("마지막 수정일 = "+modifiedDate);
			
			boolean exe = f5.canExecute();
			boolean read = f5.canRead();
			boolean write = f5.canWrite();
			System.out.println(exe+":"+read+":"+write);
			
			//특정 드라이브 혹은 폴더에 있는 파일 및 폴더 정보 얻어오기
			File f8 = new File("C://");
			File[] fileList = f8.listFiles();
			
			/*
			 getPath() : 폴더명 + 파일명
			 getName() : 파일명
			 getAbsolutePath() : 폴더명 : 파일명
			 getPatent() : 폴더명
			 */
			
			//실행해보면 실제 보이는 것보다 많이 출력될텐데, 숨김 폴더가 보이기 때문
//			for(File f:fileList) {
//				if(f.isDirectory()) {//폴더인지 확인
//					System.out.println(f.getPath() + "[폴더]");
//				}
//				else if(f.isFile()) {
//					System.out.println(f.getPath()+"[파일]");
//				}
//			}
			
			//숨김 폴더도 구분해보기
			for(File f:fileList)  {
				if(f.isDirectory()) {//폴더인지 확인
					System.out.println(f.getPath());
					if(f.isHidden()) {
						System.out.println("[숨김폴더]");
					}
					else System.out.println("[폴더]");
				}
				else if(f.isFile()) {
					System.out.println(f.getPath());
					if(f.isHidden()) {
						System.out.println("[숨김파일]");
					}
					else System.out.println("[파일]");
				}
			}
			
			//현재 시스템의 드라이브를 구한다.
			File[] root = File.listRoots();
			for(File ff:root) {
				System.out.println(ff.getPath());
			}
			
			//파일 크기 : byte
			long size = f3.length();
			System.out.println("size="+size);
			
			//파일 삭제
			boolean result = f3.delete();
			if(result) {
				System.out.println("파일이 삭제되었습니다");
			}
			else System.out.println("파일 삭제 실패했습니다");
			
			
		} catch(IOException i) {
			i.printStackTrace();
		}
		
		System.out.println("~~~~~"); //이미 존재하면 아예 if문에 못들어서 여기로 바로옴.
	}

	public static void main(String[] args) {
		new FileTest();

	}

}
