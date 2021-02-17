package pk22.InputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest3 {

	public static void main(String[] args) {
		
		try (FileInputStream fis=new FileInputStream("input3.txt")){
			
			byte[] bs=new byte[10];
			int i;
			while((i=fis.read(bs)) !=-1) {//10개씩 담아서 넘김
				//버퍼읽기 10개씩(가베지값이 출력)
				for(byte b:bs) {
					System.out.print((char)b);
				}
				System.out.println(" : "+i+"개의 바이트 읽음");
			}
		} catch (IOException e) {
			System.out.println(e);
		}
		System.out.println("완료!");
	}

}
