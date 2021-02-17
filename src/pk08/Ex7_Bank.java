package pk08;

public class Ex7_Bank {

	private String point;//은행 위치
	private String tal;//은행 전화번호
	
	static float interest;//은행 이자
	
	public Ex7_Bank(String point, String tal) {
		this.point=point;
		this.tal=tal;
		
	}
	
	//결과 출력
	
	public void getBank() {
		System.out.println("지점 : "+ point+"\n"+"전화번호 : "+tal+"\n"+"이자율 : "+interest);
	}
	
	
}
