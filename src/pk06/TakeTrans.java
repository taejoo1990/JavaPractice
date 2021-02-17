package pk06;

public class TakeTrans {

	public static void main(String[] args) {
		//버스 객체 지하철 객체 stdIn
		StdInfo studentJames =new StdInfo("James", 5000);
		StdInfo studentTomas =new StdInfo("Tomas", 10000);
		StdInfo studentBab =new StdInfo("Bab", 15000);
		
		Bus bus100=new Bus(100);
		studentJames.takeBus(bus100);//제임스가 100번 버스를탐
		studentJames.showInfo();
		bus100.showInfo();
		
		System.out.println("------------------------------");
		System.out.println();
		
		Subway subwayGreen=new Subway(2);
		studentTomas.takeSubway(subwayGreen);//지하철을 타면
		studentTomas.showInfo();//토마스의 정보
		subwayGreen.showInfo();//subwayGreen의 정보
		
		System.out.println("------------------------------");
		System.out.println();
		
		Taxi taxi1452=new Taxi(1452);
		studentBab.takeTaxi(taxi1452);//택시를 타면
		studentBab.showInfo();//밥의 정보
		taxi1452.showInfo();//taxi정보
		
		

	}

}
