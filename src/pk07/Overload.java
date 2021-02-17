package pk07;

public class Overload {
	
	private int nai;
	private float ki;
	private String name;
	
	public Overload() {
		nai=0;
		ki=0;
		name="익명";
	}
	public Overload(int a, float b) {
		nai=a;
		ki=b;
		name="익명";
	}
	public Overload(int a, float b,String c) {
		nai=a;
		ki=b;
		name=c;
	}
	public void Disp() {
		System.out.println("나이는 : "+nai+"살 입니다.");
		System.out.println("키는 : "+ki+"cm 입니다.");
		System.out.println("이름은 : "+name+"입니다.");
	}

}
