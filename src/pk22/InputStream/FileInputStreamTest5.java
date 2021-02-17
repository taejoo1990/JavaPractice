package pk22.InputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputStreamTest5 {

	public static void main(String[] args) throws IOException {
		
		//true : append(�߰�)
		try(FileOutputStream fos=new FileOutputStream("resource.txt",true);
				//�ƿ�ǲ ���� ���� �ڵ�����
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
//Input = ������ �ڹٷ� �������°�
//Output = �ڹٸ� ���Ϸ� �������°�
