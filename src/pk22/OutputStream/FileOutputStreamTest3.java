package pk22.OutputStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest3 {

	public static void main(String[] args) throws IOException {
		
		FileOutputStream fos=null;
		fos=new FileOutputStream("output3.txt",true);
		
		fos.write(70);
		fos.write(71);
		fos.write(67);

		fos.flush();//출력버퍼 비울때
		fos.close();
		System.out.println("파일이 생성되었습니다.");
	}

}
