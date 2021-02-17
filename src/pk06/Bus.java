package pk06;

public class Bus {

	int busNumber;
	int passengerCount;
	int money;
	
	
	public Bus(int busNumber) {//Bus bus1=new Bus(2580);
		this.busNumber=busNumber;
	}
	
	public void take(int money) {//승객이 낸 돈을 받아
		this.money+=money;//돈은 누적이 되기에 +표시
		passengerCount++;
		
	}
	
	public void showInfo() {//버스의 현재 정보를 출력
		
		System.out.println("버스 "+busNumber+"번의 승객은 "+passengerCount+"명 이고 받은 돈은"+money+"입니다");
	}
	
}
