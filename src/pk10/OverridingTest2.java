package pk10;

import pk09.Customer;
import pk09.VIPCustomer;

public class OverridingTest2 {

	public static void main(String[] args) {
		//VIPcustomer �������� ȣ��� �ν��Ͻ��� ����
		//������ VIPcustomer�� Ÿ���� Customer ������ �ٲ�
		Customer vs=new VIPCustomer(10030,"������",2000);
		vs.bonusPoint=1000;
		System.out.println(vs.getCustomerName()+"���� �����Ͻ� �ݾ��� "+vs.calcPrice(10000)+"�� �Դϴ�.");
		int res=vs.calcPrice(10000);
		System.out.println(res);
	}

}
