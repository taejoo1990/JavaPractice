package pk11;

//Template ����
public abstract class Car {

	public abstract void driver();
	public abstract void stop();
	
	public void startCar() {
		System.out.println("�õ��� �մϴ�");
	}
	public void turnOff() {
		System.out.println("������ ���ϴ�");
	}
	
	//�۾�����->Template : ���� ������ ������ ������� �ѹ��� ������ ����(���̳� �ʼ�)
	final public void run() {
		startCar();
		driver();
		stop();
		turnOff();
	}
	
}
