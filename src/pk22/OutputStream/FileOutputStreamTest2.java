package pk22.OutputStream;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest2 {

	public static void main(String[] args) {
		
		try(FileOutputStream fos=new FileOutputStream("output2.txt")){
			
			byte[] bs=new byte[26];
			byte data=65;
			
			for (int i = 0; i < bs.length; i++) {//A-Z���� �迭�� �ֱ�
				bs[i]=data;
				data++;
			}
			//fos.write(bs);//�迭�� �ѱ��� ���
			
			fos.write(bs, 2, 15);
		}catch (IOException e) {
			System.out.println(e);
		}
		System.out.println("����� �Ϸ�Ǿ����ϴ�.");
	}

}
