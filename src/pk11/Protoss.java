package pk11;

public class Protoss extends Unit{

	//���������̸� true, ��������false
	boolean fly;
	
	public Protoss(String name, int energy, boolean fly) {
		this.name=name;
		this.energy=energy;
		this.fly=fly;
	}
	
	@Override
	public void decEnergy() {
		energy --;
		
	}

}
