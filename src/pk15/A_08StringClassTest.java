package pk15;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class A_08StringClassTest {

	public static void main(String[] args) throws ClassNotFoundException {
		
		//Class class의 객체 생성
		Class strClass=Class.forName("java.lang.String");
		
		//String 클래스의 생성자들 호출
		Constructor[] cons=strClass.getConstructors();
		for(Constructor c:cons) {
			System.out.println(c);
		}
		//필드 호출
		System.out.println();
		Field[] fields=strClass.getFields();
		for(Field f:fields) {
			System.out.println(f);
		}
		//메서드
		System.out.println();
		Method[] method=strClass.getMethods();
		for(Method m:method) {
			System.out.println(m);
		}
	
	}

}
