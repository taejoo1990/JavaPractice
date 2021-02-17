package pk06;

public class StdInfo {
	
	public String studentName;
	public int grade;
	public int money;
	
	public StdInfo(String studentName,int money) {
		this.studentName=studentName;
		this.money=money;
	}
	public void takeBus(Bus bus) {
		bus.take(1000);//버스 요금 지불
		this.money -=1000;//내 돈은 차감
	}
	
	public void takeSubway(Subway subway) {
		subway.take(1500);//지하철 요금 지불
		this.money -=1500;//내 돈은 차감	
	}
	public void takeTaxi(Taxi taxi) {
		taxi.take(7000);//지하철 요금 지불
		this.money -=7000;//내 돈은 차감	
	}
	
	public void showInfo() {
		System.out.println(studentName+"님의 남은 돈은 "+money+"원 입니다.");
	}

}
