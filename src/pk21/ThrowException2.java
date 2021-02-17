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
			//비트연산을통해 or연산을 사용함으로써 하나라도 에러발생시 에러발생으로 처리한다
			e.printStackTrace();
		} // | : 비트연산 /
		  // || : 논리연산
		System.out.println("end");
	}

}
