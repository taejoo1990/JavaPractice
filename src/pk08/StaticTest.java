package pk08;

class StVal{
	int a;
	static int b;
}

public class StaticTest {

	public static void main(String[] args) {
		StVal obj1=new StVal();
		StVal obj2=new StVal();
		
		System.out.println(obj1);
		System.out.println(obj2);
		
		obj1.a=10;
		obj1.b=20;	
		System.out.println("obj1입니다 : a -> "+obj1.a+", b -> "+obj1.b);
		
		System.out.println();
		obj2.a=100;
		obj2.b=200;	
		System.out.println("obj2입니다 : a -> "+obj2.a+", b -> "+obj2.b);
		System.out.println("obj1입니다 : a -> "+obj1.a+", b -> "+obj1.b);
		
		obj2.a=200;
		obj2.b=300;
		System.out.println("obj2입니다 : a -> "+obj2.a+", b -> "+obj2.b); //a-> 200 b-> 300
		System.out.println("obj1입니다 : a -> "+obj2.a+", b -> "+obj2.b); //a-> 10 b-> 300
		

	}

}
