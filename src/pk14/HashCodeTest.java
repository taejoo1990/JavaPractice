package pk14;

public class HashCodeTest {

	public static void main(String[] args) {
		
		String str1=new String("abc");
		String str2=new String("abc");//HashCode�� ������ �Ǿ� ����
		
		//hashCode�� ������ �Ǿ��ִ� String
		System.out.println("********hashCode�� ������ �Ǿ��ִ� String*******");
		System.out.println("str1�� hashCode : "+str1.hashCode());
		System.out.println("str2��  hashCode : "+str2.hashCode());
		System.out.println("str2��  hashCode : "+System.identityHashCode(str2));
		System.out.println(str1);
		System.out.println();
		
		Integer i1=new Integer(500);
		Integer i2=new Integer(500);//HashCode�� ������ �Ǿ� ����
		
		//hashCode�� ������ �Ǿ��ִ� Integer
		System.out.println("********hashCode�� ������ �Ǿ��ִ� Integer*******");
		System.out.println("i1�� Integer : "+i1.hashCode());
		System.out.println("i2�� Integer : "+i2.hashCode());
		System.out.println();
		

	}

}
