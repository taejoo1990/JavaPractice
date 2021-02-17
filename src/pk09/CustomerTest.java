package pk09;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class CustomerTest {

	public static void main(String[] args) {
		
		//ArrayList의 타입 Customer customerList
		ArrayList<Customer> customerList=new ArrayList<Customer>();
		
		//일반고객 2명, GOLD 2명,VIP 2명
		Customer customerLee=new Customer(202010, "이수근");
		Customer customerKim=new Customer(202020, "김동현");
		
		GoldCustomer customerHong=new GoldCustomer(202030, "홍성수");
		GoldCustomer customerShin=new GoldCustomer(202040, "신길동");
		
		VIPCustomer customerYun=new VIPCustomer(202050, "윤소이",250);
		VIPCustomer customerChio=new VIPCustomer(202060, "최아영",260);
		
		//customerList 모두 추가
		customerList.add(customerLee);
		customerList.add(customerKim);
		customerList.add(customerHong);
		customerList.add(customerShin);
		customerList.add(customerYun);
		customerList.add(customerChio);
		
		System.out.println("======고객의 정보 출력=======");
		for(Customer customer:customerList) {
			int price=Integer.parseInt(JOptionPane.showInputDialog("가격"));
			customer.calcPrice(price);
			System.out.println(customer.showCustomerInfo());
		}
		
		System.out.println("===할인율과 보너스 포인트 계산===");
		
		int price=Integer.parseInt(JOptionPane.showInputDialog("소비자 가격"));
		for(Customer customer:customerList) {
			int cost=customer.calcPrice(price);
			System.out.println(customer.customerName+ "님이 "+cost+"원을 지불하셨습니다.");
			System.out.println(customer.getCustomerName()+"님의 현재 보너스 포인트는 "+customer.bonusPoint+"점 입니다.");
		
		}
		
	}

}
