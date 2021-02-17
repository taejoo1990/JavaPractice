package pk10;

import java.util.function.IntPredicate;

import pk09.Customer;
import pk09.VIPCustomer;

public class OverridingTest1 {

	public static void main(String[] args) {
		Customer customerLee=new Customer(10010, "�̼���");
		customerLee.bonusPoint=1000;
		System.out.println(customerLee.showCustomerInfo());
		
		VIPCustomer vip=new VIPCustomer(10020, "������", 12345);
		vip.bonusPoint=1000;
		System.out.println(vip.showCustomerInfo());

		int price=10000;
		
		System.out.println("----------------------------------------");
		System.out.println(customerLee.getCustomerName()+"���� �����ϼž� �ϴ� ����"+customerLee.calcPrice(price)+"�� �Դϴ�.");
		System.out.println(vip.getCustomerName()+"���� �����ϼž� �ϴ� ����"+vip.calcPrice(price)+"�� �Դϴ�.");
	}

}
