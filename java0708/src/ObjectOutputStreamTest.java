import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class ObjectOutputStreamTest { //0708-5

   public ObjectOutputStreamTest() {
      try {
         File file = new File("E://testFile","object.txt");
         FileOutputStream fos = new FileOutputStream(file);
         
         ObjectOutputStream oos = new ObjectOutputStream(fos);
         
         Memo memo = new Memo();
         
         oos.writeObject(memo);
         
         oos.close();
         fos.close();
         System.out.println("��ü����Ϸ�");
         
      } catch (Exception e) {
         
      }
   }

   public static void main(String[] args) {
      new ObjectOutputStreamTest();

   }

}