package pk10;

public class AnimalMain {

	public static void main(String[] args) {
		
		Bear b=new Bear();
		System.out.println("----磅----");
		System.out.println("传 : "+b.getEye());
		System.out.println("促府 : "+b.getLeg());
		System.out.println(b.woong);
		
		Lion l=new Lion();
		System.out.println("----荤磊----");
		System.out.println("传 : "+l.getEye());
		System.out.println("促府 : "+l.getLeg());
		System.out.println(l.galgi);
		
		Spider s=new Spider();
		System.out.println("----芭固----");
		System.out.println("传 : "+s.getEye());
		System.out.println("促府 : "+s.getLeg());
		System.out.println(s.web);
	}

}
