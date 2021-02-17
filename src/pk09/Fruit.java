package pk09;

public class Fruit {
	
	private String sort;
	private String season;
	
	public void set1(String a, String b) {
		sort=a;
		season=b;
		
	}
	
	public void Disp1() {
		System.out.println("분류 : "+sort);
		System.out.println("계절 : "+season);
		
	}
	

}
