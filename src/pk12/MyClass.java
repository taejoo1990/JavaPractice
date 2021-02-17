package pk12;

public class MyClass implements MyInterface{

	@Override
	public void x(int x) {
		System.out.println("x("+x+")");
	}

	@Override
	public void y(String y) {
		System.out.println("y("+y+")");
	}

	@Override
	public void myMethod() {
		System.out.println("myMethod()");
	}

}


// c