package pk11;

public class Protoss extends Unit{

	//공중유닛이면 true, 지상유닛false
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
