package pk11;

public class UnitMain {

	public static void main(String[] args) {
		
		Terran t1=new Terran("����", 100, false);
		t1.decEnergy();
		System.out.println("Terran�� energy : "+t1.getEnergy());
		
		Zerg z1=new Zerg("��Ż����ũ", 200, true);
		z1.decEnergy();
		System.out.println("Zerg�� energy : "+z1.getEnergy());
		
		Protoss p1=new Protoss("��ĭ", 250, false);
		p1.decEnergy();
		System.out.println("Protoss�� energy : "+p1.getEnergy());
		
	}

}
