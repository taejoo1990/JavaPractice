package pk07;

public class Overload {
	
	private int nai;
	private float ki;
	private String name;
	
	public Overload() {
		nai=0;
		ki=0;
		name="�͸�";
	}
	public Overload(int a, float b) {
		nai=a;
		ki=b;
		name="�͸�";
	}
	public Overload(int a, float b,String c) {
		nai=a;
		ki=b;
		name=c;
	}
	public void Disp() {
		System.out.println("���̴� : "+nai+"�� �Դϴ�.");
		System.out.println("Ű�� : "+ki+"cm �Դϴ�.");
		System.out.println("�̸��� : "+name+"�Դϴ�.");
	}

}
