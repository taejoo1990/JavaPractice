package pk22.InputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputStreamTest5 {

	public static void main(String[] args) throws IOException {
		
		//true : append(추가)
		try(FileOutputStream fos=new FileOutputStream("resource.txt",true);
				//아웃풋 사용시 파일 자동생성
				FileInputStream fis=new FileInputStream("resource.txt")){
			
			fos.write(77);//G
			fos.write(78);//H
			fos.write(79);//I
			
			System.out.print((char)fis.read()+" ");
			System.out.print((char)fis.read()+" ");
			System.out.print((char)fis.read()+" ");		
			
		}catch (IOException e) {
			System.out.println(e);
		}
	}
}
//Input = 파일을 자바로 가져오는거
//Output = 자바를 파일로 내보내는거
