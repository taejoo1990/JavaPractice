package pk11;

public class CarMain {

	public static void main(String[] args) {
		System.out.println("==���� ������ �ϴ� �ڵ���==");
		AiCar ac=new AiCar();
		ac.startCar();
		ac.driver();
		ac.stop();
		ac.turnOff();
		
		System.out.println("==����� �����ϴ� �ڵ���==");
		ManualCar mc=new ManualCar();
		mc.run();

	}

}
