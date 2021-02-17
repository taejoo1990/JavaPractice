package pk09;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class CustomerTest {

	public static void main(String[] args) {
		
		//ArrayList�� Ÿ�� Customer customerList
		ArrayList<Customer> customerList=new ArrayList<Customer>();
		
		//�Ϲݰ� 2��, GOLD 2��,VIP 2��
		Customer customerLee=new Customer(202010, "�̼���");
		Customer customerKim=new Customer(202020, "�赿��");
		
		GoldCustomer customerHong=new GoldCustomer(202030, "ȫ����");
		GoldCustomer customerShin=new GoldCustomer(202040, "�ű浿");
		
		VIPCustomer customerYun=new VIPCustomer(202050, "������",250);
		VIPCustomer customerChio=new VIPCustomer(202060, "�־ƿ�",260);
		
		//customerList ��� �߰�
		customerList.add(customerLee);
		customerList.add(customerKim);
		customerList.add(customerHong);
		customerList.add(customerShin);
		customerList.add(customerYun);
		customerList.add(customerChio);
		
		System.out.println("======���� ���� ���=======");
		for(Customer customer:customerList) {
			int price=Integer.parseInt(JOptionPane.showInputDialog("����"));
			customer.calcPrice(price);
			System.out.println(customer.showCustomerInfo());
		}
		
		System.out.println("===�������� ���ʽ� ����Ʈ ���===");
		
		int price=Integer.parseInt(JOptionPane.showInputDialog("�Һ��� ����"));
		for(Customer customer:customerList) {
			int cost=customer.calcPrice(price);
			System.out.println(customer.customerName+ "���� "+cost+"���� �����ϼ̽��ϴ�.");
			System.out.println(customer.getCustomerName()+"���� ���� ���ʽ� ����Ʈ�� "+customer.bonusPoint+"�� �Դϴ�.");
		
		}
		
	}

}
