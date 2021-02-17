package pk20;

import java.util.ArrayList;
import java.util.List;

public class TravelTest {

	public static void main(String[] args) {
		
		TravalCustomer cusyomerLee=new TravalCustomer("흰둥이", 30, 6000);
		TravalCustomer cusyomerLee1=new TravalCustomer("검둥이", 25, 5000);
		TravalCustomer cusyomerLee2=new TravalCustomer("깜둥이", 15, 4000);

		
		
		List<TravalCustomer> cList=new ArrayList<>();
		
		cList.add(cusyomerLee);
		cList.add(cusyomerLee1);
		cList.add(cusyomerLee2);
		
		System.out.println("==명단에 추가된 고객을 순서대로 출력==");
		cList.stream().map(c->c.getName()).forEach(s->System.out.println(s));
		
		//mapToInt경우 int형으로 변환 sum에 누적
		System.out.println("==금액의 총비용 출력==");
		int total=cList.stream().mapToInt(c->c.getPrice()).sum();
		System.out.println(total);
		
		System.out.println("==20세이상의 고객의 명단 정렬하여 출력==");
		cList.stream().filter(c->c.getAge()>=20).map(c->c.getAge()).sorted().forEach(s->System.out.println(s));
		
	}//forEach의경우 for문을 생략하고 간편하게 사용 
	//sorted는 정렬할떄 사용 정렬시 가나다 abc 123순으로 출력 
}
