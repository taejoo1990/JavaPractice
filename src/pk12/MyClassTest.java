package pk12;

public class MyClassTest {

	public static void main(String[] args) {
		
		MyClass mc=new MyClass();
		
		System.out.println("--MyClass--");
		mc.x(5);
		mc.y("�۸�");
		mc.myMethod();
		
		System.out.println("----x/y----");
		X xc=mc;//Downĳ����
		xc.x(7);
		
		Y yc=mc;
		yc.y("�߿�");
		
		System.out.println("--MyInterface--");
		MyInterface ic=mc;
		ic.myMethod();
		ic.x(10);
		ic.y("����");

	}

}
