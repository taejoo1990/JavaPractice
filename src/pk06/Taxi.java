package pk06;

public class Taxi {

	int taxiNumber;
	int passengerCount;
	int money;
	
	
	public Taxi(int taxiNumber) {//Bus bus1=new Bus(2580);
		this.taxiNumber=taxiNumber;
	}
	
	public void take(int money) {//�°��� �� ���� �޾�
		this.money+=money;//���� ������ �Ǳ⿡ +ǥ��
		passengerCount++;
		
	}
	
	public void showInfo() {//������ ���� ������ ���
		
		System.out.println("�ý� ��ȣ�� "+taxiNumber+"���̰�  �°���"+passengerCount+"�� �̰� ���� ����"+money+"�Դϴ�");
	}
}
