package Multi;

public class CustomerTest {

	public static void main(String[] args) {
		
		Customer c1=new Customer();
		
		System.out.println("---Buy---");
		Buy b1=new Customer();//UPĳ����
		b1.buy();
		b1.order();//Override�� order�� ����
		
		System.out.println();
		
		System.out.println("---Sell---");
		Sell s1=new Customer();//UPĳ����
		s1.sell();
		s1.order();//Override�� order�� ����
		
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
