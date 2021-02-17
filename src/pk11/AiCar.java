package pk11;

public class AiCar extends Car{

	@Override
	public void driver() {
		System.out.println("스스로 운전합니다.");
		System.out.println("자율 주행을 시작합니다.");
		
	}

	@Override
	public void stop() {
		System.out.println("자율 주행을 종료합니다.");
		
	}

}
