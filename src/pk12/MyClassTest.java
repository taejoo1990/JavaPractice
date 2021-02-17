package pk12;

public class MyClassTest {

	public static void main(String[] args) {
		
		MyClass mc=new MyClass();
		
		System.out.println("--MyClass--");
		mc.x(5);
		mc.y("港港");
		mc.myMethod();
		
		System.out.println("----x/y----");
		X xc=mc;//Down某胶泼
		xc.x(7);
		
		Y yc=mc;
		yc.y("具克");
		
		System.out.println("--MyInterface--");
		MyInterface ic=mc;
		ic.myMethod();
		ic.x(10);
		ic.y("绢蕊");

	}

}
