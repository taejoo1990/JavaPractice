package test;

import pk09.A;

public class D extends A{

	public D() {
		//super(); //부모클래스의 생성자 public A();
		this.field="value";
		this .method();//A class의 생성자에 의해서 메소드가 실행됨
		
	}
	
	public static void main(String[] args) {
		D d=new D();//this.method
		d.method();//상속에 의해서 부모클래스 메소드 실행

	}

}
