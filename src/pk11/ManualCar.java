package pk11;

public class ManualCar extends Car{

	@Override
	public void driver() {
		System.out.println("사람이 운전합니다.");
		System.out.println("사람이 핸들을 조작해야 합니다.");
		
	}

	@Override
	public void stop() {
		System.out.println("브레이크로 정지 합니다.");
		
		
	}

}
