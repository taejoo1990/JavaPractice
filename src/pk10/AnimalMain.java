package pk10;

public class AnimalMain {

	public static void main(String[] args) {
		
		Bear b=new Bear();
		System.out.println("----��----");
		System.out.println("�� : "+b.getEye());
		System.out.println("�ٸ� : "+b.getLeg());
		System.out.println(b.woong);
		
		Lion l=new Lion();
		System.out.println("----����----");
		System.out.println("�� : "+l.getEye());
		System.out.println("�ٸ� : "+l.getLeg());
		System.out.println(l.galgi);
		
		Spider s=new Spider();
		System.out.println("----�Ź�----");
		System.out.println("�� : "+s.getEye());
		System.out.println("�ٸ� : "+s.getLeg());
		System.out.println(s.web);
	}

}
