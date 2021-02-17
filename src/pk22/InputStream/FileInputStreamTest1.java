package pk22.InputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest1 {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis=null;//AutoCloseable�� Override �Ǿ� ����. �ѱ� ����

		try {
			fis=new FileInputStream("input.txt");
			
			System.out.print((char)fis.read()+" ");
			System.out.print((char)fis.read()+" ");
			System.out.print((char)fis.read()+" ");

		} catch (IOException e) {//read Error
			System.out.println(e);
		}finally {
			try {
				fis.close();				
			} catch (IOException e) {//close Error
				System.out.println(e);
				//NullPointException�� ���� ���ؼ� ����
			}catch(NullPointerException e) {
				System.out.println(e);
			}
		}System.out.println("\n end");
	}

}
