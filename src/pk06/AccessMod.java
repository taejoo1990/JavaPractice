package pk06;

public class AccessMod {
	
	private int aa;
	public int bb;
	int cc;
	
	public void SetA(int aa) {
		this.aa=aa;
	}
	
	public void SetB(int b) {
		bb=b;
	}

	public void SetC(int c) {
		cc=c;
	}
	
	public void Disp() {
		System.out.println("aa�� �� : "+aa +"\nbb�� �� : "+bb +"\ncc�� �� : "+cc);
	}
	

	public static void main(String[] args) {
		
		AccessMod obj=new AccessMod();
		//obj.aa=10
		obj.SetA(10);
		obj.SetB(20);
		obj.SetC(50);
        obj.Disp();
		

	}

}
