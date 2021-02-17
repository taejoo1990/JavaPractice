package pk10;

import java.util.function.IntPredicate;

import pk09.Customer;
import pk09.VIPCustomer;

public class OverridingTest1 {

	public static void main(String[] args) {
		Customer customerLee=new Customer(10010, "이세이");
		customerLee.bonusPoint=1000;
		System.out.println(customerLee.showCustomerInfo());
		
		VIPCustomer vip=new VIPCustomer(10020, "김유진", 12345);
		vip.bonusPoint=1000;
		System.out.println(vip.showCustomerInfo());

		int price=10000;
		
		System.out.println("----------------------------------------");
		System.out.println(customerLee.getCustomerName()+"님이 지불하셔야 하는 돈은"+customerLee.calcPrice(price)+"원 입니다.");
		System.out.println(vip.getCustomerName()+"님이 지불하셔야 하는 돈은"+vip.calcPrice(price)+"원 입니다.");
	}

}
