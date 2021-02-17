package pk08;

public class Ex7_BankMain {

	public static void main(String[] args) {
		
		Ex7_Bank bk1=new Ex7_Bank("강남점", "02-111-2222");//지점과 전번 set
		Ex7_Bank.interest=0.2f;//스테틱이므로 클래스 참조
		bk1.getBank(); //지점과 전번이 출력
		
		System.out.println("----------------");
		
		Ex7_Bank bk2=new Ex7_Bank("분당점", "031-333-4444");
		bk2.getBank();//지점과 전번이 출력
	}

}
