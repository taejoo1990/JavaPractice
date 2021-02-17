package pk11;

public class AbsTest {

	public static void main(String[] args) {
		
		AbsChild1 a1=new AbsChild1();

		System.out.println(a1.changeValue());//100(value)에서 10(a1.changeValue)을 더할거야
		System.out.println();
		
		
		AbsChild2 a2=new AbsChild2();

		System.out.println(a2.changeValue());//100(value)에서 3(a2.changeValue)을 뺄거야
		System.out.println();
		
		test(new AbsChild1());
		test(new AbsChild2());
		//System.out.println(a1.changeValue());
		//System.out.println(a2.changeValue());
		
	}
	
	public static void test(AbsClass ab) {
		System.out.println(ab.changeValue());
	}

}
