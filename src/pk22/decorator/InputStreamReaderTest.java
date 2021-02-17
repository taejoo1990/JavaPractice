package pk22.decorator;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class InputStreamReaderTest {

	public static void main(String[] args) {
		//nputStreamReader => FileInputStream�� ���� (Reader:���ڴ��� ��Ʈ��) ���شٴ� ��
		try (InputStreamReader isr=new InputStreamReader(new FileInputStream("reader.txt"))){
			int i;
			
			while((i=isr.read())!=-1){
				System.out.print((char)i+" ");
			}
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}/*����
		Socket socket=new Socket();
		try {
			new InputStreamReader(socket.getInputStream());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
	}

}
