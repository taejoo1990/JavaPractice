package pk09;

public class Vegetable {

	String sort;
	String season;
	String name;
	
	public void set1(String a,String b,String c) {
		
		sort=a;
		season=b;
		name=c;
		
	}
	
	public void Disp() {
		System.out.println("분류 : "+sort);
		System.out.println("계절 : "+season);
		System.out.println("이름 : "+name);
	}

}
