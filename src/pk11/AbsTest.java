package pk11;

public class AbsTest {

	public static void main(String[] args) {
		
		AbsChild1 a1=new AbsChild1();

		System.out.println(a1.changeValue());//100(value)���� 10(a1.changeValue)�� ���Ұž�
		System.out.println();
		
		
		AbsChild2 a2=new AbsChild2();

		System.out.println(a2.changeValue());//100(value)���� 3(a2.changeValue)�� ���ž�
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
