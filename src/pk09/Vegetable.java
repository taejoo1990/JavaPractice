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
		System.out.println("�з� : "+sort);
		System.out.println("���� : "+season);
		System.out.println("�̸� : "+name);
	}

}
