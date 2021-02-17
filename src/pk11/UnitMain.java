package pk11;

public class UnitMain {

	public static void main(String[] args) {
		
		Terran t1=new Terran("¸¶¸°", 100, false);
		t1.decEnergy();
		System.out.println("TerranÀÇ energy : "+t1.getEnergy());
		
		Zerg z1=new Zerg("¹ÂÅ»¸®½ºÅ©", 200, true);
		z1.decEnergy();
		System.out.println("ZergÀÇ energy : "+z1.getEnergy());
		
		Protoss p1=new Protoss("¾ÆÄ­", 250, false);
		p1.decEnergy();
		System.out.println("ProtossÀÇ energy : "+p1.getEnergy());
		
	}

}
