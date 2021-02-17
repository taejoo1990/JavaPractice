package pk22.decorator;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedStreamTest {

	public static void main(String[] args) {
		
		long millisecond=0;
		
		try(FileInputStream fis=new FileInputStream("a.zip");
				FileOutputStream fos=new FileOutputStream("copy.zip")) {
				BufferedInputStream bis=new BufferedInputStream(fis);//8kbyte 복사
				BufferedOutputStream bos=new BufferedOutputStream(fos);
			millisecond=System.currentTimeMillis();//copy하는데 걸리는 시간
			
			int i;
			while((i=bis.read())!=-1) {
				bos.write(i);
			}
			millisecond=System.currentTimeMillis()-millisecond;
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		System.out.println("파일 복사하는데 걸린 시간 : "+millisecond+" millisecond초가 걸렸습니다.");

	}

}
