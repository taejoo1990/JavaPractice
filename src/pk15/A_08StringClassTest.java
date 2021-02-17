package pk15;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class A_08StringClassTest {

	public static void main(String[] args) throws ClassNotFoundException {
		
		//Class class�� ��ü ����
		Class strClass=Class.forName("java.lang.String");
		
		//String Ŭ������ �����ڵ� ȣ��
		Constructor[] cons=strClass.getConstructors();
		for(Constructor c:cons) {
			System.out.println(c);
		}
		//�ʵ� ȣ��
		System.out.println();
		Field[] fields=strClass.getFields();
		for(Field f:fields) {
			System.out.println(f);
		}
		//�޼���
		System.out.println();
		Method[] method=strClass.getMethods();
		for(Method m:method) {
			System.out.println(m);
		}
	
	}

}
