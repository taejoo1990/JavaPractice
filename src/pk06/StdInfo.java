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
		bus.take(1000);//���� ��� ����
		this.money -=1000;//�� ���� ����
	}
	
	public void takeSubway(Subway subway) {
		subway.take(1500);//����ö ��� ����
		this.money -=1500;//�� ���� ����	
	}
	public void takeTaxi(Taxi taxi) {
		taxi.take(7000);//����ö ��� ����
		this.money -=7000;//�� ���� ����	
	}
	
	public void showInfo() {
		System.out.println(studentName+"���� ���� ���� "+money+"�� �Դϴ�.");
	}

}
