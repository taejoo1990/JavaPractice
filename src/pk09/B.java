package pk09;

public class B {
	
	public void method() {
		A a=new A();
		a.field="value";
		a.method();
	}

	public static void main(String[] args) {
		B b=new B();
		b.method();

	}

}
