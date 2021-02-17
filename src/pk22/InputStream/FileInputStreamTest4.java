package pk22.InputStream;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamTest4 {

	public static void main(String[] args) {
		
		try (FileInputStream fis=new FileInputStream("input3.txt")){
			
			byte[] bs=new byte[10];
			int i;
			while((i=fis.read(bs, 0, 10)) !=-1) {//10개씩 담아서 넘김
				//읽어 들이는 만큼만버 출력 (가베지값이 출력)
				for(int j=0;j<i;j++) {
					System.out.print((char)bs[j]);
				}
				System.out.println(" : "+i+"개의 바이트 읽음");
			}
		} catch (IOException e) {
			System.out.println(e);
		}
		System.out.println("완료!");
	}
}
