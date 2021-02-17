package pk10;

import pk09.Customer;
import pk09.VIPCustomer;

public class OverridingTest2 {

	public static void main(String[] args) {
		//VIPcustomer 생성자의 호출로 인스턴스가 생성
		//생성된 VIPcustomer의 타입을 Customer 변수로 바꿈
		Customer vs=new VIPCustomer(10030,"나로이",2000);
		vs.bonusPoint=1000;
		System.out.println(vs.getCustomerName()+"님이 지불하실 금액은 "+vs.calcPrice(10000)+"원 입니다.");
		int res=vs.calcPrice(10000);
		System.out.println(res);
	}

}
