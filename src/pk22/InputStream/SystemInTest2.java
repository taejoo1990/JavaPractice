package pk22.InputStream;

import java.io.IOException;

public class SystemInTest2 {

	public static void main(String[] args) {
		
		System.out.print("���ĺ� ���� ���� ���� [Enter]�� �������� : ");//ABCDE '\n'
		int i;
		try {
			
			while( (i=System.in.read() ) !='\n') {
				System.out.print((char)i+" ");//����				
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
