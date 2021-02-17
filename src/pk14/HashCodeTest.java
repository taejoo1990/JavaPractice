package pk14;

public class HashCodeTest {

	public static void main(String[] args) {
		
		String str1=new String("abc");
		String str2=new String("abc");//HashCode가 재정의 되어 있음
		
		//hashCode의 재정의 되어있는 String
		System.out.println("********hashCode의 재정의 되어있는 String*******");
		System.out.println("str1의 hashCode : "+str1.hashCode());
		System.out.println("str2의  hashCode : "+str2.hashCode());
		System.out.println("str2의  hashCode : "+System.identityHashCode(str2));
		System.out.println(str1);
		System.out.println();
		
		Integer i1=new Integer(500);
		Integer i2=new Integer(500);//HashCode가 재정의 되어 있음
		
		//hashCode의 재정의 되어있는 Integer
		System.out.println("********hashCode의 재정의 되어있는 Integer*******");
		System.out.println("i1의 Integer : "+i1.hashCode());
		System.out.println("i2의 Integer : "+i2.hashCode());
		System.out.println();
		

	}

}
