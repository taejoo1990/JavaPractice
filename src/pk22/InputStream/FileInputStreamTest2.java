package pk22.InputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileInputStreamTest2 {

	public static void main(String[] args) {
		
		//FileInputStream fis=new FileInputStream("input2.txt");

		try(FileReader fis=new FileReader("input2.txt")) {
			//input2.txt ���� ����(�ѱ��� �����ϴ� FileReader Ŭ����)
			int i;
			while((i=fis.read()) != -1) {//���� ���� �б�(�� ������ -1�� ��ȯ)
				System.out.print((char)i+" ");
			}
			System.out.println();
			System.out.println("end");
			
		} catch (FileNotFoundException e) {//������ ������ �۵�
			System.out.println(e);
		}catch (IOException e) {//���� ������ ������� ���� ����
			System.out.println(e);
		}	
	}
}