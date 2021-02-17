package pk12;

public class LeastJob implements Scheduler{

	@Override
	public void getNextCall() {
		System.out.println("상담 전화를 순서대로 대기열에서 가져오기");
		
	}

	@Override
	public void sendCallToAgebt() {
		System.out.println("현재업무가 없거나 상담대기가 가장 작은 상담원에게 배분");
		
	}

}
