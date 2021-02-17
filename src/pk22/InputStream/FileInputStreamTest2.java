package pk22.InputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileInputStreamTest2 {

	public static void main(String[] args) {
		
		//FileInputStream fis=new FileInputStream("input2.txt");

		try(FileReader fis=new FileReader("input2.txt")) {
			//input2.txt 파일 열기(한글을 지원하는 FileReader 클래스)
			int i;
			while((i=fis.read()) != -1) {//파일 연속 읽기(다 읽으면 -1을 반환)
				System.out.print((char)i+" ");
			}
			System.out.println();
			System.out.println("end");
			
		} catch (FileNotFoundException e) {//파일이 없을시 작동
			System.out.println(e);
		}catch (IOException e) {//파일 유무와 상관없이 읽지 못함
			System.out.println(e);
		}	
	}
}