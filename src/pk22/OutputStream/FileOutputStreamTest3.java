package pk22.OutputStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest3 {

	public static void main(String[] args) throws IOException {
		
		FileOutputStream fos=null;
		fos=new FileOutputStream("output3.txt",true);
		
		fos.write(70);
		fos.write(71);
		fos.write(67);

		fos.flush();//��¹��� ��ﶧ
		fos.close();
		System.out.println("������ �����Ǿ����ϴ�.");
	}

}
