package test;

import pk09.A;

public class D extends A{

	public D() {
		//super(); //�θ�Ŭ������ ������ public A();
		this.field="value";
		this .method();//A class�� �����ڿ� ���ؼ� �޼ҵ尡 �����
		
	}
	
	public static void main(String[] args) {
		D d=new D();//this.method
		d.method();//��ӿ� ���ؼ� �θ�Ŭ���� �޼ҵ� ����

	}

}
