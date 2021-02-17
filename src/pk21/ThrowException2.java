package pk21;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowException2 {

public Class loadClass(String fileName, String className) throws FileNotFoundException, ClassNotFoundException {
		
	FileInputStream fis = new FileInputStream(fileName);
	Class c = Class.forName(className);
	return c;
	
}
		
	public static void main(String[] args) {
		
		ThrowException2 test=new ThrowException2();
		try {
			test.loadClass("a.txt", "java.lang.String");
		} catch (FileNotFoundException |ClassNotFoundException e) {
			//��Ʈ���������� or������ ��������ν� �ϳ��� �����߻��� �����߻����� ó���Ѵ�
			e.printStackTrace();
		} // | : ��Ʈ���� /
		  // || : ������
		System.out.println("end");
	}

}
