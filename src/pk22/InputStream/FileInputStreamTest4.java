package pk22.InputStream;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamTest4 {

	public static void main(String[] args) {
		
		try (FileInputStream fis=new FileInputStream("input3.txt")){
			
			byte[] bs=new byte[10];
			int i;
			while((i=fis.read(bs, 0, 10)) !=-1) {//10���� ��Ƽ� �ѱ�
				//�о� ���̴� ��ŭ���� ��� (���������� ���)
				for(int j=0;j<i;j++) {
					System.out.print((char)bs[j]);
				}
				System.out.println(" : "+i+"���� ����Ʈ ����");
			}
		} catch (IOException e) {
			System.out.println(e);
		}
		System.out.println("�Ϸ�!");
	}
}
