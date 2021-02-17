package pk02;

public class LogicTest_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char a,b;
		boolean c;
		a='A';
		b='b';
		
		c= true || true && false;
		//c= true || false;
		System.out.println(c);
		
		
		c=a<b && (a==b);
		System.out.println(c);
		
		c=a<b || (a==b);
		System.out.println(c);
		

	}

}
