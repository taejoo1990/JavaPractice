package pk22.OutputStream;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {

	public static void main(String[] args) {
		
		
		try(FileWriter fw=new FileWriter("writer.txt")){
			fw.write('A');//문자 하나 출력
			char buf[]= {'B','C','D','E','F','G'};
			
			fw.write(buf);
			fw.write("2020년 연말입니다.");
			fw.write(buf,1,3);
			fw.write("65");
			
			
		} catch (IOException e) {
			System.out.println(e);
		}
		System.out.println("출력 완료");
	}

}
