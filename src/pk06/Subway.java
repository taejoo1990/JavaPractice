package pk06;

public class Subway {


	int subwayNumber;
	int passengerCount;
	int money;
	
	
	public Subway(int subwayNumber) {//Bus bus1=new Bus(2580);
		this.subwayNumber=subwayNumber;
	}
	
	public void take(int money) {//�°��� �� ���� �޾�
		this.money+=money;//���� ������ �Ǳ⿡ +ǥ��
		passengerCount++;
		
	}
	
	public void showInfo() {//������ ���� ������ ���
		
		System.out.println("����ö "+subwayNumber+"ȣ���� �°���"+passengerCount+"�� �̰� ���� ����"+money+"�Դϴ�");
	}
	
}

	


