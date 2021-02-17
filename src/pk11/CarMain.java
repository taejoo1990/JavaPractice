package pk11;

public class CarMain {

	public static void main(String[] args) {
		System.out.println("==자율 주행을 하는 자동차==");
		AiCar ac=new AiCar();
		ac.startCar();
		ac.driver();
		ac.stop();
		ac.turnOff();
		
		System.out.println("==사람이 운전하는 자동차==");
		ManualCar mc=new ManualCar();
		mc.run();

	}

}
