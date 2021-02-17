package test;

import pk09.A;

public class C extends A{
	
	public void method() {
		A a=new A();
		a.field="value";
		a.method();
	}
	
	public static void main(String[] args) {
		C c=new C();
		c.method();
	}

}
