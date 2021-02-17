package pk22.OutputStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest1 {

   public static void main(String[] args) {
      // TODO Auto-generated method stub
      
      try (FileOutputStream fos = new FileOutputStream("output.txt",true)){
   
         fos.write(71);
         fos.write(72);
         fos.write(73);
         
         
      } catch (IOException e) {
         e.printStackTrace();
      }
      System.out.println("출력이 완료되었습니다.");
   }

}