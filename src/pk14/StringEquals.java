package pk14;

public class StringEquals {

	public static void main(String[] args) {
		
		ExtendsEx1 test=new ExtendsEx1();
		System.out.println("toString이 오버라이딩이 안된 값 : ");
		
		System.out.println(test);
		System.out.println();
		
		String str1=new String("abc");
		String str2=new String("abc");
		
		System.out.println(str1==str2);
		System.out.println(str1.equals(str2));
		
		Integer i1=new Integer(100);
		Integer i2=new Integer(100);
		
		System.out.println(i1==i2);
		System.out.println(i1.equals(i2));//Intger클래스에 equsals 오버라이딩)

	}

}
