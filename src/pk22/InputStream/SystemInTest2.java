package pk22.InputStream;

import java.io.IOException;

public class SystemInTest2 {

	public static void main(String[] args) {
		
		System.out.print("알파벳 여러 개를 쓰고 [Enter]를 누르세요 : ");//ABCDE '\n'
		int i;
		try {
			
			while( (i=System.in.read() ) !='\n') {
				System.out.print((char)i+" ");//문자				
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
