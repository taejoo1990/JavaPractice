package pk06;

public class Bus {

	int busNumber;
	int passengerCount;
	int money;
	
	
	public Bus(int busNumber) {//Bus bus1=new Bus(2580);
		this.busNumber=busNumber;
	}
	
	public void take(int money) {//�°��� �� ���� �޾�
		this.money+=money;//���� ������ �Ǳ⿡ +ǥ��
		passengerCount++;
		
	}
	
	public void showInfo() {//������ ���� ������ ���
		
		System.out.println("���� "+busNumber+"���� �°��� "+passengerCount+"�� �̰� ���� ����"+money+"�Դϴ�");
	}
	
}
