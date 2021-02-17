package pk20;

import java.util.ArrayList;
import java.util.List;

public class TravelTest {

	public static void main(String[] args) {
		
		TravalCustomer cusyomerLee=new TravalCustomer("�����", 30, 6000);
		TravalCustomer cusyomerLee1=new TravalCustomer("�˵���", 25, 5000);
		TravalCustomer cusyomerLee2=new TravalCustomer("������", 15, 4000);

		
		
		List<TravalCustomer> cList=new ArrayList<>();
		
		cList.add(cusyomerLee);
		cList.add(cusyomerLee1);
		cList.add(cusyomerLee2);
		
		System.out.println("==��ܿ� �߰��� ���� ������� ���==");
		cList.stream().map(c->c.getName()).forEach(s->System.out.println(s));
		
		//mapToInt��� int������ ��ȯ sum�� ����
		System.out.println("==�ݾ��� �Ѻ�� ���==");
		int total=cList.stream().mapToInt(c->c.getPrice()).sum();
		System.out.println(total);
		
		System.out.println("==20���̻��� ���� ��� �����Ͽ� ���==");
		cList.stream().filter(c->c.getAge()>=20).map(c->c.getAge()).sorted().forEach(s->System.out.println(s));
		
	}//forEach�ǰ�� for���� �����ϰ� �����ϰ� ��� 
	//sorted�� �����ҋ� ��� ���Ľ� ������ abc 123������ ��� 
}
