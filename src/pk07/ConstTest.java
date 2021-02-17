package pk07;

//Constructor
public class ConstTest {

	private int aa;
	private int bb;
	
	public ConstTest(int a, int b) {
		aa=a;
		bb=b;
		
	}

	public static void main(String[] args) {
		
		ConstTest obj=new ConstTest(10,20);
		System.out.println(obj.aa);
		System.out.println(obj.bb);
	}

}
