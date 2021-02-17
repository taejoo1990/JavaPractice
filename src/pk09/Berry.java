package pk09;

public class Berry extends Fruit{
	//과일클래스에서 상속받을거야
	private String size;
	private String name;
	
	public void set2(String a, String b) {
		name=a;
		size=b;
	}
	
	public void Disp2() {
		System.out.println("이름 : "+name);
		System.out.println("크기 : "+size);
	}

}
