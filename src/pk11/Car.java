package pk11;

//Template 구현
public abstract class Car {

	public abstract void driver();
	public abstract void stop();
	
	public void startCar() {
		System.out.println("시동을 켭니다");
	}
	public void turnOff() {
		System.out.println("전원을 끕니다");
	}
	
	//작업순서->Template : 여러 파일을 정해진 순서대로 한번에 뽑을수 있음(파이널 필수)
	final public void run() {
		startCar();
		driver();
		stop();
		turnOff();
	}
	
}
