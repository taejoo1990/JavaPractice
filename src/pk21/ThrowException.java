package pk21;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowException {

	public Class loadClass(String fileName, String className) throws FileNotFoundException, ClassNotFoundException {

		FileInputStream fis = new FileInputStream(fileName);

		Class c = Class.forName(className);

		return c;
	}

	public static void main(String[] args) {
		ThrowException test = new ThrowException();
		try {
			test.loadClass("b.txt", "java.lang.String");
		} catch (FileNotFoundException e) {
			System.out.println(e);
		} catch (ClassNotFoundException e) {
			System.out.println(e);
		} catch (Exception e) {// 만약 발생하는 Exception을 잡지 못하는 경우 추가(Exception 처리안되면 추가)
			System.out.println(e);
		}
		System.out.println("end");
	}
}