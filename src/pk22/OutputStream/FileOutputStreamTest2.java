package pk22.OutputStream;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest2 {

	public static void main(String[] args) {
		
		try(FileOutputStream fos=new FileOutputStream("output2.txt")){
			
			byte[] bs=new byte[26];
			byte data=65;
			
			for (int i = 0; i < bs.length; i++) {//A-Z까지 배열에 넣기
				bs[i]=data;
				data++;
			}
			//fos.write(bs);//배열을 한군데 출력
			
			fos.write(bs, 2, 15);
		}catch (IOException e) {
			System.out.println(e);
		}
		System.out.println("출력이 완료되었습니다.");
	}

}
