package pk06;

public class TakeTrans {

	public static void main(String[] args) {
		//���� ��ü ����ö ��ü stdIn
		StdInfo studentJames =new StdInfo("James", 5000);
		StdInfo studentTomas =new StdInfo("Tomas", 10000);
		StdInfo studentBab =new StdInfo("Bab", 15000);
		
		Bus bus100=new Bus(100);
		studentJames.takeBus(bus100);//���ӽ��� 100�� ������Ž
		studentJames.showInfo();
		bus100.showInfo();
		
		System.out.println("------------------------------");
		System.out.println();
		
		Subway subwayGreen=new Subway(2);
		studentTomas.takeSubway(subwayGreen);//����ö�� Ÿ��
		studentTomas.showInfo();//�丶���� ����
		subwayGreen.showInfo();//subwayGreen�� ����
		
		System.out.println("------------------------------");
		System.out.println();
		
		Taxi taxi1452=new Taxi(1452);
		studentBab.takeTaxi(taxi1452);//�ýø� Ÿ��
		studentBab.showInfo();//���� ����
		taxi1452.showInfo();//taxi����
		
		

	}

}
