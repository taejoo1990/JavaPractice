package pk12;

public class PriorityAllocation implements Scheduler{

	@Override
	public void getNextCall() {
		System.out.println("고객 등급이 높은 고객을 우선으로 합니다.");
		
	}

	@Override
	public void sendCallToAgebt() {
		System.out.println("업무 skill 값이 높은 상담원에게 우선 배분합니다.");
		
	}

}
