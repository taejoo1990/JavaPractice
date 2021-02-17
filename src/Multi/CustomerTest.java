package Multi;

public class CustomerTest {

	public static void main(String[] args) {
		
		Customer c1=new Customer();
		
		System.out.println("---Buy---");
		Buy b1=new Customer();//UP캐스팅
		b1.buy();
		b1.order();//Override된 order를 읽음
		
		System.out.println();
		
		System.out.println("---Sell---");
		Sell s1=new Customer();//UP캐스팅
		s1.sell();
		s1.order();//Override된 order를 읽음
		
		System.out.println();
		
		if(s1 instanceof Customer) {
			Customer c2=(Customer)s1;//Down
			System.out.println("--Down Chasting--");
			c2.buy();
			c2.sell();
			c2.order();
		}
		System.out.println();
		System.out.println("--Customer--");
		c1.order();
	}

}
