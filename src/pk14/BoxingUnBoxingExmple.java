package pk14;

public class BoxingUnBoxingExmple {

	public static void main(String[] args) {
		//AutoBoxing
		Integer obj1=new Integer(100);
		Integer obj2=new Integer("200");
		Integer obj3=Integer.valueOf("300");
		Integer total1=obj1+obj2;
		Integer total2=obj1+obj3;
		
		System.out.println("Integer toatal1 : "+total1);
		System.out.println("Integer toatal2 : "+total2);
		
		//UnBoxing
		int value1=obj1.intValue();
		int value2=obj2.intValue();
		int value3=obj3.intValue();
		Integer total3=value1+value2;
		Integer total4=value1+value3;
		System.out.println();
		System.out.println("Integer toatal3 : "+total3);
		System.out.println("Integer toatal4 : "+total4);
		
		
	}

}