package pk07;

public class OverloadMain {

	public static void main(String[] args) {
		Overload ol1=new Overload();
		Overload ol2=new Overload(27, 182);
		Overload ol3=new Overload(27, 182, "Á¤Çö¿ì");
		
		ol1.Disp();
		System.out.println("-------------");
		ol2.Disp();
		System.out.println("-------------");
		ol3.Disp();
		
	}

}
